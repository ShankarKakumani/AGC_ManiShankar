package pro.crazydude.binaryveda.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pro.crazydude.binaryveda.R
import pro.crazydude.binaryveda.databinding.ActivityProfileBinding
import pro.crazydude.binaryveda.helper.adapter.ImagesAdapter
import pro.crazydude.binaryveda.helper.model.GalleryImages

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImagesAdapter
    private val imagesList: ArrayList<GalleryImages> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
        bindData()

    }

    private fun bindData() {
        imagesList.add(GalleryImages(R.drawable.image_one, R.drawable.image_two))
        imagesList.add(GalleryImages(R.drawable.image_three, R.drawable.image_four))
        imagesList.add(GalleryImages(R.drawable.image_five, R.drawable.image_six))

        adapter.notifyDataSetChanged()

    }

    private fun initViews() {
        recyclerView = binding.imagesRecycler

        /*
        I tried GridLayoutManager and passed spanCount to 2, but got some issue with,
        the margin between the images, size, scale and when rotated to landScape.
        so created a LinearLayout and gave weight equal for both image.
        There might be some other way, but I tried to satisfy "WYSIWYG"...
        */
        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
        adapter = ImagesAdapter(imagesList)
        recyclerView.adapter = adapter

    }
}
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
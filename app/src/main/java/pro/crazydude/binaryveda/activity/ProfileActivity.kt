package pro.crazydude.binaryveda.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pro.crazydude.binaryveda.R
import pro.crazydude.binaryveda.databinding.ActivityProfileBinding
import pro.crazydude.binaryveda.helper.adapter.ImagesAdapter

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImagesAdapter
    val imagesList : ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
        bindData()

    }

    private fun bindData() {
        imagesList.add(R.drawable.image_one)
        imagesList.add(R.drawable.image_two)
        imagesList.add(R.drawable.image_three)
        imagesList.add(R.drawable.image_four)
        imagesList.add(R.drawable.image_five)
        imagesList.add(R.drawable.image_six)

        adapter.notifyDataSetChanged()
    }

    private fun initViews() {
        recyclerView = binding.imagesRecycler
        recyclerView.layoutManager =
            GridLayoutManager(
                this,
                2,
                GridLayoutManager.VERTICAL,
                false
            )

        adapter = ImagesAdapter(imagesList)
        recyclerView.adapter

    }
}
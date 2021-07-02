package pro.crazydude.binaryveda.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pro.crazydude.binaryveda.R
import pro.crazydude.binaryveda.databinding.ActivityMainBinding
import pro.crazydude.binaryveda.helper.adapter.FeatureAdapter
import pro.crazydude.binaryveda.helper.model.FeatureModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FeatureAdapter
    var featureList: ArrayList<FeatureModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        bindData()
    }

    private fun initViews() {
        binding.register.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        recyclerView = binding.recycler
        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )

        adapter = FeatureAdapter(featureList)
        recyclerView.adapter = adapter
    }

    private fun bindData() {

        bindFeatureList()
        adapter.notifyDataSetChanged()
    }

    private fun bindFeatureList() {

        addToFeatureList(
            R.drawable.ic_feature_one,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_ullamco)
        )

        addToFeatureList(
            R.drawable.ic_feature_two,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_ullamco)
        )

        addToFeatureList(
            R.drawable.ic_feature_three,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_consequat)
        )

        addToFeatureList(
            R.drawable.ic_feature_four,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_consequat)
        )

        addToFeatureList(
            R.drawable.ic_feature_five,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_consequat)
        )

        addToFeatureList(
            R.drawable.ic_feature_six,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_pariatur)
        )

        addToFeatureList(
            R.drawable.ic_feature_seven,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_consequat)
        )

        addToFeatureList(
            R.drawable.ic_feature_eight,
            resources.getString(R.string.lorem_ipsum_is_used),
            resources.getString(R.string.lorem_pariatur)
        )
    }

    private fun addToFeatureList(imageResource: Int, titleOne: String, titleTwo: String) {
        featureList.add(FeatureModel(imageResource, titleOne, titleTwo))
    }


}
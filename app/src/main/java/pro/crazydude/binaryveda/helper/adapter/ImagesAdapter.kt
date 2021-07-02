package pro.crazydude.binaryveda.helper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pro.crazydude.binaryveda.R
import pro.crazydude.binaryveda.databinding.ItemFeatureBinding
import pro.crazydude.binaryveda.databinding.ItemImageGalleryBinding
import pro.crazydude.binaryveda.helper.model.FeatureModel

class ImagesAdapter(private var imagesList: ArrayList<Int>) :
    RecyclerView.Adapter<ImagesAdapter.ViewHolder>() {


    class ViewHolder(itemBinding: ItemImageGalleryBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var binding: ItemImageGalleryBinding = itemBinding

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_image_gallery,
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(imagesList[position])
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}
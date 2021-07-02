package pro.crazydude.binaryveda.helper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pro.crazydude.binaryveda.R
import pro.crazydude.binaryveda.databinding.ItemFeatureBinding
import pro.crazydude.binaryveda.helper.model.FeatureModel

class FeatureAdapter(private var list : List<FeatureModel>) : RecyclerView.Adapter<FeatureAdapter.ViewHolder>() {


    class ViewHolder(itemBinding : ItemFeatureBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        var binding: ItemFeatureBinding = itemBinding

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_feature, parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.model = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
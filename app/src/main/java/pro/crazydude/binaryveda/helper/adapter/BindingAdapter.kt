package pro.crazydude.binaryveda.helper.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @BindingAdapter(value = ["app:drawableResource"])
    @JvmStatic
    fun setDrawableImage(view: ImageView, resource: Int) {
        view.setImageResource(resource)
    }

}
package com.rama.xapoSample.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("picture")
fun loadPicture(view: ImageView, url: Int) {
    Glide.with(view)
        .load(url)
        .into(view)
}

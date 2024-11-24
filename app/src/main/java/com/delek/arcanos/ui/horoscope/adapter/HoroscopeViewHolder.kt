package com.delek.arcanos.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.delek.arcanos.databinding.ItemHoroscopeBinding
import com.delek.arcanos.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo) {
        val context = binding.tvName.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvName.text = context.getString(horoscopeInfo.name)
    }

}
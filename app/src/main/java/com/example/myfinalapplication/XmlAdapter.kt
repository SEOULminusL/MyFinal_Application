package com.example.myfinalapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfinalapplication.databinding.ItemMailBinding

class XmlViewHolder(val binding: ItemMailBinding): RecyclerView.ViewHolder(binding.root)
class XmlAdapter (val context: Context, val datas:MutableList<myItem>?)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int {
        return datas?.size ?:0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return XmlViewHolder(ItemMailBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as XmlViewHolder).binding
        val model = datas!![position]
        binding.name.text = model.sj
        binding.tel.text = model.ty3Date
        binding.addr.text = model.ty3Kind + "" + model.ty3Place



    }
}
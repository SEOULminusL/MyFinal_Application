package com.example.myfinalapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfinalapplication.databinding.ItemMailBinding

class MyViewHolder(val binding:ItemMailBinding): RecyclerView.ViewHolder(binding.root)
class MyAdapter (val context: Context, val datas:MutableList<ItemModel>?):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int {
        return datas?.size ?:0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(ItemMailBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyViewHolder).binding
        val model = datas!![position]
        binding.name.text = model.orgnm
        binding.tel.text = model.orgTlno
        binding.addr.text = model.orgZipaddr


    }
}
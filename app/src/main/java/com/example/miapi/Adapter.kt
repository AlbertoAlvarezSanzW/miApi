package com.example.miapi

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// esto va a gestionar la lista en concreto
class AdapterString : RecyclerView.Adapter<AdapterString.FilmsViewHolder>(){

    private var datos : String? = null

    class FilmsViewHolder(root: View) : RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    fun setData(string : String){
        datos = string
        notifyDataSetChanged()
    }


}


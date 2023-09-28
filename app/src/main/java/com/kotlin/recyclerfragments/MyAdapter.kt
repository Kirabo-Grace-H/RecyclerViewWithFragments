package com.kotlin.recyclerfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(private val emplist:ArrayList<contact_model>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View):ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val email = itemView.findViewById<TextView>(R.id.tvEmail)
    }
    //override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):MyViewHolder{
    //    val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_layout,parent,null)
    //    return MyAdapter(ItemView)
    //}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_layout,parent,false)
    return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return emplist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = emplist[position]
        holder.email.text=currentItem.email
        holder.email.text= currentItem.email
    }

}
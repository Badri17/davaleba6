package com.example.davalben6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.executor.GlideExecutor
import kotlin.contracts.contract
import kotlin.coroutines.coroutineContext
import com.bumptech.glide.Glide.with as glideWith

class dd(private var product:List<jj>): RecyclerView.Adapter<dd.jjViewHolder>(){

    class jjViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.ImageView)
        val titleTextView:TextView=itemView.findViewById(R.id.titleTextView)
        val descriptionTextView:TextView=itemView.findViewById(R.id.descriptionTextView)
        val isImprotantImageView:ImageView=itemView.findViewById(R.id.isImprotantImageView)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): jjViewHolder {
        val View =LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return jjViewHolder(View)

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: jjViewHolder, position: Int) {
        val p=product[position]
        holder.imageView.setImageResource(p.image)
        holder.titleTextView.text=p.title
        holder.descriptionTextView.text=p.title
        holder.isImprotantImageView.visibility=View.GONE
        


    }


}
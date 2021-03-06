package com.iuglab.tohfa.ui_elements.user.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iuglab.tohfa.R
import com.iuglab.tohfa.appLogic.models.Product
import com.iuglab.tohfa.ui_elements.user.model.Varieties
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.categories_item_layout.view.*
import java.net.URL

class varietiesAdapter(var conetxt:Context, var varieties:ArrayList<Varieties>, val click: onClickItem?) : RecyclerView.Adapter<varietiesAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var root = LayoutInflater.from(conetxt).inflate(R.layout.categories_item_layout,parent,false)
        return MyViewHolder(root)
    }

    override fun getItemCount(): Int {
       return varieties.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Picasso.get().load(varieties[position].img).into(holder.img)
        holder.name.text = varieties[position].title
        holder.card.setOnClickListener {
            click!!.onClick(position)
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var img = itemView.categories_item_img
        var name = itemView.categories_item_txt
        var card = itemView.categories_item_layout_cardView

    }
    interface onClickItem{
        fun onClick(position: Int)
    }

}
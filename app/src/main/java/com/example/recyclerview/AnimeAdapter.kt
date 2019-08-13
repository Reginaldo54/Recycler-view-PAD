package com.example.recyclerview
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.anime_layout.view.*
import kotlinx.android.synthetic.main.anime_layout.view.*

class AndroidVersionAdapter (private val androidVersionList : MutableList<Animedate>) : RecyclerView.Adapter<AndroidVersionAdapter.VersionViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): VersionViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.anime_layout,parent,false)
        return VersionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return androidVersionList.size
    }

    override fun onBindViewHolder(holder: VersionViewHolder, position: Int) {

            holder.nome.text = androidVersionList[position].name
            holder.version = androidVersionList[position].version.toString()
            holder.api = androidVersionList[position].version.toString()
            holder.image.setImageResource(androidVersionList[position].image)

    }

    inner class VersionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var nome = itemView.anime_name
        var version = itemView.anime_num.text
        var api = itemView.anime_ano.text
        var image = itemView.anime_image
    }
}
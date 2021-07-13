package com.example.dogoneactitvity

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogoneactitvity.ViewHolder.Companion.count
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_dog.view.*

class DogAdapter(
    val context: Context?,
    val dogs: ArrayList<Dog>,
    val callback: DogsCallback,
) :
    RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avatar.setImageBitmap(dogs[position].avatar)
        holder.name.text = dogs[position].name
        holder.description.text = dogs[position].description

//        holder.ivWhiteHeart.setImageBitmap(dogs[position].heartBitmap)

        holder.root.setOnClickListener { callback.itemDogSelected(position) }
        holder.ivWhiteHeart.setOnClickListener {


            if(dogs[position].isHeart){
                holder.ivWhiteHeart.setImageResource(R.drawable.icons8_white_heart)
                dogs[position].isHeart = false
                count-=1
                callback.add(count)
                Log.i("цвет","вайт"+count)
            } else {
                holder.ivWhiteHeart.setImageResource(R.drawable.icons8_red_heart)
                dogs[position].isHeart = true
                count+=1
                callback.add(count)
                Log.i("цвет","ред"+count)

            }
        }
    }

    override fun getItemCount(): Int {
        return dogs.size
    }
}


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var ivWhiteHeart: ImageView
    var avatar: ImageView
    var name: TextView
    var description: TextView
    var root: View


    init {
        avatar = itemView.ivAvatar
        name = itemView.tvName
        description = itemView.tvDescription
        root = itemView.constRootItem
        ivWhiteHeart = itemView.ivWhiteHeart
    }
    companion object{
       var count:Int = 0
    }
}

    interface DogsCallback {
        fun itemDogSelected(index: Int)
        fun add(i:Int)
}

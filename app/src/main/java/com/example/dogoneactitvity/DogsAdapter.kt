package com.example.dogoneactitvity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogoneactitvity.ViewHolder.Companion.count
import kotlinx.android.synthetic.main.item_dog.view.*

class DogAdapter(
    val context: Context?,
    val dogs: ArrayList<Dog>,
    val callback: DogsCallback,
) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pos = holder.getAdapterPosition()
        holder.avatar.setImageBitmap(dogs[pos].avatar)
        holder.ivWhiteHeart.setImageBitmap(dogs[pos].bitmapHeart)
        holder.name.text = dogs[pos].name
        holder.description.text = dogs[pos].description
        holder.root.setOnClickListener { callback.itemDogSelected(pos) }
        holder.ivWhiteHeart.setOnClickListener {
            if (dogs[pos].isHeart==false) {
                holder.ivWhiteHeart.setImageResource(R.drawable.icons8_red_heart)
                dogs[pos].isHeart = true
                count += 1
                    // Только для расчета счетчика лайков
                callback.addCountHeart(count)
            } else {
               holder.ivWhiteHeart.setImageResource(R.drawable.icons8_white_heart)
                dogs[pos].isHeart = false
                count -=1
                callback.addCountHeart(count)
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
        root = itemView.constRoot
        ivWhiteHeart = itemView.ivWhiteHeart
    }

    companion object {
        var count: Int = 0
    }
}

interface DogsCallback {
    fun itemDogSelected(index: Int)
    fun addCountHeart(i: Int)
}

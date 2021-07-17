package com.example.dogoneactitvity

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), DogsCallback {
    var countHeart = 0
    var adapter: DogAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var dogs = getDogs()
        adapter = DogAdapter(this, dogs, this)
        rvDogs.setLayoutManager(LinearLayoutManager(this));
        rvDogs.setAdapter(adapter);
    }

    fun getDogs(): ArrayList<Dog> {
        var dogs = ArrayList<Dog>()

        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini1),
                getString(R.string.name1),
                getString(R.string.desc1),
                desc2 = getString(R.string.descc2),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini1),
                getString(R.string.name1),
                getString(R.string.desc1),
                desc2 = getString(R.string.descc2),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini3),
                getString(R.string.name2),
                getString(R.string.desc2),
                desc2 = getString(R.string.descc2),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini4),
                getString(R.string.name3),
                getString(R.string.desc3),
                desc2 = getString(R.string.descc3),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini5),
                getString(R.string.name4),
                getString(R.string.desc4),
                desc2 = getString(R.string.descc),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini6),
                getString(R.string.name5),
                getString(R.string.desc5),
                desc2 = getString(R.string.descc5),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini7),
                getString(R.string.name6),
                getString(R.string.desc6),
                desc2 = getString(R.string.descc7),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini8),
                getString(R.string.name7),
                getString(R.string.desc7),
                desc2 = getString(R.string.dessc8),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini9),
                getString(R.string.name8),
                getString(R.string.desc8),
                desc2 = getString(R.string.descc9),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini10),
                getString(R.string.name9),
                getString(R.string.desc9),
                desc2 = getString(R.string.descc10),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini11),
                getString(R.string.name10),
                getString(R.string.desc10),
                desc2 = getString(R.string.descc11),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini12),
                getString(R.string.name11),
                getString(R.string.desc11),
                desc2 = getString(R.string.descc12),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini1),
                getString(R.string.name1),
                getString(R.string.desc1),
                desc2 = getString(R.string.descc2),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini3),
                getString(R.string.name2),
                getString(R.string.desc2),
                desc2 = getString(R.string.descc2),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini4),
                getString(R.string.name3),
                getString(R.string.desc3),
                desc2 = getString(R.string.descc3),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini5),
                getString(R.string.name4),
                getString(R.string.desc4),
                desc2 = getString(R.string.descc),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini6),
                getString(R.string.name5),
                getString(R.string.desc5),
                desc2 = getString(R.string.descc5),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini7),
                getString(R.string.name6),
                getString(R.string.desc6),
                desc2 = getString(R.string.descc7),
                bitmapHeart = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            )
        )
        return dogs
    }


    override fun itemDogSelected(index: Int) {
        rvDogs.visibility = View.GONE
        scroll.visibility = View.VISIBLE
        ivAvatarDet.setImageBitmap(getDogs()[index].avatar)
        tvNameDetail.text = getDogs()[index].name
        tvDescriptionDetail.text = getDogs()[index].description
        tvDescription2Detail.text = getDogs()[index].desc2

    }

    override fun addCountHeart(index: Int) {
        countHeart = index
        tvCountHeart.text = "Количество лайков ${countHeart}"
           }
}
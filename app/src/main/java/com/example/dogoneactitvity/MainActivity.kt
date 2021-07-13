package com.example.dogoneactitvity

import android.R.attr.data
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_dog.*


class MainActivity : AppCompatActivity(), DogsCallback {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dogs = getDogs()
        rvDogs.setLayoutManager(LinearLayoutManager(this));
        rvDogs.setAdapter(DogAdapter(this, dogs, this));
    }

    fun getDogs(): ArrayList<Dog> {
        var dogs = ArrayList<Dog>()

        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini1),
                "Английский той терьер",
                "Эти короткошерстные терьеры произошли от манчестерских терьеров (которые, предположительно, также относятся к предкам доберманов), хотя той терьеры ведут свой род из более западной части страны, из района Ливерпульских доков.",
                desc2 = "2",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini3),
                "Болоньез",
                "Эти невероятно серьезные собаки спокойны, уравновешены и очень привязаны к своим владельцам..",
                desc2 = "3",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini4),
                "Йоркширский терьер",
                "Активный и своенравный йоркширский терьер — отличная собака-компаньон.",
                desc2 = "4",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini5),
                "Китайская хохлатая собака",
                "Эта маленькая собака никогда не остается без внимания, особенно одна из разновидностей породы —" +
                        " «пуховка», которую украшает характерная длинная шерсть..",
                desc2 = "5",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini6),
                "Континентальный той-спаниель (фален)",
                "Эти универсальные, очень популярные собаки, уроженцы древнего региона Фландрия, — " +
                        "замечательные компаньоны. Когда-то они были фаворитами королевских дворов, особенно это относится к папийону..",
                desc2 = "6",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini7),
                "Мальтезе",
                "Мальтезе очень умны, отличаются живым и ласковым нравом, " +
                        "поэтому отлично подходят на роль собак-компаньонов.",
                desc2 = "7",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini8),
                "Померанский шпиц",
                "Сильный характер в маленьком теле.", desc2 = "8",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini9),

                "Пти брабансон",
                "Пти брабансоны хорошо известны своим милым, игривым и веселым характером..",
                desc2 = "9",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini10),
                "Русский той",
                "У активных и очень веселых русских тоев прекрасное будущее, ведь собаки мелких пород становятся все более популярными..",
                desc2 = "10",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini11),
                "Чихуахуа",
                "Чихуахуа считается самой миниатюрной породой собак в мире.", desc2 = "11",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))
        dogs.add(
            Dog(
                BitmapFactory.decodeResource(resources, R.drawable.mini12),
                "Японский хин",
                "Представители породы японский хин бдительны, дружелюбны и очаровательны. " +
                        "Они подходят на роль превосходных компаньонов. Во взгляде этих собак отражаются любознательность и ум.",
                desc2 = "12",
//                heartBitmap = BitmapFactory.decodeResource(resources, R.drawable.icons8_white_heart)
            ))

        return dogs
    }

    override fun itemDogSelected(index:Int) {
        rvDogs.visibility = View.GONE
        constAllView.visibility = View.VISIBLE
        ivAvatarDet.setImageBitmap(getDogs()[index].avatar)
        tvNameDetail.text = getDogs()[index].name
        tvDescriptionDetail.text = getDogs()[index].description
        tvDescription2Detail.text = getDogs()[index].desc2
        startActivity(intent)
    }

    override fun add(i: Int) {
        tvCountHeart.text = "Количество лайков " + i.toString()
    }
}
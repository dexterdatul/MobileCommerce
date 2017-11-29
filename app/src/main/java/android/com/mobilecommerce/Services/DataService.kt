package android.com.mobilecommerce.Services

import android.com.mobilecommerce.Model.Category
import android.com.mobilecommerce.Model.Products

/**
 * Created by Dexter John Datul on 29/11/2017.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Products("Devslopes Graphic Beanie", "$18", "hat01"),
            Products("Devslopes Hat Black", "$20", "hat02"),
            Products("Devslopes Hat White", "$18", "hat03"),
            Products("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Products("Devslopes Hoodie Gray", "$28", "hoodies01"),
            Products("Devslopes Hoodie Red", "$32", "hoodies02"),
            Products("Devslopes Gray Hoodie", "$28", "hoodies03"),
            Products("Devslopes Black Hoodie", "$32", "hoodies04")
    )

    val shirts = listOf(
            Products("Devslopes Shirts Blaack", "$18", "shirt01"),
            Products("Devslopes Badge Light Gray", "$30", "shirt02"),
            Products("Devslopes Logo Shirt Red", "$22", "shirt03"),
            Products("Devslopes Hustle", "$22", "shirt04"),
            Products("Kickflip Studios", "$18", "shirt05")
    )
}
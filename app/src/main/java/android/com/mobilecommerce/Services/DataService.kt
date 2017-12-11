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
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Products("Devslopes Graphic Beanie", "$18", "hat1"),
            Products("Devslopes Hat Black", "$20", "hat2"),
            Products("Devslopes Hat White", "$18", "hat3"),
            Products("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Products("Devslopes Hoodie Gray", "$28", "hoodies1"),
            Products("Devslopes Hoodie Red", "$32", "hoodies2"),
            Products("Devslopes Gray Hoodie", "$28", "hoodies3"),
            Products("Devslopes Black Hoodie", "$32", "hoodies4")
    )

    val shirts = listOf(
            Products("Devslopes Shirts Blaack", "$18", "shirt1"),
            Products("Devslopes Badge Light Gray", "$30", "shirt2"),
            Products("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Products("Devslopes Hustle", "$22", "shirt4"),
            Products("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Products>()

    fun getProducts(category: String) : List<Products>{
        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}
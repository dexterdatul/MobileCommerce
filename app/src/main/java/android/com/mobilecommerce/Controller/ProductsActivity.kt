package android.com.mobilecommerce.Controller

import android.com.mobilecommerce.R
import android.com.mobilecommerce.Utilities.EXTRA_CATEGORY
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}

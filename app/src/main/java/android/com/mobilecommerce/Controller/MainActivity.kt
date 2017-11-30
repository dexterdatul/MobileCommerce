package android.com.mobilecommerce.Controller

import android.com.mobilecommerce.Adapters.CategoryAdapter
import android.com.mobilecommerce.R
import android.com.mobilecommerce.Services.DataService
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}

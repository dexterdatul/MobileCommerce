package android.com.mobilecommerce.Controller

import android.com.mobilecommerce.Model.Category
import android.com.mobilecommerce.R
import android.com.mobilecommerce.Services.DataService
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        categoryListView.adapter = adapter
    }
}

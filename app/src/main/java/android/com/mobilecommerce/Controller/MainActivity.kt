package android.com.mobilecommerce.Controller

import android.com.mobilecommerce.Adapters.CategoryRecycleAdapter
import android.com.mobilecommerce.R
import android.com.mobilecommerce.Services.DataService
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)

        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}

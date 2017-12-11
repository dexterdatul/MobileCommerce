package android.com.mobilecommerce.Adapters

import android.com.mobilecommerce.Model.Products
import android.com.mobilecommerce.R
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Dexter John Datul on 11/12/2017.
 */
class ProductsAdapter(val context: Context,val products: List<Products>) : RecyclerView.Adapter<ProductsAdapter.ProductsHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductsHolder {
     val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductsHolder(view)
    }

    override fun onBindViewHolder(holder: ProductsHolder?, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    override fun getItemCount(): Int {
    return products.count()
    }

    inner class ProductsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(products: Products, context: Context){
            val resourceId = context.resources.getIdentifier(products.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName.text = products.title
            productPrice?.text = products.price
        }
    }
}
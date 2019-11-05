package com.example.shoppinglistapplication.ui.homeScreen

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglistapplication.R
import com.example.shoppinglistapplication.databinding.LayoutShoppingItemBinding
import com.example.shoppinglistapplication.model.ShoppingItem


class ShoppingItemsRecycleViewAdapter (
    private var shoppingItems: MutableList<ShoppingItem>,
    private val context: Context
) : RecyclerView.Adapter<ShoppingItemViewHolder>() {

    private var shoppingList: MutableList<ShoppingItem> = mutableListOf()

    init {
        this.shoppingList = shoppingList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingItemViewHolder {
        val binding = DataBindingUtil.inflate<LayoutShoppingItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.layout_shopping_item,
            parent,
            false
        )
        return ShoppingItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return shoppingItems.size
    }

    override fun onBindViewHolder(holder: ShoppingItemViewHolder, position: Int) {
        holder.shoppingItemBinding.itemName.text = shoppingItems[position].name
        holder.shoppingItemBinding.itemPrice.text = shoppingItems[position].price.toString()
        holder.shoppingItemBinding.itemPriority.text = shoppingItems[position].priority

        holder.shoppingItemBinding.item.setOnClickListener {
            val intent = Intent(context, EditDeleteActivity::class.java)
            intent.putExtra("First", false)
            intent.putExtra("Id", shoppingItems[position].id)
            context.startActivity(intent)
        }
    }

}
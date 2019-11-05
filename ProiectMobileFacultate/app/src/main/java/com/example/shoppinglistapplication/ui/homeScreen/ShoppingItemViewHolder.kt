package com.example.shoppinglistapplication.ui.homeScreen

import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglistapplication.databinding.LayoutShoppingItemBinding


class ShoppingItemViewHolder (itemBinding: LayoutShoppingItemBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    var shoppingItemBinding: LayoutShoppingItemBinding = itemBinding

}
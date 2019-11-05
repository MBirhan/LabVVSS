package com.example.shoppinglistapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shoppinglistapplication.databinding.ActivityMain2Binding
import com.example.shoppinglistapplication.model.ShoppingItem
import com.example.shoppinglistapplication.ui.homeScreen.EditDeleteActivity
import com.example.shoppinglistapplication.ui.homeScreen.ShoppingItemsRecycleViewAdapter

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    //TODO Change for DB/External memory
    private val item1 = ShoppingItem(1, "Cheese", 10, "Could Wait")
    private val item2 = ShoppingItem(2, "Bread", 3, "Need to buy")
    private val item3 = ShoppingItem(3, "Monitor", 400, "When money comes")
    private val itemList: MutableList<ShoppingItem> = mutableListOf(item1, item2, item3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        setSupportActionBar(toolbar)

        binding.fab.setOnClickListener {
            val intent = Intent(applicationContext, EditDeleteActivity::class.java)
            intent.putExtra("First", true)
            startActivity(intent)
        }
        binding.recyclerContent.recyclerView.adapter =
            ShoppingItemsRecycleViewAdapter(context = applicationContext, shoppingItems = itemList)
    }

}

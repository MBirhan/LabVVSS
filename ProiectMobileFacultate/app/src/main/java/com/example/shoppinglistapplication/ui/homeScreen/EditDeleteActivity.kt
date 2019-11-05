package com.example.shoppinglistapplication.ui.homeScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shoppinglistapplication.R
import com.example.shoppinglistapplication.databinding.ActivityEditDeleteBinding
import com.example.shoppinglistapplication.model.ShoppingItem

class EditDeleteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditDeleteBinding
    private var viewModel: HomeScreenViewModel = HomeScreenViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_delete)
        if(!intent.getBooleanExtra("First", false)) {
            val item: ShoppingItem? = viewModel.getItem(intent.getIntExtra("Id", 0))
            binding.nameEdit.setText(item?.name)
            binding.priceEdit.setText(item?.price ?: 0)
            binding.priorityEdit.setText(item?.priority)
        }
        initAddButton()
        initDeleteButton()
    }

    private fun initAddButton() {
        binding.saveButton.setOnClickListener {
            if (!intent.getBooleanExtra("First", false)) {
                viewModel.updateItem(
                    intent.getIntExtra("Id", 0),
                    binding.nameEdit.text.toString(),
                    binding.priceEdit.text.toString().toInt(),
                    binding.priorityEdit.text.toString()
                )
            } else {
                viewModel.addItem(
                    binding.nameEdit.text.toString(),
                    binding.priceEdit.text.toString().toInt(),
                    binding.priorityEdit.text.toString()
                )
            }
        }
    }

    private fun initDeleteButton() {
        binding.deleteButton.setOnClickListener {
            viewModel.removeItem(intent.getIntExtra("Id", 0))
        }
    }
}

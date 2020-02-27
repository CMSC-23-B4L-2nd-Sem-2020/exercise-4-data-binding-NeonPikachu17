package com.example.bernabe_exer4_slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.bernabe_exer4_slambook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val slamBook: SlamBook = SlamBook("Hello!!!")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.slamBook = slamBook
        binding.doneButton.setOnClickListener{
            setData(it)
        }
    }

    private fun setData(view: View){
        binding.apply{
            slamBook?.name = editName.text.toString()
            invalidateAll()
        }
    }

    private fun setVisibility(){

    }

}

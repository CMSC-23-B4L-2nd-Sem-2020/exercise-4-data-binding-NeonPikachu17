package com.example.bernabe_exer4_slambook

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.bernabe_exer4_slambook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // For data Binding
    private lateinit var binding: ActivityMainBinding
    private val slamBook: SlamBook = SlamBook("Hello!!!")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.slamBook = slamBook
        // For easier access of binding
        binding.apply{
            name.visibility = View.GONE
            nickname.visibility = View.GONE
            age.visibility = View.GONE
            goodbye.visibility = View.GONE
            doneButton.setOnClickListener{ setData(it) }
        }
    }


    private fun setData(view: View){
        // Assigns value to specific item in slamBook data
        binding.apply{
            slamBook?.name = editName.text.toString()
            slamBook?.nickname = editNickname.text.toString()
            slamBook?.age = editText4.text.toString()
            slamBook?.birthday = editDate.text.toString()
            slamBook?.course = editCourse.text.toString()
            slamBook?.phone = editPhone.text.toString()
            slamBook?.color = editColor.text.toString()
            slamBook?.dream = editDream.text.toString()
            slamBook?.crush = editCrush.text.toString()
            slamBook?.message = editMsg.text.toString()
            invalidateAll()
        }
        // Sets the visibility after setting the data to slamBook
        setVisibility()

        // Hides the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    // Sets the visibility of the boxes
    private fun setVisibility(){
        binding.apply{
            title.visibility = View.GONE
            nameTitle.visibility = View.GONE
            editName.visibility = View.GONE
            titleNickname.visibility = View.GONE
            editNickname.visibility = View.GONE
            titleAge.visibility = View.GONE
            editText4.visibility = View.GONE
            titleBirthday.visibility = View.GONE
            editDate.visibility = View.GONE
            titleCourse.visibility = View.GONE
            editCourse.visibility = View.GONE
            titleCourse.visibility = View.GONE
            editCourse.visibility = View.GONE
            titlePhone.visibility = View.GONE
            editPhone.visibility = View.GONE
            titleColor.visibility = View.GONE
            editColor.visibility = View.GONE
            titleDream.visibility = View.GONE
            editDream.visibility = View.GONE
            titleCrush.visibility = View.GONE
            editCrush.visibility = View.GONE
            titleMsg.visibility = View.GONE
            editMsg.visibility = View.GONE
            doneButton.visibility = View.GONE
            name.visibility = View.VISIBLE
            nickname.visibility = View.VISIBLE
            age.visibility = View.VISIBLE
            goodbye.visibility = View.VISIBLE
        }
    }

}

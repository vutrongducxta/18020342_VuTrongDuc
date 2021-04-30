package com.example.lession2_aboutme

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil

import com.example.lession2_aboutme.databinding.LinearlayoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LinearlayoutBinding

    private val myName: MyName = MyName("Vũ Trọng Đức")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.linearlayout)
        binding = DataBindingUtil.setContentView(this, R.layout.linearlayout)
        //findViewById<Button>(R.id.nút_xong).setOnClickListener {
            //addNickname(it)
        //}
        binding.myName= myName
        binding.doneButton.setOnClickListener{
            addNickname(it) 
        }
    }

    private fun addNickname(view: View) {
        binding.apply{

            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            nicknameEdit.visibility= View.GONE
            doneButton.visibility= View.GONE
            bietdanhText.visibility=View.VISIBLE
        }



        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
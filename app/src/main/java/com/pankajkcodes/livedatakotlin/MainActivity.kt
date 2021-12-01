package com.pankajkcodes.livedatakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView  = findViewById(R.id.textView)
        button  = findViewById(R.id.button)


        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.text.observe(this,{
            textView.text = it.toString()
        })

        mainViewModel.btnText.observe(this,{
            button.text = it.toString()
        })


        button.setOnClickListener {
            mainViewModel.updateText()

        }


    }


}
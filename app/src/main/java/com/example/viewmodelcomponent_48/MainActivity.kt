package com.example.viewmodelcomponent_48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

      lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        textViewNumber.text = mainActivityViewModel.number.toString()

        buttonAdd.setOnClickListener {
            mainActivityViewModel.addNumber()
            textViewNumber.text = mainActivityViewModel.number.toString()
        }

    }
}
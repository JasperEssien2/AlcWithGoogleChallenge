package com.example.alcwithgooglechallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.alcwithgooglechallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.frameProfile.setOnClickListener{
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }
        mainBinding.frameAboutUs.setOnClickListener{
            val intent = Intent(this,AboutUs::class.java)
            startActivity(intent)
        }
    }
}

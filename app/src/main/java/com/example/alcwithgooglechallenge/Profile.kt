package com.example.alcwithgooglechallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.alcwithgooglechallenge.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {

    lateinit var profileBinding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profileBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
    }
}

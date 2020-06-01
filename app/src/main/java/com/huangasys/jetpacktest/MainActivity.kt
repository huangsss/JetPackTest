package com.huangasys.jetpacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.huangasys.jetpacktest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var databind =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

}
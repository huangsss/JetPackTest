package com.huangasys.jetpacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.huangasys.jetpacktest.databinding.ActivityMainBinding
import com.huangasys.jetpacktest.db.UserDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var databind =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        UserDatabase.getInstance(this).getUserDao().query().observe(this, Observer { user ->

        })

        UserDatabase.getInstance(this).getStatusDao().queryStatus()
            .observe(this, Observer { logged ->
                if (logged != true) {
                    //未登录;
                    Navigation.findNavController(this, R.id.nav_host_main)
                        .navigate(R.id.nav_to_login)
                }
            })
    }

}
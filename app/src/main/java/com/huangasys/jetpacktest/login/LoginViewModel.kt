package com.huangasys.jetpacktest.login

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import com.blankj.utilcode.util.ToastUtils

/**
 * Created by "huangasys" on 2020/4/19.22:56
 * 数据跟界面的绑定层
 */
class LoginViewModel(application: Application) : AndroidViewModel(application) {
    val uname = ObservableField<String>()
    val upwd = ObservableField<String>()

    fun login() {
        ToastUtils.showShort("点击了登录")
    }
}
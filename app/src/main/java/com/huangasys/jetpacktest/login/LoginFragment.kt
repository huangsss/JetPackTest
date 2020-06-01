package com.huangasys.jetpacktest.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.huangasys.jetpacktest.databinding.FragmentLoginBinding

/**
 * Created by "huangasys" on 2020/4/19.22:36
 */
class LoginFragment : Fragment() {

    private var viewModel: LoginViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.vm = viewModel
//        var view = layoutInflater.inflate(R.layout.fragment_login, container, false)
        return binding.root
    }
}
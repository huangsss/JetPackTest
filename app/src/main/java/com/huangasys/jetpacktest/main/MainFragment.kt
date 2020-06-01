package com.huangasys.jetpacktest.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.huangasys.jetpacktest.databinding.FragmentMainBinding

/**
 * Created by "huangasys" on 2020/4/20.23:24
 */
class MainFragment : Fragment() {

    private var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.vm = viewModel
        return binding.root

    }
}
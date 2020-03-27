package com.gzeinnumer.viewpagerexamplekt.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gzeinnumer.viewpagerexamplekt.databinding.FragmentFirstViewpagerBinding
import com.gzeinnumer.viewpagerexamplekt.main.MainFagment

class FirstViewpagerFragment : Fragment() {

    companion object{
        fun newInstance() = FirstViewpagerFragment()
    }

    private lateinit var binding: FragmentFirstViewpagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstViewpagerBinding.inflate(inflater, container, false)
        return binding.root
    }

}
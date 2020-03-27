package com.gzeinnumer.viewpagerexamplekt.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gzeinnumer.viewpagerexamplekt.databinding.FragmentMainBinding

class MainFagment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    companion object{
        fun newInstance() = MainFagment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
            Toast.makeText(view.context, "Tekan", Toast.LENGTH_SHORT).show()
        }
    }

}

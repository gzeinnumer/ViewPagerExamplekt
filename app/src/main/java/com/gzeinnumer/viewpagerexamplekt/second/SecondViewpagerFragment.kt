package com.gzeinnumer.viewpagerexamplekt.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gzeinnumer.viewpagerexamplekt.databinding.FragmentSecondViewpagerBinding
import com.gzeinnumer.viewpagerexamplekt.main.MainFagment

class SecondViewpagerFragment : Fragment() {
    private lateinit var binding: FragmentSecondViewpagerBinding

    companion object{
        fun newInstance() = SecondViewpagerFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondViewpagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                view.context,
                "Tekan",
                Toast.LENGTH_SHORT
            ).show()
        })
    }
}
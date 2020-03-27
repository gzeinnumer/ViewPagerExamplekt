package com.gzeinnumer.viewpagerexamplekt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gzeinnumer.viewpagerexamplekt.databinding.ActivityMainBinding
import com.gzeinnumer.viewpagerexamplekt.second.SecondFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.second_fragment, SecondFragment.newInstance())
        ft.commit()
    }
}

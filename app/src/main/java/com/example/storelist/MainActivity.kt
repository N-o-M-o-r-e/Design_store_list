package com.example.storelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.storelist.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.radioGrounp.setOnCheckedChangeListener { group, checkID ->
            if (checkID==R.id.rdoYearly){
                binding.view01T.visibility = View.VISIBLE
                binding.view02T.visibility = View.INVISIBLE
                binding.view03T.visibility = View.INVISIBLE
                binding.view04T.visibility = View.INVISIBLE
            }
            if (checkID==R.id.rdoLifetime){
                binding.view02T.visibility = View.VISIBLE
                binding.view01T.visibility = View.INVISIBLE
                binding.view03T.visibility = View.INVISIBLE
                binding.view04T.visibility = View.INVISIBLE
            }
            if (checkID==R.id.rdoMonthly){
                binding.view03T.visibility = View.VISIBLE
                binding.view02T.visibility = View.INVISIBLE
                binding.view01T.visibility = View.INVISIBLE
                binding.view04T.visibility = View.INVISIBLE
            }
            if  (checkID==R.id.rdoWeekly){
                binding.view04T.visibility = View.VISIBLE
                binding.view01T.visibility = View.INVISIBLE
                binding.view02T.visibility = View.INVISIBLE
                binding.view03T.visibility = View.INVISIBLE
            }
        }
    }
}
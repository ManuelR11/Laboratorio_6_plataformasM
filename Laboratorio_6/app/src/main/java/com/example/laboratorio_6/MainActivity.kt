package com.example.laboratorio_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    private lateinit var Home: Button
    private lateinit var Search: Button
    private lateinit var Librari: Button
    private lateinit var fragmentContainer: FragmentContainerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Home = findViewById(R.id.button)
        Search = findViewById(R.id.button2)
        Librari = findViewById(R.id.button3)

        setListeners()
    }

    private fun setListeners() {
        Home.setOnClickListener {
            setFragment(BlankFragment())
        }
        Search.setOnClickListener {
            setFragment(SearchFragment())
        }
        Librari.setOnClickListener {
            setFragment(Library())
        }
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit{
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer_mainActivity, fragment)
        }
    }
}
package com.example.myapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            showFragment(FirstFragment())
        }
    }
    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
    fun onFragmentResult(tag: String, result: String) {
        val resultText = if (tag == "FirstActivityResult") {
            "First Fragment result: $result"
        } else {
            "Second Fragment result: $result"
        }
        findViewById<TextView>(R.id.textViewResult).text = resultText
    }
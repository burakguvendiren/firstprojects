package com.burakguvendiren.firstprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println ("Hello  World")
        println (5 * 10)
        var a = 5
        var b = 10
        println (a * b)
        var old = 50
        println (old * 10 / 7)
        old = 15
        println (old * 10 / 7)


    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text : TextView = findViewById(R.id.text)
        val button : Button = findViewById(R.id.materialButton)
        data class SomeClass(var count:Int, var movie:String)
        val justObject = object{
            val someText : String = "Some text to test from OBJECT"
            fun copy() : String {
                return someText
            }
        }
        button.setOnClickListener {
            val textToView = "This text for test"
            text.text = justObject.copy()
        }
        val c = SomeClass(4,"Star Wars")
        val copyC = c.copy()
        println("Это копия $copyC")
        for(i in 1..10 ){
            println("попытка вывода $i")
        }
        var i : Int = 40
        while (i > 0) {
            print(i--)
        }
        val textView : TextView = findViewById(R.id.count)
        val textView2 : TextView = findViewById(R.id.movie)
        textView.text = c.count.toString()
        textView2.text = c.movie
    }


}
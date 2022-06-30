package com.example.myhomework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var name: EditText? = null
    private var height: EditText? = null
    private var weight: EditText? = null
    private var age: EditText? = null
    private var text1: TextView? = null
    private var text2: TextView? = null
    private var text3: TextView? = null
    private var text4: TextView? = null
    private var text5: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        name = findViewById(R.id.editTextTextPersonName)
        height = findViewById(R.id.editTextTextPersonName2)
        weight = findViewById(R.id.editTextTextPersonName3)
        age = findViewById(R.id.editTextTextPersonName4)
        text1 = findViewById(R.id.textView)
        text2 = findViewById(R.id.textView2)
        text3 = findViewById(R.id.textView3)
        text4 = findViewById(R.id.textView4)
        text5 = findViewById(R.id.textView5)
        button?.setOnClickListener{
            val el1: String = name?.text.toString()
            val el2: String = height?.text.toString()
            val el3: String = weight?.text.toString()
            val el4: String = age?.text.toString()
            var tf1: Boolean = true
            var tf2: Boolean = true
            var tf3: Boolean = true
            var tf4: Boolean = true

            if (el1.isEmpty()){
                tf1 = false
                text1?.setText("Впишите имя")
            }else{
                tf1 = true
                text1?.setText(" ")
            }
            if (el2.isNotEmpty()){
                if(el2.toInt() < 1 || el2.toInt() > 249){
                    tf2 = false
                    text2?.setText("Введите рост корректно")
                }else{
                    tf2 = true
                    text2?.setText(" ")
                }
            }
            if (el2.isEmpty()){
                text2?.setText("Впишите рост")
            }
            if(el3.isNotEmpty()){
                if(el3.toInt() < 1 || el3.toInt() > 249){
                    tf3 = false
                    text3?.setText("Введите вес корректно")
                }else{
                    tf3 = true
                    text3?.setText(" ")
                }
            }
            if(el4.isNotEmpty()){
                if(el4.toInt() < 1 || el4.toInt() > 149){
                    tf4 = false
                    text4?.setText("Введите возраст корректно")
                }else{
                    tf4 = true
                    text4?.setText(" ")
                }
            }
            if(tf1 && tf2 && tf3 && tf4){
                text5?.setText("${el1}, your daily calorie intake: ${el3.toDouble() * 10 + el2.toDouble() * 6.25 - el4.toDouble() * 5}")
            }

        }

    }
}
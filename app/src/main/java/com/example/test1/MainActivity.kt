@file:Suppress("UnusedImport")

package com.example.radio0621

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test1.databinding.ActivityMainBinding

import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Comment
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var address: String? = null
//メアド格納用変数
    private var pass: String? = null
//パスワード格納用変数

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    private fun saveData(address: String,pass: String){
        //入力されたデータを保存する

    }

    private fun referData(address: String,pass: String){
        //入力されたデータを参照する
    }

}

data class Login(
    val address: String,
    val pass: String
)

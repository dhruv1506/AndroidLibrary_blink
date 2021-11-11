package com.lib.androidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.lib.text_blink.BlinkEffect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_view:TextView =findViewById(R.id.txt_hello) as TextView
        BlinkEffect.blink(txt_view)

    }
}
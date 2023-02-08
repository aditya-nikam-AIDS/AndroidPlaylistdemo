package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonUpload= findViewById<Button>(R.id.btnupload)
        val buttonDownload=findViewById<Button>(R.id.btndownload)
        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "downloading.." , Toast.LENGTH_SHORT ).show()
        }
        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext,"uploading",Toast.LENGTH_SHORT).show()
        }
    }
}
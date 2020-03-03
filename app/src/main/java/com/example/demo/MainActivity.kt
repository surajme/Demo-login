package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Create", "onCreate Called")

        setContentView(R.layout.activity_main)

        val nameET = findViewById<EditText>(R.id.nameEt)
        val phoneEt = findViewById<EditText>(R.id.phoneEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)


        //Handle button click
        saveBtn.setOnClickListener {

            //get texts from editTexts

            val name = nameET.text.toString()
            val phone = phoneEt.text.toString()

            //intent to start new activity

            if (name.contains("suraj", ignoreCase = false) && phone.contains("9431", ignoreCase = false)) {
                Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_LONG).show()

                val intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("Name", name)
                intent.putExtra("Phone", phone)
                startActivity(intent)

            } else {
                Toast.makeText(applicationContext, "Please Enter Correct Value!!!!", Toast.LENGTH_SHORT).show()

            }

        }
    }
}

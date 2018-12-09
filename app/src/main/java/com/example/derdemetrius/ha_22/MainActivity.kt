package com.example.derdemetrius.ha_22

import android.content.Context
import android.os.Bundle

import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

import android.provider.MediaStore
import android.content.Intent
import android.graphics.Bitmap
import android.hardware.camera2.CameraManager

import android.hardware.camera2.CameraAccessException
import android.util.Log
import android.widget.Toast
import android.support.v4.app.ActivityCompat.startActivityForResult
import com.example.derdemetrius.ha_22.R.id.image


class MainActivity : AppCompatActivity()
{

    private val REQUEST_IMAGE_CAPTURE = 1

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun takePictureIntent() {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (takePictureIntent.resolveActivity(packageManager) != null) {
               startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
        button2.setOnClickListener {
            if (editText.getText().toString().equals(""))
                Toast.makeText(this@MainActivity, "Введите имя", Toast.LENGTH_SHORT).show()
            else
                //Toast.makeText(this@MainActivity, "вы ввели имя", Toast.LENGTH_SHORT).show()
            takePictureIntent()
            }
            }
}




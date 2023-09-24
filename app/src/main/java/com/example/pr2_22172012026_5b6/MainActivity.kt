package com.example.pr2_22172012026_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val test="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Display("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Display("onStart called")
    }

    override fun onResume() {
        super.onResume()
        Display("onResume called")
    }

    override fun onPause() {
        super.onPause()
        Display("onPause called")
    }
    override fun onStop() {
        super.onStop()
        Display("onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Display("onDestroy called")
    }
    fun Display(msg:String){
        Toast.makeText(this,"$msg",Toast.LENGTH_LONG).show()
        Log.i(test, "$msg")
        Snackbar.make(findViewById(R.id.l1),"$msg",Snackbar.LENGTH_LONG).show()

    }
}

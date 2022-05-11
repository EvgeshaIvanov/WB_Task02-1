package com.example.secondweeklifecycleapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.secondweeklifecycleapp.databinding.ActivityMainBinding
import com.example.secondweeklifecycleapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag", "Second activity - OnCreate")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showAlertDialog()

    }

    private fun showAlertDialog() {

        val dialog = AlertDialog.Builder(this)
            .setCancelable(false)
            .setTitle("В какое активити вы хотите перейти?")
            .setItems(arrayOf("Main Activity", "First Activity (с фрагментами)"),DialogInterface.OnClickListener { dialogInterface, i ->
                when(i){
                    0 -> startActivity(Intent(this, MainActivity::class.java))
                    1 -> startActivity(Intent(this, FirstActivity::class.java))
                }
            })

            .setNeutralButton("Отмена") { dialog, i -> dialog.cancel() }
            .create()
        dialog.show()

    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "Second activity - OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "Second activity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "Second activity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "Second activity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "Second activity - onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MyTag", "Second activity - onSaveInstanceState")
    }
}
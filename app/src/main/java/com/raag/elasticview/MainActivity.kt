package com.raag.elasticview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.raag.elasticview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply{
        setContentView(root)

            elasticView.setOnClickListener {
                Toast.makeText(this@MainActivity, "Elastic View", Toast.LENGTH_LONG)
                        .show()
            }

        }

    }
}
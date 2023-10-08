package com.fabiokusaba.listatelefonica.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fabiokusaba.listatelefonica.R
import com.fabiokusaba.listatelefonica.databinding.ActivityContactImageSelectionBinding

class ContactImageSelectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactImageSelectionBinding
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactImageSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        i = intent

        binding.imageProfile6.setOnClickListener { 
            sendID(R.drawable.profile6)
        }

        binding.imageProfile5.setOnClickListener {
            sendID(R.drawable.profile5)
        }

        binding.imageProfile4.setOnClickListener {
            sendID(R.drawable.profile4)
        }

        binding.imageProfile1.setOnClickListener {
            sendID(R.drawable.profile1)
        }

        binding.imageProfile8.setOnClickListener {
            sendID(R.drawable.profile8)
        }

        binding.imageProfile2.setOnClickListener {
            sendID(R.drawable.profile2)
        }

        binding.buttonRemoveImage.setOnClickListener {
            sendID(R.drawable.profiledefault)
        }
    }

    private fun sendID(id: Int) {
        i.putExtra("id", id)
        setResult(1, i)
        finish()
    }
}
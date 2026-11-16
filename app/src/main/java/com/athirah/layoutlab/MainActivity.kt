package com.athirah.layoutlab

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.athirah.layoutlab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLinear.setOnClickListener { open(LinearActivity::class.java) }
        binding.btnRelative.setOnClickListener { open(RelativeActivity::class.java) }
        binding.btnConstraint.setOnClickListener { open(ConstraintActivity::class.java) }
        binding.btnFrame.setOnClickListener { open(FrameActivity::class.java) }
        binding.btnTable.setOnClickListener { open(TableActivity::class.java) }
        binding.btnRecycler.setOnClickListener { open(RecyclerActivity::class.java) }
    }
    private fun open(target: Class<*>) = startActivity(Intent(this, target))
}
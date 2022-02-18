package edu.fullerton.ecs.mdap.crosswalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var clearButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name: EditText = findViewById(R.id.name)

        val addButton: Button = findViewById(R.id.add)
        addButton.setOnClickListener {
            val toast = Toast.makeText(this, "Adding ${name.text}.", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}
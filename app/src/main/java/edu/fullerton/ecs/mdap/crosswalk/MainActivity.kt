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
        val address: EditText = findViewById(R.id.address)


        val addButton: Button = findViewById(R.id.add)
        addButton.setOnClickListener {
            // val toast = Toast.makeText(this, "Adding ${name.text}.", Toast.LENGTH_SHORT)  || Old, used for one address
            val toast = Toast.makeText(this, "Adding ${name.text} @ ${(address.text)}", Toast.LENGTH_SHORT) // adds intersection
            toast.show()

        }
        val clearButton: Button = findViewById(R.id.clear)
        clearButton.setOnClickListener {
            val toast = Toast.makeText(this, "Clearing Fields!", Toast.LENGTH_SHORT) // mounts clear, adds toast when used
            address.setText(null) // archaic way derrived from Java, uses default setters to override as NULL
            name.setText(null)
            toast.show()

        }

    }
}
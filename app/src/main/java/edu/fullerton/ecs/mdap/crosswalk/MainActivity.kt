package edu.fullerton.ecs.mdap.crosswalk

import android.os.Bundle
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    lateinit var clearButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //CheckifCorrect()
        val name: EditText = findViewById(R.id.name)
        val address: EditText = findViewById(R.id.address)
        val announcer: EditText = findViewById(R.id.announcer)
        val lettersRight: EditText = findViewById(R.id.LettersRight)
        val wordList = listOf("cat")
        val word = wordList.random()
        val addButton: Button = findViewById(R.id.add)
        var i = 0
        //val result = 1;
        /*
        fun CheckifCorrect() {
            if (result == 0) {
                val toast =
                    Toast.makeText(this, "words are equal", Toast.LENGTH_SHORT)
                toast.show()
                announcer.setText("Correct")
                // TODO letterOne.filters = arrayOf(InputFilter.LengthFilter(10)) setting all previous grid to unmutable
            }
        }
        */

        fun GameMechanic () {
                val letterOne: String = findViewById<EditText>(R.id.letterOne).text.toString().lowercase()
                val letterTwo: String = findViewById<EditText>(R.id.letterTwo).text.toString().lowercase()
                val letterThree: String = findViewById<EditText>(R.id.letterThree).text.toString().lowercase()

                val RTwoLetterOne: String = findViewById<EditText>(R.id.RTwoLetterOne).text.toString().lowercase()
                val RTwoLetterTwo: String = findViewById<EditText>(R.id.RTwoLetterTwo).text.toString().lowercase()
                val RTwoLetterThree: String = findViewById<EditText>(R.id.RTwoLetterThree).text.toString().lowercase()

                val RThreeLetterOne: String = findViewById<EditText>(R.id.RThreeLetterOne).text.toString().lowercase()
                val RThreeLetterTwo: String = findViewById<EditText>(R.id.RThreeLetterTwo).text.toString().lowercase()
                val RThreeLetterThree: String = findViewById<EditText>(R.id.RThreeLetterThree).text.toString().lowercase()

                val RFourLetterOne: String = findViewById<EditText>(R.id.RFourLetterOne).text.toString().lowercase()
                val RFourLetterTwo: String = findViewById<EditText>(R.id.RFourLetterTwo).text.toString().lowercase()
                val RFourLetterThree: String = findViewById<EditText>(R.id.RFourLetterThree).text.toString().lowercase()

                val RFiveLetterOne: String = findViewById<EditText>(R.id.RFiveLetterOne).text.toString().lowercase()
                val RFiveLetterTwo: String = findViewById<EditText>(R.id.RFiveLetterTwo).text.toString().lowercase()
                val RFiveLetterThree: String = findViewById<EditText>(R.id.RFiveLetterThree).text.toString().lowercase()

                var wordGuessed = letterOne + letterTwo + letterThree
                if(i == 1){
                    wordGuessed = RTwoLetterOne + RTwoLetterTwo + RTwoLetterThree
                }
                if(i == 2){
                    wordGuessed = RThreeLetterOne + RThreeLetterTwo + RThreeLetterThree
                }
                if(i == 3){
                    wordGuessed = RFourLetterOne + RFourLetterTwo + RFourLetterThree
                }
                if(i == 4){
                    wordGuessed = RFiveLetterOne + RFiveLetterTwo + RFiveLetterThree
                }
                // TODO make above initialization its own func ^^^

            name.setText(wordGuessed)
            address.setText(word)
            var result = wordGuessed.compareTo(word)
            //CheckifCorrect(result)

            if(i != 5) {
                if (result == 0) {
                    val toast =
                        Toast.makeText(this, "words are equal", Toast.LENGTH_SHORT)
                    toast.show()
                    announcer.setText("Correct")
                    // TODO letterOne.filters = arrayOf(InputFilter.LengthFilter(10)) setting all previous grid to unmutable
                }else{
                    ++i
                    val toast =
                        Toast.makeText(this, "words are not equal", Toast.LENGTH_SHORT)
                    toast.show()
                    announcer.setText("not quite ")
                    val wordArray = Array(wordGuessed.length) {wordGuessed[it].toString() }
                    val word = Array(word.length) {word[it].toString() }
                    val t = word.size
                    // TODO for length of array, compare arrays to check for dupes
                    }
                    /*
                    if(wordGuessed.contains(word, true)){
                        val wordArray = Array(wordGuessed.length) {wordGuessed[it].toString() }
                        lettersRight.setText(word)
                     */
                        // TODO uses a contains method to check if letters are correct; doesn't work


            }else if(i == 5){
                val toast =
                    Toast.makeText(this, "Out of tries", Toast.LENGTH_SHORT)
                toast.show()
                announcer.setText("Failed")
            }

        }

        addButton.setOnClickListener {
            GameMechanic()
        }


        val clearButton: Button = findViewById(R.id.clear)
        clearButton.setOnClickListener {
        }

    }


}

// while attempt > 3 keep going, attempt 3 = fail ( for checking row) i + 1 to check row
// difficulty easy = attempt > 4 + n--

// val toast = Toast.makeText(this, "Adding ${name.text}.", Toast.LENGTH_SHORT)  || Old, used for one address
//val toast = Toast.makeText(this, "Adding ${name.text} @ ${(address.text)}", Toast.LENGTH_SHORT) // adds intersection
//toast.show()
//val toast = Toast.makeText(this, "Adding ${name.text} @ ${(address.text)}", Toast.LENGTH_SHORT) // adds intersection

/*
val wordGuessed: String = findViewById<EditText>(R.id.name).text.toString()
name.setText(wordGuessed)
address.setText(word)
val result = wordGuessed.compareTo(word)
if (result == 0) {
    val toast =
        Toast.makeText(this, "words are equal", Toast.LENGTH_SHORT) // adds intersection
    toast.show()

}
*/

/*
val toast = Toast.makeText(this, "Clearing Fields!", Toast.LENGTH_SHORT) // mounts clear, adds toast when used
address.setText(null) // archaic way derrived from Java, uses default setters to override as NULL
name.setText(null)
    val letterOne: EditText = findViewById(R.id.letterOne)
    letterOne.setText(null)
    val letterTwo: EditText = findViewById(R.id.letterTwo)
    letterTwo.setText(null)
    val letterThree: EditText = findViewById(R.id.letterThree)
    letterThree.setText(null)
toast.show()
*/
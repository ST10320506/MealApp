package vcmsa.ci.mealapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } //end of ViewCompat

        //Declaring the variables on the user interface
        val inputTime = findViewById<EditText>(R.id.editTextInput)
        val generateMealButton = findViewById<Button>(R.id.Btngenerate)

        //Declaring the button function that when clicked will generate the meal suggestions
        generateMealButton.setOnClickListener {
            //If statements for when the user enters different times of the day
            //Reference: https://github.com/liehanels/NumberGuesser
            if(inputTime.text.toString() == "Morning") {
                //Intent code is used to pass this information "Morning" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface
                val intent = Intent (this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Mid-morning") {
                //Intent code is used to pass this information "Mid-morning" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface
                val intent = Intent (this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Afternoon") {
                //Intent code is used to pass this information "Afternoon" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Mid-afternoon") {
                //Intent code is used to pass this information "Mid-afternoon" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Dinner") {
                //Intent code is used to pass this information "Dinner" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if(inputTime.text.toString() == "Dessert") {
                //Intent code is used to pass this information "Dessert" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)
            }
            //the final else statement displays an error message when the user has entered incorrect information
            // Reference: https://github.com/liehanels/NumberGuesser
            else {
                //Toast message to display a prompt when the user has entered incorrect information
                //Reference: https://github.com/liehanels/NumberGuesser
                Toast.makeText(this, "Please enter a valid time of day", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
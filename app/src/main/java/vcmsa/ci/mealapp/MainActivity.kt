package vcmsa.ci.mealapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
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

        //Declaring the variables on the user interface - edit text input for the user to enter time of day and button to generate a meal suggestion once clicked
        val inputTime = findViewById<EditText>(R.id.editTextInput)
        val generateMealButton = findViewById<Button>(R.id.Btngenerate)

        //Declaring the button function that when clicked will generate the meal suggestions
        generateMealButton.setOnClickListener {
            //If statements for when the user enters different times of the day
            //Reference: https://github.com/liehanels/NumberGuesser - Liehan Els, 2025. Liehan had written code to help with understanding if statements. [online] Available at: <https://github.com/liehanels/NumberGuesser> [Accessed 31 March 2025].
            if(inputTime.text.toString() == "Morning") {
                //Logging function for debugging purposes
                //Reference: https://github.com/liehanels/CalculatorApp - Liehan Els, 2025. Liehan had written code to help with understanding and using log functions. [online] Available at: <https://github.com/liehanels/CalculatorApp> [Accessed 02 April 2025].
                Log.d("MainActivity", "Entered Morning")
                //Intent code is used to pass this information "Morning" to the second screen (Generated Suggestions Activity)
                //Reference: https://github.com/liehanels/UserInterface - Liehan Els, 2025. Liehan had written code to show how to pass information between two screens/activities. [online] Available at: <https://github.com/liehanels/UserInterface> [Accessed 31 March 2025].
                val intent = Intent (this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Mid-morning") {
                Log.d("MainActivity", "Entered Mid-morning")
                //Intent code is used to pass this information "Mid-morning" to the second screen (Generated Suggestions Activity)
                val intent = Intent (this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Afternoon") {
                Log.d("MainActivity", "Entered Afternoon")
                //Intent code is used to pass this information "Afternoon" to the second screen (Generated Suggestions Activity)
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Mid-afternoon") {
                Log.d("MainActivity", "Entered Mid-afternoon")
                //Intent code is used to pass this information "Mid-afternoon" to the second screen (Generated Suggestions Activity)
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if (inputTime.text.toString() == "Dinner") {
                Log.d("MainActivity", "Entered Dinner")
                //Intent code is used to pass this information "Dinner" to the second screen (Generated Suggestions Activity)
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)

            } else if(inputTime.text.toString() == "Dessert") {
                Log.d("MainActivity", "Entered Dessert")
                //Intent code is used to pass this information "Dessert" to the second screen (Generated Suggestions Activity)
                val intent = Intent(this, GeneratedSuggestionsActivity::class.java)
                intent.putExtra("inputTime", inputTime.text.toString())
                startActivity(intent)
            }
            //the final else statement displays an error message when the user has entered incorrect information
            //Reference: https://github.com/liehanels/NumberGuesser - Liehan Els, 2025. Liehan had written code to help with understanding if statements. [online] Available at: <https://github.com/liehanels/NumberGuesser> [Accessed 31 March 2025].
            else {
                //Toast message to display a prompt when the user has entered incorrect information
                //Reference: https://github.com/liehanels/NumberGuesser - Liehan Els, 2025. Liehan had written code to help with understanding how to use a TOAST message. [online] Available at: <https://github.com/liehanels/NumberGuesser> [Accessed 31 March 2025].
                Toast.makeText(this, "Please enter a valid time of day", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
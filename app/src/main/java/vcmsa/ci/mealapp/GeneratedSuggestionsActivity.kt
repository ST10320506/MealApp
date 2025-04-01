package vcmsa.ci.mealapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GeneratedSuggestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_generated_suggestions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// end of ViewCompat

        //Declaring the time input variable used from the previous activity - Main Activity
        //Reference: https://github.com/liehanels/UserInterface - Liehan Els, 2025. Liehan had written code to show how to receive information from screen 1 / main activity to this screen. [online] Available at: <https://github.com/liehanels/UserInterface> [Accessed 31 March 2025].
        val intent: Intent = intent
        val inputTime = intent.getStringExtra("inputTime")

        //Declaring the text view to display the meal suggestions and reset button to clear user input ad return to Main Activity screen
        val displayTextView = findViewById<TextView>(R.id.textViewDisplay)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //Nested if statements for when the user enters the time of day in the Main Activity
        //Reference: https://github.com/liehanels/NumberGuesser - Liehan Els, 2025. Liehan had written code to help with understanding if statements. [online] Available at: <https://github.com/liehanels/NumberGuesser> [Accessed 31 March 2025].
        if (inputTime == "Morning") {
            // Text Views will display the time of day entered by the user in Main Activity
            // once this information has passed to the second screen it will display the meal suggestion linked to the time of day entered
            //Reference: https://github.com/liehanels/UserInterface - Liehan Els, 2025. Liehan had written code to show how to display the information being passed from screen 1/ Main Activity to this screen. [online] Available at: <https://github.com/liehanels/UserInterface> [Accessed 31 March 2025].
            displayTextView.text = "The meal suggestions for $inputTime are as follows: \n Bacon and Eggs or \n Toast. " +
                    "\nTo Drink: Juice or a hot beverage (eg: coffee)."
        } else if (inputTime == "Mid-morning") {
            displayTextView.text = "The meal suggestions for $inputTime snacks are as follows: \n A yogurt bowl with fruit or nuts"
        } else if (inputTime == "Afternoon") {
            displayTextView.text = "The meal suggestions for $inputTime are as follows: \n Wraps with chicken and lettuce filling or \n a Sandwich. "+
                    "\nTo Drink: Juice or a cooldrink."
        } else if (inputTime == "Mid-afternoon") {
            displayTextView.text = "The meal suggestions for $inputTime snacks are as follows: \n a sweet treat: a slice of cake or chips. "
        } else if (inputTime == "Dinner") {
            displayTextView.text = "The meal suggestions for $inputTime are as follows: \n Cajun or Mac and Cheese Pasta or \n Tacos. "+
                    "\nTo Drink: Cooldrink or a mocktail"
        } else if (inputTime == "Dessert") {
            displayTextView.text = "The meal suggestions for $inputTime are as follows: \n Ice-cream or Cake of your choice \n or Popcorn"
        }

        //This button will allow the user to clear the meal suggestion and return to the Main Activity screen
        //Reference: https://github.com/liehanels/UserInterface - Liehan Els, 2025. Liehan had written code to show how to clear and return to screen 1/ Main Activity using a button. [online] Available at: <https://github.com/liehanels/UserInterface> [Accessed 31 March 2025].
        resetButton.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

    }
}
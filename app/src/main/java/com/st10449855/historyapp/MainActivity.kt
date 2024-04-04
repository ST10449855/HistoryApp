package com.st10449855.historyapp
//Aphiwe Njabulo Ndlovu
//https://www.geeksforgeeks.org/kotlin-if-else-expression/?ref=gcse

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare variables
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        searchButton= findViewById(R.id.Searchbutton)
        clearButton= findViewById(R.id.ClearButton)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resulttextView2)

        searchButton.setOnClickListener {
            // create a variable of age to get value from user

            val age = ageInput.text.toString().toIntOrNull()

            // if age is not full and age is in range between 10 and 100
            if (age != null && age in 20..100) {
                val HistoryName = when (age) {
                    95 -> "Nelson Mandela. You are 95 years old. which is the same age as Nelson Mandela. He was a famous historical figure."
                    60 -> "Diego Maradona. You are 60 years old. which is the same age as Diego Maradona. He was a famous historical figure."
                    91 -> "Walter Sisulu. You are 91 years old. which is the same age as Walter Sisulu. He was a famous historical figure."
                    51 -> "Chris Hani. You are 51 years old. which is the same age as Chris Hani. He was a famous historical figure."
                    41 -> "Shaka Zulu. You are 41 years old. which is the same age as Shaka Zulu. He was a famous historical figure."
                    32 -> "Alexander The Great. You are 32 years old. which is the same age as Alexander The Great. He was a famous historical figure."
                    69 -> "Muammar Muhmmad Abu Minyar al-Gaddafi. You are 69 years old. which is the same age as Muammar Muhmmad Abu Minyar al-Gaddafi. He was a famous historical figure."
                    54 -> "Senzangakhona. You are 54 years old. which is the same age as Senzangakhona. He was a famous historical figure."
                    30 -> "Steve Biko. You are 30 years old. which is the same age as Steve Biko. He was a famous historical figure."
                    else -> null

                }
                val message = if (HistoryName != null) "The historian  name is $HistoryName."
                else "No historian found with the entered age."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100"
            }
        }
    clearButton.setOnClickListener {
        ageInput.text.clear()
        resultTextView.text = ""
    }






    }
}
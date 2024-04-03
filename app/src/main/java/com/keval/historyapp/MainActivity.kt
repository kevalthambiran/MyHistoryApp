package com.keval.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class   MainActivity : AppCompatActivity() {
    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialise
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val FamousPerson = when (age) {
                    20 -> "XXXTentacion he was a famous singer that created songs that touch peoples souls through music "
                    30 -> "Chris Farley died at the age of 30. He was a famous comedian from america  who made people laugh so hard they cried  "
                    40 -> "Paul walker age 40 years was a icon for people who where big fans of cars "
                    50 -> "Micheal Jackson died at the age of 50 . He was a famous singer who sang songs that are known across the world "
                    60->" Diego Maradona was one of the best soccer players in the world . He was considered the greatest footballer of all time  "
                    70->"Niki lauda was a austrian formula one driver and was considered the greatest f1 driver of all time"
                    80->"John Delorean was a american inventor who created the car from back to the future called Delorean"
                    90->"Sean Connery was the first actor to play the famous movie James Bond"
                    100->"Glynis Johns the famous actress who played the famous movie Mary Poppins"
                    else -> null
                }
                val message = if (FamousPerson != null) "The famous persons name is  $FamousPerson"
                else "No employee found with the entered age"
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid input.Please enter a valid age between 20 and 100."
            }
            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
        }
    }
}

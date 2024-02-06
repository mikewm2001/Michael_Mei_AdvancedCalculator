package com.bignerdranch.android.michael_mei_advancedcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one: Button = findViewById(R.id.one)
        val two: Button = findViewById(R.id.two)
        val three: Button = findViewById(R.id.three)
        val four: Button = findViewById(R.id.four)
        val five: Button = findViewById(R.id.five)
        val six: Button = findViewById(R.id.six)
        val seven: Button = findViewById(R.id.seven)
        val eight: Button = findViewById(R.id.eight)
        val nine: Button = findViewById(R.id.nine)
        val zero: Button = findViewById(R.id.zero)
        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val star: Button = findViewById(R.id.star)
        val div: Button = findViewById(R.id.divide)
        val sqrt: Button = findViewById(R.id.sqrt)
        val equals: Button = findViewById(R.id.equals)
        val solution: EditText = findViewById(R.id.editTextNumberDecimal)

        var val1 = 0.0
        var val2 = 0.0
        var operator = ""

        one.setOnClickListener {
            val newNum = getString(R.string.one)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        two.setOnClickListener {
            val newNum = getString(R.string.two)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        three.setOnClickListener {
            val newNum = getString(R.string.three)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        four.setOnClickListener {
            val newNum = getString(R.string.four)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        five.setOnClickListener {
            val newNum = getString(R.string.five)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        six.setOnClickListener {
            val newNum = getString(R.string.six)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        seven.setOnClickListener {
            val newNum = getString(R.string.seven)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        eight.setOnClickListener {
            val newNum = getString(R.string.eight)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        nine.setOnClickListener {
            val newNum = getString(R.string.nine)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        zero.setOnClickListener {
            val newNum = getString(R.string.zero)
            val currentNum = solution.text.toString()
            solution.setText("$currentNum$newNum")
        }
        plus.setOnClickListener {
            val currentNum = solution.text.toString()
            val1 = currentNum.toDouble()
            solution.setText("")
            operator = "plus"

        }
        minus.setOnClickListener {
            val currentNum = solution.text.toString()
            val1 = currentNum.toDouble()
            solution.setText("")
            operator = "minus"

        }
        star.setOnClickListener {
            val currentNum = solution.text.toString()
            val1 = currentNum.toDouble()
            solution.setText("")
            operator = "star"

        }
        div.setOnClickListener {
            val currentNum = solution.text.toString()
            val1 = currentNum.toDouble()
            solution.setText("")
            operator = "div"

        }
        sqrt.setOnClickListener {
            val currentNum = solution.text.toString()
            val1 = currentNum.toDouble()
            operator = "sqrt"
            val output = sqrt(val1)
            solution.setText(output.toString())

        }
        equals.setOnClickListener {
            val currentNum = solution.text.toString()
            val2 = currentNum.toDouble()
            if (operator == "plus") {
                val output = val1 + val2
                solution.setText(output.toString())
            }
            else if (operator == "minus") {
                val output = val1 - val2
                solution.setText(output.toString())
            }
            else if (operator == "star") {
                val output = val1 * val2
                solution.setText(output.toString())
            }
            else if (operator == "div") {
                if (val2 == 0.0) {
                    val snack = Snackbar.make(
                        it,
                        R.string.div_zero,
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
                else {
                    val output = val1 / val2
                    solution.setText(output.toString())
                }

            }
        }
    }
}
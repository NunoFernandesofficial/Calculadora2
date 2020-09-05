package com.example.calculadorabasica

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber = ""
    var op = "+"
    var result = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if (isNewOp)
            editText.setText("")
        isNewOp = false
        var buclick = editText.text.toString()
        var buselect = view as Button
        when (buselect.id) {
            bu1.id -> {
                buclick += "1"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)

            }
            bu2.id -> {
                buclick += "2"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            bu3.id -> {
                buclick += "3"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            bu4.id -> {
                buclick += "4"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            bu5.id -> {
                buclick += "5"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            bu6.id -> {
                buclick += "6"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)

            }
            bu7.id -> {
                buclick += "7"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            bu8.id -> {
                buclick += "8"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            bu9.id -> {
                buclick += "9"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            bu0.id -> {
                buclick += "0"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            buDot.id -> {
                buclick += "."
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            buDot.id -> {
                buclick += ""
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            buPlusMinus.id -> {
                buclick = "-$buclick"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
            }
            buPi.id -> {
                buclick += "3.14"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)

            }


        }
        editText.setText(buclick)


    }

    fun operatorEvent(view: View) {
        isNewOp = true
        oldNumber = editText.text.toString()
        var buselect = view as Button

        when (buselect.id) {
            buMultiply.id -> {
                op = "*"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_buttonazul)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            buPlus.id -> {
                op = "+"
                buPlus.setBackgroundResource(R.drawable.my_buttonazul)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            buMinus.id -> {
                op = "-"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_buttonazul)
                buDivide.setBackgroundResource(R.drawable.my_button2)
            }
            buDivide.id -> {
                op = "/"
                buPlus.setBackgroundResource(R.drawable.my_button2)
                buMultiply.setBackgroundResource(R.drawable.my_button2)
                buMinus.setBackgroundResource(R.drawable.my_button2)
                buDivide.setBackgroundResource(R.drawable.my_buttonazul)
            }
            buEqual.id -> {
                op = "="
            }


        }



    }



    fun equalEvent(view: View) {

        var newNumber = editText.text.toString()

        buPlus.setBackgroundResource(R.drawable.my_button2)
        buMultiply.setBackgroundResource(R.drawable.my_button2)
        buDivide.setBackgroundResource(R.drawable.my_button2)
        buMinus.setBackgroundResource(R.drawable.my_button2)

        when (op) {
            "+" -> {
                result = oldNumber.toDouble() + newNumber.toDouble()
            }
            "*" -> {
                result = oldNumber.toDouble() * newNumber.toDouble()
                }
            "/" -> {
                result = oldNumber.toDouble() / newNumber.toDouble()
            }
            "-" -> {
                result = oldNumber.toDouble() - newNumber.toDouble()
            }


        }
        editText.setText(result.toString().take(4))

    }

    fun ApagarEvent(view: View) {
        editText.setText("0")
        isNewOp = true
        buPlus.setBackgroundResource(R.drawable.my_button2)
        buMultiply.setBackgroundResource(R.drawable.my_button2)
        buMinus.setBackgroundResource(R.drawable.my_button2)
        buDivide.setBackgroundResource(R.drawable.my_button2)


    }


}















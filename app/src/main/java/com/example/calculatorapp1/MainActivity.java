package com.example.calculatorapp1;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String oldNumber="";

    String op= "+";
    boolean isNewOp = true;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.txt1);
    }


    public void numberEvent(View view) {
        if(isNewOp)
            edit1.setText("");
        isNewOp = false;
        String number = edit1.getText().toString();
        switch (view.getId()){
            case R.id.btn1:
                number += "1";
                break;

            case R.id.btn2:
                number += "2";
                break;

            case R.id.btn3:
                number += "3";
                break;

            case R.id.btn4:
                number += "4";
                break;

            case R.id.btn5:
                number += "5";
                break;
            case R.id.btn6:
                number += "6";
                break;
            case R.id.btn7:
                number += "7";
                break;
            case R.id.btn8:
                number += "8";
                break;

            case R.id.btn9:
                number += "9";
                break;

            case R.id.btn0:
                number += "0";
                break;

            case R.id.btnpoint:
                number += ".";
                break;

            case R.id.btnPlusMinus:
                number += "+/-";
                break;
        }
        edit1.setText(number);
    }


    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = edit1.getText().toString();
        switch (view.getId()){
            case  R.id.btndivide: op = "/"; break;
            case  R.id.btnmultiply: op = "x"; break;
            case  R.id.btnadd: op = "+"; break;
            case  R.id.btnsubtract: op = "-"; break;


        }

    }


    public void equalEvent(View view) {
        String newNumber = edit1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = parseDouble(oldNumber) + parseDouble(newNumber);
                break;

            case "-":
                result = parseDouble(oldNumber) - parseDouble(newNumber);
                break;

            case "/":
                result = parseDouble(oldNumber) / parseDouble(newNumber);
                break;

            case "x":
                result = parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;

        }
        edit1.setText(result + "");

    }

    public void acEvent(View view) {
        edit1.setText("0");
        isNewOp = true;
    }

    public void percentEvent(View view) {
        double no = Double.parseDouble(edit1.getText().toString())/100;
        edit1.setText(no + "");
        isNewOp= true;

    }
}
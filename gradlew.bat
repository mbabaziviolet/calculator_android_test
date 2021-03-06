package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.put1);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
                
            }
        });
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
        display.setSelection(cursorPos + );


    }

    public void zeroBTN(View view){
        updateText("0");

    }

    public void button1(View view){
        updateText("1");

    }

    public void button2(View view){
        updateText("2");

    }
    public void button3(View view){
        updateText("3");

    }
    public void button4(View view){
        updateText("4");

    }
    public void button5(View view){
        updateText("5");

    }
    public void button6(View view){
        updateText("6");

    }
    public void button7(View view){
        updateText("7");

    }
    public void button8(View view){
        updateText("8");

    }
    public void button9(View view){
        updateText("9");

    }
    public void plusM(View view){
        updateText("+/-");

    }
    public void equalsBTN(View view){
        updateText("=");

    }
    public void divide1(View view){
        updateText("/");

    }
    public void multiply1(View view){
        updateText("x");

    }
    public void subtract1(View view){
        updateText("-");

    }
    public void modulus(View view){
        updateText("%");

    }
    public void add1(View view){
        updateText("+");

    }
    public void point1(View view){
        updateText(".");

    }
    public void parenthe1(View view){
        updateText("()");

    }

}                                                                                                                                                                                                                                       
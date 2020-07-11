package com.example.utkcalci;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Basic extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    long  num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }
    public boolean getNumbers()
    {
        // defining the edit text 1 to e1
        e1 = (EditText)findViewById(R.id.num1);
        e2 = (EditText)findViewById(R.id.num2);
        t1 = (TextView)findViewById(R.id.result);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        // condition to check if box is not empty
        if (s1.equals("") && s2.equals("")) {
            String result = "Please enter a value";
            t1.setText(result);
            return false;
        }
        else {
            num1 = Long.parseLong(e1.getText().toString());
            num2 = Long.parseLong(e2.getText().toString());
        }
        return true;
    }
    // a public method to perform addition
    @SuppressLint("SetTextI18n")
    public void doSum(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            long sum = num1 + num2;
            t1.setText(Long.toString(sum));
        }
    }
    // a public method to perform power function
    @SuppressLint("SetTextI18n")
    public void doPow(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
    }
    // a public method to perform subtraction
    @SuppressLint("SetTextI18n")
    public void doSub(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            long sum = num1 - num2;
            t1.setText(Long.toString(sum));
        }
    }
    // a public method to perform multiplication
    @SuppressLint("SetTextI18n")
    public void doMul(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            long sum = num1 * num2;
            t1.setText(Long.toString(sum));
        }
    }
    // a public method to perform Division
    @SuppressLint("SetTextI18n")
    public void doDiv(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            // displaying the text in text view assigned as t1
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
    }
    // a public method to perform modulus function
    @SuppressLint("SetTextI18n")
    public void doMod(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
    }
}

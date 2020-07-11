package com.example.utkcalci;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lcmhcf extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcmhcf);
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
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
        }
        return true;
    }
    @SuppressLint("SetTextI18n")
    public void doTri(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            double sum = num1 * num2 * 0.5;
            t1.setText(Double.toString(sum));
        }
    }
    @SuppressLint("SetTextI18n")
    public void doRect(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            double sum = num1 * num2;
            t1.setText(Double.toString(sum));
        }
    }
    @SuppressLint("SetTextI18n")
    public void doHcf(View v){
        if (getNumbers()) {
            while (num1 != num2) {
                if (num1 > num2)
                    num1 = num1 - num2;
                else
                    num2 = num2 - num1;
            }
            t1.setText(Integer.toString(num1));
        }
    }
    @SuppressLint("SetTextI18n")
    public void doLcm(View v) {
        if (getNumbers()) {
            int a=num1;
            int b=num2;
            while (a != b) {
                if (a> b)
                    a = a - b;
                else
                    b = b - a;
            }
            int ans=(num1*num2)/a;
            t1.setText(Integer.toString(ans));
        }
    }

}

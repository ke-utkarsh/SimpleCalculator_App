package com.example.utkcalci;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class Bank extends AppCompatActivity {
    EditText e1, e2, e3;
    TextView t1;
    int num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
    }
    public boolean getNumbers()
    {
        // defining the edit text 1 to e1
        e1 = (EditText)findViewById(R.id.num1);
        e2 = (EditText)findViewById(R.id.num2);
        e3 = (EditText)findViewById(R.id.num3);

        t1 = (TextView)findViewById(R.id.result);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        String s3 = e3.getText().toString();
        // condition to check if box is not empty
        if (s1.equals("") && s2.equals("") && s3.equals("")) {
            String result = "Please enter a value";
            t1.setText(result);
            return false;
        }
        else {
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
            num3 = Integer.parseInt(e3.getText().toString());
        }
        return true;
    }
    @SuppressLint("SetTextI18n")
    public void doSi(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            double sum = (num1 * num2 * num3)/100.0;
            sum=sum+num1;
            t1.setText(Double.toString(sum));
        }
    }
    @SuppressLint("SetTextI18n")
    public void doCi(View v)
    {
        // get the input numbers
        if (getNumbers()) {
            double sum=num1*(Math.pow((1+num2/100.0),num3));
            t1.setText(Double.toString(sum));
        }
    }
}

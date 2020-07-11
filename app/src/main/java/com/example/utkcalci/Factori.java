package com.example.utkcalci;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Factori extends AppCompatActivity {
    TextView t1;
    EditText e1;
    int num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factori);
    }
    public boolean getNumbers()
    {
        // defining the edit text 1 to e1
        e1 = (EditText)findViewById(R.id.num1);
        t1 = (TextView)findViewById(R.id.result);
        String s1 = e1.getText().toString();
        if (s1.equals("")) {
            String result = "Please enter a value";
            t1.setText(result);
            return false;
        }
        else {
            num1 = Integer.parseInt(e1.getText().toString());
        }
        return true;
    }
    @SuppressLint("SetTextI18n")
    public void doFactorial(View v)
    {
        // get the input numbers
        int sum=1;
        if (getNumbers()) {
            for (int i = 2; i <= num1; i++)
                sum = sum * i;
            t1.setText(Integer.toString(sum));
        }
    }
    @SuppressLint("SetTextI18n")
    public void doFactorization(View v)
    {
        // get the input numbers
        StringBuilder result= new StringBuilder(new StringBuilder(500));
        int c=num1;
        int a=0;
        if (getNumbers()) {
            while(c%2==0){
                a=a+1;
                c=c/2;
            }
            if(a!=0)
                result.append("2^").append(a);
            c=num1;
            for(int i=3;i<=(Math.sqrt(num1)+1);i+=2){
                a=0;
                while(c%i==0){
                    a=a+1;
                    c=c/i;
                }
                if(a!=0)
                    result.append(" x ").append(i).append("^").append(a);
            }
            t1.setText(result.toString().toString());
        }
    }
}

package com.example.utkcalci;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity1();
            }
        });
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity2();
            }
        });
        button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity3();
            }
        });
        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity4();
            }
        });

    }
    public void openNewActivity1(){
        Intent intent=new Intent(this,Basic.class);
        startActivity(intent);
    }
    public void openNewActivity2(){
        Intent intent=new Intent(this,Lcmhcf.class);
        startActivity(intent);
    }
    public void openNewActivity3(){
        Intent intent=new Intent(this,Factori.class);
        startActivity(intent);
    }
    public void openNewActivity4(){
        Intent intent=new Intent(this,Bank.class);
        startActivity(intent);
    }
}

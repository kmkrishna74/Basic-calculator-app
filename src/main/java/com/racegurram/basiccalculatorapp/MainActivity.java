package com.racegurram.basiccalculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @SuppressLint({"WrongViewCast", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstnumber=(EditText)findViewById(R.id.firstnumber);
        EditText secondnumber=(EditText)findViewById(R.id.secondnumber);
        Button add= (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul= (Button) findViewById(R.id.mul);
        Button div= (Button) findViewById(R.id.div);
        TextView tv=(TextView)findViewById(R.id.tv);
        TextView result=(TextView)findViewById(R.id.result);

        add.setOnClickListener(view -> {
            int f,s,r;
            f=Integer.parseInt(firstnumber.getText().toString());
            s=Integer.parseInt(secondnumber.getText().toString());
            r=f+s;
            result.setText("Result=" +r);
        });
        sub.setOnClickListener(view -> {
            int f,s,r;
            f=Integer.parseInt(firstnumber.getText().toString());
            s=Integer.parseInt(secondnumber.getText().toString());
            r=f-s;
            result.setText("Result=" +r);
        });
        mul.setOnClickListener(view -> {
            int f,s,r;
            f=Integer.parseInt(firstnumber.getText().toString());
            s=Integer.parseInt(secondnumber.getText().toString());
            r=f*s;
            result.setText("Result=" +r);
        });
        div.setOnClickListener(view -> {
            int f,s,r;
            f=Integer.parseInt(firstnumber.getText().toString());
            s=Integer.parseInt(secondnumber.getText().toString());
            r=f/s;
            result.setText("Result=" +r);
        });
    }
}
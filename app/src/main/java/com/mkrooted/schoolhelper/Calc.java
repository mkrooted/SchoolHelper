package com.mkrooted.schoolhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;
import java.util.Objects;

public class Calc extends AppCompatActivity implements View.OnClickListener{
    TextView answer;
    EditText a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        answer = (TextView) findViewById(R.id.answer);
        a = (EditText) findViewById(R.id.edit_a);
        b = (EditText) findViewById(R.id.edit_b);
        c = (EditText) findViewById(R.id.edit_c);

        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(this);
        ImageButton imgbtn = (ImageButton) findViewById(R.id.calcClear);
        imgbtn.setOnClickListener(this);
    }

    private void compute(float _a, float _b, float _c){
        double D = Math.pow(_b,2) - 4*_a*_c;
        if (D>=0) {
            double res1, res2;
            res1 = (-1*_b + Math.sqrt(D))/2*_a;
            res2 = (-1*_b - Math.sqrt(D))/2*_a;
            answer.setText("x1: "+res1+";\nx2: "+res2);
        } else {
            Toast.makeText(this, "No answers!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.calcClear:
                a.setText(""); b.setText(""); c.setText(""); answer.setText(" "); break;
            case R.id.submit:
                if(!Objects.equals(a.getText().toString(), "") && !Objects.equals(b.getText().toString(), "") && !Objects.equals(c.getText().toString(), "")){
                    compute(Float.valueOf(a.getText().toString()),Float.valueOf(b.getText().toString()),Float.valueOf(c.getText().toString()));
                }
                break;
        }
    }
}

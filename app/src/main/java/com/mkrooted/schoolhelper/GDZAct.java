package com.mkrooted.schoolhelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class GDZAct extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gdz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn1 = (Button) findViewById(R.id.b1);
        Button btn2 = (Button) findViewById(R.id.b2);
        Button btn3 = (Button) findViewById(R.id.b3);
        Button btn4 = (Button) findViewById(R.id.b4);
        Button btn5 = (Button) findViewById(R.id.b5);
        Button btn6 = (Button) findViewById(R.id.b6);
        Button btn7 = (Button) findViewById(R.id.b7);
        Button btn8 = (Button) findViewById(R.id.b8);
        Button btn9 = (Button) findViewById(R.id.b9);
        Button btn10 = (Button) findViewById(R.id.b10);
        Button btn11 = (Button) findViewById(R.id.b11);
        Button btn12 = (Button) findViewById(R.id.b12);
        Button btn13 = (Button) findViewById(R.id.b13);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent browser;
        switch (v.getId()){
            case R.id.fab:
                browser = new Intent(this, Stealth_mode.class);
                startActivity(browser); break;
            case R.id.b1: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s1))); startActivity(browser); break;
            case R.id.b2: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s2))); startActivity(browser); break;
            case R.id.b3: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s3))); startActivity(browser); break;
            case R.id.b4: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s4))); startActivity(browser); break;
            case R.id.b5: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s5))); startActivity(browser); break;
            case R.id.b6: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s6))); startActivity(browser); break;
            case R.id.b7: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s7))); startActivity(browser); break;
            case R.id.b8: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s8))); startActivity(browser); break;
            case R.id.b9: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s9))); startActivity(browser); break;
            case R.id.b10: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s10))); startActivity(browser); break;
            case R.id.b11: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s11))); startActivity(browser); break;
            case R.id.b12: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s12))); startActivity(browser); break;
            case R.id.b13: browser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.s13))); startActivity(browser); break;
        }
    }
}

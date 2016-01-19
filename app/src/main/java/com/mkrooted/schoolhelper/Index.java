package com.mkrooted.schoolhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class Index extends AppCompatActivity implements View.OnClickListener{

    ImageButton imgb1;
    ImageButton imgb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgb1 = (ImageButton) findViewById(R.id.imgb1);
        imgb2 = (ImageButton) findViewById(R.id.imgb2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.indexFab);
        fab.setOnClickListener(this);
        imgb1.setOnClickListener(this);
        imgb2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.indexFab:
                intent = new Intent(this, Stealth_mode.class);
                startActivity(intent);
                break;
            case R.id.imgb1:
                intent = new Intent(this, GDZAct.class);
                startActivity(intent);
        }
    }
}

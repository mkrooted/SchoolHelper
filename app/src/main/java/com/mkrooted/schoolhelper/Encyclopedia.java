package com.mkrooted.schoolhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Encyclopedia extends Activity {
    ImageButton math, ukrlit, ukrmov, chemistry, physics, eng, geom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encyclopedia);
        math = (ImageButton) findViewById(R.id.math);

        eng = (ImageButton) findViewById(R.id.englang);
        chemistry = (ImageButton) findViewById(R.id.chem);
        physics = (ImageButton) findViewById(R.id.phys);
        geom = (ImageButton) findViewById(R.id.geom);

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
    public void math(View view){
        Intent intent= new Intent(this,Math.class);
        startActivity(intent);
    }
    public void geom(View view){
        Intent intent= new Intent(this,Geom.class);
        startActivity(intent);
    }
    public void eng(View view){
        Intent intent= new Intent(this,Eng.class);
        startActivity(intent);
    }
    public void physics(View view){
        Intent intent= new Intent(this,Physics.class);
        startActivity(intent);
    }
    public void chem(View view){
        Intent intent= new Intent(this,Chemistry.class);
        startActivity(intent);
    }

    public void shpora(View view){
        Intent intent= new Intent(this,Shpora.class);
        startActivity(intent);
    }
}

package com.mkrooted.schoolhelper;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Shpora extends Activity implements View.OnClickListener{
    EditText editText;
    Button btnS;
    Button btnL;
    SharedPreferences ShP;

    final String Saved_Text = "saved text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shpora);
        editText = (EditText) findViewById(R.id.editText);
        btnL = (Button) findViewById(R.id.button);
        btnS = (Button) findViewById(R.id.button2);
        btnL.setOnClickListener(this);
        btnS.setOnClickListener(this);
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
        switch (v.getId()) {
            case  R.id.button:
                saveText();
                break;
            case R.id.button2:
                loadText();
                break;
        }
    }
    private void saveText()
    {
        ShP = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed=ShP.edit();
        ed.putString(Saved_Text, editText.getText().toString());
        ed.commit();
        Toast.makeText(Shpora.this, "Text saved", Toast.LENGTH_LONG).show();
    }
    private void loadText()
    {
        ShP = getPreferences(MODE_PRIVATE);
        String savedText = ShP.getString(Saved_Text,"");
        editText.setText(savedText);
        Toast.makeText(Shpora.this,"text loaded",Toast.LENGTH_LONG).show();
    }
}

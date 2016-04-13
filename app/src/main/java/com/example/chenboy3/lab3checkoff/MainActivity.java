package com.example.chenboy3.lab3checkoff;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.chenboy3.lab3checkoff.MainActivity;
import com.example.chenboy3.lab3checkoff.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public int add( int a, int b) {
        return a+b;
    }

    public void sendMessage(View view) {
        EditText edit1 = (EditText)findViewById(R.id.number1);
        int num1 = Integer.parseInt(edit1.getText().toString());
        EditText edit2 = (EditText)findViewById(R.id.number2);
        int num2 = Integer.parseInt(edit2.getText().toString());
        int c = add(num1, num2);

        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Sum: " + c);
    }

}

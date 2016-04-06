package com.example.administrator.androidtestapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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


        Log.i("TAG","---22---");
        Log.i("TAG","---aaa11---");
        Log.i("TAG","---ccc---");
        Log.i("TAG","---ddd---");
        Log.i("TAG","---ggg---");
        Log.i("TAG","---tttt---");
        Log.i("TAG","---sdfhdgdfjhgjkhgj---");
        Log.i("TAG","---爱你---");
        Toast.makeText(MainActivity.this, "aa", Toast.LENGTH_SHORT).show();

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
            Log.i("TAG","------");
            Log.i("TAG","------");
            Log.i("TAG","------");
            Log.i("TAG","------");
            Log.i("TAG","---bbb---");
            Log.i("TAG","---aaa---");
            Log.i("TAG","---ccc---");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

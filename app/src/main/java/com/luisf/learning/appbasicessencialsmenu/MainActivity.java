package com.luisf.learning.appbasicessencialsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Fundamentals, to new Menu");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuMainOption:
                Toast.makeText(MainActivity.this, "Menu Option, was selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuMainSettings:
                Toast.makeText(MainActivity.this, "Menu Settings, was selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuMainEdit:
                Toast.makeText(MainActivity.this, "Menu Edit, was selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuMainSave:
                Toast.makeText(MainActivity.this, "Menu Save, was selected", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
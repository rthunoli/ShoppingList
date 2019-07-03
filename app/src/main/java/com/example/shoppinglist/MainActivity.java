package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final int rc = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchListActivity(View view) {
        Intent intent = new Intent(this,ListActivity.class);
        startActivity(intent);
        //startActivityForResult(intent,rc);
    }
}

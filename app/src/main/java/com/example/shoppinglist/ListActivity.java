package com.example.shoppinglist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }


    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        String txt = btn.getText().toString();
        Toast.makeText(this,txt,Toast.LENGTH_SHORT);
    }
}

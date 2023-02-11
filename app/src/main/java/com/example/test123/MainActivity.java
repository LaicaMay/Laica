package com.example.test123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "THIS IS A VERBOSE LOG.");
        Log.d(TAG, "THIS IS A DEBUG LOG.");
        Log.i(TAG, "THIS IS AN INFO LOG.");
        Log.w(TAG, "THIS IS A WARN LOG.");
        Log.e(TAG, "THIS IS AN ERROR LOG.");

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Log.i(TAG, "Button Clicked");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
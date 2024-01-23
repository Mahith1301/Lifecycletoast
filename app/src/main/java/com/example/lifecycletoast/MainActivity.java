package com.example.lifecycletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "on create method called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "on resume method called", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "on pause method called", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(), "on start method called", Toast.LENGTH_LONG).show();
        super.onStart();

    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(), "on stop method called", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(), "on destroy method called", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }


}
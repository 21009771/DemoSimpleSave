package com.example.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String msg = "No Greeting";
        Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
        toast.show();



    }

    @Override
    protected void onPause() {
        super.onPause();

        // Step 1: Obtain the SharedPreferences instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        // Step 2: Create a SharedPreferences Editor by calling edit()
        SharedPreferences.Editor prefEdit = prefs.edit();

        // step 3: Set a key-value pair in the editor
        prefEdit.putString("Greeting!", "Hello!");

        // Step 4: Call commit() to save the changes made to the SharedPreferences
        prefEdit.commit();
    }

}
package com.example.assessment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {
       //startActivity(new Intent(MainActivity.this,InteractiveMap.class));
       // toastMsg("Going to page 2");
        EditText editPassword = findViewById(R.id.editTextPassword);
        TextView textPassword = findViewById(R.id.textViewPassword);

        String content = editPassword.getText().toString(); // gets the contents of the edit text

        if(content.equals("Password")) {
            startActivity(new Intent(MainActivity.this,InteractiveMap.class));
            toastMsg("Logging In!");
        }else {
            toastMsg("Incorrect Password, Try Again");
        }




    }
}
package com.example.jsonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    String userInputUserName;
    String userInputPassword;

    ArrayList<User> users = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.editTextTextUsername);
        EditText password = findViewById(R.id.editTextTextPassword);
        Button button = findViewById(R.id.loginButton);
        users.add(new User("1","Karan", "test"));
        users.add(new User("2","Drew", "starwars"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInputUserName = username.getText().toString();
               userInputPassword = password.getText().toString();

                Log.d("tag", "example 2");

                for(int i = 0; i < users.size(); i++){
                    if(users.get(i).getUsername().equals(userInputUserName) && users.get(i).getPassword() .equals(userInputPassword)){
                        Intent myIntent = new Intent(LoginActivity.this, UserActivity.class);
                        myIntent.putExtra("key", users.get(i).getUserId()); //Optional parameters
                        LoginActivity.this.startActivity(myIntent);
                        Log.d("tag", "example");

                    }
                }
            }
        });
    }



}
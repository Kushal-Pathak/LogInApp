package com.esnapeyekushal.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email;
    TextInputEditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        //click the button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if email is empty is or not

//                if(userEmail.isEmpty()){
//                    Toast.makeText(MainActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
//                }

                //check if email is password is or not


//                if(userPassword.length() < 8){
//                    Toast.makeText(MainActivity.this, "Password must be 8 characters long", Toast.LENGTH_SHORT).show();
//                }

//                //login to another screen
//                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
//                startActivity(intent);

                //combining all three
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();
                if(userEmail.isEmpty() || userPassword.length() < 8){
                    Toast.makeText(MainActivity.this, "Email needed and password must be 8 character long", Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    //intent.putExtra(name "email", userEmail);
                    intent.putExtra("email", userEmail);
                    intent.putExtra("password", userPassword);
                    startActivity(intent);
                }
            }
        });

    }
}
package com.example.gourn.buzztracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.welcome);
||||||| merged common ancestors
        setContentView(R.layout.activity_login2);
=======
        setContentView(R.layout.welcome);
        Button login = findViewById(R.id.sign_in);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginScreen.class);
                startActivityForResult(intent, 0);
            }
        });
        Button register = (Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RegisterScreen.class);
                startActivityForResult(intent, 0);
            }
        });
>>>>>>> 85898cc0986439eca48af0e2632bbb579c09bdbf
    }


}

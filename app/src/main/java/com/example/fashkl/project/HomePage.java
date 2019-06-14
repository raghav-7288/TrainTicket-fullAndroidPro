package com.example.fashkl.project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button loginBtn, creditBtn,caller;
    public Intent loginPageIntent, registerIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        loginBtn = (Button) findViewById(R.id.login_Button);
        creditBtn = (Button) findViewById(R.id.credits_Button);
        caller=(Button)findViewById(R.id.caller);

        loginPageIntent = new Intent(this, LoginPage.class);
        registerIntent = new Intent(this, RegisterPage.class);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginPageIntent);
                finish();
            }
        });
        creditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(registerIntent);
            }
        });

        caller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.example.fashkl.project.HomePage.
                        this, Manifest.permission.CALL_PHONE) !=
                        PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(com.example.fashkl.project.HomePage.this,new String[]
                            {Manifest.permission.CALL_PHONE},0);

                }

                else{
                    Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"8700230416"));
                    startActivity(i);
                }
            }
        });

    }
}

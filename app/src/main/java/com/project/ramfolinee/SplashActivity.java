package com.project.ramfolinee;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import co.chatsdk.ui.HomeActivity;

public class SplashActivity  extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, HomeActivity.class));

    }
}

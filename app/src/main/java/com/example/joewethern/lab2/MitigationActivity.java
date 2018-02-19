package com.example.joewethern.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MitigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitigation);

    }
    //This function makes it so when the 'Return' button is selected
    //the app will go to the previous page.
    public void onButtonCLick3(View v) {
        super.finish();
    }
    //This function makes it so when the 'New Search' button is selected
    //the app will go to the MainPage.
    public void onButtonCLick4(View v) {
        Intent myIntent = new Intent(this, MainPage.class);
        startActivity(myIntent);
    }
}

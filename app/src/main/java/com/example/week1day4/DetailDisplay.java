package com.example.week1day4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class DetailDisplay extends AppCompatActivity {

    TextView fNameView, lNameView, strView, cityView, stateView, zipView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_display);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Intent passedIntent = getIntent();
        Bundle passedBundle = passedIntent.getExtras();

        ObjectMailingInfo passed = passedBundle.getParcelable("mail");

        //Binding to the views
        fNameView = findViewById(R.id.fnameDisplay);
        lNameView = findViewById(R.id.lNameDisplay);
        strView = findViewById(R.id.strDisplay);
        cityView = findViewById(R.id.cityDisplay);
        stateView = findViewById(R.id.stateDisplay);
        zipView = findViewById(R.id.zipDisplay);

        //Projecting the Text to the views
        fNameView.setText(passed.getfName());
        lNameView.setText(passed.getlName());
        strView.setText(passed.getAddress());
        cityView.setText(passed.getCity());
        stateView.setText(passed.getState());
        zipView.setText(passed.getZip());


    }

}

package com.example.week1day4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText fNameInput, lNameInput, strInput, cityInput, stateInput, zipInput;
    private ObjectMailingInfo mailingDoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding the objects in the code to the objects in the XML
        //Making it easier to execute the functions/Reads on it so we can
        //Package the code.
        fNameInput = findViewById(R.id.inputFName);
        lNameInput = findViewById(R.id.inputLName);
        strInput = findViewById(R.id.inputStreet);
        cityInput = findViewById(R.id.inputCity);
        stateInput = findViewById(R.id.inputState);
        zipInput = findViewById(R.id.inputZip);
    }

    //Method to pull from the inputs and populate/create the object
    public void Submit(View view){

        //creating a new objectMailingInfo object with the string inputs
        //contained within a universal try and catch
        //try {
            mailingDoc = new ObjectMailingInfo(fNameInput.getText().toString(),
                    lNameInput.getText().toString(), strInput.getText().toString(),
                    cityInput.getText().toString(), stateInput.getText().toString(),
                    zipInput.getText().toString());

            //creation of intent and bundles to ship off with the intent
            Intent explicitIntent = new Intent(this, DetailDisplay.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("mail", mailingDoc);

            //Packaging up everything and shipping it off to the other screen to be rendered
            explicitIntent.putExtras(bundle);
            startActivity(explicitIntent);
            finish();

        //} catch(Exception e){
            Log.d("Transfer ERR", "Submit: Uh oh");
        //}
    }
}

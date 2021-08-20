package com.example.dndinvmngt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button createNewCharacterButton;
    private TextView noCharacterCreatedTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning IDs to objects
        createNewCharacterButton = findViewById(R.id.create_new_character_button);
        noCharacterCreatedTV = findViewById(R.id.no_character_created_tv);


        if (charactersAlreadyExist()) {
            noCharacterCreatedTV.setVisibility(View.INVISIBLE);
            //TODO: Display recycler view of all characters created
        } else {
            noCharacterCreatedTV.setVisibility(View.VISIBLE);
        }
    }

    //TODO: WILL CHECK AND SEE IF CHARACTERS HAVE ALREADY BEEN CREATED
    private boolean charactersAlreadyExist()
    {
        return false;
    }
}

package com.example.dndinvmngt;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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


        //If a character has been created before, hide text and call creation function
        if (charactersAlreadyExist()) {
            noCharacterCreatedTV.setVisibility(View.INVISIBLE);
            createCharacterRecyclerView();
        } else {
            noCharacterCreatedTV.setVisibility(View.VISIBLE);
        }

        createNewCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.println("PRESSED NEW CHARACTER");
            }
        });
    }



    //TODO: WILL CHECK AND SEE IF CHARACTERS HAVE ALREADY BEEN CREATED
    private boolean charactersAlreadyExist()
    {
        return false;
    }

    private void createCharacterRecyclerView()
    {
        //TODO: Display recycler view of all characters created
    }
}

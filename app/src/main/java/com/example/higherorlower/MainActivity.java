package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int NtoGuess;

    public void generate_number() {

        Random random = new Random();
        NtoGuess = random.nextInt(20)+1;

    }

    public void ButtonGuess (View view){

        EditText NumberIn = (EditText) findViewById(R.id.NumberIn);
        int GuessValue = Integer.parseInt(NumberIn.getText().toString());
        String Message;

        if (GuessValue>NtoGuess){

            Message="Lower";

        } else if (GuessValue<NtoGuess){

            Message="Higher";

        } else {

            Message="you got it, try again";
            generate_number();

        }

        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generate_number();

    }
}

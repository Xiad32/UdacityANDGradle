package com.example.showpassedtext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowExtraText extends AppCompatActivity {

    public static String JOKE_TAG = "Joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_extra_text);

        TextView passedTextTV = (TextView) findViewById(R.id.passedtexttv);

        Intent callingIntent =  getIntent();
        if (callingIntent.hasExtra(JOKE_TAG))
            passedTextTV.setText(callingIntent.getStringExtra(JOKE_TAG));
        else
            passedTextTV.setText("No Joke! Not Funny!");
    }
}

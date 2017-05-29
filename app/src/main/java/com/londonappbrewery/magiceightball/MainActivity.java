package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final TextView tv = (TextView) findViewById(R.id.textView2);
        final int [] ballArray = {R.drawable.ball1,
                                   R.drawable.ball2,
                                   R.drawable.ball3,
                                   R.drawable.ball4,
                                   R.drawable.ball5};

        Button myButton = (Button) findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5);
                //Log.d("SSS", String.valueOf(number));
                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}

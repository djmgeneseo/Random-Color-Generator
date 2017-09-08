package com.example.david.randomcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View mainView;
    private Button tryMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainView = findViewById(R.id.mainViewId);

        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Random Number Generator
                Random random = new Random();
                int r,g,b;
                int Low = 0;
                int High = 256;
                r = random.nextInt(High-Low) + Low;
                g = random.nextInt(High-Low) + Low;
                b = random.nextInt(High-Low) + Low;

                // Change background color
                //mainView.setBackgroundColor(0xff000000 + r * 0x10000 + g * 0x100 + b);
                mainView.setBackgroundColor(Color.rgb(r,g,b));

                // For Debugging
                Log.d("Red = ", String.valueOf(r));
                Log.d("Green = ", String.valueOf(g));
                Log.d("Blue = ", String.valueOf(b));

            }
        });
    } // onCreate()
}

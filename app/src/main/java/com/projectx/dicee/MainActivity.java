package com.projectx.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = (Button) findViewById(R.id.rollbutton);

        final ImageView leftdice = (ImageView) findViewById(R.id.image_ldice);
        final ImageView rightdice = (ImageView) findViewById(R.id.image_rdice);

        final int[] diceArray = {R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6};
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerater = new Random();
                int number = randomNumberGenerater.nextInt(6);
                leftdice.setImageResource(diceArray[number]);
                number = randomNumberGenerater.nextInt(6);
                rightdice.setImageResource(diceArray[number]);
            }
        });
    }
}

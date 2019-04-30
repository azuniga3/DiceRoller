package com.example.diceroller;

import android.app.Service;
import android.hardware.SensorEventListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;
import android.widget.Button;;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    public ImageView firstImageViewDice;
    public ImageView secondImageViewDice;
    public Random rng1 = new Random();
    public Random rng2 = new Random();
    Sensor accel;
    SensorManager listener;
    public TextView xtext, ytext, ztext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //accelerometer set up
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listener= (SensorManager)getSystemService(SENSOR_SERVICE);
        accel =listener.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);listener.registerListener(this, accel, SensorManager.SENSOR_DELAY_NORMAL);
        //xtext = (TextView)findViewById(R.id.xtext);
        //dice set up
        firstImageViewDice = findViewById(R.id.imageView1);
        secondImageViewDice = findViewById(R.id.imageView2);
        //Button Roll = findViewById(R.id.btnRoll);
        //Roll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Accel temp = new Accel();
//                temp.
//            }
      //  });
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        double x = event.values[0];
        double y = event.values[1];
        double z = event.values[2];
        //xtext.setText(String.valueOf(x));
        if ((x > -0.2 && x < 0.2) || (y > -0.2 && y < 0.2) || (z > -0.2 && z < 0.2)) {
            int random = rng1.nextInt(6) + 1;
            int random2 = rng2.nextInt(6) + 1;

            switch(random) {
                case 1:
                    firstImageViewDice.setImageResource(R.drawable.inverted_dice_1);
                    firstImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    firstImageViewDice.setImageResource(R.drawable.inverted_dice_2);
                    firstImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    firstImageViewDice.setImageResource(R.drawable.inverted_dice_3);
                    firstImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    firstImageViewDice.setImageResource(R.drawable.inverted_dice_4);
                    firstImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    firstImageViewDice.setImageResource(R.drawable.inverted_dice_5);
                    firstImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    firstImageViewDice.setImageResource(R.drawable.inverted_dice_6);
                    firstImageViewDice.setVisibility(View.VISIBLE);
                    break;
            }
            switch(random2) {
                case 1:
                    secondImageViewDice.setImageResource(R.drawable.inverted_dice_1);
                    secondImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    secondImageViewDice.setImageResource(R.drawable.inverted_dice_2);
                    secondImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    secondImageViewDice.setImageResource(R.drawable.inverted_dice_3);
                    secondImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    secondImageViewDice.setImageResource(R.drawable.inverted_dice_4);
                    secondImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    secondImageViewDice.setImageResource(R.drawable.inverted_dice_5);
                    secondImageViewDice.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    secondImageViewDice.setImageResource(R.drawable.inverted_dice_6);
                    secondImageViewDice.setVisibility(View.VISIBLE);
                    break;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Not in use
    }
}
//    }
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//        // Not in use
//    }
//    @Override
//    public void onResume() {
//        super.onResume();
//        //if (sensorManager != null) {
//        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
//        //}
//    }
//    @Override
//    public void onSensorChanged(SensorEvent event) {
//        if (event.values[0] == 0 || event.values[1] == 0 || event.values[2] == 0){
//            rollDice();
//        }
//    }

//    public void rollDice() {
//
//    }


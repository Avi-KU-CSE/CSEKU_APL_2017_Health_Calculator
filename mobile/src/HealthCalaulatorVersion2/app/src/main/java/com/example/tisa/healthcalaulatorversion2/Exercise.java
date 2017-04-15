package com.example.tisa.healthcalaulatorversion2;



import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exercise extends Activity {

    Button manually,sensor;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        manually = (Button) findViewById(R.id.Manual);
        manually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WE are Going For Manual!!! Yeahhh...", Toast.LENGTH_SHORT).show();
                //connected to manual activiy
                Intent i = new Intent(Exercise.this, ManualActivity.class);
                startActivity(i);

            }
        });
        sensor= (Button) findViewById(R.id.ib2);
        sensor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WE are Going For sensors!!!.", Toast.LENGTH_SHORT).show();
                //connected to Sensor
                Intent i = new Intent(Exercise.this, PedoActivity.class);
                startActivity(i);

            }
        });
    }


}


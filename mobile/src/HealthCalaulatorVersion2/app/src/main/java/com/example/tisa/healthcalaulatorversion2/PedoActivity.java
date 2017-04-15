package com.example.tisa.healthcalaulatorversion2;



import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PedoActivity extends AppCompatActivity implements SensorEventListener {
    SensorManager sensorManager;
    Sensor sensor;
    TextView display;
    float i=-1;
    float st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedo);
        display=(TextView)findViewById(R.id.textView1);
        sensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensor=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(sensor!=null)
        {
            sensorManager.registerListener(this,sensor,sensorManager.SENSOR_DELAY_UI);
        }else
        {
            Toast.makeText(getApplicationContext(), "Your phone does not have sensor..", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        st=event.values[0]-i;
        display.setText(""+(event.values[0]-st)+".");//printing the value of steps.
        i++;
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}


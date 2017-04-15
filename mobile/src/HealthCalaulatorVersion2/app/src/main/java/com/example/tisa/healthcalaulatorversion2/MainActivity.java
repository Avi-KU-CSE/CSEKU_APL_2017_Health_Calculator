package com.example.tisa.healthcalaulatorversion2;

import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends Activity {

    Button b, b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.Mybutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WE are Going For BMI Test!!! Yeahhh...", Toast.LENGTH_SHORT).show();//this method shows a message
                //Connected to BMI Calculator Class//
                Intent i = new Intent(MainActivity.this, Main2Activity2.class);

                startActivity(i);

            }
        });
        b1 = (Button) findViewById(R.id.MYbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WE are Going For Exercise!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();
                //connected to exercise class
                Intent a = new Intent(MainActivity.this, Exercise.class);
                startActivity(a);

            }
        });

    }
}

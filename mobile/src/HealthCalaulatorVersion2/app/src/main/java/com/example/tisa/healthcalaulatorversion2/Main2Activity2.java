package com.example.tisa.healthcalaulatorversion2;






import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        final EditText e1 = (EditText) findViewById(R.id.et1);
        final EditText e2 = (EditText) findViewById(R.id.et2);
        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if(TextUtils.isEmpty(str1)){
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(str2)){
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }


                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2);


                float bmiValue = calculateBMI(weight, height);


                String bmiInterpretation = interpretBMI(bmiValue);

                tv4.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));

            }
        });

    }

      //Process of BMI CalCuLation
    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }


    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely underweight\nTips:-\n" +
                    "You should walk atleast 5000 steps in a day";
        } else if (bmiValue < 18.5) {

            return "Underweight\nTips:-\n" +
                    "You have to walk atleast 6000 steps in a day";
        }else if (bmiValue < 20) {
            return "Normal \nTips:-\n" +
                    "You should walk atleast 7000 steps in a day";
        }
         else if (bmiValue < 23) {
            return "Normal \nTips:-\n" +
                    "You should walk atleast 8000 steps in a day";
        }

        else if (bmiValue < 25) {

            return "Your BMI is Normal\nTips:-\n" +
                    "You should Walk atleast 10000 steps in a day";
        }
        else if (bmiValue <28) {

            return "Overweight\nTips:-\n" +
                    "You have to walk atleast 12000 in a day";
        }
        else if (bmiValue>28) {

            return "Overweight\nTips:-\n" +
                    "You have to walk atleast 15000 in a day";
        }

        else {
            return "Invalid";
        }
    }
}


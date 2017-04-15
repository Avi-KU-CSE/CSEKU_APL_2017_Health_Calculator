package com.example.tisa.healthcalaulatorversion2;



import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ManualActivity extends Activity {
    int clickks=0;
    private TextView countertextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        countertextview=(TextView)findViewById(R.id.countertextview);
    }

    public void PlusButtonClicked(View view) {
        clickks++;
        countertextview.setText(String.valueOf(clickks));
    }


    public void minusButtonClicked(View view) {
        clickks--;
        countertextview.setText(String.valueOf(clickks));
    }
}

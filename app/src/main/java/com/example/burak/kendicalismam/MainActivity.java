package com.example.burak.kendicalismam;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv,tv2;
    Button b1,b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.cevap);
        tv2 = findViewById(R.id.bilmece);
        b = findViewById(R.id.button);
        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setVisibility(View.VISIBLE);
                tv2.setText(R.string.soru_metni);
                b.setVisibility(View.VISIBLE);
            }
        });
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        tv.setText(R.string.cevap_metni);
    }
}


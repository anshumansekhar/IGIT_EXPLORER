package com.example.smokie.igit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SMOKIE on 12-03-2017.
 */
public class
Detail extends AppCompatActivity {
    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);
        img=(ImageView)findViewById(R.id.imageq);
        tv=(TextView)findViewById(R.id.name);
        img.setMaxHeight(800);
        Intent i=getIntent();
        i.getStringExtra("Type");

    }
}
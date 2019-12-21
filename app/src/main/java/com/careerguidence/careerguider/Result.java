package com.careerguidence.careerguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    String tagString;
    TextView tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tagString=getIntent().getStringExtra("TAG");
        tag=findViewById(R.id.tag);


        tag.setText(tagString);





    }
}

package com.careerguidence.careerguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClassSelector extends AppCompatActivity {


    Button btn_classtwel,btn_classten;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_selector);

        btn_classtwel=findViewById(R.id.btn_classtwel);
        btn_classten=findViewById(R.id.btn_classten);

        btn_classten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Dashboard.class));

            }
        });

        btn_classtwel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DashboardTwelve.class));



            }
        });

    }
}

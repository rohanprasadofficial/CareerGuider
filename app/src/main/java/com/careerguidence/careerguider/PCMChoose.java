package com.careerguidence.careerguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PCMChoose extends AppCompatActivity {


    LinearLayout maths,bio;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcmchoose);


        maths=findViewById(R.id.mathematics);
        bio=findViewById(R.id.biology);

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),Result.class);
                intent.putExtra("TAG","According to the inputs, Career Guider provides PCM as the best choice for you. \n Thank you for using Career Guider.");
                startActivity(intent);
                //PCM Is Good choice

            }
        });


        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(getApplicationContext(),Result.class);
                intent.putExtra("TAG","According to the inputs, Career Guider provides PCB as the best choice for you.  \n Thank you for using Career Guider.");
                startActivity(intent);
                //PCB Is Good choice

            }
        });

    }
}

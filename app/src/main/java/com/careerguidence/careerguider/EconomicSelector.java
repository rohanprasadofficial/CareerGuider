package com.careerguidence.careerguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EconomicSelector extends AppCompatActivity {
    LinearLayout yes,no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economic_selector);



        yes=findViewById(R.id.mathematics);
        no=findViewById(R.id.biology);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(getApplicationContext(),ArtsChoose.class));
                //PCM Is Good choice
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),Result.class);
                intent.putExtra("TAG","According to the inputs, Career Guider provides Humanities as the best choice for you.  \n Thank you for using Career Guider.");
                startActivity(intent);
                //PCB Is Good choice

            }
        });

    }
}

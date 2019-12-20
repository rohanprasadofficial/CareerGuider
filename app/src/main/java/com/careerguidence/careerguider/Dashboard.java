package com.careerguidence.careerguider;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {


    TextView firstlan,secondlan,science,socialsc,maths;
    Button btn_predict;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        firstlan=findViewById(R.id.firstlan);
        secondlan=findViewById(R.id.secondlan);
        science=findViewById(R.id.science);
        socialsc=findViewById(R.id.socialsc);
        maths=findViewById(R.id.maths);
        btn_predict=findViewById(R.id.btn_predict);
        flag=0;



        btn_predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstlan.getText().toString().length() >0 &&  Integer.parseInt(firstlan.getText().toString()) >=0 &&  Integer.parseInt(firstlan.getText().toString()) <= 100)
                {

                    if(secondlan.getText().toString().length() >0 &&  Integer.parseInt(secondlan.getText().toString()) >=0 &&  Integer.parseInt(secondlan.getText().toString()) <= 100 )
                    {


                        if(science.getText().toString().length() >0 &&  Integer.parseInt(science.getText().toString()) >=0 &&  Integer.parseInt(science.getText().toString()) <= 100 )
                        {



                            if(socialsc.getText().toString().length() >0 &&  Integer.parseInt(socialsc.getText().toString()) >=0 &&  Integer.parseInt(socialsc.getText().toString()) <= 100 )
                            {

                                if(maths.getText().toString().length() >0 &&  Integer.parseInt(maths.getText().toString()) >=0 &&  Integer.parseInt(maths.getText().toString()) <= 100 )
                                {


                                    Toast.makeText(Dashboard.this, "Good to go", Toast.LENGTH_SHORT).show();

                                    int mathmarks=Integer.parseInt(maths.getText().toString());
                                    int sciencemarks=  Integer.parseInt(science.getText().toString());
                                    int firstlanmarks=Integer.parseInt(firstlan.getText().toString()) ;
                                    int secondlanmarks=Integer.parseInt(secondlan.getText().toString()) ;
                                    int socialsci=Integer.parseInt(socialsc.getText().toString()) ;


                                    float pmMarks=(mathmarks+sciencemarks)/2;
                                    float artsmarks=(socialsci + firstlanmarks + secondlanmarks)/3;


                                    if(pmMarks >=75)
                                    {
                                        Toast.makeText(Dashboard.this, "S1 ", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(),PCMChoose.class));

                                        //Science
                                    }
                                    else if (artsmarks>75 ){

                                        //arts path
                                        Toast.makeText(Dashboard.this, "S2", Toast.LENGTH_SHORT).show();

                                    }
                                    else{


                                        //Commerce path
                                        Toast.makeText(Dashboard.this, "S3 ", Toast.LENGTH_SHORT).show();

                                    }


                                }
                                else{
                                    Toast.makeText(Dashboard.this, "There is problem with Mathematics marks , make sure that it is between 0 to 100 and not blank !", Toast.LENGTH_LONG).show();
                                }


                            }
                            else{
                                Toast.makeText(Dashboard.this, "There is problem with Social Science marks , make sure that it is between 0 to 100 and not blank !", Toast.LENGTH_LONG).show();
                            }

                        }
                        else{
                            Toast.makeText(Dashboard.this, "There is problem with Science marks , make sure that it is between 0 to 100 and not blank !", Toast.LENGTH_LONG).show();
                        }

                    }
                    else{
                        Toast.makeText(Dashboard.this, "There is problem with Second Lan marks , make sure that it is between 0 to 100 and not blank !", Toast.LENGTH_LONG).show();
                    }

                }
                else{
                    Toast.makeText(Dashboard.this, "There is problem with First Lan marks , make sure that it is between 0 to 100 and not blank !", Toast.LENGTH_LONG).show();
                }


            }
        });









    }
}

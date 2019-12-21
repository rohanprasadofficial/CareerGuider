package com.careerguidence.careerguider;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DashboardTwelve extends Activity {


    Button arts,commerce,science;

    String marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_twelve);



        arts=findViewById(R.id.arts);
        commerce=findViewById(R.id.commerce);
        science=findViewById(R.id.science);


        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardTwelve.this);
                builder.setTitle("Enter your marks in %");

            // Set up the input
                final EditText input = new EditText(getApplicationContext());
            // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                builder.setView(input);

                // Set up the buttons
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        marks = input.getText().toString();
                        if(marks==null)
                        {
                            Toast.makeText(DashboardTwelve.this, "Please enter something", Toast.LENGTH_SHORT).show();

                        }

                        else{

                            AlertDialog.Builder builder = new AlertDialog.Builder(
                                    DashboardTwelve.this);
                            builder.setTitle("Interest Selector");
                            builder.setMessage("Are you interested in regular honours courses ?");
                            builder.setNegativeButton("NO",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,
                                                            int which) {

                                            Intent intent=new Intent(getApplicationContext(),Result.class);
                                            intent.putExtra("TAG","According to the inputs, Career Guider provides B.A(Best Sub marks sub) Honours as the best choice for you.  \n Thank you for using Career Guider.");
                                            startActivity(intent);
                                        }
                                    });
                            builder.setPositiveButton("YES",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,
                                                            int which) {
                                            Intent intent=new Intent(getApplicationContext(),Result.class);
                                            intent.putExtra("TAG","According to the inputs, Career Guider provides regular humanities (for civil services or govt jobs) as the best choice for you.  \n Thank you for using Career Guider.");
                                            startActivity(intent);
                                        }
                                    });
                            builder.show();


                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();



            }
        });

        commerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardTwelve.this);
                builder.setTitle("Enter your marks in %");

                // Set up the input
                final EditText input = new EditText(getApplicationContext());
                // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                builder.setView(input);

                // Set up the buttons
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        marks = input.getText().toString();
                        if(marks==null)
                        {
                            Toast.makeText(DashboardTwelve.this, "Please enter something", Toast.LENGTH_SHORT).show();

                        }

                        else{

                            AlertDialog.Builder builder = new AlertDialog.Builder(
                                    DashboardTwelve.this);
                            builder.setTitle("Interest Selector");
                            builder.setMessage("Are you interested in regular honours courses ?");
                            builder.setNegativeButton("NO",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,
                                                            int which) {

                                            Intent intent=new Intent(getApplicationContext(),Result.class);
                                            intent.putExtra("TAG","According to the inputs, Career Guider provides B.Com(Best Sub marks sub) Honours as the best choice for you.  \n Thank you for using Career Guider.");
                                            startActivity(intent);
                                        }
                                    });
                            builder.setPositiveButton("YES",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,
                                                            int which) {
                                            Intent intent=new Intent(getApplicationContext(),Result.class);
                                            intent.putExtra("TAG","According to the inputs, Career Guider provides regular commerce courses (for civil services or govt jobs) as the best choice for you.  \n Thank you for using Career Guider.");
                                            startActivity(intent);
                                        }
                                    });
                            builder.show();


                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();





















            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                try {

                    AlertDialog.Builder builder = new AlertDialog.Builder(DashboardTwelve.this);
                    builder.setTitle("Enter your marks in %");

                    // Set up the input
                    final EditText input = new EditText(getApplicationContext());
                    // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    builder.setView(input);

                    // Set up the buttons
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            marks = input.getText().toString();
                            if (marks == null) {
                                Toast.makeText(DashboardTwelve.this, "Please enter something", Toast.LENGTH_SHORT).show();

                            } else {

                                AlertDialog.Builder builder = new AlertDialog.Builder(
                                        DashboardTwelve.this);
                                builder.setTitle("Interest Selector");
                                builder.setMessage("Are you interested in regular honours courses ?");
                                builder.setNegativeButton("NO",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,
                                                                int which) {

                                                Intent intent = new Intent(getApplicationContext(), Result.class);
                                                intent.putExtra("TAG", "According to the inputs, Career Guider provides B.Sc(Best Sub marks sub) Honours as the best choice for you.  \n Thank you for using Career Guider.");
                                                startActivity(intent);
                                            }
                                        });
                                builder.setPositiveButton("YES",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,
                                                                int which) {
                                                Intent intent = new Intent(getApplicationContext(), Result.class);
                                                intent.putExtra("TAG", "According to the inputs, Career Guider provides regular B.sc (for civil services or govt jobs) as the best choice for you.  \n Thank you for using Career Guider.");
                                                startActivity(intent);
                                            }
                                        });
                                builder.show();


                            }

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

                    builder.show();

                }catch (Exception e)
                {
                    e.printStackTrace();

                }
            }
        });






    }
}

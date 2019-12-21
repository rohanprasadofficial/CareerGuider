package com.careerguidence.careerguider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import dmax.dialog.SpotsDialog;

public class Login extends AppCompatActivity {

    TextView username,password;
    Button btn_login;
    CardView googleSignin;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            username=findViewById(R.id.edt_username);
            password=findViewById(R.id.edt_pass);
            btn_login=findViewById(R.id.btn_login);
            googleSignin=findViewById(R.id.googleLoginCV);

            googleSignin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Login.this, "Under construction.. try username login", Toast.LENGTH_LONG).show();
                }
            });


            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Toast.makeText(Login.this, "Logging In...", Toast.LENGTH_SHORT).show();
                    alertDialog = new SpotsDialog.Builder().setContext(Login.this).setTheme(R.style.Custom).build();
                    alertDialog.setMessage("Logging In... ");
                    alertDialog.show();

                    if(username.getText().length() >0 && password.getText().length()>0)
                        {


                                    if(username.getText().toString().equals("madhu-sit") && password.getText().toString().equals("test-password"))
                                    {
                                        alertDialog.dismiss();
                                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_LONG).show();
                                        startActivity(new Intent(getApplicationContext(),ClassSelector.class));
                                    }
                                    else{
                                        alertDialog.dismiss();
                                        Toast.makeText(Login.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
                                    }

                        }
                        else
                        {
                            alertDialog.dismiss();
                            Toast.makeText(Login.this, "Fields cannnot be empty !", Toast.LENGTH_SHORT).show();
                        }


                }
            });
        }catch (Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
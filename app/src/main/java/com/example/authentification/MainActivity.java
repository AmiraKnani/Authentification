package com.example.authentification;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button OK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(EditText)findViewById(R.id.idLogin);
        password=(EditText)findViewById(R.id.idPassword);
        OK=(Button)findViewById(R.id.btOk);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login.getText().toString().equals("student") && password.getText().toString().equals("polytech2023"))
                {
                    Intent intent = new Intent(MainActivity.this,homeactivity.class);
                    startActivity(intent);
                }
                else{
                    AlertDialog.Builder alertDialog;
                    alertDialog= new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle("Authentification");
                    alertDialog.setMessage("Données érronées!!");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    alertDialog.show();
                }
            }
        });
    }
}
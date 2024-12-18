package com.example.emp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.emp2.MainActivity;
import com.example.emp2.R;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button btnlogin;
    Button btnreg;
    String s1 = "admin";
    String s2 = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnlogin = findViewById(R.id.btnLogin);
        btnreg=findViewById(R.id.btnreg);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uname = et1.getText().toString();
                String Pass = et2.getText().toString();

                if (Uname.equals(s1) && Pass.equals(s2)) {
                    Intent ob = new Intent(getApplicationContext(), menuActivity2.class);
                    startActivity(ob);
                } else {
                    Toast.makeText(getApplicationContext(), "INVALID CREDENTIALS", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uname = et1.getText().toString();
                String Pass = et2.getText().toString();

                if (Uname.equals(s1) && Pass.equals(s2)) {
                    Intent ob = new Intent(getApplicationContext(), searchActivity2.class);
                    startActivity(ob);
                } else {
                    Toast.makeText(getApplicationContext(), "INVALID CREDENTIALS", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

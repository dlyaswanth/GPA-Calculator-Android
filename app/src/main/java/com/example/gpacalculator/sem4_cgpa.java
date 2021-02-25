package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sem4_cgpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem4_cgpa);
        String str= cgpa.getValue();
        EditText s1=(EditText)findViewById(R.id.editTextTextPersonName2);
        EditText s2=(EditText)findViewById(R.id.editTextTextPersonName3);
        EditText s3=(EditText)findViewById(R.id.editTextTextPersonName4);
        EditText s4=(EditText)findViewById(R.id.editTextTextPersonName5);
        Button show =(Button)findViewById(R.id.btn);
        TextView result=(TextView)findViewById(R.id.textView14);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.getText().toString().equals(""))
                    s1.setText("0");
                if (s2.getText().toString().equals(""))
                    s2.setText("0");
                if (s3.getText().toString().equals(""))
                    s3.setText("0");
                if (s4.getText().toString().equals(""))
                    s4.setText("0");
                if (str.equals("CSE")) {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float se3 = Float.parseFloat(s3.getText().toString()) * 24;
                    float se4 = Float.parseFloat(s4.getText().toString()) * 24;
                    float value = (se1 + se2 + se3 + se4 ) / (25 + 25 + 24 + 24 );
                    result.setText("Your CGPA is " + Float.toString(value));
                } else if (str.equals("ECE")) {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float se3 = Float.parseFloat(s3.getText().toString()) * 24;
                    float se4 = Float.parseFloat(s4.getText().toString()) * 24;
                    float value = (se1 + se2 + se3 + se4 ) / (25 + 25 + 24 + 24 );
                    result.setText("Your CGPA is " + Float.toString(value));
                } else if (str.equals("EEE")) {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float se3 = Float.parseFloat(s3.getText().toString()) * 23;
                    float se4 = Float.parseFloat(s4.getText().toString()) * 25;

                    float value = (se1 + se2 + se3 + se4 ) / (25 + 25 + 23 + 25 );
                    result.setText("Your CGPA is " + Float.toString(value));
                } else {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float se3 = Float.parseFloat(s3.getText().toString()) * 25;
                    float se4 = Float.parseFloat(s4.getText().toString()) * 24;

                    float value = (se1 + se2 + se3 + se4 ) / (25 + 25 + 25 + 24);
                    result.setText("Your CGPA is " + Float.toString(value));
                }
            }
        });
    }
}
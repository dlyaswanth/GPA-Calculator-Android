package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sem2_cgpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem2_cgpa);
        String str= cgpa.getValue();
        EditText s1=(EditText)findViewById(R.id.editTextTextPersonName2);
        EditText s2=(EditText)findViewById(R.id.editTextTextPersonName3);
        Button show =(Button)findViewById(R.id.btn);
        TextView result=(TextView)findViewById(R.id.textView14);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.equals("CSE")) {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float value = (se1 + se2 ) / (25 + 25);
                    result.setText("Your CGPA is " + Float.toString(value));
                } else if (str.equals("ECE")) {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float value = (se1 + se2 ) / (25 + 25 );
                    result.setText("Your CGPA is " + Float.toString(value));
                } else if (str.equals("EEE")) {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float value = (se1 + se2  ) / (25 + 25  );
                    result.setText("Your CGPA is " + Float.toString(value));
                } else {
                    float se1 = Float.parseFloat(s1.getText().toString()) * 25;
                    float se2 = Float.parseFloat(s2.getText().toString()) * 25;
                    float value = (se1 + se2) / (25 + 25);
                    result.setText("Your CGPA is " + Float.toString(value));
                }
            }
        });
    }
}
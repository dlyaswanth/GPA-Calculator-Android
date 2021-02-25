package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class sem8_sgpa extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] values = {"O", "A+", "A", "B+", "B", "RA"};
    public static int formatValue(String str)
    {
        if(str.equals("O"))
            return 10;
        else if(str.equals("A+"))
            return 9;
        else if(str.equals("A"))
            return 8;
        else if(str.equals("B+"))
            return 7;
        else if(str.equals("B"))
            return 6;
        else
            return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem8_sgpa);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spin3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spin4 = (Spinner) findViewById(R.id.spinner4);
        Button btn=(Button)findViewById(R.id.button);
        TextView result=(TextView)findViewById(R.id.textView);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, values);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(aa);
        ArrayAdapter aa1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, values);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(aa1);
        ArrayAdapter aa2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, values);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin4.setAdapter(aa2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1=formatValue(spin2.getSelectedItem().toString())*3;
                int val2=formatValue(spin3.getSelectedItem().toString())*3;
                int val3=formatValue(spin4.getSelectedItem().toString())*10;
                double val=(val1+val2+val3)/16.00;
                result.setText("Your SGPA is "+Double.toString(val));
            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        // DO Nothing
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}
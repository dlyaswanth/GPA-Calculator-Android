package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class sgpa extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] depart = {"CSE", "ECE","EEE","MECH"};
    String[] sem={"1","2","3","4","5","6","7","8"};
    private static String value;
    public static String getValue() {
        return value;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sgpa);
        Button btn=(Button)findViewById(R.id.button);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin1 = (Spinner) findViewById(R.id.spinner2);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner3);
        //Creating the ArrayAdapter instance
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, depart);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);
        ArrayAdapter aa1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sem);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(aa1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                value=spin1.getSelectedItem().toString();
                if (spin2.getSelectedItem().toString().equals("1"))
                {
                    Intent intent =new Intent(getApplicationContext(), sem1_sgpa.class);
                    startActivity(intent);
                }
                else if(spin2.getSelectedItem().toString().equals("2"))
                {
                    if(value.equals("CSE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem2_cse_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("ECE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem2_ece_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("EEE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem2_eee_sgpa.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent =new Intent(getApplicationContext(), sem2_mech_sgpa.class);
                        startActivity(intent);
                    }
                }
                else if(spin2.getSelectedItem().toString().equals("3"))
                {
                    if(value.equals("CSE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem3_cse_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("ECE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem3_ece_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("EEE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem3_eee_sgpa.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent =new Intent(getApplicationContext(), sem3_mech_sgpa.class);
                        startActivity(intent);
                    }
                }
                else if(spin2.getSelectedItem().toString().equals("4"))
                {
                    if(value.equals("CSE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem4_cse_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("ECE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem4_ece_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("EEE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem4_eee_sgpa.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent =new Intent(getApplicationContext(), sem4_mech_sgpa.class);
                        startActivity(intent);
                    }
                }
                else if(spin2.getSelectedItem().toString().equals("5"))
                {
                    if(value.equals("CSE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem5_cse_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("ECE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem5_ece_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("EEE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem5_eee_sgpa.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent =new Intent(getApplicationContext(), sem5_mech_sgpa.class);
                        startActivity(intent);
                    }
                }
                else if(spin2.getSelectedItem().toString().equals("6"))
                {
                    if(value.equals("CSE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem6_cse_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("ECE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem6_ece_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("EEE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem6_eee_sgpa.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent =new Intent(getApplicationContext(), sem6_mech_sgpa.class);
                        startActivity(intent);
                    }
                }
                else if(spin2.getSelectedItem().toString().equals("7"))
                {
                    if(value.equals("CSE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem7_cse_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("ECE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem7_ece_sgpa.class);
                        startActivity(intent);
                    }
                    else if(value.equals("EEE"))
                    {
                        Intent intent =new Intent(getApplicationContext(), sem7_eee_sgpa.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent =new Intent(getApplicationContext(), sem7_mech_sgpa.class);
                        startActivity(intent);
                    }
                }
                else
                {
                        Intent intent =new Intent(getApplicationContext(), sem8_sgpa.class);
                        startActivity(intent);
                }
               //Toast.makeText(getApplicationContext(),spin2.getSelectedItem().toString(),100);
            }
        });
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        // DO Nothing
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
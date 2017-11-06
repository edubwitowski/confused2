package com.example.user.mymealtipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costPerHour= 1.50;
    int costOfMeal;
    double totalCharges;
    String tip;
    //Spinner spinner;


         @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final EditText dollars =(EditText)findViewById(R.id.txtHours);
            final Spinner group =(Spinner)findViewById(R.id.txtGroup);
            Button charges = (Button)findViewById(R.id.btnCharge);
            charges.setOnClickListener(new View.OnClickListener(){
                final TextView result = ((TextView)findViewById(R.id.txtResults));
                @Override
                public void onClick(View view){
                    costOfMeal = Integer.parseInt(dollars).getText().toString());
                    DecimalFormat currency = new DecimalFormat("$###,###.##");
                    totalCharges = tipChoice * costOfMeal;
                    tip = group.getSelectedItem().toString();
                    result.setText(" Total for Charges Plus Tip Equal " + tip + " for " + costOfMeal
                            + " hours is " + currency.format(totalCharges));

                }
            });
        }
    }


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
    int numberOfHours;
    double totalCharges;
    String lotChoice;

         @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final EditText hours =(EditText)findViewById(R.id.txtHours);
            final Spinner group =(Spinner)findViewById(R.id.txtGroup);
            Button charges = (Button)findViewById(R.id.btnCharge);
            charges.setOnClickListener(new View.OnClickListener(){
                final TextView result = ((TextView)findViewById(R.id.txtResults));
                @Override
                public void onClick(View view){
                    numberOfHours = Integer.parseInt(hours.getText().toString());
                    DecimalFormat currency = new DecimalFormat("$###,###.##");
                    totalCharges = costPerHour * numberOfHours;
                    lotChoice = group.getSelectedItem().toString();
                    result.setText(" Total for Charges Plus Tip Equal " + lotChoice + " for " + numberOfHours
                            + " hours is " + currency.format(totalCharges));

                }
            });
        }
    }


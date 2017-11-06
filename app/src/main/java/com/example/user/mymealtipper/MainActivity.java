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

    double notGoodService= 0.10;
    double adequateService= 0.15;
    double goodService= 0.20;
    double excellentService= 0.25;
    int costOfMeal;
    double totalCharges;
    double tipChoice;
    double tip;
    ///*
    /// String tip;
    //Spinner spinner;
    /*
    this is where i can put a message
     */


         @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final EditText dollars =(EditText)findViewById(R.id.txtHours);
            final Spinner group =(Spinner)findViewById(R.id.txtGroup);
             final Spinner Service =(Spinner)findViewById(R.id.txtService);
            Button charges = (Button)findViewById(R.id.btnCharge);
            charges.setOnClickListener(new View.OnClickListener(){
                final TextView result = ((TextView)findViewById(R.id.txtResults));
                @Override
                public void onClick(View view){
                    costOfMeal = Integer.parseInt(dollars.getText().toString());
                    DecimalFormat currency = new DecimalFormat("$###,###.##");

                    /*
                    An if statement will not work properly with the math, a switch statement
                    works well with math. Also when you you use System.out.println will show in
                    the code below but could slow the app down
                     */

                    switch (group.getSelectedItem().toString()) {
                        case "10%":
                            tipChoice = 0.10;
                            break;
                        case "15%":
                            tipChoice = 0.15;
                            break;
                        case "20%":
                            tipChoice = 0.20;
                            break;
                        case "25%":
                            tipChoice = 0.25;
                            break;
                    }






                    tip = (tipChoice * costOfMeal);
                    totalCharges = tip + costOfMeal;
                    //tip = group.getSelectedItem().toString();
                    result.setText("Meal/Tip is " + currency.format(tip) + " and " + currency.format(costOfMeal)
                            + " is " + currency.format(totalCharges) +" "+ Service.getSelectedItem().toString());

/*http://www.avajava.com/tutorials/lessons/how-do-i-use-numberformat-to-format-currencyies.html*/

                }
            });
        }
    }


package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check1, check2, check3, check4;
    String finalList = "";
    int totalAmt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check1 = findViewById(R.id.checkBox1);
        check2 = findViewById(R.id.checkBox2);
        check3 = findViewById(R.id.checkBox3);
        check4 = findViewById(R.id.checkBox4);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Checked();
                check1.setEnabled(false);
                check2.setEnabled(false);
                check3.setEnabled(false);
                check4.setEnabled(false);
                Context context = getApplicationContext();
                CharSequence text = finalList;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    private void Checked() {
        if (check1.isChecked()) {
            finalList = finalList + "Veg Burger : 100\n";
            totalAmt = totalAmt + 100;
        }
        if (check2.isChecked()) {
            finalList = finalList + "Chicken Burger : 150\n";
            totalAmt = totalAmt + 150;
        }
        if (check3.isChecked()) {
            finalList = finalList + "Fries : 70\n";
            totalAmt = totalAmt + 70;
        }
        if (check4.isChecked()) {
            finalList = finalList + "Coke : 90\n";
            totalAmt = totalAmt + 50;
        }
        finalList = finalList + "Total = " + totalAmt;
    }

}
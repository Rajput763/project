package com.vivek.user.illnessdector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ListTwo extends AppCompatActivity {

    CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_two);


        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (checkBox.isChecked() && checkBox2.isChecked()) {
                    Toast.makeText(getBaseContext(), "" + "Cricket", Toast.LENGTH_LONG).show();
                }
                 if (checkBox3.isChecked() && checkBox4.isChecked()) {
                     Toast.makeText(getBaseContext(), "" + "Crickettt", Toast.LENGTH_LONG).show();
            }
            }
        });
    }




}


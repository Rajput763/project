package com.vivek.user.illnessdector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button one = (Button)findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Main.this,MainActivity.class);
                startActivity(in);


            }
        });

        Button two = (Button)findViewById(R.id.two);
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Intent in = new Intent(Main.this,ListTwo.class);
                        startActivity(in);



                    }
                });


    }
}

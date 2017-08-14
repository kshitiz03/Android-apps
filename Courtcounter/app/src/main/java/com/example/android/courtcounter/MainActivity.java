package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int scorea,scoreb;

    public void updateAdda3(View view) {
        scorea+=3;
        displaya(scorea);
    }
    public void updateAddb3(View view) {
        scoreb+=3;
        displayb(scoreb);
    }
    public void updateAdda2(View view) {
        scorea+=2;
        displaya(scorea);
    }
    public void updateAddb2(View view) {
        scoreb+=2;
        displayb(scoreb);
    }
    public void updateAddaf(View view) {
        scorea+=1;
        displaya(scorea);
    }
    public void result(View view) {
        String vic;
        if (scorea > scoreb) {
            vic = "Team A has won";
        } else if (scoreb > scorea) {
            vic = "Team B has won";
        } else {
            vic = "Match draw";
        }
        displayMess(vic);
    }
    public void updateAddbf(View view) {
        scoreb+=1;
        displayb(scoreb);
    }
       public void notun(View view){
        scorea=0;
        scoreb=0;
        displaya(scorea);
        displayb(scoreb);
           String ms="";
           displayMess(ms);
       }

    public void displayMess(String message){
        TextView quantityTextView = (TextView) findViewById(R.id.displayMessage);
        quantityTextView.setText(message);
    }
    public void displaya(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.disp_sc_a);
        quantityTextView.setText(String.valueOf(number));
    }

    public void displayb(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.disp_sc_b);
        quantityTextView.setText(String.valueOf(number));
    }


}
package com.med.shg_succor_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.med.shg_succor_1.R.id.btn1;
import static com.med.shg_succor_1.R.id.never;

    public class Dashboard extends AppCompatActivity implements View.OnClickListener {

   public CardView c1,c2,c3,c4,c5,c6;
    private Object v;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        c1 = findViewById(R.id.btn1);
        c2 = findViewById(R.id.btn2);
        c3 = findViewById(R.id.btn3);
        c4 = findViewById(R.id.btn4);
        c5 = findViewById(R.id.btn5);
        c6 = findViewById(R.id.btn6);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Dashboard.this,Editprofile.class);
                startActivity(int1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Dashboard.this,Memberslist.class);
                startActivity(int2);
            }});
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Dashboard.this,Loan.class);
                startActivity(int3);
            }});
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Dashboard.this,Transaction.class);
                startActivity(int4);
            }});
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(Dashboard.this,Report.class);
                startActivity(int5);
            }});
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(Dashboard.this,Settings.class);
                startActivity(int6);
            }});


    }

        @Override
        public void onClick(View v) {

        }
    }
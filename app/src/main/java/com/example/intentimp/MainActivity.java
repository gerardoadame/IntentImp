 package com.example.intentimp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);

    }

     @Override
     public void onClick(View v) {


         switch (v.getId())
         {
             case R.id.btn1:
                 Intent it1=new Intent(Intent.ACTION_CALL,Uri.parse("tel:8711384109"));
                 startActivity(it1);
                 break;
             case R.id.btn2:
                 Intent it2=new Intent(Intent.ACTION_CALL,Uri.parse("tel:8713504483"));
                 startActivity(it2);
                 break;
             case R.id.btn3:
                 Intent it3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com.mx/"));
                 startActivity(it3);
                 break;
         }

     }
 }

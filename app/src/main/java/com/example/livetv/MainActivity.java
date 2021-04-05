package com.example.livetv;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    CardView cricket,football,tv,events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        
        cricket = findViewById(R.id.cricket);
        football = findViewById(R.id.football);
        tv = findViewById(R.id.tv);
        events = findViewById(R.id.events);

    }


    public void Cricket(View view) {

        Toast.makeText(MainActivity.this, "Live Cricket", Toast.LENGTH_SHORT).show();
    }

    public void Football(View view) {
        Toast.makeText(MainActivity.this, "Live Football", Toast.LENGTH_SHORT).show();
    }

    public void TV(View view) {
        Toast.makeText(MainActivity.this, "Live TV Show", Toast.LENGTH_SHORT).show();
    }

    public void Events(View view) {
        Toast.makeText(MainActivity.this, "Live Events", Toast.LENGTH_SHORT).show();
    }


    //alert dialog
    @Override
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setIcon(R.drawable.ques);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setTitle(R.string.alert_text);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNeutralButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
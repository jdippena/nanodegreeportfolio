package com.imber.nanodegreeportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ProjectLauncher extends Activity {

    String[] mToastAppNames = {"Spotify Streamer app", "Scores App", "Library App", "Build It Bigger app",
            "XYZ Reader app", "Capstone app"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_launcher);
        setUpButtons();
    }

    void setUpButtons() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_layout);

        Button b = (Button) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(0);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will open the " + mToastAppNames[0], Toast.LENGTH_SHORT).show();
            }
        });

        b = (Button) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will open the " + mToastAppNames[1], Toast.LENGTH_SHORT).show();
            }
        });

        b = (Button) ((LinearLayout) linearLayout.getChildAt(1)).getChildAt(0);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will open the " + mToastAppNames[2], Toast.LENGTH_SHORT).show();
            }
        });

        b = (Button) ((LinearLayout) linearLayout.getChildAt(1)).getChildAt(1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will open the " + mToastAppNames[3], Toast.LENGTH_SHORT).show();
            }
        });

        b = (Button) linearLayout.getChildAt(2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will open the " + mToastAppNames[4], Toast.LENGTH_SHORT).show();
            }
        });

        b = (Button) linearLayout.getChildAt(3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will open the " + mToastAppNames[5], Toast.LENGTH_SHORT).show();
            }
        });
    }

}

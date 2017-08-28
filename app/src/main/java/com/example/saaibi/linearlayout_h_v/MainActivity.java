package com.example.saaibi.linearlayout_h_v;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.layout);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((layout.getOrientation()) == 1)
                    layout.setOrientation(LinearLayout.HORIZONTAL);
                else
                    layout.setOrientation(LinearLayout.VERTICAL);
            }
        });
        FloatingActionButton fabTwoAct = (FloatingActionButton) findViewById(R.id.fabTwoAct);
        fabTwoAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(second);
            }
        });

    }

}

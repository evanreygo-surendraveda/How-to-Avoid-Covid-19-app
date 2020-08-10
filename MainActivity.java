package com.example.howtoavoidcovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moveActivity1 = findViewById(R.id.btn_move_activity1);
        moveActivity1.setOnClickListener(this);

        Button moveActivity2 = findViewById(R.id.btn_move_activity2);
        moveActivity2.setOnClickListener(this);

        Button moveActivity3 = findViewById(R.id.btn_move_activity3);
        moveActivity3.setOnClickListener(this);

        Button moveActivity4 = findViewById(R.id.btn_move_activity4);
        moveActivity4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity1:
                Intent moveIntent1 = new Intent(MainActivity.this,MoveActivity1.class);
                startActivity(moveIntent1);
                break;
            case R.id.btn_move_activity2:
                Intent moveIntent2 = new Intent(MainActivity.this,MoveActivity2.class);
                startActivity(moveIntent2);
                break;
            case R.id.btn_move_activity3:
                Intent moveIntent3 = new Intent(MainActivity.this,MoveActivity3.class);
                startActivity(moveIntent3);
                break;
            case R.id.btn_move_activity4:
                Intent moveIntent4 = new Intent(MainActivity.this,MoveActivity4.class);
                startActivity(moveIntent4);
                break;
        }
    }
}

package com.mrestu.a10120767latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView txtklikregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtklikregister = (TextView) findViewById(R.id.txtklikregister);
        txtklikregister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if(i == R.id.txtklikregister){
        Intent switch_activity = new Intent(this, Register.class);
        startActivity(switch_activity);
        }
    }
}
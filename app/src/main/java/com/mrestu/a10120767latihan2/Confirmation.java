package com.mrestu.a10120767latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirmation extends AppCompatActivity implements View.OnClickListener {
Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        btn_send = (Button) findViewById(R.id.btn_send);
        btn_send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if(i == R.id.btn_send){
            Intent switch_activity = new Intent(this, Home.class);
            startActivity(switch_activity);
        }
    }
}
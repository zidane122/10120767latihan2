package com.mrestu.a10120767latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity implements View.OnClickListener {
Button btn_verify;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        btn_verify = (Button) findViewById(R.id.btn_verify);
        btn_verify.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if(i == R.id.btn_verify){
            Intent switch_activity = new Intent(this, Confirmation.class);
            startActivity(switch_activity);
        }
    }
}
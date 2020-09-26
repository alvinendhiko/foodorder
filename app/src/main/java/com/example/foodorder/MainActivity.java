package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button pesanEmail;
private Button pesanPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesanPhone = findViewById(R.id.pesantelfon);
        pesanEmail = findViewById(R.id.pesanemail);
        pesanPhone.setOnClickListener(this);
        pesanEmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        case R.id.pesanemail:
        Intent moveIntent = new Intent(MainActivity.this,SubmainPemesananActivity.class);
        startActivity(moveIntent);
        break;

        case R.id.pesantelfon:
            String phoneNumber = "08138999999";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
            startActivity(dialPhoneIntent);
            break;
    }

    }
}

package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilPemesanan extends AppCompatActivity {
    TextView namapemesan , totalayamgoreng , sambalmerah , sambalijo , totalpembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_pemesanan);
        Intent intent=getIntent();
        namapemesan=findViewById(R.id.pemesan);
        totalayamgoreng=findViewById(R.id.hargaayamgoreng);
        sambalmerah=findViewById(R.id.hargasambalmerah);
        sambalijo=findViewById(R.id.hargasambalijo);
        totalpembayaran=findViewById(R.id.totalharga);
        namapemesan.setText(getIntent().getStringExtra("nama"));
        totalayamgoreng.setText(getIntent().getStringExtra("ayamgoreng"));
        sambalmerah.setText(getIntent().getStringExtra("sambalmerah"));
        sambalijo.setText(getIntent().getStringExtra("sambalijo"));
        Boolean truesambalmerah= getIntent().getExtras().getBoolean("sambalmerah");
        Boolean truesambalijo= getIntent().getExtras().getBoolean("sambalijo");
        if (truesambalmerah){
            sambalmerah.setText("3000");

        }
        else {
            sambalmerah.setText("0");

        }
        if (truesambalijo){
            sambalijo.setText("3000");
        }
        else {
            sambalijo.setText("0");
        }
        String stringayamgoreng=totalayamgoreng.getText().toString();
        int intayamgoreng= Integer.parseInt(stringayamgoreng);
        String stringsambalmerah=sambalmerah.getText().toString();
        int intsambalmerah= Integer.parseInt(stringsambalmerah);
        String stringsambalijo=sambalijo.getText().toString();
        int intsambalijo=Integer.parseInt(stringsambalijo);
        int total=intayamgoreng+intsambalmerah+intsambalijo;
        totalpembayaran.setText(String.valueOf(total));
        Button kirim = findViewById(R.id.kirimpesan);



    }
    public void Kirim (View v) {
        Intent intent =
    }
}

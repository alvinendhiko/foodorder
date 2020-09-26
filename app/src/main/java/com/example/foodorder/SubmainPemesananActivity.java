package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubmainPemesananActivity extends AppCompatActivity {

    EditText namapemesan;

    Button tomboltambah,tombolkurang,pesan;

    TextView totalharga,jumlah;

    CheckBox sambalijo,sambalmerah;
    int ayamgoreng=0;
    int satuanayamgoreng=15000;
    int hargaayamgoreng=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain_pemesanan);
        namapemesan= findViewById(R.id.namapemesan);
        tomboltambah=findViewById(R.id.buttontambah);
        tombolkurang=findViewById(R.id.buttonkurang);
        pesan=findViewById(R.id.pesan);
        totalharga=findViewById(R.id.totalharga);
        jumlah=findViewById(R.id.jumlah);
        sambalijo=findViewById(R.id.sambalijo);
        sambalmerah=findViewById(R.id.sambalmerah);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SubmainPemesananActivity.this,HasilPemesanan.class);
                String nama=namapemesan.getText().toString();
                intent.putExtra("nama",nama);
                intent.putExtra("ayamgoreng",totalharga.getText().toString());
                intent.putExtra("sambalijo",sambalijo.isChecked());
                intent.putExtra("sambalmerah",sambalmerah.isChecked());
                startActivity(intent);

            }
        });



    }
    public void tomboltambah (View view){
        ayamgoreng=ayamgoreng+1;
        hargaayamgoreng=ayamgoreng*satuanayamgoreng;
        jumlah.setText(String.valueOf(ayamgoreng));
        totalharga.setText(String.valueOf(hargaayamgoreng));
    }
    public void tombolkurang (View view) {

        if (ayamgoreng < 1) {
            Toast.makeText(this, "maaf tidak bisa memesan kurang dari 1", Toast.LENGTH_SHORT).show();
        return;
        }
        ayamgoreng=ayamgoreng-1;
        hargaayamgoreng=ayamgoreng*satuanayamgoreng;
        jumlah.setText(String.valueOf(ayamgoreng));
        totalharga.setText(String.valueOf(hargaayamgoreng));
    }

}


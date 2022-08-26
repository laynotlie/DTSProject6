package com.example.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    Button tampil;
    TextView lbnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.TxtNama);
        tampil = (Button) findViewById(R.id.btnTampil);
        lbnama = (TextView) findViewById(R.id.lbl_Nama);

        tampil.setOnClickListener(view -> {
           nama.getText().toString();
           lbnama.setText("" + nama);
        });

    }
}
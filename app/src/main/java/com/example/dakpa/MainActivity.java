package com.example.dakpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMasuk;
    private Button btnTentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMasuk = (Button)findViewById(R.id.btn_masuk);
        btnMasuk.setOnClickListener(this);

        btnTentang = (Button)findViewById(R.id.btn_tentang);
        btnTentang.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_masuk:
                Intent masukIntent = new Intent(MainActivity.this, MasukActivity.class);
                startActivity(masukIntent);
                break;
            case R.id.btn_tentang:
                Intent tentangIntent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(tentangIntent);
                break;
        }
    }
}
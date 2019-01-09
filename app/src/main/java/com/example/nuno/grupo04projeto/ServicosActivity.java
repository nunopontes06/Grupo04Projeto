package com.example.nuno.grupo04projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicosActivity extends AppCompatActivity {

    Button btnBricolage, btnLimpezas, btnCarpintaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);

        btnBricolage=findViewById(R.id.btnUserBricolage);
        btnLimpezas=findViewById(R.id.btnUserLimpezas);
        btnCarpintaria=findViewById(R.id.btnUserCarpintaria);

        btnBricolage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServicosActivity.this, BricolageActivity.class);
                startActivity(intent);
            }
        });

        btnLimpezas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServicosActivity.this, LimpezasActivity.class);
                startActivity(intent);
            }
        });

        btnCarpintaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServicosActivity.this, CarpintariaActivity.class);
                startActivity(intent);
            }
        });
    }
}

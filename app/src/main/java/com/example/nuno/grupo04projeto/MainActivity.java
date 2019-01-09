package com.example.nuno.grupo04projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*Atribuimos os dois botoes de login as duas variaveis*/
    /*O evento comeca assim que o botao for clicaco no OnclickListener
    * Depois de clicado o botao envia o utilizador para a actividade Login*/

    /*O segundo botao do evento é para o registo ele leva a activity do registo propriamentedito*/

    Button btnLogin, btnSignup, btnServicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btnUserLogin);
        btnSignup=findViewById(R.id.btnUserSignup);
        btnServicos=findViewById(R.id.btnUserServices);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ServicosActivity.class);
                startActivity(intent);
            }
        });


    }
}

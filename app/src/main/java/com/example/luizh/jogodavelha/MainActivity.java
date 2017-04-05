package com.example.luizh.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean jogador = true;

    ImageButton x1, x2, x3, x4, x5, x6, x7, x8, x9;
    ImageButton circulo1, circulo2, circulo3, circulo4, circulo5, circulo6, circulo7, circulo8, circulo9;
    ImageButton vazio1, vazio2, vazio3, vazio4, vazio5, vazio6, vazio7, vazio8, vazio9;

    Button novojogo;

    TextView mostra_pontos_x, mostra_pontos_o, mostra_pontos_empate;

    int pontos_x = 0, pontos_o = 0, empate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x1 = (ImageButton)findViewById(R.id.x1);
        x2 = (ImageButton)findViewById(R.id.x2);
        x3 = (ImageButton)findViewById(R.id.x3);
        x4 = (ImageButton)findViewById(R.id.x4);
        x5 = (ImageButton)findViewById(R.id.x5);
        x6 = (ImageButton)findViewById(R.id.x6);
        x7 = (ImageButton)findViewById(R.id.x7);
        x8 = (ImageButton)findViewById(R.id.x8);
        x9 = (ImageButton)findViewById(R.id.x9);
        circulo1 = (ImageButton)findViewById(R.id.circulo1);
        circulo2 = (ImageButton)findViewById(R.id.circulo2);
        circulo3 = (ImageButton)findViewById(R.id.circulo3);
        circulo4 = (ImageButton)findViewById(R.id.circulo4);
        circulo5 = (ImageButton)findViewById(R.id.circulo5);
        circulo6 = (ImageButton)findViewById(R.id.circulo6);
        circulo7 = (ImageButton)findViewById(R.id.circulo7);
        circulo8 = (ImageButton)findViewById(R.id.circulo8);
        circulo9 = (ImageButton)findViewById(R.id.circulo9);
        vazio1 = (ImageButton)findViewById(R.id.vazio1);
        vazio2 = (ImageButton)findViewById(R.id.vazio2);
        vazio3 = (ImageButton)findViewById(R.id.vazio3);
        vazio4 = (ImageButton)findViewById(R.id.vazio4);
        vazio5 = (ImageButton)findViewById(R.id.vazio5);
        vazio6 = (ImageButton)findViewById(R.id.vazio6);
        vazio7 = (ImageButton)findViewById(R.id.vazio7);
        vazio8 = (ImageButton)findViewById(R.id.vazio8);
        vazio9 = (ImageButton)findViewById(R.id.vazio9);
        novojogo = (Button)findViewById(R.id.btn_novo_jogo);
        mostra_pontos_x = (TextView)findViewById(R.id.txt_mostra_x);
        mostra_pontos_o = (TextView)findViewById(R.id.txt_mostra_o);
        mostra_pontos_empate = (TextView)findViewById(R.id.txt_mostra_empate);

        x1.setVisibility(ImageButton.INVISIBLE);
        x2.setVisibility(ImageButton.INVISIBLE);
        x3.setVisibility(ImageButton.INVISIBLE);
        x4.setVisibility(ImageButton.INVISIBLE);
        x5.setVisibility(ImageButton.INVISIBLE);
        x6.setVisibility(ImageButton.INVISIBLE);
        x7.setVisibility(ImageButton.INVISIBLE);
        x8.setVisibility(ImageButton.INVISIBLE);
        x9.setVisibility(ImageButton.INVISIBLE);
        circulo1.setVisibility(ImageButton.INVISIBLE);
        circulo2.setVisibility(ImageButton.INVISIBLE);
        circulo3.setVisibility(ImageButton.INVISIBLE);
        circulo4.setVisibility(ImageButton.INVISIBLE);
        circulo5.setVisibility(ImageButton.INVISIBLE);
        circulo6.setVisibility(ImageButton.INVISIBLE);
        circulo7.setVisibility(ImageButton.INVISIBLE);
        circulo8.setVisibility(ImageButton.INVISIBLE);
        circulo9.setVisibility(ImageButton.INVISIBLE);

        vazio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio1.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x1.setVisibility(ImageButton.VISIBLE);
                    circulo1.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo1.setVisibility(ImageButton.VISIBLE);
                    x1.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio2.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x2.setVisibility(ImageButton.VISIBLE);
                    circulo2.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo2.setVisibility(ImageButton.VISIBLE);
                    x2.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio3.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x3.setVisibility(ImageButton.VISIBLE);
                    circulo3.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo3.setVisibility(ImageButton.VISIBLE);
                    x3.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio4.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x4.setVisibility(ImageButton.VISIBLE);
                    circulo4.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo4.setVisibility(ImageButton.VISIBLE);
                    x4.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio5.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x5.setVisibility(ImageButton.VISIBLE);
                    circulo5.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo5.setVisibility(ImageButton.VISIBLE);
                    x5.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio6.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x6.setVisibility(ImageButton.VISIBLE);
                    circulo6.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo6.setVisibility(ImageButton.VISIBLE);
                    x6.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio7.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x7.setVisibility(ImageButton.VISIBLE);
                    circulo7.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo7.setVisibility(ImageButton.VISIBLE);
                    x7.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio8.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x8.setVisibility(ImageButton.VISIBLE);
                    circulo8.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo8.setVisibility(ImageButton.VISIBLE);
                    x8.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        vazio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vazio9.setVisibility(ImageButton.INVISIBLE);
                if(jogador == true){
                    x9.setVisibility(ImageButton.VISIBLE);
                    circulo9.setVisibility(ImageButton.INVISIBLE);
                    jogador = false;
                }
                else{
                    circulo9.setVisibility(ImageButton.VISIBLE);
                    x9.setVisibility(ImageButton.INVISIBLE);
                    jogador = true;
                }
                VerificaVencedor();
            }
        });

        novojogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1.setVisibility(ImageButton.INVISIBLE);
                x2.setVisibility(ImageButton.INVISIBLE);
                x3.setVisibility(ImageButton.INVISIBLE);
                x4.setVisibility(ImageButton.INVISIBLE);
                x5.setVisibility(ImageButton.INVISIBLE);
                x6.setVisibility(ImageButton.INVISIBLE);
                x7.setVisibility(ImageButton.INVISIBLE);
                x8.setVisibility(ImageButton.INVISIBLE);
                x9.setVisibility(ImageButton.INVISIBLE);
                circulo1.setVisibility(ImageButton.INVISIBLE);
                circulo2.setVisibility(ImageButton.INVISIBLE);
                circulo3.setVisibility(ImageButton.INVISIBLE);
                circulo4.setVisibility(ImageButton.INVISIBLE);
                circulo5.setVisibility(ImageButton.INVISIBLE);
                circulo6.setVisibility(ImageButton.INVISIBLE);
                circulo7.setVisibility(ImageButton.INVISIBLE);
                circulo8.setVisibility(ImageButton.INVISIBLE);
                circulo9.setVisibility(ImageButton.INVISIBLE);
                vazio1.setVisibility(ImageButton.VISIBLE);
                vazio2.setVisibility(ImageButton.VISIBLE);
                vazio3.setVisibility(ImageButton.VISIBLE);
                vazio4.setVisibility(ImageButton.VISIBLE);
                vazio5.setVisibility(ImageButton.VISIBLE);
                vazio6.setVisibility(ImageButton.VISIBLE);
                vazio7.setVisibility(ImageButton.VISIBLE);
                vazio8.setVisibility(ImageButton.VISIBLE);
                vazio9.setVisibility(ImageButton.VISIBLE);

                pontos_x = 0;
                pontos_o = 0;
                empate = 0;

                jogador = true;

                String valor = String.valueOf(pontos_x);
                mostra_pontos_x.setText(valor);

                valor = String.valueOf(pontos_o);
                mostra_pontos_o.setText(valor);

                valor = String.valueOf(empate);
                mostra_pontos_empate.setText(valor);
            }
        });
    }

    private void VerificaVencedor(){

        int valida = 0;

        if ((x1.getVisibility() == ImageButton.VISIBLE) && (x2.getVisibility() == ImageButton.VISIBLE) && (x3.getVisibility() == ImageButton.VISIBLE)||
            (x4.getVisibility() == ImageButton.VISIBLE) && (x5.getVisibility() == ImageButton.VISIBLE) && (x6.getVisibility() == ImageButton.VISIBLE)||
            (x7.getVisibility() == ImageButton.VISIBLE) && (x8.getVisibility() == ImageButton.VISIBLE) && (x9.getVisibility() == ImageButton.VISIBLE)||
            (x1.getVisibility() == ImageButton.VISIBLE) && (x5.getVisibility() == ImageButton.VISIBLE) && (x9.getVisibility() == ImageButton.VISIBLE)||
            (x1.getVisibility() == ImageButton.VISIBLE) && (x4.getVisibility() == ImageButton.VISIBLE) && (x7.getVisibility() == ImageButton.VISIBLE)||
            (x2.getVisibility() == ImageButton.VISIBLE) && (x5.getVisibility() == ImageButton.VISIBLE) && (x8.getVisibility() == ImageButton.VISIBLE)||
            (x3.getVisibility() == ImageButton.VISIBLE) && (x6.getVisibility() == ImageButton.VISIBLE) && (x9.getVisibility() == ImageButton.VISIBLE)||
            (x3.getVisibility() == ImageButton.VISIBLE) && (x5.getVisibility() == ImageButton.VISIBLE) && (x7.getVisibility() == ImageButton.VISIBLE)){
                Toast.makeText(getApplicationContext(),"'X' Ganhou!", Toast.LENGTH_LONG).show();
            valida = 1;
            LimpaTela();
            pontos_x++;
            String valor = String.valueOf(pontos_x);
            mostra_pontos_x.setText(valor);
        }
        if ((circulo1.getVisibility() == ImageButton.VISIBLE) && (circulo2.getVisibility() == ImageButton.VISIBLE) && (circulo3.getVisibility() == ImageButton.VISIBLE)||
            (circulo4.getVisibility() == ImageButton.VISIBLE) && (circulo5.getVisibility() == ImageButton.VISIBLE) && (circulo6.getVisibility() == ImageButton.VISIBLE)||
            (circulo7.getVisibility() == ImageButton.VISIBLE) && (circulo8.getVisibility() == ImageButton.VISIBLE) && (circulo9.getVisibility() == ImageButton.VISIBLE)||
            (circulo1.getVisibility() == ImageButton.VISIBLE) && (circulo5.getVisibility() == ImageButton.VISIBLE) && (circulo9.getVisibility() == ImageButton.VISIBLE)||
            (circulo1.getVisibility() == ImageButton.VISIBLE) && (circulo4.getVisibility() == ImageButton.VISIBLE) && (circulo7.getVisibility() == ImageButton.VISIBLE)||
            (circulo2.getVisibility() == ImageButton.VISIBLE) && (circulo5.getVisibility() == ImageButton.VISIBLE) && (circulo8.getVisibility() == ImageButton.VISIBLE)||
            (circulo3.getVisibility() == ImageButton.VISIBLE) && (circulo6.getVisibility() == ImageButton.VISIBLE) && (circulo9.getVisibility() == ImageButton.VISIBLE)||
            (circulo3.getVisibility() == ImageButton.VISIBLE) && (circulo5.getVisibility() == ImageButton.VISIBLE) && (circulo7.getVisibility() == ImageButton.VISIBLE)){
                Toast.makeText(getApplicationContext(),"'O' Ganhou!", Toast.LENGTH_LONG).show();
            valida = 2;
            LimpaTela();
            pontos_o++;
            String valor = String.valueOf(pontos_o);
            mostra_pontos_o.setText(valor);
        }
        if((valida == 0) && (vazio1.getVisibility() == ImageButton.INVISIBLE) && (vazio2.getVisibility() == ImageButton.INVISIBLE) && (vazio3.getVisibility() == ImageButton.INVISIBLE)&&
           (vazio4.getVisibility() == ImageButton.INVISIBLE) && (vazio5.getVisibility() == ImageButton.INVISIBLE) && (vazio6.getVisibility() == ImageButton.INVISIBLE)&&
           (vazio7.getVisibility() == ImageButton.INVISIBLE) && (vazio8.getVisibility() == ImageButton.INVISIBLE) && (vazio9.getVisibility() == ImageButton.INVISIBLE)){
                Toast.makeText(getApplicationContext(),"Empatou!", Toast.LENGTH_LONG).show();
            LimpaTela();
            empate++;
            String valor = String.valueOf(empate);
            mostra_pontos_empate.setText(valor);
        }
    }

    private void LimpaTela(){

        jogador = true;

        x1.setVisibility(ImageButton.INVISIBLE);
        x2.setVisibility(ImageButton.INVISIBLE);
        x3.setVisibility(ImageButton.INVISIBLE);
        x4.setVisibility(ImageButton.INVISIBLE);
        x5.setVisibility(ImageButton.INVISIBLE);
        x6.setVisibility(ImageButton.INVISIBLE);
        x7.setVisibility(ImageButton.INVISIBLE);
        x8.setVisibility(ImageButton.INVISIBLE);
        x9.setVisibility(ImageButton.INVISIBLE);
        circulo1.setVisibility(ImageButton.INVISIBLE);
        circulo2.setVisibility(ImageButton.INVISIBLE);
        circulo3.setVisibility(ImageButton.INVISIBLE);
        circulo4.setVisibility(ImageButton.INVISIBLE);
        circulo5.setVisibility(ImageButton.INVISIBLE);
        circulo6.setVisibility(ImageButton.INVISIBLE);
        circulo7.setVisibility(ImageButton.INVISIBLE);
        circulo8.setVisibility(ImageButton.INVISIBLE);
        circulo9.setVisibility(ImageButton.INVISIBLE);
        vazio1.setVisibility(ImageButton.VISIBLE);
        vazio2.setVisibility(ImageButton.VISIBLE);
        vazio3.setVisibility(ImageButton.VISIBLE);
        vazio4.setVisibility(ImageButton.VISIBLE);
        vazio5.setVisibility(ImageButton.VISIBLE);
        vazio6.setVisibility(ImageButton.VISIBLE);
        vazio7.setVisibility(ImageButton.VISIBLE);
        vazio8.setVisibility(ImageButton.VISIBLE);
        vazio9.setVisibility(ImageButton.VISIBLE);
    }
}
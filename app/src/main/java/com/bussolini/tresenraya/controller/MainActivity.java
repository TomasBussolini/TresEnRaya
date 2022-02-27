package com.bussolini.tresenraya.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bussolini.tresenraya.R;

public class MainActivity extends AppCompatActivity {

    protected void clickOnFrame (ImageView frame, int turno, int cont, TextView texto){

        if (frame.getBackground() == null) {

            if (turno == 1){
                frame.setBackground(getDrawable(R.drawable.circle));
                texto.setText(getText(R.string.text2));
                turn++;
            }

            else {
                frame.setBackground(getDrawable(R.drawable.cross));
                texto.setText(getText(R.string.text1));
                turn--;
            }

            count ++;

            if (cont > 4) {
                gameOver(count, texto, turno);
            }

        }

        else if (count < 9) {

            Toast.makeText(MainActivity.this,
                    R.string.frame_taken,
                   Toast.LENGTH_SHORT).show();

        }

    }

    protected void gameOver (int cont, TextView texto, int turno){

        checkWinner(texto, turno);

        if (winner || cont == 9){

            texto.setText(getText(R.string.game_over));

        }
    }

    protected void checkWinner (TextView texto, int turno) {

        // NO ME FUNCIONA POR EL MOMENTO
        
        Drawable f1 = findViewById(R.id.frame1).getBackground();
        Drawable f2 = findViewById(R.id.frame2).getBackground();
        Drawable f3 = findViewById(R.id.frame3).getBackground();
        Drawable f4 = findViewById(R.id.frame4).getBackground();
        Drawable f5 = findViewById(R.id.frame5).getBackground();
        Drawable f6 = findViewById(R.id.frame6).getBackground();
        Drawable f7 = findViewById(R.id.frame7).getBackground();
        Drawable f8 = findViewById(R.id.frame8).getBackground();
        Drawable f9 = findViewById(R.id.frame9).getBackground();

        if ( (f1 != null && (f1.equals(f2)) && (f1.equals(f3))) || (f4 != null && (f4.equals(f5)) && (f4.equals(f6))) || (f7 != null && (f7.equals(f8)) && (f7.equals(f9))) || (f1 != null && (f1.equals(f4)) && (f1.equals(f7))) || (f2 != null && (f2.equals(f5)) && (f2.equals(f8))) || (f3 != null && (f3.equals(f6)) && (f3.equals(f9))) || (f1 != null && (f1.equals(f5)) && (f1.equals(f9))) || (f3 != null && (f3.equals(f5)) && (f3.equals(f7)))) {

            winner = true;

            if (turno == 1){
                Toast.makeText(MainActivity.this,
                        R.string.winner1,
                        Toast.LENGTH_SHORT).show();
            }

            else {
                Toast.makeText(MainActivity.this,
                        R.string.winner2,
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    private int turn = 1;
    private int count = 0;
    private boolean winner = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text_turn);

        ImageView frame1 = (ImageView) findViewById(R.id.frame1);
        ImageView frame2 = (ImageView) findViewById(R.id.frame2);
        ImageView frame3 = (ImageView) findViewById(R.id.frame3);
        ImageView frame4 = (ImageView) findViewById(R.id.frame4);
        ImageView frame5 = (ImageView) findViewById(R.id.frame5);
        ImageView frame6 = (ImageView) findViewById(R.id.frame6);
        ImageView frame7 = (ImageView) findViewById(R.id.frame7);
        ImageView frame8 = (ImageView) findViewById(R.id.frame8);
        ImageView frame9 = (ImageView) findViewById(R.id.frame9);

        frame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame1, turn, count, text);
            }
        });

        frame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame2, turn, count, text);
            }
        });

        frame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame3, turn, count, text);
            }
        });

        frame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame4, turn, count, text);
            }
        });

        frame5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame5, turn, count, text);
            }
        });

        frame6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame6, turn, count, text);
            }
        });

        frame7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame7, turn, count, text);
            }
        });

        frame8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame8, turn, count, text);
            }
        });

        frame9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnFrame(frame9, turn, count, text);
            }
        });
    }
}
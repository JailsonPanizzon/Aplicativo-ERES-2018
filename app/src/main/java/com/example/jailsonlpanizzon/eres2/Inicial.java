package com.example.jailsonlpanizzon.eres2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial2);

        Button button = (Button) findViewById(R.id.dia1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Inicial.this, dia22.class);
                startActivity(i);
            }
        });
        Button button2 = (Button) findViewById(R.id.dia2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Inicial.this, dia23.class);
                startActivity(i);
            }
        });
        Button button3 = (Button) findViewById(R.id.dia3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Inicial.this, dia24.class);
                startActivity(i);
            }
        });
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://portal.utfpr.edu.br/campus/doisvizinhos"));
                startActivity(i);
            }
        });
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.sbc.org.br/"));
                startActivity(i);
            }
        });
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://coens.dv.utfpr.edu.br/eres/"));
                startActivity(i);
            }
        });
    }


}

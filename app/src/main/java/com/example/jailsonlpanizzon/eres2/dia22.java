package com.example.jailsonlpanizzon.eres2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dia22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia22);

        Button button = (Button) findViewById(R.id.button30);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, abertura.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, palestra1.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.coffee);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, coffee.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.secaotec2);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, Trilhagraduacao1.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) findViewById(R.id.secaotec);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, Trilhapos1.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) findViewById(R.id.secaotec3);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, mini1.class);
                startActivity(intent);
            }
        });
        Button button7 = (Button) findViewById(R.id.button);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, jantar1.class);
                startActivity(intent);
            }
        });
        Button button8 = (Button) findViewById(R.id.button2);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, palestra2.class);
                startActivity(intent);
            }
        });
        Button button9 = (Button) findViewById(R.id.button10);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia22.this, palestra3.class);
                startActivity(intent);
            }
        });
        Button button10 = (Button) findViewById(R.id.button64);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_happyhour);
            }
        });
        Button button11 = (Button) findViewById(R.id.secaotec4);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_sessao3);
            }
        });
    }

}

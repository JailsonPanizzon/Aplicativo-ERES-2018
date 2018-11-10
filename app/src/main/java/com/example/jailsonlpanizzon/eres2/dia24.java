package com.example.jailsonlpanizzon.eres2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dia24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia24);

        Button button = (Button) findViewById(R.id.button30);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, mini4.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, mini5.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.coffee);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, coffee.class);
                startActivity(intent);
            }
        });
        Button button41 = (Button) findViewById(R.id.secaotec);
        button41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, sessaotec4.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.secaotecgrad2);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, sesao5.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) findViewById(R.id.secaotec2);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, mini6.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.button);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, jantar3.class);
                startActivity(intent);
            }
        });
        Button button8 = (Button) findViewById(R.id.button2);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, trilhaindustria.class);
                startActivity(intent);
            }
        });
        Button button9 = (Button) findViewById(R.id.button10);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, palestra7.class);
                startActivity(intent);
            }
        });
        Button button10 = (Button) findViewById(R.id.button640);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, talkindustria.class);
                startActivity(intent);
            }
        });

        Button button11 = (Button) findViewById(R.id.button64);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dia24.this, encerramento.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.teste1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sorteio(View view){
        TextView text = findViewById(R.id.tv2);

        int x = new Random().nextInt(21);
        text.setText("O numero do sorteio foi: " + x );

    }


}
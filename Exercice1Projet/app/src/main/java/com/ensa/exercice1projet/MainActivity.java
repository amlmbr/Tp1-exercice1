package com.ensa.exercice1projet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int compteur =0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        Button btnToast = findViewById(R.id.buttonToast);
        Button btnIncrement = findViewById(R.id.buttonIncrement);

        // Gestion de l'événement pour le bouton Toast
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Toast" ,Toast.LENGTH_LONG).show();
            }
        });

        // Gestion de l'événement pour le bouton Incrémenter
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compteur++;
                textView.setText(String.valueOf(compteur));
            }
        });
    }
}
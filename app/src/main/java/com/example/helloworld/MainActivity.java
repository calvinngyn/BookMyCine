package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; // Importer Intent
import android.os.Bundle;
import android.view.View; // Importer View
import android.widget.Button; // Importer Button

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupérer le bouton par son ID
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Créer une intention pour lancer la nouvelle activité
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent); // Démarrer la nouvelle activité
            }
        });
    }
}

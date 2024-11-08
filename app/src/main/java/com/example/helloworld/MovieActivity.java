package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_activity);

        // Configuration des clics pour chaque ImageView
        findViewById(R.id.myImageView1).setOnClickListener(view -> openDetailActivity(R.drawable.venom, "Venom", "Avis: Très bon film! Action et suspense."));
        findViewById(R.id.myImageView2).setOnClickListener(view -> openDetailActivity(R.drawable.challenger, "Challenger", "Avis: Histoire captivante avec de bons acteurs."));
        findViewById(R.id.myImageView3).setOnClickListener(view -> openDetailActivity(R.drawable.houseof, "House of Cards", "Avis: Politique intense, excellente série."));
        findViewById(R.id.myImageView4).setOnClickListener(view -> openDetailActivity(R.drawable.juren2, "Attack on Titan", "Avis: Série incroyable! Suspense et action." ));
    }

    // Méthode pour ouvrir l'activité de détail avec les informations du film
    private void openDetailActivity(int imageResId, String title, String reviews) {
        Intent intent = new Intent(this, MovieDetailActivity.class);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("title", title);
        intent.putExtra("reviews", reviews);
        startActivity(intent);
    }
}

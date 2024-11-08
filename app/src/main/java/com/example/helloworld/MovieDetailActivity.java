package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        // Récupération des vues
        ImageView imageView = findViewById(R.id.detailImageView);
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView reviewsTextView = findViewById(R.id.reviewsTextView);

        // Récupération des données envoyées via l'intent
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("imageResId", 0);
        String title = intent.getStringExtra("title");

        // Définir le titre du film
        titleTextView.setText(title);

        // Définir l'image du film
        imageView.setImageResource(imageResId);

        // Définir les avis pour Venom (ajoutez ici d'autres films avec leurs avis)
        String reviews = "";
        if (title != null && title.equals("Venom")) {
            reviews = "Alors j'ai passé un agréable moment avec ce 3e volet. Beaucoup de critiques négatives des médias mais c'est un bon film. La fin, je vous laisse la découvrir.\n\n" +
                    "Les médias ne sont jamais contents, ils voient un film et le critiquent ensuite. Alors, zapper le cinéma, la critique est facile, l'art est difficile.\n\n" +
                    "Très bons effets spéciaux, on est dedans jusqu'à la fin avec un pincement au cœur. Mais le meilleur reste à venir, je vous conseille ce film.";
        }

        // Affichage des avis
        reviewsTextView.setText(reviews);
    }
}

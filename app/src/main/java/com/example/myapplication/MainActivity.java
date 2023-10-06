package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int [] ListImages = {
            R.drawable.audia7_sportback,
            R.drawable.porsche_911,
            R.drawable.rr_ghost
    };
    private int ImagesIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign image on imageView
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(ListImages[ImagesIndex]);

        // handle the next button event
        Button buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Next image
                ImagesIndex++;
                if (ImagesIndex >= ListImages.length) {
                    ImagesIndex = 0;
                }

                // assign new image on imageView
                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(ListImages[ImagesIndex]);
            }
        });

        // assign new image on view
        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // assign new image on view
                ImagesIndex--;
                if (ImagesIndex < 0) {
                    ImagesIndex = ListImages.length - 1;
                }

                // assign new image on imageView
                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(ListImages[ImagesIndex]);
            }
        });
    }
}
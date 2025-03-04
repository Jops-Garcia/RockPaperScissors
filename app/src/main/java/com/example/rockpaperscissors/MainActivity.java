package com.example.rockpaperscissors;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void selectRock(View view) {
        selectWinner("Rock");
    }

    public void selectPaper(View view) {
        selectWinner("Paper");
    }

    public void selectScissors(View view) {
        selectWinner("Scissors");
    }

    private String generateAppChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomIndex = new Random().nextInt(choices.length);

        ImageView appChoiceImageView = findViewById(R.id.image_app);
        switch (randomIndex) {
            case 0:
                appChoiceImageView.setImageResource(R.drawable.pedra);
                break;
            case 1:
                appChoiceImageView.setImageResource(R.drawable.papel);
                break;
            case 2:
                appChoiceImageView.setImageResource(R.drawable.tesoura);
                break;
        }

        return choices[randomIndex];
    }

    private void selectWinner(String userChoice) {
        //generate app choice
        String appChoice = generateAppChoice();

        //get result text view
        TextView resultTextView = findViewById(R.id.text_resultado);

        if (userChoice.equals(appChoice)) {
            resultTextView.setText("Empate!");
        } else if (
            (userChoice.equals("Rock") && appChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && appChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && appChoice.equals("Paper"))
        ) {
            resultTextView.setText("Você ganhou!");
        } else {
            resultTextView.setText("Você perdeu!");
        }
    }
}

package com.example.a731labassignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeSteps extends AppCompatActivity {
    TextView recipeSteps;
    ImageView recipeImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_steps);

        recipeSteps = (TextView)findViewById(R.id.ivRecipe);
        recipeImg = (ImageView)findViewById(R.id.ivImage);

        Bundle rBundle = getIntent().getExtras();

        if(rBundle != null){
            recipeSteps.setText(rBundle.getString("Recipe"));
            recipeImg.setImageResource(rBundle.getInt("Image"));
        }

    }
}
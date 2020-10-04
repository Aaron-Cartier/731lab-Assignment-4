package com.example.a731labassignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rRecyclerView;
    List<FoodData> myRecipeList;
    FoodData rFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        rRecyclerView.setLayoutManager(gridLayoutManager);

        myRecipeList = new ArrayList<>();
        rFoodData = new FoodData("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work. The lemon adds an almost sweet taste. Be generous with it!","", R.drawable.kale_lemon_sandwich);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salsa. It really is our all-time favourite summer salad.","" , R.drawable.mango_lime_bean_salad);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good, easy and I ate it ALL the first time I made it. If someone is hesitant about plant-based food, this has to be a convincer. ","" , R.drawable.sweet_potato_and_lentil_soup);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more of less lime according to taste.","", R.drawable.lime_mousse);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Broiled Tilapia Parmesan","Flavourful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavour and finished with Parmesana on top.","", R.drawable.broiled_tilapia_parmesan);
        myRecipeList.add(rFoodData);

        recipeAdapter rAdapter = new recipeAdapter(MainActivity.this, myRecipeList);
        rRecyclerView.setAdapter(rAdapter);

    }
}
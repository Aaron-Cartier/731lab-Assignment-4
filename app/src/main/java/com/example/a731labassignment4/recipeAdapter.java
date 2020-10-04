package com.example.a731labassignment4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recipeAdapter extends RecyclerView.Adapter<recipeViewHolder>{

    private Context rContext;
    private List<FoodData> myRecipeList;

    public recipeAdapter(Context rContext, List<FoodData> myRecipeList) {
        this.rContext = rContext;
        this.myRecipeList = myRecipeList;
    }

    @NonNull
    @Override
    public recipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_recipes, parent, false);
        return new recipeViewHolder(rView);
    }

    @Override
    public void onBindViewHolder(@NonNull final recipeViewHolder holder, int i) {
        holder.imageView.setImageResource(myRecipeList.get(i).getItemImg());
        holder.rTitle.setText(myRecipeList.get(i).getTitle());
        holder.rDescription.setText(myRecipeList.get(i).getDescription());
        holder.rRecipe.setText(myRecipeList.get(i).getRecipeSteps());

    }

    @Override
    public int getItemCount() {
        return myRecipeList.size();
    }
}
class recipeViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView rTitle, rDescription, rRecipe;
    CardView rCardView;

    public recipeViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imgOne);
        rTitle = itemView.findViewById(R.id.ivTitle);
        rDescription = itemView.findViewById(R.id.ivDescription);
        rRecipe = itemView.findViewById(R.id.ivRecipe);

        rCardView = itemView.findViewById(R.id.myCardView);
    }
}


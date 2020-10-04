package com.example.a731labassignment4;

public class FoodData {

    private String title;
    private String description;
    private String recipeSteps;
    private int itemImg;

    public FoodData(String title, String info, String recipeSteps, int itemImg) {
        this.title = title;
        this.description = info;
        this.recipeSteps = recipeSteps;
        this.itemImg = itemImg;
    }

    public String getRecipeSteps() {
        return recipeSteps;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getItemImg() {
        return itemImg;
    }
}

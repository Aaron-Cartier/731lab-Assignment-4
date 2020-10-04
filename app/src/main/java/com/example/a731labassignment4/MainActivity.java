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
        rFoodData = new FoodData("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work. The lemon adds an almost sweet taste. Be generous with it!"," Ingredients:\n" + " - 4 slices whole grain bread\n" +
                " - 1 bunch of kale or chard, center rib removed and chopped in bite sized pieces (4 cups or more)\n" + " - 1/4-1/3 cup hummus\n" + " - a few green onions, light green parts only (save the rest for soup), sliced thin\n" +
                " - 2 tbsp chopped cilantro or parsley leaves\n" + " - 1 lemon\n" + " - Finishing oil (sunflower or olive)\n" + " - salt and pepper\n" + " - 1 large tomato, sliced in 4 thick slices (optional)\n\n" + " Instructions:\n" +
                "1. For the lemon, zest the ends and then remove about 1 inch from each stem end side. Juice these ends and reserve. VERY thinly slice the center section, and remove any seeds as you go.\n\n" +
                "2. Toast your bread really well, to an almost cracker-like texture.\n\n" +
                "3. Blanch the kale: bring 3-4 inches of water to a boil, drop in kale cover and cook until tender, 3 minutes. Quickly drop into an ice water bath, or rinse until freezing water to stop the cooking process. Pat/squeeze dry with towels. Sprinkle the tender kale with lemon zest and lemon juice, and tear up into small pieces, and allow to sit while you prep the sandwiches.\n\n" +
                "4. Spread toast thickly with hummus, sprinkle green onions on the hummus, pile cilantro on top of the green onions and then place a few super thing lemon slices on the cilantro.\n\n" +
                "5. Then put a big handful of lemoney-kale on top of each piece of bread. Drizzle a little bit of oil on top, and crack some salt and pepper. It's delicious as is, or top with a tomato slice.", R.drawable.kale_lemon_sandwich);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salsa. It really is our all-time favourite summer salad."," Ingredients:\n" +
                " - 2 medium or 3 Ataulfo mango, chopped\n" + " - 1 large tomato, chopped\n" + " - 1 large bell pepper, chopped\n" + " - 1 cup corn, cooked or frozen (thawed)\n" + " - 15 – 19 oz can black beans, rinsed and drained\n" +
                " - 1/2 cup cilantro, finely chopped\n" + " - 2 tbsp red onion, minced\n" + " - 2 tbsp olive oil, extra virgin\n" + " - 1 lime, juice of\n" + " - 2 tsp cumin, ground\n" + " - 1/2 tsp salt\n" + " - red chili pepper flakes, to taste\n\n" + " Instructions:\n" +
                "1. In a large bowl, add mango, tomato, bell pepper, corn, black beans, cilantro, onion, olive oil, lime juice, cumin, salt, hot pepper flakes.\n\n" +
                "2. Gently stir to combine. If you have time, allow flavors to marry each other in the fridge for a few hours.\n\n" +
                "3. Serve cold with cilantro lime chicken, grilled salmon or add cooked quinoa to make it one complete meal." , R.drawable.mango_lime_bean_salad);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good, easy and I ate it ALL the first time I made it. If someone is hesitant about plant-based food, this has to be a convincer. "," Ingredients:\n" +
                " - 1 leak; thinly sliced\n" + " - 6 cloves garlic; minced\n" + " - 2 cups shiitake mushrooms; soaked for 30 min before slicing\n" + " - 4 cups vegetable broth\n" + " - 2 cups water\n" + " - 1 1/2 cups lentils\n" +
                " - 1 sweet potato; diced\n" + " - 1 bay leaf\n" + " - 1/2 cup basil\n" + " - dash Black pepper\n" + " - handful spinach\n\n" + " Instructions:\n" +
                "1. In a large pan, stir-fry leek, mushrooms and garlic for 3 to 4 minutes until leeks are soft.\n\n" +
                "2. Stir in broth, water, lentils, sweet potato, and bay leaf.\n\n" +
                "3. Bring to boil then simmer uncovered until lentils and sweet potatoes are soft, about 30 to 40 minutes.\n\n" +
                "4. Remove bay leaf and puree 2 cups of soup until smooth or use an immersion blender; return to pot, stir in basil and pepper to taste.\n\n" +
                "5. Just before serving stir in as much as you dare fresh spinach. It will melt in the pot. If you prefer fill individual soup bowls with spinach and spoon hot soup over the spinach. Top with a sprinkle of more fresh basil.\n" , R.drawable.sweet_potato_and_lentil_soup);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more of less lime according to taste."," Ingredients:\n"+
                " - Juice of 4 limes\n" + " - 400 ml (1 pint (473 ml)) heavy whipping cream\n" + " - 397 grams (14 ounces) condensed milk\n" + " - 1 tablespoon powdered sugar\n\n" + " Instructions:\n" +
                "1. In a bowl, beat the cream with a tablespoon powdered sugar until stiff peaks form.\n\n" +
                "2. Add the condensed milk and fold gently with a spatula. Pour the lime juice and fold gently until the cream begins to thicken slightly.\n\n" +
                "3. Pour the mousse into individual bowls and refrigerate about 2 hours.\n\n" +
                "4. Remove the mousse from the fridge, garnish with lime zest and serve.", R.drawable.lime_mousse);
        myRecipeList.add(rFoodData);
        rFoodData = new FoodData("Broiled Tilapia Parmesan","Flavourful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavour and finished with Parmesana on top."," Ingredients:\n" +
                " - 4 Tilapia fillets (defrosted if frozen)\n" + " - 1/4 cup parmesan cheese grated\n" + " - 2 tablespoons butter\n" + " - 1 1/2 tablespoons mayonnaise or dressing\n" + " - 1 tablespoons lemon juice fresh\n" +
                " - 1 teaspoon dill fresh\n" + " - seasoning salt and pepper\n\n" + " Instructions:\n" +
                "1. Turn broiler onto high and adjust oven rack to the top.\n\n" +
                "2. In a small bowl, combine all ingredients except the Tilapia. Set aside.\n\n" +
                "3. Place Tilapia fillets on a foil lined pan. Broil for 3 minutes.\n\n" +
                "4. Remove from the oven, flip over and divide the parmesan mixture over the uncooked sides of the Tilapia.\n\n" +
                "5. Return to the oven and broil an additional 3-4 minutes making sure not to over cook the fish.", R.drawable.broiled_tilapia_parmesan);
        myRecipeList.add(rFoodData);

        recipeAdapter rAdapter = new recipeAdapter(MainActivity.this, myRecipeList);
        rRecyclerView.setAdapter(rAdapter);

    }
}
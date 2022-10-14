import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("Japanese Temple");
        System.out.println("Welcome to the "+ myRestaurant.getName() + ". What can I get you?" + "\n");

        HashMap<String, Float> recipes = new HashMap<>();
        recipes.put(myRestaurant.asianFood.sushi.getName(), myRestaurant.asianFood.sushi.getPrice());
        recipes.put(myRestaurant.asianFood.onigiri.getName(), myRestaurant.asianFood.onigiri.getPrice());
        recipes.put(myRestaurant.asianFood.yakisoba.getName(), myRestaurant.asianFood.yakisoba.getPrice());
        recipes.put(myRestaurant.asianFood.tonkatsu.getName(), myRestaurant.asianFood.tonkatsu.getPrice());
        recipes.put(myRestaurant.asianFood.karaage.getName(), myRestaurant.asianFood.karaage.getPrice());

        System.out.println("The recipe in the third position is " + myRestaurant.asianFood.yakisoba.getName() + ".\n");

        recipes.clear();

        recipes.put(myRestaurant.asianFood.sushi.getName(), myRestaurant.asianFood.sushi.getPrice());
        recipes.put(myRestaurant.asianFood.onigiri.getName(), myRestaurant.asianFood.onigiri.getPrice());
        recipes.put(myRestaurant.asianFood.vegan.getName(), myRestaurant.asianFood.vegan.getPrice());
        recipes.put(myRestaurant.asianFood.tonkatsu.getName(), myRestaurant.asianFood.tonkatsu.getPrice());
        recipes.put(myRestaurant.asianFood.karaage.getName(), myRestaurant.asianFood.karaage.getPrice());

        System.out.println("The recipe in the third position is " + myRestaurant.asianFood.vegan.getName() + ".\n");

        int sizeMenu = recipes.size();
        System.out.println("The amount of recipes in the menu is " + sizeMenu + ".\n");

        System.out.println("The list of the recipes and prices in the " + myRestaurant.asianFood.getName() + " menu is:\n");

        for (String recipe : recipes.keySet()) {
            System.out.println("Recipe: " + recipe + ". " + "Price: " + recipes.get(recipe));
        }
    }
}
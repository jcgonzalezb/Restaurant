public class Recipe {
    public int position;

    public String name;

    public float price;

    Recipe(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return this.name; }
    public float getPrice() { return this.price; }

}

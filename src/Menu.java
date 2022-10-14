public class Menu {

    public String name;

    Menu(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    Recipe sushi = new Recipe("Sushi", 10);
    Recipe onigiri = new Recipe("Onigiri", 20);
    Recipe yakisoba = new Recipe("Yakisoba", 30);
    Recipe tonkatsu = new Recipe("Tonkatsu", 40);
    Recipe karaage = new Recipe("Karaage", 50);
    Recipe vegan = new Recipe("Vegan", 30);
}


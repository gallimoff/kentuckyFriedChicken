public class Main {
    public static void main(String[] args) {
        Burger burgerOne = new Burger();
        burgerOne.postScriptum = new PostScriptum();
        burgerOne.nutritionalValue = new NutritionalValue();

        burgerOne.name = "De Luxe Chefburger";
        burgerOne.id = 2_380;
        burgerOne.price = 144;
        burgerOne.weight = 239;
        burgerOne.calories = 242;
        burgerOne.nutritionalValue.fat= 12.1;
        burgerOne.nutritionalValue.protein = 13.2;
        burgerOne.nutritionalValue.carbohydrate = 20.3;
        burgerOne.imageUrl = "https://s82079.cdn.ngenix.net/SCeZWBR7JEc83mEiNKDeFEeD.png?dw=230";
        burgerOne.description = "Tasty our new unique chef’s burger is De Luxe now! Juicy fillet in original breading, Tomatoeses, lettuce, sauce Cesar and appetizing bun with black and white sesame, with slice of cheese and two pieces of bacon.";
        System.out.println(burgerOne.name);
        System.out.println("Id " + burgerOne.id);
        System.out.println("Burger price " + burgerOne.price + " rubles");
        System.out.println("Burger weight " + burgerOne.weight + " grams");
        System.out.println("Сalorie burger " +burgerOne.calories + " ccal");
        System.out.println("A burger contains " + burgerOne.nutritionalValue.fat + " grams of fat");
        System.out.println("A burger contains " + burgerOne.nutritionalValue.protein + " grams of protein");
        System.out.println("A burger contains " + burgerOne.nutritionalValue.carbohydrate + " grams of carbohydrates");
        System.out.println(burgerOne.description);
        System.out.println("Image link " + burgerOne.imageUrl);
        System.out.println("* " + burgerOne.postScriptum.clarificationOne);
        System.out.println("** " + burgerOne.postScriptum.clarificationTwo);

        System.out.println('\n');

        Burger burgerTwo = new Burger();
        burgerTwo.postScriptum = new PostScriptum();
        burgerTwo.nutritionalValue = new NutritionalValue();

        burgerTwo.name = "De Luxe Chefburger Hot and Spicy";
        burgerTwo.id = 2_381;
        burgerTwo.price = 144;
        burgerTwo.weight = 229;
        burgerTwo.calories = 236;
        burgerTwo.nutritionalValue.fat = 10.9;
        burgerTwo.nutritionalValue.protein = 13.4;
        burgerTwo.nutritionalValue.carbohydrate = 21.2;
        burgerTwo.imageUrl = "https://s82079.cdn.ngenix.net/wyCbBvmb3DKwXFTcJQ4jw4Zh.png?dw=230";
        burgerTwo.description = "Tasty our new unique chef’s burger is De Luxe now! Spicy fillet in crispy breading, lettuce, onion, sauce Burger, pickles and appetizing bun with black and white sesame, with slice of cheese and two pieces of bacon.";
        System.out.println(burgerTwo.name);
        System.out.println("Id " + burgerTwo.id);
        System.out.println("Burger price " + burgerTwo.price + " rubles");
        System.out.println("Burger weight " + burgerTwo.weight + " grams");
        System.out.println("Сalorie burger " + burgerTwo.calories + " ccal");
        System.out.println("A burger contains " + burgerTwo.nutritionalValue.fat + " grams of fat");
        System.out.println("A burger contains " + burgerTwo.nutritionalValue.protein + " grams of protein");
        System.out.println("A burger contains " + burgerTwo.nutritionalValue.carbohydrate + " grams of carbohydrates");
        System.out.println(burgerTwo.description);
        System.out.println("Image link " + burgerTwo.imageUrl);
        System.out.println("* " + burgerTwo.postScriptum.clarificationOne);
        System.out.println("** " + burgerTwo.postScriptum.clarificationTwo);
    }
}

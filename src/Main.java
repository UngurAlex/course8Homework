public class Main {
    private static Fridge Fridge;
    public static void main(String[] args) {
        Cosmetics GoodCosmetics = new Cosmetics("red", 33, 10, "Paint", "is good", 6);
        Product whatProduct = new Product(5, "AnyProduct", "NotVeryExpensive", 10);
        Electronics manyElectronics = new Electronics("PC", 50, 30, 5, 3, 250, "PC", "better", 1);
        Fridge = new Fridge(-5,"Fridge",100,50,50,60,2000,"Whirlpool","the best fridge", 5);
    }



}
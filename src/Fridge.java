public class Fridge extends Electronics{

    private int temperature;
    public Fridge (int temperature, String type, int length, int width, int height, int weight,int price, String name, String description, int quantity){
    super( type, length, width, height, weight,price, name, description, quantity);
        System.out.println("Create Fridge");
        this.temperature=temperature;
    }

    public  int getTemperature() {
        return temperature;
    }
}

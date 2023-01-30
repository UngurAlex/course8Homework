public class Product {

    private  int price;
    private  String name;
    private  String description;
    private  int quantity;
    public Product (int price, String name, String description, int quantity){
    this.price= price;
    this.name=name;
    this.description=description;
    this.quantity=quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getDescription() {
        return this.description;
    }
}

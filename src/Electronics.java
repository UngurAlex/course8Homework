public class Electronics extends Product {

    private String type;
    private int length;
    private int  width;
    private int  height;
    private int weight;

    public Electronics(String type, int length, int width, int height, int weight, int price, String name, String description, int quantity){
    super(price, name, description, quantity);
        System.out.println("Create Electronics");
    this.type=type;
    this.length=length;
    this.width=width;
    this.height=height;
    this.weight=weight;
    }

    public  String getType() {
        return type;
    }

    public  int getLength() {
        return length;
    }

    public  int getWidth() {
        return width;
    }

    public  int getHeight() {
        return height;
    }

    public  int getWeight() {
        return weight;
    }
}
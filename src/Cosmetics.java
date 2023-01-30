
public class Cosmetics extends Product {
        private String color;
        private int weight;
        public Cosmetics (String color, int weight,int price, String name, String description, int quantity){
                super(price, name, description, quantity);
                System.out.println("Create Cosmetics");
                this.color=color;
                this.weight=weight;
        }


        public  String getColor() {
                return color;
        }

        public  int getWeight() {
                return weight;
        }
}

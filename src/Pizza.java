public class Pizza {
    //Pizza variables
    private String[] toppings;
    private String description;
    private int price;
    private int numberOfToppings;
    private int pizzaPrice = 14;
    private int toppingPrice = 2;

    //Constructor
    public Pizza(String[] toppings, int numberOfToppings) {
        //set pizza values
        this.toppings = toppings;
        this.numberOfToppings = numberOfToppings;
        this.description = "";

        //build the description
        for(int i = 0; i < numberOfToppings; i++) {
            description += toppings[i];
            if(i < numberOfToppings - 1) {
                description += ", ";
            }
        }

        //calculate price
        this.price = pizzaPrice + (numberOfToppings * toppingPrice);

    }

    //Accessor Method for Price
    public double getPrice() {
        return price;
    }

    //toString Override: called when you print an  object
    @Override
    public String toString() {
        return "Pizza with toppings: " + description + "\nPrice: $" + price;
    }

}

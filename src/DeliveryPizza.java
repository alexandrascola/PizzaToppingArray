public class DeliveryPizza extends Pizza {
    //New Variables
    private int deliveryFee;
    private String deliveryAddress;
    //Constructor
    public DeliveryPizza(String[] topping, int numberOfToppings, String deliveryAddress) {
        super(topping, numberOfToppings);
        this.deliveryAddress = deliveryAddress;

        //Calculate price with delivery fee
        if(getPrice() >18)
            deliveryFee = 3;
        else deliveryFee = 5;
    }

    //Override toString
    public String toString() {
        return super.toString() + "\nDelivery fee: $" + deliveryFee +
                "\nDelivery Address: " + deliveryAddress +
                "\nTotal Price: $" + (getPrice() + deliveryFee);
    }
}

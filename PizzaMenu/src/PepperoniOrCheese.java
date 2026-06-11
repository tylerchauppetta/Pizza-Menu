public class PepperoniOrCheese extends PizzaType {
    double basePrice = 6.99, thinPrice = 7.99, stuffedPrice = 12.49, deepPrice = 12.99;
    double[] pepperoniCheesePrice = {basePrice, thinPrice, stuffedPrice, deepPrice};

    @Override
    public void setPizzaPrice(String crust) {
        for (int i = 0; i < crustType.length; i++) {
            if (crust.equals(crustType[i])) {
                price = pepperoniCheesePrice[i];
            }
        }
    }

    @Override
    public double getPizzaPrice() {
        return price;
    }
}

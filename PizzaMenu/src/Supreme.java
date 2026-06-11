public class Supreme extends PizzaType {
    double basePrice = 15.99;

    @Override
    public void setPizzaPrice(String crust) {
        for (int i = 0; i < crustType.length; i++) {
            if (crust.equals(crustType[i])) {
                price = basePrice + i;
            }
        }
    }

    @Override
    public double getPizzaPrice() {
        return price;
    }
}

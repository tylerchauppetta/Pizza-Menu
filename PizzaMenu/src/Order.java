public class Order extends PizzaType {

    @Override
    public void setPizzaPrice(String crust) {
        String type = getToppingType();
        int quantity = getPizzaQuantity();
        if (type.equals(toppingType[0])) {
            ThreeMeat threeMeatPizza = new ThreeMeat();
            for (int i = 0; i < crustType.length; i++) {
                if (crust.equals(crustType[i])) {
                    threeMeatPizza.setPizzaPrice(crust);
                    price = threeMeatPizza.getPizzaPrice() * quantity;
                }
            }
        } else if (type.equals(toppingType[1])) {
            Supreme supremePizza = new Supreme();
            for (int i = 0; i < crustType.length; i++) {
                if (crust.equals(crustType[i])) {
                    supremePizza.setPizzaPrice(crust);
                    price = supremePizza.getPizzaPrice() * quantity;
                }
            }
        } else if (type.equals(toppingType[2]) || type.equals(toppingType[3])) {
            PepperoniOrCheese pepOrChzPizza = new PepperoniOrCheese();
            for (int i = 0; i < crustType.length; i++) {
                if (crust.equals(crustType[i])) {
                    pepOrChzPizza.setPizzaPrice(crust);
                    price = pepOrChzPizza.getPizzaPrice() * quantity;
                }
            }
        }
    }

    @Override
    public double getPizzaPrice() {
        return price;
    }


}
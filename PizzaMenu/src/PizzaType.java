public abstract class PizzaType {
    protected String crust, toppings;
    protected double price;
    protected int quantity;
    protected String[] crustType = {"Round Pizza", "Thin Crust", "Stuffed Crust", "Deep Dish"};
    protected String[] toppingType = {"3 Meat", "Supreme", "Pepperoni", "Cheese"};


    public void setPizzaCrust(int pizzaCrust) {
        for (int i = 0; i < crustType.length; i++) {
            if (pizzaCrust == i + 1) {
                crust = crustType[i];
            }
        }
    }

    public String getPizzaCrust() {
        return crust;
    }

    public void setToppingType(int type) {
        for (int i = 0; i < toppingType.length; i++) {
            if (type == i + 1) {
                toppings = toppingType[i];
            }
        }
    }

    public String getToppingType() {
        return toppings;
    }

    public void setPizzaQuantity(int pizzaQuantity) {
        quantity = pizzaQuantity;
    }

    public int getPizzaQuantity() {
        return quantity;
    }

    // Abstracts
    abstract void setPizzaPrice(String crust);

    abstract double getPizzaPrice();


}


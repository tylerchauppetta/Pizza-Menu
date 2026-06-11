import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaApplication {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Order myOrder = new Order();

        char continueInput;
        try {
            do {
                int userInput;
                System.out.println("Select the number to the corresponding crust type:" +
                        "\n1 - Round Pizza\n2 - Thin Crust\n3 - Stuffed Crust\n4 - Deep Dish");
                userInput = scnr.nextInt();

                if (userInput < 1 || userInput > 4) {
                    throw new Exception("Input must be in range 1 - 4");
                }

                myOrder.setPizzaCrust(userInput);

                System.out.println("Select the number to the corresponding topping type:" +
                        "\n1 - 3 Meat\n2 - Supreme\n3 - Pepperoni\n4 - Cheese");
                userInput = scnr.nextInt();

                if (userInput < 1 || userInput > 4) {
                    throw new Exception("Input must be in range 1 - 4");
                }

                myOrder.setToppingType(userInput);

                System.out.println("Item quantity:");
                userInput = scnr.nextInt();

                if (userInput < 1) {
                    throw new Exception("Quantity be greater than zero.");
                }
                if (userInput > 100) {
                    throw new Exception("Quantity be less than 100.");
                }

                myOrder.setPizzaQuantity(userInput);

                myOrder.setPizzaPrice(myOrder.getPizzaCrust());
                System.out.printf("Your total is... $%.2f\n", myOrder.getPizzaPrice());

                System.out.println("Enter Y to order another pizza, or any key to quit.");
                continueInput = scnr.next().charAt(0);
            }
            while (continueInput == 'Y' || continueInput == 'y');
        }
        catch (InputMismatchException mismatchException) {
            System.out.println("Input must be an integer.");
            System.out.println("Exiting program.");
        }
        catch (Exception excpt) {
            System.out.println(excpt.getMessage());
            System.out.println("Exiting program.");
        }
        System.out.println("Enjoy!");

    }
}

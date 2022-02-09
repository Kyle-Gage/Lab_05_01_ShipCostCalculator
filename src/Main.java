import com.sun.deploy.ui.DialogTemplate;

public class Main
{

    public static void main(String[] args)
    {
	// if else statement

    /*
    An application program where the user enters the price of an item and the program computes shipping costs.
    If the item price is $100 or more, then shipping is free otherwise it is 2% of the price.
    The program should output the shipping cost and the total price.
     */

        int itemPrice = 85;
        double shippingRate = .02;
        double shippingCost;
        double totalPrice;



        if(itemPrice >= 100)
        {
            System.out.println("Shipping is free! The total price is $" + itemPrice);
        }
        else
        {
            shippingCost = itemPrice * shippingRate;
            totalPrice = itemPrice + shippingCost;
            System.out.println("The shipping cost is $" + shippingCost + " and the total price is $" + totalPrice);
        }

    }
}

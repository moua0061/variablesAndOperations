public class JAVA02 {

    public static void main(String[] args) {

        // create a variable to hold the quantity of available plane seats left on a
        // flight
        int seatsLeft = 34;

        // create a variable to hold the cost of groceries at checkout
        double costOfGroceriesAtCheckout = 1.00;

        // create a variable to hold a person's middle initial
        String middileInitial = "L";

        // create a variable to hold true if its hot outside and false if it's cold
        // outside
        boolean hotOutside = true;
        boolean coldOutside = false;

        // create a variable to hold a customer's first name
        String firstName = "Testing";

        // create a variable to hold a street address
        String address = "1234 Main Street";

        // print all variables to the console
        System.out.print(seatsLeft + " " + costOfGroceriesAtCheckout + " " + middileInitial + " " + hotOutside + " "
                + coldOutside
                + " " + firstName + " " + address);

        // customer booked 2 plane seats, remove 2 seats from the available seats
        // variable
        seatsLeft -= 2;

        // impulse candy bar purchase, add 2.15 to the grocery total
        double candyBar = 2.15;
        costOfGroceriesAtCheckout += candyBar;

        // birth certificate was printed incorrectly, change the middle initial to
        // something else
        middileInitial = "R";

        // the season has changed, update the hot outside variable to be opposite of
        // what it was
        hotOutside = !hotOutside;
    }
}
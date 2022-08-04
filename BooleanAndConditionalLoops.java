public class BooleanAndConditionalLoops {

    public static void main(String[] args) {
        // create a variable named age and assign it a value of 14
        int age = 14;

        // print the boolean expression age >= 16 to the console and note the results
        // System.out.println(age >= 16);
        // change the value of age to 18 and run again
        age = 18;
        // System.out.println(age >= 16);

        // using a conditional, print "you can drive" if age is greater than or equal to
        // 16
        // and "you cannot drive" otherwise
        age = 16;
        boolean haslicense = false;
        if (age >= 16 && haslicense) {
            // System.out.println("you can drive");
        } else {
            // System.out.println("you cannot drive");
        }
        // change the value of age and rerun to see the result

        // add a new variable called haslicense before the conditional
        // change the boolean expression in the conditional to additionally include the
        // need for haslicense to be true
        // try changing the values of age and haslicense and note the different results

        // create 2 new variables - costOfMilk and thirstLevel
        double costOfMilk = 2.19;
        int thirstLevel = 2;
        // create a new conditional that prints "milk please" if costOfMilk is less than
        // 2.50
        // or if thirstLevel is greater than 6 and prints "no thanks" otherwise
        // change the values and note the different results
        if (costOfMilk < 2.50 || thirstLevel > 6) {
            // System.out.println("milk please");
        } else {
            // System.out.println("no thanks");
        }

        // create 2 variables called numberofcookies and numberofchildren
        // you will evenly distribute all of the cookies to the children and as the
        // adult
        // you get to keep the remaining cookies to yourself
        // use a conditional to print the following based on the following conditions:
        // if there are 0 cookies remaining, print "sad face"
        // if there are less than 2 cookies, print "yes"
        // if there are less than 5 cookies, print "whoohooo!"
        // if there are 5 or more cookies, print "jackpot!"
        int numberOfCookies = 2;
        int numberOfChildren = 3;
        int remainingCookies = numberOfCookies % numberOfChildren;
        System.out.println(remainingCookies);

        if (remainingCookies == 0) {
            System.out.println("sad face");
        } else if (remainingCookies < 2) {
            System.out.println("yes");
        } else if (remainingCookies < 5) {
            System.out.println("whoohooo");
        } else {
            System.out.println("jackpot");
        }

        // create a variable called loyaltyMemberStatus and assign the value "SILVER"
        // create a variable called loyaltyMemberDiscount and assign the value 0.0
        // using switch, set the value of loyaltyMemberDiscount based on the following
        // loyaltyMemeberStatus scale:
        // Silver is 0.10, GOLD is 0.15, PLATINUM is 0.25
        String loyaltyMemberStatus = "SILVER";
        double loyaltyMemberDiscount = 0.0;

        switch (loyaltyMemberStatus) {
            case "SILVER":
                loyaltyMemberDiscount = 0.10;
                break;
            case "GOLD":
                loyaltyMemberDiscount = 0.15;
                break;
            case "PLATINUM":
                loyaltyMemberDiscount = 0.25;
                break;
        }
        // System.out.println(loyaltyMemberDiscount);

        // create a variable called billTotal and assign a value
        // create a variable called adjustedTotal and assign it the billTotal minus the
        // loyaltyMemberDiscount percent of the billTotal
        // if the adjustedBillTotal is greater than $500, upgrade the
        // loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM

        double billTotal = 2000.01;
        double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;

        if (adjustedTotal > 500) {
            if (loyaltyMemberStatus == "SILVER") {
                loyaltyMemberStatus = "GOLD";
            } else if (loyaltyMemberStatus == "GOLD") {
                loyaltyMemberStatus = "PLATINUM";
            }
        }
        // System.out.println(loyaltyMemberStatus + " " + adjustedTotal);

        // create 2 variables; username & password
        // create a conditional that prints "login successful" if the username is
        // Tommy123 and the password is "12345"
        // else print "access denied"
        String username = "testing";
        String password = "12";
        if (username == "Tommy123" && password == "12345") {
            // System.out.println("login successful");
        } else {
            // System.out.println("access denied");
        }

        // write a for loop that prints each member from 0 to 9
        for (int i = 0; i < 10; i++) {
            // System.out.println(i);
        }

        // write a for loop that prints each member from 10 to 0 backwards
        for (int j = 10; j >= 0; j--) {
            // System.out.println(j);
        }

        // write a for loop that prints every other member from 0 to 100
        for (int k = 0; k <= 100; k += 2) {
            // System.out.println(k);
        }

        // write a for loop that iterates from 0 to 100 and prints "even" if the number
        // is even and "Odd" if it's odd
        for (int l = 0; l <= 100; l++) {
            if (l % 2 == 0) {
                // System.out.println("even");
            } else {
                // System.out.println("odd");
            }
        }
        // write a for loop that starts at 100 and iterates backwards by 1 until it
        // reaches 0
        // divide each number by 3 and print the remainder to the console
        for (int m = 100; m >= 0; m--) {
            System.out.println(m % 3);
        }
    }
}

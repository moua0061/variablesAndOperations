public class BooleanAndConditionalLoops {

    public static void main(String[] args) {
        // create a variable named age and assign it a value of 14
        int age = 14;

        // print the boolean expression age >= 16 to the console and note the results
        System.out.println(age >= 16);
        // change the value of age to 18 and run again
        age = 18;
        System.out.println(age >= 16);

        // using a conditional, print "you can drive" if age is greater than or equal to
        // 16
        // and "you cannot drive" otherwise
        age = 16;
        boolean haslicense = false;
        if (age >= 16 && haslicense) {
            System.out.println("you can drive");
        } else {
            System.out.println("you cannot drive");
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
            System.out.println("milk please");
        } else {
            System.out.println("no thanks");
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
        System.out.println(numberOfCookies & numberOfChildren);

        if (numberOfCookies % numberOfChildren > 0) {
            System.out.println("yes");
        } else if (numberOfCookies % numberOfChildren >= 2) {
            System.out.println("whooohooo!");
        } else if (numberOfCookies % numberOfChildren >= 5) {
            System.out.println("jackpot!");
        } else {
            System.out.println("sad face");
        }

        // switch(numberOfCookies > 0){

        // }

        // create a variable called loyaltyMemberStatus and assign the value "SILVER"
        // create a variable called loyaltyMemberDiscount and assign the value 0.0

    }
}

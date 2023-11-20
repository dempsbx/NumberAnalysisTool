import java.util.Scanner;

/**
 * This class prompts the user to enter a pair of positive integers
 * and then uses methods to perform mathemtical checks to determine
 * the least common multiple (LCM) and the greatest common factor (GCF)
 * of the two numbers. It also uses methods to determine if either number
 * is a prime number or if either number is a 'perfect’ number.
 * 
 * @author Billy Dempsey
 * @version 1.0
 */
public class NumberAnalysisTool {
    public static void main(String args[]) {

        int firstInt, secondInt;
        Scanner in = new Scanner(System.in);

        // Data validation loop. Ensure both integers are postive.
        do {
            System.out.println("Enter the first positive integer: ");
            firstInt = in.nextInt();
            System.out.println("Enter the second positive integer: ");
            secondInt = in.nextInt();
        } while (firstInt <= 0 || secondInt <= 0);

        // Print out the least common multiple (LCM)
        System.out.println("The least common multiple (LCM) of " + firstInt
                + " and " + secondInt + " is: "
                + (leastCommonMultiple(firstInt, secondInt)));

        // Print out the greatest common factor (GCF)
        System.out.println("The greatest common factor (GCF) of " + firstInt
                + " and " + secondInt + " is: "
                + (greatestCommonFactor(firstInt, secondInt)));

        // Determine if first number is prime and print
        if (isItPrime(firstInt) == true) {
            System.out.println(firstInt + " is a prime number.");
        } else {
            System.out.println(firstInt + " is NOT a prime number.");
        }

        // Determine if second number is prime and print
        if (isItPrime(secondInt) == true) {
            System.out.println(secondInt + " is a prime number.");
        } else {
            System.out.println(secondInt + " is NOT a prime number.");
        }

        // Determine if first number is perfect and print
        if (isItPerfect(firstInt) == true) {
            System.out.println(firstInt + " is a perfect number.");
        } else {
            System.out.println(firstInt + " is NOT a perfect number.");
        }

        // Determine if second number is perfect and print
        if (isItPerfect(secondInt) == true) {
            System.out.println(secondInt + " is a perfect number.");
        } else {
            System.out.println(secondInt + " is NOT a perfect number.");
        }

    }

    /**
     * This method determines the least common multiple (lcm)
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the least common multiple
     */
    public static int leastCommonMultiple(int a, int b) {
        // Determine max and min of the two integers
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        // Assign max value to lcm
        int lcm = max;

        /*
         * While loop until LCM is perfectly divisible by both and b.
         * If not perfeclty divisible, increase LCM by value of max until true
         */
        while (lcm % min != 0) {
            lcm += max;
        }
        return lcm;
    }

    /**
     * This method determines the greatest common factor (GCF)
     * 
     * @param a - the first integer
     * @param b - the second integer
     * @return - the greatest common factor
     */
    public static int greatestCommonFactor(int a, int b) {
        // Create variable for GCF
        int gcf;

        /*
         * While loop until int a is equivalent to int b
         * If not equivalent, determine which is larger and assign the int a new
         * value equivalent to the lower int subtracted from the larger int
         */
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        gcf = b;
        return gcf;
    }

    /**
     * This method determines if a number is prime.
     * A prime number is positive integer greater than 1,
     * that has only 2 factors, 1 and the number itself
     * 
     * @param number - the number being checked
     * @return - true if number is prime, false otherwise
     */
    public static boolean isItPrime(int number) {
        // Initialize as true
        boolean isItPrime = true;

        /*
         * For loop to see if it is false. Checks if the number has more
         * than 2 factors. Starts by seeing if the number is perfeclty divisible
         * by int i = 2. If not, increases until all possible factors checked
         */
        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                isItPrime = false;
            }
        }
        // Return true or false after check
        return isItPrime;
    }

    /**
     * This method determines if a number is a 'perfect' number.
     * A perfect number is a positive integer that is equal to the sum of
     * its positive divisors, excluding the number itself
     * 
     * @param number - the number being checked
     * @return - true if perfect, false otherwise
     */
    public static boolean isItPerfect(int number) {
        // create variables the true/false and sum of divisors
        boolean isItPerfect;
        int sum = 0;

        /*
         * For loop that finds the sum of the postive divisors of a number.
         * Starts the sum at 0. Checks if the number is perfectly divisible
         * by int i = 1. If perfectly divisible by int, increase the sum by
         * value of int until. Increasing i++ until all divisors checked.
         */
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        // Return true if number is equal to sum of its postive divisors
        isItPerfect = sum == number;
        return isItPerfect;
    }

}

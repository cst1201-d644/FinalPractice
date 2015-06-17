/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.util.Random;

/**
 *
 * @author rkhatchadourian
 */
public class FinalPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14;
        final int DAYS_IN_WEEK = 7;
        final int SMALLEST_RANDOM_NUMBER = 5;
        final int LARGEST_RANDOM_NUMBER = 15;
        
        System.out.println(Math.PI/Math.E);
        
        double result = Math.abs(-3);
        System.out.println(result);
        
        double randomNumber = Math.random();
        System.out.println("A random number is: " + randomNumber);
        
        randomNumber = 5;
        
        //Fixes the random generator so that it produces the same random numbers.
//        Random randomObject = new Random(12345);
        
        //A random generator that produces a new random number each time the program is run.
        Random randomObject = new Random();

        int randomInt = randomObject.nextInt();
        System.out.println("My random integer is: " + randomInt);
        
        int randomIntegerBetweenFiveAndFifteen = randomObject.ints(1, SMALLEST_RANDOM_NUMBER, LARGEST_RANDOM_NUMBER + 1).findFirst().getAsInt();
        System.out.println("My bounded random integer: " + randomIntegerBetweenFiveAndFifteen);
        
//        Math.PI--;
//        
//        PI = 12.2;
//        DAYS_IN_WEEK++;
    }
    
}

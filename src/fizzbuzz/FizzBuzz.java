/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 * Output Fizz for numbers divisible by 3
 * Output Buzz for numbers divisible by 5
 * Output FizzBuzz for numbers divisible by both
 * Output number for numbers not divisible by either
 * 
 * @author chris
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int currentNumber = 0;
        
        for (int currentNumber = 1; currentNumber < 101; currentNumber++){
            if (currentNumber % 3 == 0){
                if (currentNumber % 5 == 0){
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else {
                if (currentNumber % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(currentNumber);
                }
            }
                
        }
    }
    
}

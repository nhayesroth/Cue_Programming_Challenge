/*
 * Level_2.java
 * ------------
 * Name: Nathan Hayes-Roth
 * The Cue Programming Challenge
 * ------------
 * Finds the first prime fibonacci number larger than a given minimum. 
 */

package Cue;

public class Level_2{
    
    /* static variables */
    private static int min = 227000;    // the given minimum value
    private static int a = 0;           // the first fibonacci number
    private static int b = 1;           // the second fibonacci number
    
    /*
     * genFib()
     * returns the smallest prime fibonacci number larger than the given minimum
     * returns: int
     * args: NA
     */
    private static int genFib(){
        int temp = b;
        b = a+b;
        a = temp;
        if (b < min)
            return genFib();
        else{
            if (!isPrime(b))
                return genFib();
            return b;
        }
    }
    
    /*
     * isPrime(int x)
     * returns true if x is prime
     * returns: boolean
     * args: int
     */
    private static boolean isPrime(int x){
        for (int i = 2; i<=Math.sqrt(x); i++){
            if (x%i == 0)
                return false;
        }
        return true;
    }
    
    /*
     * addPrimeDivisors(int x)
     * finds and adds all the prime divisors of x
     * returns: int
     * args: int
     */
    private static int addPrimeDivisors(int x){
        int toReturn = 0;
        for (int i = 2; i<Math.sqrt(x); i++){
            if (isPrime(i) && x%i == 0)
                toReturn = toReturn + i;
        }
        return toReturn;
    }
        
    public static void main(String [] args){
        int x = genFib(); // x=514229
        System.out.println("X: " + x);
        int toReturn = addPrimeDivisors(x+1); // toReturn=352
        System.out.println("Sum of Prime Divisors: " + toReturn);
    }
}
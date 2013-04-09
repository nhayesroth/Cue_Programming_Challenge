/*
 * Level_3.java
 * ------------
 * Name: Nathan Hayes-Roth
 * The Cue Programming Challenge
 * ------------
 * Finds the number of subsets of an array where the largest number is
 * the sum of the other elements. 
 */

package Cue;

public class Level_3{
    
    /* arrays to be examined, pre-sorted */
    private static int[] example = {1,2,3,4,6};
    private static int[] to_test = {3, 4, 9, 14, 15, 19, 28, 37, 47, 50, 54, 56, 59, 61, 70, 73, 78, 81, 92, 95, 97, 99};
    
    /* value we're looking for */
    static int count = -to_test.length;    // ignore single element sets
    
    /*
     * getEm(int sum, int index)
     * increments count for each valid subset (includes single element sets)
     * returns: NA
     * args: int, int
     */
    private static void getEm(int sum, int index) {
        // if the sum is less than the indexed value, exit the method
        if(sum < to_test[index])
            return;
        // if the sum is greater than the indexed value
        //     1) subtract the value and increment the index, then recurse
        //     2) ignore the value and increment the index, then recurse
        else if(sum > to_test[index]){
            getEm(sum - to_test[index], index + 1);
            getEm(sum, index + 1);
        }
        // if the subset is valid, increment count
        else count++;
    }
    
    public static void main(String[] args) {
        // iterate across each number in the array
        for(int i = 0; i<to_test.length; i++)
            // count the number of sub-sets that sum to that number
            getEm(to_test[i], 0);
        System.out.println("Number of sub-sets: " + count);
    }
}
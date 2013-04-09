/*
 * Level_1.java
 * ------------
 * Name: Nathan Hayes-Roth
 * The Cue Programming Challenge
 * ------------
 * Finds the longest substring that is also a palindrome. 
 */

package Cue;

import java.lang.String;

public class Level_1{
    
    /* static variables */
    private static String to_check = "FourscoreandsevenyearsagoourfaathersbroughtforthonthiscontainentanewnationconceivedinzLibertyanddedicatedtothepropositionthatallmenarecreatedequalNowweareengagedinagreahtcivilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    private static int start = 0;
    private static int end = 0;
    private static int length = to_check.length();
    private static String toReturn = "";
    
    /* isPal(String str)
     * returns true if str is a palandrome
     * Returns: boolean
     * Args: String
     */
    private static boolean isPal(String str){
        int len = str.length();
        for(int i = 0; i<len; i++){
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;
        }
        return true;
    }
    
    public static void main(String [] args){
        for (start = 0; start < length; start++){
            for (end = length; end >=start; end--){
                if (isPal(to_check.substring(start, end))){
                    if (to_check.substring(start, end).length() > toReturn.length()){
                        System.out.println(to_check.substring(start, end));
                        toReturn = to_check.substring(start, end);
                    }
                }
            }
        }
    }
}
/*Print a single integer denoting the number of letter a's in the first N
letters of the infinite string created by repeating S infinitely many
times.

S is the string. N is the length of the "infinite" string. The problem
is to find the amount of a's in the "infinite" string.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class repeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        int count =0, otherCount =0;
        
        char[] charArray = s.toCharArray();

        
        for(char letter : charArray)
           if(letter == 'a')
              count++;
            
       long fullOccourance = n/s.length();
        
       long leftOver = n - (fullOccourance*s.length());
       
       for(int i = 0; i<leftOver; i++)
           if(charArray[i] == 'a')
                otherCount++;
        
      System.out.println((count * fullOccourance) + otherCount);  
        
    }
}

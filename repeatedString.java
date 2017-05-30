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

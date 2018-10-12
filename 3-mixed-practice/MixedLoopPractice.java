/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}. GOOD
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}. GOOD
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}. GOOD
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}. GOOD
 *
 *  6) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}. GOOD
 *
 *  7) sumN            - uses a while loop to find and return the sum of the first  GOOD
 *                       n integers. 
 *                       
 *  8) perfectSquaresF - uses a for loop to print the first n perfect squares. GOOD
 *
 *  9) sumSquaresW     - uses a while loop find and return the sum of the first n GOOD
 *                       perfect squares.
 *
 * 10) iLoveJava       - uses a while loop to print the sentence "I love java." n  GOOD
 *                       times. 
 *
 * 11) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only  GOOD
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 12) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only GOOD
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 13) divBy5or7Sum    - uses a while loop to find and return the sum of all values in GOOD
 *                       the set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 14) bizzBuzz        - uses a while loop to count from 1 to n by ones. However,    GOOD
 *                       if a number is divisible by 3, the word "bizz" should be 
 *                       printed, and if the number is divisible by 5, "buzz" should
 *                       be printed. Sample output:
 *
 *                       1, 2, Bizz, 4, Buzz, Bizz, 7, 8, Bizz, Buzz, 11, Bizz, 13, 14, 
 *                       Bizz Buzz, 16, 17, Bizz, 19, Buzz, Bizz, 22, 23, Bizz, ...
 *                       
 * 15) sumDigits       - uses a loop to find and return the sum of the digits in an int.  GOOD
 *
 * 16) countEvens      - uses a loop to count the number of even digits in an int. GOOD
 *
 * 17) hasDigit        - uses the appropriate type of loop to return true if a number n
 *                       contains the digit d and false otherwise.
 *
 * 18) moreEvens       - returns true if a number n has more even digits than odd digits
 *                       and false otherwise.
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class MixedLoopPractice
 {
    public static void oneToThirtyF()
    {
        
        for (int i = 1; i <= 30; i++) { 
        
            System.out.print( i + " ");
        }
    }
    
    public static void oneToThirtyW()
    {
         int i = 1;
         while (i <= 30) 
         {
         System.out.print( i + " ");
         i++;
        }   
    }
       
    public static void twentyToZeroF()
    { 
        for (int i = 20; i >=0; i = i - 2) {
            System.out.print (i + " ");
        }
    }
    
    public static void twentyToZeroW()
    { 
        int i = 20;
        while (i >= 0)
        {
            System.out.print(i + " ");
            i = i - 2;
        }
        
    }
    
    public static void countMtoN(int m, int n)
    {
        int i = m;
        while (i <= n)
        {
            System.out.print(i + " ");
            i++;
        }
    }
    
    public static void sumN(int n)
    {
        int i = 1;
        int sum = 0;
        while (i <= n)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    
    public static void perfectSquaresF(int n)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.print(i*i + " ");
        }
        System.out.println();   
    }
    
    public static void sumSquaresW(int n)
    {
        int i = 0;
        int sum = i*i;
        int num = 0;
        while (i <= n)
        { 
            sum += i*i ;
            i++;
        }
        System.out.print(sum + " ");
    }
    
    public static void iLoveJava(int n)
    {
        int i = 1;
        while(i <= n)
        { 
            i++;
            System.out.println("I love java.");
        }
    }
    
    public static void  divBy2and9()
    {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 9 == 0)
            System.out.print(i + " ");
        }
    }
    
    public static void  divBy3and8()
    {
        int i = 1;
           while (i <= 100)
           {
            if (i % 3 == 0 && i % 8 == 0)
            System.out.print(i + " ");
            i++;
        }
        }
    
       public static void divBy5or7Sum()
    {
        int i = 0; 
        int count = 0;
        while (i <= 10000)
        {
            if (i % 5 == 0 || i % 7 == 0) {
                count += i;
            }
            i++;
        } 
        System.out.println(count);
    } 
        
    public static void bizzBuzz(int n)
    {
       int i = 1;
       while ( i <= n)
       {
           if ((i % 3 == 0) && (i % 5 == 0))
            System.out.print(" Bizz Buzz ");
           else if (i % 3 == 0)
            System.out.print(" bizz ");
            else if (i % 5 == 0)
             System.out.print(" buzz ");
           else  System.out.print(i + " ");
           i++;
        }
    }
    
    public static boolean moreEvens(int n)
    {
        int i = 1;
        while (i <= n)
        { 
            if (i % 2 == 0 && i > n)
                return true;
        }
        return false;
    }
    
    public static void sumDigits(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum = sum + (n % 10);
            n = n/10;
        }
        System.out.print(sum);
    }
    
    public static void countEvens(int n)
    {
        int count = 0;
        while (n > 0) {
                if (n % 2 == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.print(count);
    }
    
    public static boolean hasDigit(int n)
    {
        boolean digit = false;
        while (n > 0)
        {
            if (n % d == 0
        }
    }
    // keep making methods here
    
    
    public static void main(String[] args)
    {
        oneToThirtyF();
        oneToThirtyW();
        twentyToZeroW();
        
        // test your methods here
    }
 }
 

import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;


//? like "int main()" in c , in java we have to make class Main contains main function (it must be public and static )
public class  Main {
    public static void main(String[] args){
        // *0 Overview =======================================================
            // ? Hello World
                System.out.println("Hello World");
            // ? variables :
                // dataType name = vlaue;
                int forTest = 10;
            // ? const :
                // final dataType name = vlaue;
                final float pi = 3.14F;

        // *1 Data types ======================================================
            // ? primitive data types :
                boolean a = true;         // 1 bit           true /false
                byte    b = 1;            // 1 byte (8 bit)  [-127 to 127]
                short   s = 1;            // 2 bytes         [-32,768 to 32,767]
                int     i = 1;            // 4 bytes         [-2,147,483,648 to 2,147,483,647]
                long    l = 999_999_999L; // 8 bytes         [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
                float   f = 1.2f ;        // 4 bytes
                double  d = 1.2 ;         // 8 bytes
                char    c = 'c' ;         // 2 bytes
            
            // ? some Reference types :
                String hello = "Hello world";

                int array[] = {0,2,3,4};
                
                // you must import Date from java.util (line 2)
                Date now = new Date(); 
        // *2 Operators =========================================================
            int x = 7,y = 5; 
            // ? Arithmetic :
                int sum = x + y;                     // Addition
                int difference = x - y;              // Subtraction
                int product = x * y;                 // Multiplication
                int quotient = x / y;                // Division
                int remainder = x % y;               // Modulus (remainder of division)
            
            // ? Relational :
                boolean isEqual = (x == y);          // Equal to
                boolean isNotEqual = (x != y);       // Not equal to
                boolean isGreaterThan = (x > y);     // Greater than
                boolean isLessThan = (x < y);        // Less than
                boolean isGreaterOrEqual = (x >= y); // Greater than or equal to
                boolean isLessOrEqual = (x <= y);    // Less than or equal to

            // ? Logical :
                boolean p = true,q = false;

                boolean andResult = (p && q);         // Logical AND
                boolean orResult = (p || q);          // Logical OR
                boolean notResultP = !p;              // Logical NOT for p


            // ? Bitwise :
                int bitwiseAndResult = x & y;         // Bitwise AND        101 & 111 = 101 
                int bitwiseOrResult = x | y;          // Bitwise OR         101 | 111 = 111 
                int xorResult = x ^ y;                // Bitwise XOR        101 ^ 111 = 010 
                int notResult = ~x;                   // Bitwise NOT        ~101 = 010
                int leftShiftResult = x << 1;         // Left shift by 1    101 << = 1010
                int rightShiftResult = x >> 1;        // Right shift by 1   101 >> = 10 


        // *3 Sting methods =====================================================
            String txt = "Hello World";

            System.out.println(txt.length()); // 11
            System.out.println(txt.toUpperCase());   // "HELLO WORLD"
            System.out.println(txt.toLowerCase());   // "hello world"

            // sreach 
            System.out.println(txt.indexOf("World"));   // 6 (-1 if it not exists)
            System.out.println(txt.charAt(2));   // l
            System.out.println(txt.contains("Hello"));   // true
            

            // slice
            System.out.println(txt.substring(0,6)); // Returns substring from index 0 to 6
            System.out.println(txt.substring(6)); // Returns substring from index 6 to the end

            //  rplace 
            System.out.println(txt.replace("Hello", "hi")); // replace hello by hi
            System.out.println("Hello Hello World".replaceAll("Hello", "hi")); // replace hello by hi  


            // split and join 
            System.out.println(txt.split(" ")); // ['Hello',"world"]  

            String[] arr = {"str1", "str2", "str3", "str4"};
            String joinedString = String.join(" ", arr);
            System.out.println("Joined String: " + joinedString);
        

        // *4 Loops and conditions =====================================================
            //  LOOPS :
                // ? for :
                    for (int j = 0; j < 10; j++) {
                        // do something
                        
                    }
                // ? while :
                    while (x>10) {
                        // do something
                    }

               
            // CONDITIONS :
                // ? if ,else ...:
                    int var;

                    if (x>10) {
                        // block of code 
                        var = 1;
                    } else if (x>5) {
                        // block of code
                        var = 2 ;
                    } else {
                        // block of code 
                        var = 3;
                    }
                // ? Ternary Operator :
                    var = (x>10) ? 1 :  (x>5) ? 2 :  3; // this code is the same as the  previous code

                // ? switch :
                    switch (var) {
                        case 1:
                            // if var == 1 do something
                            break;
                        case 2:
                        case 3:
                            // if var ==2 or var == 3 do something
                            break;
                    
                        default:
                            // else do something
                            break;
                    }
        // *5 Arrays =================================================================
            // ? one dim array :
                int[] arr1 = {3,1,2};
                
                System.out.println(arr1); // output : [I@1700915
                
                // ? to make the out put readable we use Arrays.toString method (function)
                // ! you should import java.util.Arrays 

                System.out.println(Arrays.toString(arr1)); // output : [3, 1, 2]
                
                System.out.println(arr1.length); // output : 3

                // you can sort the array using sort method
                Arrays.sort(arr1);
                System.out.println(Arrays.toString(arr1)); // output : [1, 2, 3]
                
                // binary search 
                System.out.println( Arrays.binarySearch(arr1,2));

            // ? multi dim array
                    int[][] arr2 = {{1,2,3},{4,5,6}};

                    System.out.println(Arrays.toString(arr2)); // output : [[I@14dd9eb7, [I@52e6fdee]
                    // ? to make it readable
                    System.out.println(Arrays.deepToString(arr2)); // output : [[1, 2, 3], [4, 5, 6]]

            // !!! note : we can make arrays or any reference data type with this notation 
            int[] test = new int[3];
            test[0] = 3;
            // ... 

        // *6 User input =================================================================  
            
            // ! you should import java.util.Scanner

            // creates an object of Scanner
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");

            // takes input from the keyboard
            String name = input.nextLine();
  
            // nextInt()	        reads an int value from the user 
            // nextFloat()	        reads a float value form the user
            // nextBoolean()	    reads a boolean value from the user
            // nextLine()	        reads a line of text from the user
            // next()	            reads a word from the user
            // nextByte()	        reads a byte value from the user
            // nextDouble()         reads a double value from the user
            // nextShort()	        reads a short value from the user
            // nextLong()	        reads a long value from the user

            // ? the deffirence between nextLine() and next() is: 
                // next() takes only one word  exemple : user input => "abc def" it takes only 'abc'

            // prints the name
            System.out.println("My name is " + name);

            // closes the scanner
            input.close();

        // *7 Math =======================================================================

    }
}
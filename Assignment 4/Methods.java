/***
 * This File contains all methods used in NoLoopOperations.java
 * 
 * Owner: Kartik Agarwal
 */
import java.util.Scanner;
public class Methods {
    static Scanner scanner = new Scanner(System.in);

    // This function prints Nth digit of fibonacci series
    // It takes two long integer and two integer as an input
    // It returns void
    public void NthFibonacci(long firstDigit, long secondDigit, int NthDigit, int count){
        Constant constant = new Constant();
        if(count == NthDigit){System.out.println(constant.Output + secondDigit);}
        else{
            count++;
            long sumOfDigits = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = sumOfDigits;
            NthFibonacci(firstDigit, secondDigit, NthDigit, count);
        }
    }

    // This functions prints number of consonants present in a string
    // It takes one character array and two integer as input
    // It returns void
    public static void isConsonant(char[] characterArray, int numberOfConsonant, int index){
        Constant constant = new Constant();
        if(index < characterArray.length){
            char character = characterArray[index];
            if((character >= 'a' && character <= 'z') && !(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')){
                numberOfConsonant++;
                index++;
                isConsonant(characterArray, numberOfConsonant, index);
            }
            else{
                index++;
                isConsonant(characterArray, numberOfConsonant, index);
            }
        }
        else{
            System.out.println(constant.Output + numberOfConsonant);
        }
    }
}

/***
 * This program performs various functions like :-
 * Task 1: Valid Parentheses Combination Generator
 * Task 2: Digit Sum Loop(String)
 * Task 3: Consecutive Number Summer
 * Task 4: Caesar Cipher with Shift Variability
 * Task 5: Encoding Challenge with ASCII Conversion
 * 
 * Owner Name: Kartik Agarwal
 * DOS: 10/09/2024
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Operations {

    // This function contains all operations list for user
    static public void options(){
        Constant constant = new Constant();
        System.out.println(constant.Options);
        System.out.println(constant.CombinationGenerator);
        System.out.println(constant.DigitSum);
        System.out.println(constant.NumberSummer);
        System.out.println(constant.CaesarCipher);
        System.out.println(constant.Encoding);
        System.out.println(constant.Quit);
        System.out.println(constant.Repeat);
    }

    public static void main(String args[]){
        Constant constant = new Constant();
        Methods method = new Methods();
        Scanner scanner = new Scanner(System.in);
        String currentString;
        long currentInteger;
        boolean continueLoop = true;
        options();
        while(continueLoop == true){
            System.out.print(constant.Choice);
            String choice = scanner.next();
            switch (choice) {

                case "1":
                    System.out.print(constant.String_Input);
                    String inputString = scanner.nextLine();
                    inputString = scanner.nextLine();
                    char[] inputCharacter = new char[inputString.length()];
                    boolean[] boolUsed = new boolean[inputCharacter.length];
                    for (int i = 0; i < inputString.length(); i++) {
                        inputCharacter[i] = inputString.charAt(i);
                    }
                    char[] result = new char[inputCharacter.length];
                    for (int length = 1; length <= inputCharacter.length; length++) {
                        method.CombinationGenerator(inputCharacter, result, 0, boolUsed, length);
                    }
                    break;
                    
                case "2":
                    try{
                        System.out.print(constant.Integer_Input);
                        currentInteger = scanner.nextLong();
                        method.DigitSum(currentInteger);
                    }
                    catch(InputMismatchException e){
                        System.out.println(constant.Invalid_Input);
                    }
                    break;

                case "3":
                    try{
                        System.out.print(constant.Integer_Input);
                        int target = scanner.nextInt();
                        method.NumberSummer(target);}
                    catch(InputMismatchException e){
                        System.out.println(constant.Invalid_Input);
                    }
                    break;

                case "4":
                    try{
                        System.out.print(constant.String_Input);
                        currentString = scanner.nextLine();
                        currentString = scanner.nextLine();
                        System.out.print(constant.SizeEnterArray);
                        int size = scanner.nextInt();
                        int[] arrayForFour = new int[size];
                        System.out.print(constant.EnterArray);
                        for(int i = 0; i < size; i++) {arrayForFour[i] = scanner.nextInt();}
                        method.CaesarCipher(currentString, arrayForFour);
                    }
                    catch(InputMismatchException e){
                        System.out.println(constant.Invalid_Input);
                    }
                    break;

                case "5":
                    try{
                        System.out.print(constant.SizeEnterArray);
                        int size = scanner.nextInt();
                        int[] array = new int[size];
                        System.out.print(constant.EnterArray);
                        for(int i = 0; i < size; i++) {array[i] = scanner.nextInt();}
                        System.out.print(constant.SizeEnterSeries);
                        size = scanner.nextInt();
                        int[] series = new int[size];
                        System.out.print(constant.EnterSeries);
                        for(int i = 0; i < size; i++) {series[i] = scanner.nextInt();}
                        method.Encoding(array, series);
                    }
                    catch(InputMismatchException e){
                        System.out.println(constant.Invalid_Input);
                    }
                    break;

                case "6":
                    System.out.println(constant.End);
                    continueLoop = false;
                    break;

                case "7":
                    System.out.print("\n\n\n\n");
                    options();
                    break;

                default:
                    System.out.println(constant.Invalid_Input);
                    break;

            }
        }
        scanner.close();
    }
}

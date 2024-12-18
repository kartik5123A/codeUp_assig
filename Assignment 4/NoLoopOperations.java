/***
 * This program performs various functions like :-
 * Task 1: CountPalindromes
 * Task 2: NthFibonacci
 * Task 3: ToCamel
 * Task 4: CountConsonants
 * Task 5: BinaryToDecimal
 * 
 * Owner: Kartik Agarwal
 * DOS: 11/09/2024
 */
import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NoLoopOperations {

    // This function contains all operations list for user
    static public void options(){
        Constant constant = new Constant();
        System.out.println(constant.Options);
        System.out.println(constant.CountPalindromes);
        System.out.println(constant.NthFibonacci);
        System.out.println(constant.ToCamel);
        System.out.println(constant.CountConsonants);
        System.out.println(constant.BinaryToDecimal);
        System.out.println(constant.Quit);
        System.out.println(constant.Repeat);
    }

    public static void main(String[] args) {
        Constant constant = new Constant();
        Methods method = new Methods();
        Scanner scanner = new Scanner(System.in);
        options();
        boolean continueLoop = true;
        while(continueLoop == true){
            System.out.print(constant.Choice);
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    boolean continueCase = true;
                    while(continueCase){
                        System.out.print(constant.StringPrompt);
                        String stringInput = scanner.nextLine();
                        stringInput = scanner.nextLine();
                        String[] uniquePalindromes = new String[30]; 
                        int[] palindromeCount = {0};
                        method.countPalindromes(stringInput, 0, 1, uniquePalindromes, palindromeCount); 
                        System.out.println(constant.Output + palindromeCount[0]);
                        System.out.print(constant.ContinueCase);
                        char choiceCase = scanner.next().charAt(0);
                        if(choiceCase == 'y'){continue;}
                        else{continueCase = false;}
                    }
                    break;

                case "2":
                    continueCase = true;
                    while(continueCase){
                        try{
                            System.out.print(constant.IntegerPromptFibonacci);
                            int NthDigit = scanner.nextInt();
                            if(NthDigit < 0 || NthDigit > 92){System.out.println(constant.Invalid);}
                            else if(NthDigit == 0 || NthDigit == 1){System.out.println(constant.Output + NthDigit);}
                            else{int value = 1; method.NthFibonacci(0, 1, NthDigit, value);}
                            System.out.print(constant.ContinueCase);
                            char choiceCase = scanner.next().charAt(0);
                            if(choiceCase == 'y'){continue;}
                            else{continueCase = false;}
                        }
                        catch(Exception e){
                            System.out.println(constant.Invalid);
                            System.out.print(constant.ContinueCase);
                            char choiceCase = scanner.next().charAt(0);
                            choiceCase = scanner.next().charAt(0);
                            if(choiceCase == 'y'){continue;}
                            else{continueCase = false;}
                        } 
                    }
                    break;
            
                case "3":
                    continueCase = true;
                    while(continueCase){
                        System.out.print(constant.StringPrompt);
                        String stringInput = scanner.nextLine();
                        stringInput = scanner.nextLine();
                        String removingCharacters = "()[]{}=?!.:,-_/$@^&+%*\\\"#~/";
                        stringInput = stringInput.replaceAll("[" + Pattern.quote(removingCharacters) + "]", " ");
                        stringInput = stringInput.toLowerCase();
                        System.out.println(constant.ToSnakeCase + method.ToSnake(stringInput, "", false)); 
                        System.out.println(constant.ToCamelCase + method.ToCamel(stringInput, false, true, "")); 
                        System.out.print(constant.ContinueCase);
                        char choiceCase = scanner.next().charAt(0);
                        if(choiceCase == 'y'){continue;}
                        else{continueCase = false;}
                    }
                    break;

                case "4":
                    continueCase = true;
                    while(continueCase){
                        try{
                            System.out.print(constant.StringPrompt);
                            String stringInput = scanner.nextLine();
                            stringInput = scanner.nextLine();
                            char[] stringToChar = (stringInput.toLowerCase()).toCharArray();
                            int index = 0;
                            int numberOfConsonant = 0;
                            method.isConsonant(stringToChar, numberOfConsonant, index);
                        }
                        catch(Exception e){
                            System.out.println(constant.Invalid);
                        }
                        System.out.print(constant.ContinueCase);
                        char choiceCase = scanner.next().charAt(0);
                        if(choiceCase == 'y'){continue;}
                        else{continueCase = false;}
                    }
                    break;

                case "5":
                    continueCase = true;
                    while(continueCase){
                        try{
                            System.out.print(constant.BinaryToDecimalPrompt);
                            int integerInput = scanner.nextInt();
                            int power = 0; 
                            int result = 0;
                            method.BinaryToDecimal(integerInput, power, result);
                            System.out.print(constant.ContinueCase);
                            char choiceCase = scanner.next().charAt(0);
                            if(choiceCase == 'y'){continue;}
                            else{continueCase = false;}
                        }
                        catch(Exception e){
                            System.out.println(constant.Invalid);
                            System.out.print(constant.ContinueCase);
                            char choiceCase = scanner.next().charAt(0);
                            choiceCase = scanner.next().charAt(0);
                            if(choiceCase == 'y'){continue;}
                            else{continueCase = false;}
                            System.out.print(constant.ContinueCase);
                            choiceCase = scanner.next().charAt(0);
                            if(choiceCase == 'y'){continue;}
                            else{continueCase = false;}
                        }
                    }
                    break;

                case "6":
                    continueLoop = false;
                    break;

                case "7":
                    System.out.println("\n\n\n\n");
                    options();
                    break;

                default:
                    System.out.println(constant.Invalid);
                    break;
            }
        }
    }
}

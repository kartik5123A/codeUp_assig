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
            
                case "3":
                    continueCase = true;
                    while(continueCase){
                        
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
                        
                        System.out.print(constant.ContinueCase);
                        char choiceCase = scanner.next().charAt(0);
                        if(choiceCase == 'y'){continue;}
                        else{continueCase = false;}
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

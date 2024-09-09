import java.util.Scanner;
import java.util.InputMismatchException;

public class Operations {

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
                    
                    break;

                case "4":
                    System.out.print(constant.String_Input);
                    currentString = scanner.nextLine();
                    System.out.print(constant.ArraySize);
                    int arraySize = scanner.nextInt();
                    method.CaesarCipher(currentInteger, )
                    break;

                case "5":
                    
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
                    System.out.println(constant.Invalid_Option);
                    break;

            }
        }
        scanner.close();
    }
}

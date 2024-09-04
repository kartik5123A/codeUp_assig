import java.util.Scanner;

public class BasicOperations {


    static public void options(){

        Constant constant = new Constant();
        System.out.println(constant.Operation);
        System.out.println(constant.Append);
        System.out.println(constant.Count);
        System.out.println(constant.Replace);
        System.out.println(constant.Palindrome);
        System.out.println(constant.Splice);
        System.out.println(constant.Split);
        System.out.println(constant.Repeat);
        System.out.println(constant.Sort);
        System.out.println(constant.Shift);
        System.out.println(constant.Reverse);
        System.out.println(constant.NewString);
        System.out.println(constant.Exit);
    }

    public static void main(String args[]){
        Constant constant = new Constant();
        Scanner scanner = new Scanner(System.in);
        System.out.print(constant.Enter_String);
        String currentString = scanner.nextLine();
        boolean continueLoop = true;
        options();
        while(continueLoop == true){
            
            System.out.print(constant.Choice);
            String choice = scanner.next();
            switch (choice) {

                case "1":
                    System.out.print(constant.Enter_Append);
                    String append = scanner.next();
                    currentString = constant.appendString(currentString, append);
                    System.out.println(constant.Output + currentString);
                    break;
                    
                case "2":
                    System.out.print(constant.Input);
                    int count = constant.countLetters(currentString);
                    System.out.println(constant.Output + count);
                    break;

                case "3":
                    System.out.print(constant.OldChar);
                    char oldChar = scanner.next().charAt(0);
                    System.out.print(constant.NewChar);
                    char newChar = scanner.next().charAt(0);
                    currentString = constant.replaceString(currentString, oldChar, newChar);
                    System.out.println(constant.Output + currentString);
                    break;

                case "4":
                    if(constant.isPalindrome(currentString)) System.out.println(currentString + " is Palindrome.");
                    else System.out.println(currentString + " is not Palindrome.");
                    break;

                case "5":
                    System.out.print(constant.startIndex);
                    int start = scanner.nextInt();
                    System.out.print(constant.endIndex);
                    int length = scanner.nextInt();
                    currentString = constant.spliceString(currentString, start, length);
                    System.out.println(constant.Output + currentString);
                    break;

                case "6":
                    System.out.print(constant.SplitInput);
                    char splitChar = scanner.next().charAt(0);
                    String[] result = constant.splitString(currentString, splitChar);
                    System.out.println(constant.Output);
                    for (String part : result) {
                        System.out.println(part);
                    }
                    break;

                case "7":
                    System.out.println(constant.Output + constant.maxRepeat(currentString));
                    break;

                case "8":
                    currentString = constant.sortString(currentString);
                    System.out.println(constant.Output + currentString);
                    break;
                    
                case "9":
                    System.out.print(constant.rotateInt);
                    int num = scanner.nextInt();
                    currentString = constant.shifter(currentString, num);
                    System.out.println(constant.Output + currentString);
                    break;

                case "10":
                    currentString = constant.reverseString(currentString);
                    System.out.println(constant.Output + currentString);
                    break;

                case "11":
                    System.out.print(constant.Enter_String);
                    currentString = scanner.next();
                    break;

                case "0":
                    System.out.println(constant.End);
                    continueLoop = false;
                    break;

                default:
                    System.out.println(constant.Invalid);
                    break;

            }
        }
        scanner.close();
    }
}

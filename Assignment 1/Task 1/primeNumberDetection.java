import java.util.InputMismatchException;
import java.util.Scanner;
class primeNumberDetection {

    public static boolean isPrime(int num){
        int lastNum = num / 2;
        for(int i = 2; i <= lastNum; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Constant constant = new Constant();
        while(true){
            System.out.print(constant.ENTER_NUM);
            try{
                int num = scanner.nextInt();
                boolean result;
                
                if(num < 2) result = true;
                else result = isPrime(num);
                
                if(result == true){
                    System.out.println("Number is prime");
                }
                else{
                    System.out.println("Number is not prime");
                }
            }
            catch(InputMismatchException e){
                System.out.print("Input provided by you is not valid.");
                break;
            }
        }

        // scanner.close();
    }
}
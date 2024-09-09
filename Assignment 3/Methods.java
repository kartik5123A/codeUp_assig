public class Methods { 

    public static void DigitSum(long inputInteger){
        Constant constant = new Constant();
        if(inputInteger < 0){
            System.out.println(constant.Invalid);
        }else{
            while (inputInteger >= 10) {
                int sum = 0;
                while (inputInteger > 0) {
                    sum += inputInteger % 10; 
                    inputInteger /= 10;
                }
                inputInteger = sum;
            }
            System.out.println(constant.Output + inputInteger);
        }
    }

    public static String CaesarCipher(String inputString, int[] array){
        
    }
}

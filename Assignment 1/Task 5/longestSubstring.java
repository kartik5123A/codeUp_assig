import java.util.Scanner;
public class longestSubstring {
    public static int max(int a,int b) {
        if(a > b) return a;
        else return b;
    }
    public static void main(String[] args) {
        Constant constant = new Constant();
        System.out.print(constant.ENTER_STRING);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
        sc.close();
    }

    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i = 0,j = 0;
        int mx = 0;
        int[] arr = new int[255];
        for(int k = 0; k < 255; k++) {
            arr[k] = 0;
        }

        while(j<n){
            int ascii = (int)s.charAt(j);
            if(arr[ascii] == 0){
                arr[ascii]++;
                mx = max(mx,j-i+1);
                j++;
            }
            else{
                while(s.charAt(i) != s.charAt(j)){
                    arr[(int)s.charAt(i)]--;
                    i++;
                }
                i++;
                arr[ascii]--;
            }
        }
        return mx;
    }
}

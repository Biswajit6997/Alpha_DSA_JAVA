// Write a programme to check the string pallindomic String Or Not

// T(n)=O(n)

import java.util.Scanner;

public class PallindrmicSring {
    public static boolean Pallindromic(String str) {
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                // Return not a pallindrome String
                return false;
            }
            

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a String to check if Pallindromic or not:");
        Scanner sc=new Scanner(System.in);

        String str = sc.nextLine();

        Pallindromic(str);

        if(true){
            System.out.println(str+" is a Pallindromic String");
        }
        else{
            System.out.println(str+" is a Not a Pallindromic String");
        }
        

    }
}

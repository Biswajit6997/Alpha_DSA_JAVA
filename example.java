// String example  eith Input and Output

import java.util.Scanner;

public class example {

    public static void main(String[] args) {

        char arr[]={'a','b','c','d'};
        String str1="abcde";
        String str2=new String("xyz");
        // String are IMMUTABLE


    
        Scanner sc=new Scanner(System.in);
        // next() is used only a single string
        // String name=sc.next();

        // nextLine() is used for whole a words "With space "
        System.out.println("Enter a String:");
        String name1=sc.nextLine();
        System.out.println("My name is "+name1);

        // to calculate the string length

        // String myname="Biswajit Dey";
        System.out.println("The length of the string is :"+name1.length());

        //  String Concatentation

        String firstname="Biswajit";
        String lastname="Dey";
        String fullName=firstname+" "+lastname;
        System.out.println(fullName);
        
        

    }
}
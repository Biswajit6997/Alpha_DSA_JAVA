
//Comapre two string are equals or not

public class CompareTwoString {
    public static void main(String[] args) {
        String a="Biswajit";
        String b="Biswajit";
        String c=new String("Biswajit");
// here a and c not equals because in java "INTERNING " occurs when we compare two string new keyword allocate a new memeory so the old string and the new string are not equals

        /*if(a==b){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not eqal");
        }

        if (a==c) {System.out.println("String are equal");
            
        }
        else{
            System.out.println("String are not equals");
        }*/

        if (a.equals(c)) {// .equals return a boolean type 
            System.out.println("String are equals");
            
        }
        else{
            System.out.println("String are not equals");
        }
    }
    
}

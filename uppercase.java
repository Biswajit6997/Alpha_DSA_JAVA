// For a given String convert each the first letter of each word to uppercase
// T(n)=O(n);

// i/p: "Hi! i am biswajit"
// o/p: "Hi ! I Am Biswajit"

// Character.toUpperString()
public class uppercase {
public static String toUpperCase(String str){
    StringBuilder sb=new StringBuilder("");
    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();

}

    public static void main(String[] args) {
        String str="Hi! i am biswajit";
        System.out.println(toUpperCase(str));
    }
}

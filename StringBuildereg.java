
// StringBuilder Exmple
// T(n)=O(26)

public class StringBuildereg {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");//StringBuilder obj 
        for(char ch='a';ch<='z';ch++){
        sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}

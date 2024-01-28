public class SubString {

    public static String substringeg(String str, int si, int ei) {

        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // In java substring function are already exist
        System.out.println(str.substring(0,5));

        // We create a subString function

        System.out.println(substringeg(str, 0, 5));
    }
}

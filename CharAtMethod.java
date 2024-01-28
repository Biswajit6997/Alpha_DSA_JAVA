public class CharAtMethod {
    public static void CharAtMethod(String name) {
        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i) + " ");// CharAt method
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstname = "Biswajit";
        String lastname = "Dey";
        String fullname = firstname + " " + lastname;
        System.out.println("Without charAt :"+fullname);
        // Method for CharAt method
        CharAtMethod(fullname);
    }
}

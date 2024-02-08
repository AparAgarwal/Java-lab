public class palindrome {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were passed.");
        } else if (args.length > 1) {
            System.out.println("Too many arguments were passed.");
        } else {
            String original = args[0];
            String reverse = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }
            if (original.equals(reverse)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}

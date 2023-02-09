public class Main {
    public static void main(String[] args) {
        //Given any String determine if it is Palindrome. Print“Palindrome” if it is and “Not Palindrome” if
        //it is not:
        //Example:

        String text = "Madam Coco";
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        if (text.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}

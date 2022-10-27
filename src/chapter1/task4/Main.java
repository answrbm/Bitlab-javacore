package chapter1.task4;

public class Main {
    public static void isPalindrome(String word) {
        if(word.equals(new StringBuilder(word).reverse().toString())) System.out.println("YES");
        else System.out.println("NO");
    }
}

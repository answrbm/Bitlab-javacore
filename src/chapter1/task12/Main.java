package chapter1.task12;

public class Main {
    public static void duplicateSymbols(String word) {
        for(char c : word.toCharArray()) {
            System.out.print(c);
            System.out.print(c);
        }
    }
}

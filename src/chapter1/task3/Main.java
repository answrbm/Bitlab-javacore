package chapter1.task3;

public class Main {
    public static int letterCounter(String word, char letter) {
        int counter = 0;
        for(char c : word.toLowerCase().toCharArray()) {
            if(letter == c) counter++;
        }
        return counter;
    }
}

package chapter1.task13;

public class Main {
    public static int vowels(String word) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for(char c : word.toLowerCase().toCharArray()) {
            for(char v : vowels)
                if(c == v) count++;
        }
        return count;
    }
}

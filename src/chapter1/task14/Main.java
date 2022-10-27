package chapter1.task14;

public class Main {
    public static int isNotZero(int[] numbers) {
        int count = 0;
        for(int i : numbers) {
            if(i != 0) count++;
        }
        return count;
    }
}

package chapter1.task9;

public class Main {
    public static void printEvenNumbers(int[] numbers) {
        for(int i : numbers) {
            if(i == 23) break;
            if(i % 2 != 0) System.out.println(i);
        }
    }
}

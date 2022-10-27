package chapter1.task19;

public class Main {
    public static void printElem(int[] numbers) {
        for (int number : numbers) {
            if (number < 50 && number % 5 == 0) System.out.println(number);
        }
    }
}

package chapter1.task10;

public class Main {
    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for(int i : numbers) {
            if(i % 5 != 0) sum += i;
        }
        return sum;
    }
}

package chapter1.task7;

public class Main {
    public static int averageValue(int[] numbers) {
        int sum = 0;
        int count = 0;
        for(int i : numbers) if(i % 2 == 0) {
            sum += i;
            count++;
        }
        return sum/count;
    }
}

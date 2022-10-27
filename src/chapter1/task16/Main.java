package chapter1.task16;

public class Main {
    public static void minMaxElements(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}

package chapter1.task15;

public class Main {
    public static void uniqueElements(int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j && numbers[i] == numbers[j]) count++;
            }
            if(count == 0) System.out.print(numbers[i] + " ");
            count = 0;
        }
    }
}

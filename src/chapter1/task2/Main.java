package chapter1.task2;

public class Main {
    public static void isTriangleExist(int a, int b, int c) {
        if(a + b > c && b + c > a && c + a > b) System.out.println("YES");
        else System.out.println("NO");
    }
}

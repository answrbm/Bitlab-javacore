package chapter1.task1;

public class Main {
    public static int max(int i1, int i2, int i3) {
        if(i1 > i2 && i1 > i3) return i1;
        if(i2 > i1 && i2 > i3) return i2;
        return i3;
    }
}

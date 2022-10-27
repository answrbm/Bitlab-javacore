package chapter1.task17;

public class Main {
    public static int calculator(int i1, int i2, String sign) {
        int result = 0;
        switch(sign) {
            case "+" : result = i1 + i2;
                break;
            case "-" : result = i1 - i2;
                break;
            case "*" : result = i1 * i2;
                break;
            case "/" : result = i1 / i2;
                break;
        }
        return result;
    }
}

package chapter1.task20;

public class Main {
    public static void printSeason(int month) {
        if(month == 12 || (month >= 1 && month < 3)) System.out.println("Winter");
        if(month >= 3 && month < 6) System.out.println("Spring");
        if(month >= 6 && month < 9) System.out.println("Summer");
        if(month >= 9 && month < 12) System.out.println("Autumn");
    }
}

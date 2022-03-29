package Smth;

public class InputChecker {
    public InputChecker() {
    }

    private static final double eps = 1E-6;

    public static boolean integerValidCheck(String s, int min, int max) {
        try {
            int x = Integer.parseInt(s);
            if (x >= min && x <= max) return true;
            System.out.println("Ввод недействителен. Пожалуйста, введите целое число в правильном диапазоне");
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Ввод недействителен.Пожалуйста введите целое число");
            return false;
        }

    }

    public boolean longValidCheck(String s, Long min, Long max) {
        try {
            long x = Long.parseLong(s);
            if (x >= min && x <= max) return true;
            System.out.println("Input is invalid. Please enter the long number in correct range");
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Input is invalid. Please enter a long number");
            return false;
        }
    }
}

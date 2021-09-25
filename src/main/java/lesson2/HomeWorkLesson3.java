package lesson2;

import java.util.Arrays;

public class HomeWorkLesson3<pablic> {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive(7, 10);
        taskSix();
        int[] mass = {1, 5, 7, 9, 12, 3, 4, 7};
        System.out.println(taskSeven(mass));
        int[] massive = {1, 2, 3, 4, 5, 6, 7};
        int n = 1;
        taskBreakYourBrains(massive, n);
    }

    public static void taskOne() {
        int[] data = {1, 0, 1, 1, 0, 1};
        for (int i = 0; i < data.length; i++) {
            data[i] = 1 - data[i];
        }
        System.out.println(Arrays.toString(data));
    }

    ;

    public static void taskTwo() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    ;

    public static void taskThree() {
        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] = num[i] * 2;
            }
            ;
        }
        System.out.println(Arrays.toString(num));
    }

    ;

    public static void taskFour() {
        final int D_SIZE = 5;
        int[][] diagonal = new int[D_SIZE][D_SIZE];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                }
                if (j == D_SIZE - i - 1) {
                    diagonal[i][j] = 1;
                }
                System.out.printf("%2d", diagonal[i][j]);
            }
            System.out.println();
        }
    }

    public static void taskFive(int len, int initialValue) {
        int[] mass = new int[len];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = initialValue;
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void taskSix() {
        int[] findelements = {3, 33, 5, 2, 14, 2, 18};
        int max = findelements[0];
        int min = findelements[0];
        for (int i = 0; i < findelements.length - 1; i++) {
            if (findelements[i] > max) {
                max = findelements[i];
            } else {
                max = max + 0;
            }
        }
        for (int j = 0; j < findelements.length - 1; j++) {
            if (findelements[j] < min) {
                min = findelements[j];
            } else {
                min = min + 0;
            }
        }
        System.out.println("Максимальное число равно " + max);
        System.out.println("Минимальное число равно " + min);
    }

        private static boolean taskSeven(int[] mass) {
            int summAll = 0;
            int summ = mass[0];
            for (int i = 0; i < mass.length; i++) {
                summAll = summAll + mass[i];
            }
            for (int i = 0; i < mass.length - 1; i++) {
                summ = summ + mass[i];
                if (summ != summAll - summ) ;
                return true;
            }
            return false;
        }

    private static void taskBreakYourBrains (int[] massive, int n) {
        int abs = Math.abs(n);
        if (massive.length >= abs) {
            for (int i = 0; i < massive.length; i++) {
                if (i < massive.length - n) {
                    massive[i] = massive[i + n];
                } else {
                    massive[i] = massive[i - massive.length + n];
                }
            }
        }
        if (massive.length < abs) {
            int shift = n % massive.length;
            for (int i = 0; i < massive.length; i++) {
                if (i < massive.length - shift) {
                    massive[i] = massive[i + shift];
                } else {
                    massive[i] = massive[i - massive.length + shift];
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}



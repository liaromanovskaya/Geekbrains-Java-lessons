package lesson2;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        taskOneResult();
        taskTwo(9);
        taskThreeResult();
        taskFour("И снова здравствуйте!", 5);

    }

    private static void taskOneResult() {
        boolean result = taskOne(12, 25);
        System.out.println(result);
    }

    private static boolean taskOne(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    private static void taskTwo(int a) {
        String answer;
        if (a >= 0) {
            answer = "Число положительное";
        } else {
            answer = "Число отрицательное";
        }
        System.out.println(answer);
    }

    private static void taskThreeResult() {
        boolean result = taskThree(8);
        System.out.println(result);
    }

    private static boolean taskThree(int a) {
        if (a > 0) {
            return false;
        }
        return true;
    }

    private static void taskFour(String args, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(args);
        }
    }
}



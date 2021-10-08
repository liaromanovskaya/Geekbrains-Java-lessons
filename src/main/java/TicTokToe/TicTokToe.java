import java.util.Random;
import java.util.Scanner;

public class TicTokToe {

    private static final int SIZE = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int ternsCount;

    private static final String SPACE_MAP = " ";
    private static final String HEADER_FIRST_ELEMENT = "*";

    public static void main(String[] args) {
        ternGame();
    }

    private static void ternGame() {
        do {
            initMap();
            printMap();
            ternsCount = 0;
            playGame();
        } while (true);
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_ELEMENT + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTern();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTern();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTern() {
        System.out.println("\nХод человека");
        int rowNumber, columnNumber;
        do {
            rowNumber = getValidNumber() - 1;
            columnNumber = getValidNumber() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.println("\nЯчейка занята");
            }
        } while (true);

        MAP[rowNumber][columnNumber] = DOT_HUMAN;

        ternsCount++;

    }

    private static int getValidNumber() {
        do {
            System.out.print("Введите координату: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    System.out.printf("Координата %d принята%n", n);
                    return n;
                }
                System.out.println("Значение координаты должно быть от 1 до " + SIZE);
            } else {
                System.out.println("Ввести можно только целое число ");
                in.next();
            }

        } while (true);
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nВы победили!");
            } else {
                System.out.println("\nВы проиграли!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("\nНичья!");
            return true;
        }
        return false;
    }



    private static boolean checkWin(char symbol) {
        boolean primaryDiagonal = true;
        boolean secondaryDiagonal = true;

        for(int i = 0; i < SIZE; i++) {
            if (MAP[i][i] != symbol) primaryDiagonal = false;
            if (MAP[i][SIZE - i - 1] != symbol) secondaryDiagonal = false;
        }

        if (primaryDiagonal || secondaryDiagonal) return true;

        for(int i = 0; i < SIZE; i++) {
            boolean vertical = true;
            boolean horizontal = true;
            for(int j = 0; j < SIZE; j++) {
                if (MAP[i][j] != symbol) horizontal = false;
                if (MAP[j][i] != symbol) vertical = false;
            }
            if (vertical || horizontal) return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return ternsCount == SIZE * SIZE;
    }

    private static void aiTern() {
        System.out.println("\nХод компьютера");
        int rowNumber, columnNumber;
        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = DOT_AI;

        ternsCount++;

    }
}


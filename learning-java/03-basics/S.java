public class S {
    public static void main(String[] args) {
        printHeader("Java Basics Demo");

        showVariables();
        showOverflow();
        showConditions();
        showSwitch();
        showLoops();
        showModulo();
        showCharacters();
        showIntegerDivision();
        showFloatAndDouble();
    }

    private static void showVariables() {
        printHeader("1. Variables and Data Types");

        int number = 5;
        double decimalNumber = 3.14;
        boolean isJavaFun = true;
        char grade = 'A';

        System.out.println("int value:" + number);
        System.out.println("double value:" + decimalNumber);
        System.out.println("boolean value:" + isJavaFun);
        System.out.println("char value:" + grade);
    }

    private static void showOverflow() {
        printHeader("2. Integer Overflow");

        int maxInt = Integer.MAX_VALUE;
        int overflowResult = maxInt + 1;

        System.out.println("Maximum int value:" + maxInt);
        System.out.println("Maximum int value + 1:" + overflowResult);
        System.out.println("An int wraps around when it becomes larger than its maximum value.");
    }

    private static void showConditions() {
        printHeader("3. If / Else");

        int firstNumber = 5;
        double secondNumber = 3.14;

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + "is greater than" + secondNumber);
        } else {
            System.out.println(firstNumber + "is not greater than" + secondNumber);
        }
    }

    private static void showSwitch() {
        printHeader("4. Switch");

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }
    }

    private static void showLoops() {
        printHeader("5. Loops");

        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i =" + i);
        }

        System.out.println("While loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("j =" + j);
            j++;
        }

        System.out.println("Dowhile loop:");
        int k = 0;
        do {
            System.out.println("k =" + k);
            k++;
        } while (k < 5);
    }

    private static void showModulo() {
        printHeader("6. Modulo");

        int dividend = 5;
        int divisor = 2;
        int remainder = dividend % divisor;

        System.out.println(dividend + "%" + divisor + " = " + remainder);
    }

    private static void showCharacters() {
        printHeader("7. Characters");

        char asciiCharacter = 67;
        char unicodeCharacter = '\u0041';

        System.out.println("Character with code 67:" + asciiCharacter);
        System.out.println("Unicode character \\u0041:  " + unicodeCharacter);
    }

    private static void showIntegerDivision() {
        printHeader("8. Integer Division");

        int result = 5 / 2;

        System.out.println("5 / 2 with integers =" + result);
        System.out.println("Java removes the decimal part when both values are integers.");
    }

    private static void showFloatAndDouble() {
        printHeader("9. Float and Double");

        float floatValue = 3.14f;
        double doubleValue = 3.14159;

        System.out.println("float value:" + floatValue);
        System.out.println("double value:" + doubleValue);
    }

    private static void printHeader(String title) {
        System.out.println();
        System.out.println("===" + title + " ===");
    }
}

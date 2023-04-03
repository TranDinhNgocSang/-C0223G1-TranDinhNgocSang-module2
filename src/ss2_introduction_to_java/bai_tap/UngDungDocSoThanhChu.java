package ss2_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer up to 3 digits: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = "";
            int ones = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = number / 100;

            if (number == 0) {
                result = "zero";
            } else if (number < 10) {
                result = readOnes(ones);
            } else if (number < 20) {
                result = readTeens(number);
            } else if (number < 100) {
                result = readTens(tens) + " " + readOnes(ones);
            } else {
                result = readOnes(hundreds) + " hundred";
                if (tens == 0 && ones != 0) {
                    result += " and " + readOnes(ones);
                } else if (tens == 1) {
                    result += " and " + readTeens(number % 100);
                } else if (tens > 1) {
                    result += " " + readTens(tens);
                    if (ones != 0) {
                        result += " " + readOnes(ones);
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static String readOnes(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    private static String readTeens(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    private static String readTens(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
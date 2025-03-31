package util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static int validateInputInteger(String message, Scanner scanner) {
        System.out.println(message);
        do {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Dữ liệu nhập vào không phải số nguyên, vui lòng nhập lại");
            }
        } while (true);
    }

    public static float validateInputFloat(String message, Scanner scanner) {
        System.out.println(message);
        do {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Dữ liệu nhập vào không phải số thực, vui lòng nhập lại");
            }
        } while (true);
    }

    public static double validateInputDouble(String message, Scanner scanner) {
        System.out.println(message);
        do {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Dữ liệu nhập vào không hợp lệ, vui lòng nhập lại");
            }
        } while (true);
    }

    public static boolean validateInputBoolean(String message, Scanner scanner) {
        System.out.println(message);
        while (true) {
            try {
                String inputString = scanner.nextLine().trim();
                if (inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("false")) {
                    return Boolean.parseBoolean(inputString);
                }
                throw new IllegalArgumentException("Dữ liệu nhập vào không hợp lệ, vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String validateInputString(String message, Scanner scanner, StringRule stringRule) {
        System.out.println(message);
        while (true) {
            try {
                String inputString = scanner.nextLine().trim();
                if (stringRule.isValidString(inputString)) {
                    return inputString;
                }
                throw new IllegalArgumentException("Dữ liệu nhập vào không hợp lệ, vui lòng nhập lại");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String validateEmail(String message, Scanner scanner) {
        System.out.println(message);
        while (true) {
            try {
                String inputString = scanner.nextLine();
                if (Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", inputString)) {
                    return inputString;
                }
                throw new IllegalArgumentException("Dữ liệu nhập vào không hợp lệ, vui lòng nhập lại");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для чтения пользовательского ввода из консоли

        System.out.println("Введите первое число:");
        Double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число:");
        Double b = Double.parseDouble(reader.readLine()); // Читаем и преобразуем ввод в Double

        System.out.println("Введите оператор(+, -, *, /):");
        String operator = reader.readLine();

        DecimalFormat decimalFormat = new DecimalFormat("#0.0000"); // Создаем объект DecimalFormat для форматирования результата с 4 знаками после запятой

        System.out.println(decimalFormat.format(operation(a, b, operator))); // Выводим результат операции, отформатированный с помощью decimalFormat

    }

    /**
     * Выполняет арифметическую операцию между двумя числами на основе переданного оператора.
     *
     * @param a первое число, которое участвует в операции.
     * @param b второе число, которое участвует в операции.
     * @param operator арифметический оператор, указывающий на действие, которое нужно выполнить.
     *                 Возможные значения: "+", "-", "*", "/".
     * @return результат выполнения арифметической операции.
     * @throws IllegalArgumentException если передан неизвестный оператор.
     */
    public static double operation(Double a, Double b, String operator) {
        double result;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            default -> throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
        return result;
    }
}

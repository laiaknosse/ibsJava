package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // ������� BufferedReader ��� ������ ����������������� ����� �� �������

        System.out.println("������� ������ �����:");
        Double a = Double.parseDouble(reader.readLine());
        System.out.println("������� ������ �����:");
        Double b = Double.parseDouble(reader.readLine()); // ������ � ����������� ���� � Double

        System.out.println("������� ��������(+, -, *, /):");
        String operator = reader.readLine();

        DecimalFormat decimalFormat = new DecimalFormat("#0.0000"); // ������� ������ DecimalFormat ��� �������������� ���������� � 4 ������� ����� �������

        System.out.println(decimalFormat.format(operation(a, b, operator))); // ������� ��������� ��������, ����������������� � ������� decimalFormat

    }

    /**
     * ��������� �������������� �������� ����� ����� ������� �� ������ ����������� ���������.
     *
     * @param a ������ �����, ������� ��������� � ��������.
     * @param b ������ �����, ������� ��������� � ��������.
     * @param operator �������������� ��������, ����������� �� ��������, ������� ����� ���������.
     *                 ��������� ��������: "+", "-", "*", "/".
     * @return ��������� ���������� �������������� ��������.
     * @throws IllegalArgumentException ���� ������� ����������� ��������.
     */
    public static double operation(Double a, Double b, String operator) {
        double result;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            default -> throw new IllegalArgumentException("����������� ��������: " + operator);
        }
        return result;
    }
}

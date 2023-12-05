package org.example;

public class SumCalculator {
    public static int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Параметр n повинен бути більше за 0");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int result = sum(0);
        System.out.println(result);
    }
}
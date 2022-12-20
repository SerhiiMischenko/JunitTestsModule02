package org.example;

public class SumCalculator {
    public int sum(int n) {
        int result = 0;
        if(n <= 0) {
            throw new IllegalArgumentException();
        }
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }
}

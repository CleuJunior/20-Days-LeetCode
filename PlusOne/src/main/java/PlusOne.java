package main.java;

import java.util.ArrayList;

public class PlusOne {
    public int[] solutionPlusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }

        if (carry > 0) {
            int[] sum = new int[digits.length + 1];
            sum[0] = carry;
            System.arraycopy(digits, 0, sum, 1, sum.length - 1);
            return sum;
        } else
            return digits;
    }
}

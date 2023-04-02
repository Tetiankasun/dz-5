package org.example;


public class IntCalculator {

    private int a1;
    private int a2;
    private int a3;
    private int a4;

    public IntCalculator(int a1, int a2, int a3, int a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }


    public void countSumOfNumbers() {
        int sum1 = a1 + a2;
        int sum2 = a3 + a4;

        System.out.println("a1 + a2 > a3 + a4: " + (sum1 > sum2));

        sum1++;
        sum2 -= 2;

        System.out.println("Increasing sum1 by 1, decreasing sum2 by 2...");
        System.out.println("a1 + a2 > a3 + a4: " + (sum1 > sum2));

        System.out.println("sum1 %2 == 0 | sum2 %2 == 0: " + (sum1 % 2 == 0 || sum2 % 2 == 0));
    }

}

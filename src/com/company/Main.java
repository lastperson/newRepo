package com.company;

public class Main {
    public static void main(String[] args) {
        int d1 = diskrim(1, 2, 3, 4);
        int d2 = diskrim(2, 3, 1, 8);
        int d3 = diskrim(5, 3, 2, 7);
        int d4 = diskrim(3, 6, 2, 9);

        System.out.println("d1 = " + d1 + " d2 = " + d2 + " d3 = " + d3 + " d4 = " + d4);
    }

    public static int diskrim(int a, int b, int c, int x) {
        int res;
        res = a + b*x*x + 2*c*x;
        return res;
    }
}

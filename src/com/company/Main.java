package com.company;

public class Main {
    public static void main(String[] args) {
        Box a = new Box();
        a.name();

        a.rename("My New Funny Box");
        a.name();

        Box b = new Box();
        b.name();
        b.rename("Second Not SO Funny Box");
        b.name();


        SizedBox s = new SizedBox();




        a.name();

        a.fillFirstName("Oleksii");
    }

    public static int diskrim(int a, int b, int c, int x) {
        int res;
        res = a + b*x*x + 2*c*x;
        return res;
    }


}

package com.company.scope;

import java.util.Scanner;

public class X {

    private int x;

    public void x() {
        Scanner x = new Scanner(System.in);
        while(true) {

            System.out.println("Enter the value of x:");
            this.x = x.nextInt();
            if (this.x  < 1 || this.x > 12) {
                break;
            }
            x(this.x);

        }
    }

    public void x(int y) {
        for(int x=1; x<=12; x++) {
            System.out.println( y + " * " + x + " = " + x*y);
        }
    }


}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Area {
    Scanner sc = new Scanner(System.in);
    private int lenght;
    private int breath;

    public void getArea() {
        System.out.println("Enter Length");
        lenght = sc.nextInt();

        System.out.println("Enter Breath");
        breath = sc.nextInt();
    }

    public void setDem() {
        System.out.println("Your Area of the rectangle is " + lenght * breath);
    }

    public static void main(String[] args) {

        Area r = new Area();

        r.getArea();
        r.setDem();
    }
}
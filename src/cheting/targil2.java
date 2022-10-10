package cheting;

import java.util.Scanner;

public class targil2 {

    public  static void main(String[] args) {
        //2.1
        System.out.println("Hello, world!");

        //2.2
        System.out.println("H-e-1-1-o-,-f-r-i-e-n-d!");

        //2.3
        String P = "+";
        String W = "!";
        String E = "?";
        System.out.println(P+P+P+"\n"+W+W+W+W+"\n"+E+E);

        //2.4
        System.out.println(P+P+P+W+W+W+W+E+E);

        //2.8
        int x = 6;
        System.out.println(x+"\n"+(x*x)+"\n"+(x*x*x));

        //2.9
        int y = 9;
        System.out.println("значение y равно" + y + "\n" + (y*y));

        //2.10
        System.out.println("значение переменных x и y :" + x + " " + y);

        //2.11
            String name = "Grisha";
            String phone = "+375336608460";
        System.out.println("*"+name+"* "+"*"+phone+"*");

        //2.12
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        char sim = '8';
        String strDo = "";
        for (int i =0; i<a;i++) {
            System.out.print(strDo);
            for (int j = i; j < a; j++)
                System.out.print(sim);
            for (int k = a; k > i; k--)
                System.out.print(sim);
            strDo+=" ";
            System.out.println("");
        }
    }
}


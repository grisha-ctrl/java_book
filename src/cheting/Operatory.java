package cheting;

import java.util.Scanner;

public class Operatory {
    public static Scanner in = new Scanner(System.in);
    public static void main(String str[]){
    //4.1
        int x = in.nextInt();
        System.out.println(x / 10 + " " + x % 10);

    //4.2
        int y = in.nextInt();
        System.out.println(y / 100 + " " + (y-100*(y/100)) / 10+" "+y%10);

    //4.3
        int z = in.nextInt();
        System.out.println(z % 10 + " " + z / 10);

    //4.4
        int x1 = in.nextInt();
        System.out.println(x1 % 10 + " " + (x1-100*(x1/100)) / 10+" "+x1/100);

    //4.5
        int y1 = in.nextInt();
        System.out.println(((y1/10)*10+"+"+y1%10));

    //4.6
        int z1 = in.nextInt();
        System.out.println(((z1/100)*100+"+"+((z1-100*(z1/100))-z1%10)+"+"+z1%10));

    //4.7
        int x2 = in.nextInt();
        int reverse =((x2 % 10)*10 + x2 / 10)+8;
        System.out.println(reverse);

    //4.8
        int y2 = in.nextInt();
        int revers2 = ((((y2%10)*100)+((y2-100*(y2/100))-y2%10)+y2/100))-20;
        System.out.println(revers2);

    //4.9
        int z2 = in.nextInt();
        System.out.println((z2 / 10)  + (z2 % 10));

    //4.10
        int x3 = in.nextInt();
        System.out.println((x3 / 100) + ((x3 - 100 * (x3 / 100)) / 10) + x3%10);

    //4.11
        int y3 = in.nextInt();
        int num1 = (y3 / 10);
        int num2 = (y3 % 10);
        if (num1 > num2){
            System.out.println(num1-num2);
        } else {
            System.out.println(num2-num1);
        }

    //4.12
        int z3 = in.nextInt();
        int num3 = z3 / 100;
        int num4 = ((z3-100*(z3/100)) / 10) * (z3 % 10);
        if (num3>num4) System.out.println(num3-num4);
        else System.out.println(num4-num3);


    //4.13
        int x4 = in.nextInt();
        int counter = 0;
        int num5 = (x4 / 10);
        int num6 = (x4 % 10);
        if (num5%2 == 0) counter++;
        if (num6%2 == 0) counter++;
        System.out.println(counter);

    //4.14
        int y4 = in.nextInt();
        int counter2 = 0;
        int num7 = (y4 / 100);
        int num8 = ((y4-100*(y4/100))-y4%10);
        int num9 = (y4 % 10);
        if (num7%2 == 0) counter2++;
        if (num8%2 == 0) counter2++;
        if (num9%2 == 0) counter2++;
        System.out.println(counter2);

    //4.15
        int z4 = in.nextInt();
        int counter3 = 0;
        int num10 = z4/1000;
        int num11 = (z4-1000*(z4 / 100));
        int num12 = ((z4-1000*(z4-100*(z4/100))-z4%10));
        int num13 = (z4 % 10);
        if (num10%2 == 0) counter3++;
        if (num11%2 == 0) counter3++;
        if (num12%2 == 0) counter3++;
        if (num13%2 == 0) counter3++;
        System.out.println(counter3);

    //4.16


    //4.17
        int x5 = in.nextInt();
        int num14 = x5/1000;
        int num15 = (x5-1000*(x5/1000)-x5%10);
        int num16 = (x5%10)*1000;
        System.out.println(num16+num15+num14);

    //4.19
        int y5= in.nextInt();
        int swap = ((y5-1000*(y5/1000))*10);
        System.out.println(swap);

    //4.21
        int z5 = in.nextInt();
        int swap1 = ((z5-1000*(z5/1000))*10)+(z5/1000);
        System.out.println(swap1);
    //4.23
        int x6 = in.nextInt();
        int swap2 = ((x6-1000*(x6/1000))-x6%10)+((x6%10)*1000)+x6/1000;
        System.out.println(swap2);

    //4.24
        int y6 = in.nextInt();
        int z6 = in.nextInt();
        int swap3 = ((y6/10)*10)+z6%10;
        int swap4 = ((z6/10)*10)+y6%10;
        System.out.println(swap3+" "+swap4);

    //4.25
        int a,a1,b,b1;
        a=in. nextInt();
        b=in. nextInt();
        a1=a%10;
        b1=b%10;
        a=((a/10)*10)+b1;
        b=((b/10)*10)+a1;
        System.out.println(a+" "+b);

    }
}

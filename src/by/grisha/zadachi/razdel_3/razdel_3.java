package by.grisha.zadachi.razdel_3;

import java.util.Scanner;

public class razdel_3 {
    public static Scanner in=new Scanner(System.in);
    public static void main (String[] args) {

        //3.2
        System.out.println("Введите число s :");
        double s = in.nextDouble();
        double d = s*2.54;
        System.out.println(d);

        //3.3
        System.out.println("Введите число d :");
        d = in.nextDouble();
        s = d/2.54;
        System.out.println("s равно: "+s);

        //3.4
        System.out.println("Введите сумму :");
        double dollar= in.nextDouble();
        System.out.println("Введите коэффициент :");
        double bank = in.nextDouble();
        System.out.println("Перевод :" + dollar*bank);

        //3.5
        System.out.println("Введите первый катет :");
        double k1 = in.nextDouble();
        System.out.println("Введите второй катет :");
        double k2 = in.nextDouble();
        System.out.println("Введите гипотенузу :");
        double g = in.nextDouble();
        System.out.println("Площадь: " + (0.5*k1*k2) + "\n" + "Периметр :" + (k1+k2+g));

        //3.6
        System.out.println("Введите число :");
        int a = in.nextInt();
        int b=0, c=0, e=0;
        b = a+2;
        c = b+2;
        e = c+2;
        System.out.println(b + "\t" + c + "\t" + e);

        //3.7
        System.out.println("Введите число :");
        int f = in.nextInt();
        int k=0, l=0, m=0;
        k = f-1;
        l = k-1;
        m = l-1;
        System.out.println(k + "\n" + l + "\n" + m);

        //3.8
        System.out.println("Введите параметры :");
        int bot = in.nextInt();
        int height = in.nextInt();
        System.out.println("Площадь треугольника:" + (bot*height) + "\n" + "Периметр прямоульника :" + (2 * (bot+height)));

        //3.9
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum = 10*n1+10*n2+10*n3;
        System.out.println(sum);

        //3.10
        int v = in.nextInt();
        int pr = in.nextInt();
        double curs = in.nextDouble();
        double euro = (v+pr)*curs;
        System.out.println(euro);

    }
}

package by.grisha.zadachi.razdel_6;
import java.util.Scanner;

public class otvet6_1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        o6_11();
    }

    /**
     * Зачем в метод передаешь аргументом массив, если не используешь его внутри метода?
     * @param str
     */
    public static void o6_6(String[] str){
        int x = in.nextInt();
        if (x<0) System.out.println("Отрицатетльное");
        if (x>0) System.out.println("Положительное");
        if (x==0) System.out.println("Ноль");
    }
    public static void o6_7() {
        int x = in.nextInt();
        //Можно написать вот так
//        if (x>99) x-=1;
        if(x > 99) {
            x--;
        }
        System.out.println(x);
    }
    public static void o6_8(String[] str) {
        int x = in.nextInt();
        int y = in.nextInt();
        if (x>y) System.out.println(x+y);
        if (x<y) System.out.println(x*y);
        if (x==y) System.out.println("Числа равны");
    }
    public static void o6_9(){
        int x = in.nextInt();
        int y = (x/100)%2;
        int z = (x - 100*(x/100))%2;
        int a = (x%10)%2;
        String f = "не четно-красивое";
        String t = "Четно-красивое";
        if (y == 0 & z == 0 & a == 0) System.out.println(t);
        else System.out.println(f);

    }
    public static void o6_10(){
        int x = in.nextInt();
        int z = (x/10)*(x%10);
        if (x>z) System.out.println("число больше");
        else System.out.println("произведение больше");
    }
    public static void o6_11(){
        int x = in.nextInt();
        int y = in.nextInt();
        if (x==0 || y==0) System.out.println("Некорректно");
        //Фатальная ошибка, ты попутал & и &&. Гугли разницу. Оно то работает, но так нельзя делать.
        else if ((x>0 & y>0)||(x<0 & y<0)) System.out.println("Один и тотже знак");
        else System.out.println("Знаки разные");
    }
    public static void o6_12(){
        //Харэ писать переменные в строку
        int a,b,c,d;
        a=in.nextInt();
        b=in. nextInt();
        c=in. nextInt();
        d=b*b-4*a*c;
        if (d>=0) System.out.println("Дa");
        else System.out.println("Heт");
    }
    public static void o6_14(){
        int x,y;
        x=in.nextInt();
        y=in.nextInt();
        if (x*y>0)
            System.out.println("Положительная");
        else System.out.println("Отрицательная");
    }

    }


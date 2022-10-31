package by.grisha.zadachi.razdel_7;
import java.util.Scanner;
public class razdel_7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String [] str){
        o7_11(5, 6);
    }

    public void o7_6(){
        int x = in.nextInt();
        int y = in.nextInt();
        if (x==y) System.out.println("Da");
        else System.out.println("Net");
    }
    public void o7_7(){
        int x = in.nextInt();
        int y = in.nextInt();
        if (x>=y) System.out.println("Da");
        else System.out.println("Net");
    }
    public void o7_8(){
        int x = in.nextInt();
        int y = in.nextInt();
        //Вот тут и проблема. Хер пойми где ученики, а где столы, если х это столы, то норм, если наоборот, то надо делить
        //Пиши осознанные имена переменных
        if (x*2>=y) System.out.println("Da");
        else System.out.println("Net");
    }
    public void o7_9(){
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x==Math.sqrt(z*z-y*y) & y==Math.sqrt(z*z-x*x) & z==Math.sqrt(x*x+y*y))System.out.println("da");
        else System.out.println("net");
    }
    public void o7_10(){
        int x =in. nextInt();
        if (x<0) x*=-1;
        else x=0;
        System.out.println(x);
    }

    public static void o7_11(int x, int y){
        if (x>y) System.out.println(x + " " + y + "\n" + y + " " + x);
        else System.out.println(y + " " + x + "\n" + x + " " + y);

    }


}

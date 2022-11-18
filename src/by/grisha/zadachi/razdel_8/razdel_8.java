package by.grisha.zadachi.razdel_8;

import java.util.Scanner;

public class razdel_8 {
    public static Scanner in=new Scanner(System.in);
    public static void main (String[] args) {ticket831();}

/**  Напишите класс, который принимает с клавиатуры два числа: первое -
    количество учеников в классе, второе - количество стульев в классной
    комнате.
    Программа проверит соответствие между этими двумя значениями и
    выведет на экран соответствующую информацию (например, для значений
    35 и 39 на экран выводится 4 стула лишних).*/

    private static void ticket811(){
        System.out.println("Введите число учеников: ");
        int x = in.nextInt();
        System.out.println("Введите число стульев: ");
        int y = in.nextInt();
        if (x>y){
            int dif = x-y;
            if (dif<5){
                System.out.println("Не хватает " + dif + " стула");
            }else System.out.println("Не хватает " + dif + " стульев");
        }
        if (x<y){
            int dif = y-x;
            if (dif<5){
                System.out.println(dif + " стула лишних");
            }else System.out.println(dif + " лишних стульев");
        }
    }

/** Напишите класс, который принимает с клавиатуры оценку ученика
    (целое число) и проверяет, не является ли введенное значение ошибочным.
    На экран должно выводиться соответствующее текстовое сообщение.*/

    private static void ticket812(){
        System.out.println("Введите оценку: ");
        int x = in.nextInt();
        if(x<1 & x>10) {
            System.out.println("Оценка введина некорректно");
        }
        }
    /** Напишите класс, который принимает с клавиатуры двузначное положительное
     число и проверяет, составлено ли оно из одинаковых цифр.
     В соответствии с результатом проверки надо вывести на экран соответствующее
     текстовое сообщение.*/

    private static void ticket813(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x/10;
        int z = x%10;
        if (y==z){
            System.out.println("Составлено из одинаковых цифр");
        }else System.out.println("Не составлено из одинаковых цифр");
    }

/** Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, является ли в нем первая цифра (десятков)
    больше второй (единиц). В соответствии с результатом проверки
    надо вывести на экран соответствующее текстовое сообщение.*/

    private static void ticket814() {
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x / 10;
        int z = x % 10;
        if (y > z) {
            System.out.println("Число десятков больше");
        }else System.out.println("Число десятков меньше");
    }

/** Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, какая из его двух цифр является большей.
    В соответствии с результатом проверки надо вывести на экран
    соответствующее текстовое сообщение. Не следует выводить на экран
    никакого сообщения, если число составлено из одинаковых цифр.*/

    private static void ticket815(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x/10;
        int z = x%10;
        if (y>z){
            System.out.println("Число десятков больше");
        }else if(y<z) System.out.println("Число единиц больше");
    }

/**  Трехзначное число называется «симметричным», если первая и последняя
     его цифры одинаковы.
     Напишите класс, который принимает с клавиатуры трехзначное положительное
     число и проверяет, является ли оно «симметричным». В соответствии
     с результатом проверки надо вывести на экран соответствующее
     текстовое сообщение.*/

    private static void ticket816(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x/100;
        int z = x%10;
        if (y==z){
            System.out.println("Число симметрично");
        }else System.out.println("Число не симметрично");
    }

/**  Трехзначное число называется «дважды четным», если и оно само, и
     сумма его цифр - четные.
     Напишите класс, который принимает с клавиатуры трехзначное положительное
     число и проверяет, является ли оно «дважды четным».
     В соответствии с результатом проверки надо вывести на экран соответствующее
     текстовое сообщение.
     Обратите внимание: задание имеет решение с использованием единственного
     оператора if- без составного условия!*/

     private static void ticket817(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int z = (x/100) + ((x%100)-x%10)+x%10;
        if ((x&2)==0 & z%2==0){
            System.out.println("Число является дважды четным");
        }else System.out.println("Число не является дважды четным");
    }

/** Назовем «степенью четности» числа количество четных цифр в его составе
    (например, степень четности для 2346 равна 3).
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и определяет, какова его «степень четностю>. В соответствии
    с результатом проверки надо вывести на экран соответствующее
    текстовое сообщение.*/

    private static void ticket818(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int counter = 0;
        int y = x/100;
        int z = (x%100)-x%10;
        int s = x%10;
        if (y%2==0) counter++;
        if (z%2==0) counter++;
        if (s%2==0) counter++;
        System.out.println("Степень четности числа равна: "+counter);
    }

/** Четырехзначное число называется «парно-симметричным», если две
    его первых цифры и две его последних цифры образуют одинаковые
    числа (например - 5252).
    Напишите класс, который принимает с клавиатуры четырехзначное
    положительное число и определяет, является ли оно «парно-симметричным».
    В соответствии с результатом проверки надо вывести на
    экран соответствующее текстовое сообщение.*/

    private static void ticket819(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x/100;
        int z = x%100;
        if (y==z) System.out.println("Число парно-симметрично");
    }

/** Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, содержится ли в нем хотя бы один ноль.
    По результатам проверки надо вывести на экран соответствующее текстовое
    сообщение.*/

    private static void ticket820(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x/100;
        int z = (x%100)-x%10;
        int s = x%10;
        int counter = 0;
        if (y==0) counter++;
        if (z==0) counter++;
        if (s==0) counter++;
        if (counter==0) {
            System.out.println("Нулей нет");
        }else System.out.println("Нули есть");
    }

/** Напишите класс, который принимает с клавиатуры положительное
    целое число и выводит на экран ближайшее к нему «круглое число».
    Например, для введенного значения 433 выводится на экран 430, а для
    56 выводится 60.*/

    private static void ticket821(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x%10;
        if (y>=5){
            x = x+(10-y);
            System.out.println(x);
        }else {x=(x/10)*10;
            System.out.println(x);
        }
    }

/** Напишите класс, который принимает с клавиатуры целое положительное
    число и изменяет его следующим образом:
        • для четного числа - увеличивает его до ближайшего «крутлого» и
    выводит новое значение на экран вместе с сообщением Up to."
        • для нечетного числа - уменьшает его до ближайшего «крутлого» и
    выводит новое значение на экран вместе с сообщением Down to".
    Например, для введенного значения 433 на экран выводится Down to
    430, а для 56 выводится Up to 60.*/

    private static void ticket822(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        if (x%2==0){
            x=x+(10-x%10);
            System.out.println("Up to " + x);
        }else {
            x=(x/10)*10;
            System.out.println("Down to " + x);
        }
    }

/** Напишите класс, который принимает с клавиатуры два целых числа и
    изменяет их следующим образом:
        • при разных значениях, большее число уменьшается на 1, а меньшее - увеличивается на 1;
        • при одинаковых значениях чисел оба увеличиваются на 1.
    Программа должна вывести на экран новые значения переменных.*/

    private static void ticket823(){
        System.out.println("Введите x: ");
        int x = in.nextInt();
        System.out.println("Введите y: ");
        int y = in.nextInt();
        if (x==y){
            x++;
            y++;
            System.out.println(x+" "+y);
        }else if (x>y){
            x--;
            y++;
            System.out.println(x+" "+y);
        }else if (x<y){
            x++;
            y--;
            System.out.println(x+" "+y);
        }
    }

/** Напишите класс, который принимает с клавиатуры целое трехзначное
    положительное число и изменяет его следующим образом:
        • для чисел, больших 500, - переставляет местами числа единиц и
    сотен (вместо 672 - 276);
        • в остальных числах переставляются местами числа десятков и
    единиц (вместо 363 - 336).
    Программа должна вывести на экран новое значение переменной.*/

    private static void ticket824(){
        int x,y,z,s,a=0;
        x=in.nextInt();
        y=a/100;
        z=(x/10)%10;
        s=x%10;
        if (x>500) a=s*100+z*10+y;
        else a=y*100+s*10+z;
        System. out. println(a);
    }

/** Напишите класс, который принимает с клавиатуры целое положительное
    число, и затем:
        • в случае если введено четное число, - принимает с клавиатуры
    дробное число и выводит на экран произведение этих двух чисел;
        • в противном случае - принимает с клавиатуры целое число и выводит
    на экран сумму этих двух чисел.*/

    private static void ticket825(){
        System.out.println("Введите число: ");
        int x = in.nextInt();
        if (x%2==0){
            System.out.println("Введите дробное число: ");
            double z = in.nextDouble();
            System.out.println(z*x);
        }else {
            System.out.println("Введите число: ");
            int z = in.nextInt();
            System.out.println(z+x);
        }
    }

/** Симметричным («палиндромом») называется число, которое дает одинаковое
    значение при чтении его справа налево и слева направо (например, 787).
    Напишите класс, который принимает с клавиатуры положительное число
    (не большее 99999) и проверяет, является ли это число палиндромом.
    Класс должен выводить на экран соответствующее текстовое сообщение.*/

    private static void ticket826(){
        int x;
        while ((x=in.nextInt()) > 9999){
            System.out.println("Число не подходит");
        }
        
    }

/** Напишите класс, который принимает в качестве параметров два целых
    положительных числа и выводит на экран с дополнительным сообщением
    то из них, у которого наибольшая последняя цифра (число единиц).
    Если такого числа нет, класс должен вывести на экран соответствующее
    сообщение.*/

    private static void ticket827(){
        
        int x = in.nextInt();
        int y = in.nextInt();
        int z=x%10;
        int s=y%10;
        if (z>s)
            System.out.println(x);
        if (z<s)
            System.out.println(y);
        if (z==s)
            System.out.println("Heт результата");
    }

/** Напишите класс, который принимает с клавиатуры два целых положительных
    числа. Класс должен определить, могут ли эти числа быть числителем
    (первое) и знаменателем (второе) дроби.
    В случае если могут, класс должен определить, является ли эта дробь
    правильной, неправильной или же она выражает целое число, а также
    вывести на экран соответствующее текстовое сообщение.
    В случае если числа не могут выражать дробь, следует вывести на экран
    соответствующее объяснение.*/

    private static void ticket828(){
        System.out.println("Введите числа: ");
        int x = in.nextInt();
        int y = in.nextInt();
        if (y!=0){
            if (x<y) System.out.println("Дробь является правильной");
            if (x>y) System.out.println("Дробь является неправильной");
            if (x%y==0)System.out.println("Дробь выражает целое число");
        }
        else System.out.println("Эти числа не могут выражать дробь");
    }

/** Напишите класс, который принимает с клавиатуры две пары целых
    ненулевых чисел: первая пара является числителем и знаменателем одной
    дроби, вторая пара - числителем и знаменателем другой дроби.
    Класс должен проверить, равны ли эти дроби друг другу, и вывести на
    экран соответствующее текстовое сообщение.*/

    private static void ticket829(){

        System.out.println("Введите первую пару числе: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Введите вторую пару чисел: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (x==0 || y==0 || a==0 || b==0) {
            System.out.println("Введенные числа не подходят условию");
            ticket829();
        }else {
            double d1 = (double) x / y;
            double d2 = (double) a / b;
            System.out.println(d1 + " " + d2);
            if (d1 == d2) System.out.println("Дроби равны");
            else System.out.println("Дроби не равны");
        }
    }

/** Напишите класс, который принимает с клавиатуры два целых числа.
    Класс должен определить, мoryr ли эти числа быть числителем (первое)
    и знаменателем (второе) дроби.
    В случае если числа выражают неправильную дробь, следует вывести
    на экран соответствующую ей правильную сложную дробь, а во всех
    остальных случаях - текстовое сообщение Подсчет не производится.
    Например, если с клавиатуры введены значения 7 и 12 - на экран выводится
    сообщение Подсчет не производится; если введены 12 и 7, то
    на экран выводится 1 5/7.*/

    private static void ticket830(){
        int x=in. nextInt();
        int y=in. nextInt();
        int z=0;
        if (y!=0 && x>y) {
            z=x/y;
            x-=z*y;
            System. out. println(z + " " + x + " /" + y);
        }
        else
        System.out.println("Подсчет не производится");
    }

/** Напишите класс, который принимает с клавиатуры трехзначное число
    и изменяет его следующим образом:
        • для четных чисел - все четные цифры увеличиваются на 1, а нечетные
    уменьшаются на 1; в случае если это невозможно, они остаются
    неизменными;
        • в нечетных числах все изменения производятся «наоборот».
    Программа должна вывести на экран новое значение переменной.*/

    private static void ticket831(){
        int x = in.nextInt();
        if (x%2==0){
            if ((x/100)%2==0) x+=100;
            else x-=100;
            if (((x%100)-x%10)%2==0) x+=10;
            else x-=10;
            if ((x%10)%2==0) x+=1;
            else x-=1;
        }else if (x%2!=0){
            if ((x/100)%2==0) x-=100;
            else x+=100;
            if (((x%100)-x%10)%2==0) x-=10;
            else x+=10;
            if ((x%10)%2==0) x-=1;
            else x+=1;
        }
        System.out.println(x);
    }

/** Напишите класс, который принимает с клавиатуры целое число, и затем:
        • в случае если введено четное число, - принимает с клавиатуры
    дробное число и выводит на экран произведение этих двух чисел;
        • в противном случае - принимает с клавиатуры целое число и вы-
    водит на экран сумму этих двух чисел.*/

    private static void ticket832() {
        int a = in.nextInt();
        if (a % 2 == 0) {
            double c = in.nextDouble();
            System.out.println(a * c);
        }else {
            int b= in.nextInt();
            System.out.println(a+b);
        }
    }
}
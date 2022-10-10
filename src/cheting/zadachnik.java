package cheting;

public class zadachnik {
    static public void main(String str[]){

        //1.4
        int a = 5, b = 9;
        int c = a + b;

        //1.5
        double x = 7.5;
        double y = x * 2;
        double z = x * 3;

        //1.6
        int min = 10;
        int max = 100;

        int r1 = (int)((Math.random() * (max + 1 - min) + min)/10);
        int r2 = (int)((Math.random() * (max + 1 - min) + min)/10);
        String r = r1 + "" + r2;

        //1.7
        int e = (int) (Math.random()*66);
        int t = e/3;
        System.out.println(t);
    }
}

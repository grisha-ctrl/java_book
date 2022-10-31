package by.grisha.zadachi.razdel_1;

public class razdel_1 {
    /**
     * Сначала идёт модификатор доступа потом ключевое слово статик.
     *
     * В мейне как правило не str, а args
     *
     * Имя класса в CamelCase должно быть
     *
     * Скачай себе Adobe Acrobat там можно копировать текст в пдфке и вставляй описание задачи перед каждой задачей
      *
     * чтобы не писать 3 миллиона разных переменных можно делать отдельные методы на каждую задачку из раздела
     */
    static public void main(String[] str){

        //1.4
        int a = 5, b = 9;
        int c = a + b;

        //1.5
        double x = 7.5;
        double y = x * 2;
        double z = x * 3;

        //1.6 тут ты что-то намудрил
        int min = 10;
        int max = 100;

        int r1 = (int)((Math.random() * (max + 1 - min) + min)/10);
        int r2 = (int)((Math.random() * (max + 1 - min) + min)/10);
        String r = r1 + "" + r2;

        //1.7
        int e = (int) (Math.random()*66);
        int t = e/3;
    }
}
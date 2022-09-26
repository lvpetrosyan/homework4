public class Main {
    public static void main(String[] args) {
//задание1
        System.out.println("задание 1");
        byte age = 18;
        if (age >=18) { System.out.println("поздравляем с совершеннолетием!");}
        if (age <18) { System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать.");}
        //задание2
        System.out.println("задание 2");
        int child = 7;
        if (child>=7) { System.out.println("ребенок ходит в школу");}
        if (child<7) {System.out.println("ребенок не ходит в школу");}

        byte student = 18;
        if (student>=18) { System.out.println("человек уже закончил школу и может отправляться в университет"); }

        byte young = 24;
        if (young>=24) { System.out.println("человек окончил университет и ему пора искать первую работу"); }
        //задание 3
     System.out.println("задание 3");
        int all = 102;
        int sit = 62;
        int standUpp = 42;
        if (sit>60) { System.out.println("сидячх мест нет");}
        if (standUpp>42) { System.out.println("стоячих мест нет"); }
        if (sit>60 || standUpp>42) { System.out.println("мест нет"); } //вариант1
        if (all>102) { System.out.printf("вагон полностью забит");} //вариант2






    }
}
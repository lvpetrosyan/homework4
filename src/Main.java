public class Main {
    public static void main(String[] args) {
//задание1
        System.out.println("задание 1");
        byte age = 16;
        if (age >=18) { System.out.println("поздравляем с совершеннолетием!");}
        if (age <18) { System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать.");}
        //задание2
        System.out.println("задание 2");
        int child = 7;
        if (child>=7 && child <18) { System.out.println("ребенок ходит в школу");}
        if (child<7 || child > 18 ) {System.out.println("ребенок не ходит в школу");}

        byte student = 18;
        if (student>=18 && student >24 ) { System.out.println("человек уже закончил школу и может отправляться в университет"); }

        byte young = 24;
        if (young>=24) { System.out.println("человек окончил университет и ему пора искать первую работу"); }
        //задание 3
     System.out.println("задание 3");
        int all = 102;
        int sit = 62;
        int standUpp = 40;
        if (sit>60) { System.out.println("сидячх мест нет");}
        if (standUpp>42) { System.out.println("стоячих мест нет"); }
        if (sit>60 || standUpp>42) { System.out.println("мест нет"); } //вариант1
        if (all>102) { System.out.printf("вагон полностью забит");} //вариант2

        // else задание 1
        System.out.println("задание 1");
        if (age >=18) { System.out.println ("поздравляем с совершеннолетием!");}
        else { System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать."); }

        // задание 2
        System.out.println("задание 2");

        if (child >=7 && child < 18) { System.out.println("ребенок ходит в школу"); } else { System.out.println("Ребенок не ходит в школу"); }
        if (student >=18 && student<24)
        { System.out.println("человек уже закончил школу и может отправляться в университет"); }
        else { System.out.println("человек не может отправляться в университет"); }
        if (young >=24) { System.out.println("человек окончил университет и ему пора искать первую работу"); }
        else { System.out.println("человек не закончил университет"); }

        // задание 3
        System.out.println("задание 3");
        if (sit>60) { System.out.println("сидячх мест нет");} else { System.out.println("место есть"); }
        if (standUpp>42) { System.out.println("стоячих мест нет"); } else { System.out.println("место есть"); }
        if (all>102) { System.out.printf("вагон полностью забит");} else { System.out.println("место есть"); }

        // задание 3.1
        System.out.println("задание 1");
        int people =15;
        if (people>2 && people<6) { System.out.println("Если возраст человека равен " + people +", то ему нужно ходить в детский сад");}
        else if (people <18 && people>7) { System.out.println("Если возраст человека равен " + people +", то ему  нужно ходить в школу");}
        else if (people >24) { System.out.println("Если возраст человека равен " + people +", то ему пора ходить на работу");}
// задание 2
        System.out.println("задание 2");
        int children = 8;
        if (children<5) { System.out.println("он не может кататься на аттракционе"); }
        else if (children>5 && children<14) { System.out.println("может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        else if (children>14) { System.out.println("может кататься без сопровождения взрослого"); }
// задание 3
        System.out.println("задание 3");
        int one = 10;
        int two = 7;
        int free =15;
      if (one>two && one>free) { System.out.println("самое большое число " +one); }
        else if (two>free && two>one) { System.out.println("самое большое число " +two); }
        else if (free>two && free>one) { System.out.println("самое большое число " +free); }



         }






    }

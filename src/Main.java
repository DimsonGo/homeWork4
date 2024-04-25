public class Main {
    public static void main(String[] args) {
        System.out.println("Task number one");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", значит он уже достиг совершеннолетия");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он еще не совершеннолетний");
        }

        System.out.println();
        System.out.println("Task number two");
        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, достаточно холодно, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно выходить без шапки");
        }

        System.out.println();
        System.out.println("Task number three");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость составляет более 60 км/ч, то придет штраф. Ваша скорость равна " + speed +
                    " км/ч. Вам нужно заплатить штраф немедленно");
        }
        if (speed <= 60) {
            System.out.println("Ваша скорость составляет " + speed + " км/ч. Вам не стоит беспокоиться, вам не придёт штраф");
        }

        System.out.println();
        System.out.println("Task number four");
        int agePeople = 25;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " годам, то ему нужно ходить в детский сад");
        } else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + " годам, то нужно ходить в школу");
        } else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + " годам, то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + agePeople + " годам, то уже пора ходить на работу");
        }

        System.out.println();
        System.out.println("Task number five");
        int ageAttraction = 15;
        if (ageAttraction <= 5) {
            System.out.println("Ребенок не может кататься, поскольку ему или 5 или менее 5 лет");
        } else if (ageAttraction > 5 && ageAttraction <= 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослых");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослых");
        }

        System.out.println();
        System.out.println("Task number six");
        int capacityCar = 103;
        if (capacityCar <= 60) {
            System.out.println("В вагоне есть сидячие места, " + (60 - capacityCar) + " мест осталось");
        } else if (capacityCar > 60 && capacityCar <= 102) {
            System.out.println("в вагоне остались только стоячие места, " + (102 - capacityCar) + " свободных места осталось");
        } else {
            System.out.println("В вагоне совсем нет места");
        }

        System.out.println();
        System.out.println("Task number Seven");
        int one = 4;
        int two = 5;
        int three = 9;
        boolean numOne = one > two && one > three;
        boolean numTwo = two < one && two > three;
        boolean numThree = three > one && three > two;
        if (numOne) {
            System.out.println("Самое большое число" + numOne);
        } else if (numTwo) {
            System.out.println("Самое большое число" + numTwo);
        } else {
            System.out.println("Самое большое число " + three);
        }

//Изначально решение 7 задание было таким, оно верное? Я проверя все работает, но гпт сказал мол оно неполноценное.
        /*  System.out.println( );
        System.out.println("Task number Seven");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean numOne = one > two;
        boolean numTwo = two > three;
        boolean numThree = one < three;
            if (numOne){
                System.out.println("Я не отображусь");
            } else if (numTwo){
                System.out.println("я тоже отображусь");
            } else{
                System.out.println("Самое большое число " + three);
            }*/

    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 4");
//Задача 1
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

//Задача 2
        System.out.println("Задача 2");
        int grad = 12;
        if (grad > 5) {
            System.out.println("На улице " + grad + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + grad + " градусов, нужно надеть шапку");
        }

//Задача 3
        System.out.println("Задача 3");
        int speed = 58;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штрав");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
//Задача 4
        System.out.println("Задача 4");
        int agePeople = 12;
        if (agePeople >= 2 && agePeople <= 6 ){
            System.out.println("Если возраст человека "+ agePeople + " ,то ему нужно ходить в детский сад");
        }  else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека "+ agePeople + " ,то ему нужно ходить в школу");
        } else if (agePeople >= 18 && agePeople <=24) {
            System.out.println("Если возраст человека "+ agePeople + " ,то ему нужно ходить в университет");
        } else {System.out.println("Если возраст человека "+ agePeople + " ,то ему нужно ходить на работу");
        }

//Задача 5
        System.out.println("Задача 5");
        int ageBaby =12;
        if (ageBaby < 5){
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на атракционе");
        } else if (ageBaby >= 5 && ageBaby < 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на атракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на атракционе без сопровождения взрослых");
        }

//Задача 6
        System.out.println("Задача 6");
        int place = 102;
        int seatingPlace = 60;
        int passenger = 58;
        int standing = place - seatingPlace;
        if (passenger > place) {
            int extraPeople = passenger - place;
            System.out.println("Не влезли " + extraPeople + " человек");
        } else if (passenger == place) {
            System.out.println("Вагон полон");
        } else if (passenger < place && passenger > seatingPlace) {
            int standPlace = place - passenger;
            System.out.println("Осталось " + standPlace + " стоячих мест");
        } else if (passenger == seatingPlace) {
            System.out.println("Осталось только " + standing + " стоячих мест");
        } else {
            int seatPlace = seatingPlace - passenger;
            System.out.println("Осталось " + seatPlace + " сидячих мест и " + standing + " стоячих мест");
        }
//Задача 7
        System.out.println("Задача 7");
        int one = 4;
        int two = 28;
        int three = 27;
        if (one>two && one>three) {
            System.out.println("Наибольшее число one");
        } else if (two>one && two>three) {
            System.out.println("Наибольшее число two");
        } else {
            System.out.println("Наибольшее число three");
        }

    }
}
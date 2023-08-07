// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        short age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float temperature = 32f;
        if (temperature < 5f){
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        float speed = 66f;
        if (speed > 60f){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short age = 25;
        boolean baby = age < 2;
        boolean child = age >= 2 && age <= 6;
        boolean schoolStudent = age >= 7 && age <= 18;
        boolean univercityStudent = age > 18 && age <= 24;
        // в задаче "меньше 24", но тогда пропадает вывод при значении 24
        boolean adult = age > 24 && age <= 60;
        if (baby){
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        }else if (child){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }else if (schoolStudent){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }else if (univercityStudent){
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }else if (adult){
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short ageOfChild = 13;
        boolean cannotGo = ageOfChild < 5;
        boolean canGoWithParents = ageOfChild >= 5 && ageOfChild < 14;
        if (cannotGo){
            System.out.println("Eсли возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");
        } else if (canGoWithParents){
            System.out.println("Eсли возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Eсли возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte allPlaces = 102;
        byte seats = 60;
        int standingPlaces =  allPlaces - seats;
        //Задаю значения для примера
        byte bookedSeats = 60;
        byte bookedStandingPlaces = 32;
        boolean seatAvailable = (seats - bookedSeats) > 0;
        boolean standingPlaceAvailable = (standingPlaces - bookedStandingPlaces) > 0;
        if (seatAvailable && standingPlaceAvailable){
            System.out.println("В вагоне есть места, сидячее и стоячее");
        } else if (seatAvailable) {
            System.out.println("В вагоне есть место, сидячее");
        } else if (standingPlaceAvailable){
            System.out.println("В вагоне есть место, стоячее");
        } else {
            System.out.println("В вагоне мест нет");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean oneIsTheBiggest = one >= two && one >= three; //Могут содержаться одинаковые значения, главное - вывод наибольшего из заданных
        boolean twoIsTheBiggest = two >= three && two >= one;
        if (oneIsTheBiggest){
            System.out.println("Наибольшее число - " + one);
        } else if (twoIsTheBiggest) {
            System.out.println("Наибольшее число - " + two);
        } else {
            System.out.println("Наибольшее число - " + three);
        }
    }
}
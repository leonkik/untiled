import java.util.Scanner;

public class Main {
    static int year = 1;
    static Object anw;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExhibitionOfCars exhibitionOfCars = new ExhibitionOfCars();
        while (true) {

            exhibitionOfCars.setYear(0);// default value is 4000
            exhibitionOfCars.showCars();
            scanner.nextLine();
        }
        //машины вооспроизводяться по их релиз дате краткая таблица ниже
        // (значения по умолчанию хватает)

            /*
            * cheapCar :2004
            * TimeCar : 2200
            * HomeMadeCar : 2018(Nelly)
            * ExpensiveCar: 2000
            * */



    }
}
import cars.*;

import java.time.Year;

public class ExhibitionOfCars {
    CheapCar cheapCar;
    ExpensiveCar expensiveCar;
    HomeMadeCar homeMadeCar;
    TimeCar timeCar;

    WeekDay weekDay;
    DeafoltCar[] cars;
    int year ;

    public ExhibitionOfCars() {
        cheapCar = new CheapCar();
        expensiveCar = new ExpensiveCar();
        homeMadeCar = new HomeMadeCar();
        timeCar = new TimeCar();
        if (weekDay == null) {
            weekDay = WeekDay.Monday;
        }
        cars = new DeafoltCar[]{cheapCar, expensiveCar, homeMadeCar, timeCar};

    }

    public void test() {
        System.out.println(cheapCar.releaseDate);

    }

    public void showCars() {
        if(year == 0){
            year = 4000;
        }
        for (int i = 0; i < cars.length; i++) {
            if (year >= cars[i].releaseDate) {
                cars[i].printAboutCar();
                if (cars[i] instanceof TimeCar) {
                    ((TimeCar) cars[i]).warp(2000);
                    ((TimeCar) cars[i]).fly();
                    ((TimeCar) cars[i]).carIsDrive();
                    ((TimeCar) cars[i]).LowerRoof();
                    ((TimeCar) cars[i]).openDoor();
                }
                if (cars[i] instanceof  ExpensiveCar) {
                    ((ExpensiveCar) cars[i]).LowerRoof();
                    ((ExpensiveCar) cars[i]).openDoor();
                    ((ExpensiveCar) cars[i]).carIsDrive();
                    ((ExpensiveCar) cars[i]).jump();
                }
                if(cars[i] instanceof CheapCar){
                    ((CheapCar) cars[i]).openDoor();
                    ((CheapCar) cars[i]).carIsDrive();

                }
                if (cars[i] instanceof HomeMadeCar) {
                    ((HomeMadeCar) cars[i]).carIsDrive();
                    ((HomeMadeCar) cars[i]).LowerRoof();
                    ((HomeMadeCar) cars[i]).openDoor();

                }
            }


        }
        switch (weekDay) {
            case Monday:
                if(year >= 1899){
                    year+=1;
                }
                System.out.println(WeekDay.Monday +" year "+year);
                weekDay =  WeekDay.Tuesday;
                break;
            case Tuesday:
                year += 1;
                System.out.println(WeekDay.Tuesday+" year "+year);
                weekDay =  WeekDay.Wednesday;
                break;
            case Wednesday:
                year += 1;
                System.out.println(WeekDay.Wednesday+" year "+year);
                weekDay =  WeekDay.Thursday;
                break;
            case Thursday:
                year += 1;
                System.out.println(WeekDay.Thursday+" year "+year);
                weekDay = WeekDay.Friday;
                break;
            case Friday:
                year += 1;
                System.out.println(WeekDay.Friday+" year "+year);
                weekDay = WeekDay.Saturday;
                break;
            case Saturday:
                year += 1;
                System.out.println(WeekDay.Saturday+" year "+year);
                weekDay = WeekDay.Sunday;
                break;
            case Sunday:
                year += 1;
                System.out.println(WeekDay.Sunday+" year "+year);
                weekDay = WeekDay.Monday;
                break;
        }




    }
    public void setYear(int b){
        year = b;
    }

}

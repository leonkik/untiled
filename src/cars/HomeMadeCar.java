package cars;

import cars.DeafoltCar;

public class HomeMadeCar extends DeafoltCar {
    public HomeMadeCar() {
        super(4, 60, 50, 1600, 170, 2018, "Nelly", 1800);
    }
    public void carIsDrive(){
        System.out.println(name + " is Drive");
    }
    public void openDoor(){
        System.out.println(name +" door is open");
    }
    public void LowerRoof(){
        System.out.println(name +" car is Lower the roof");
    }

}

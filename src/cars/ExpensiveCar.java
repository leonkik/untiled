package cars;

import cars.DeafoltCar;

public class ExpensiveCar extends DeafoltCar {
    public ExpensiveCar() {
        super(4, 300, 500, 1600, 160, 2000, "Expencive", 16000);
    }
    public void carIsDrive(){
        System.out.println(name + " is Drive");
    }
    public void LowerRoof(){
        System.out.println(name +" car is Lower the roof");
    }
    public void openDoor(){
        System.out.println(name +" door is open");
    }
    public void jump(){
        System.out.println( name + " is jumping");
    }
}

package cars;

public class TimeCar extends DeafoltCar {
    public TimeCar() {
        super(4, 500, 700, 6000, 190, 2200, "Delorean", 80000);
    }
    public void warp(int age){
        System.out.println(name+" is warp in" + age);
    }
    public void openDoor(){
        System.out.println(name +" door is open");
    }
    public void carIsDrive(){
        System.out.println(name + " is Drive");
    }
    public void LowerRoof(){
        System.out.println(name +" car is Lower the roof");
    }
    public void fly(){
        System.out.println(name + " is flying");
    }
}

package cars;

public class CheapCar extends DeafoltCar {
    public CheapCar() {
        super(2, 10, 5, 1000, 130, 2004, "cheap car", 10000);
    }
    public void openDoor(){
        System.out.println(name +" door is open");
    }
    public void carIsDrive(){
        System.out.println(name + " is Drive");
    }
}

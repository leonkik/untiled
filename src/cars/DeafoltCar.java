package cars;

public class DeafoltCar {
    protected int wheels;
    protected int maxSpeed;
    protected int horsePower;
    protected int weight;
    protected int height;
    public int releaseDate;
    public String name;
    protected int price;

    public DeafoltCar(int wheels, int maxSpeed, int horsePower, int weight,
                      int height, int releaseDate,String name, int price){
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public void printAboutCar() {
        System.out.println("wheels: "+wheels+" "+"maxSpeed:"+maxSpeed+" "+"horsePower:"+
                horsePower+" "+"weight:"+weight+" "+"height:"+height+" "+"name:"+name+" "+ "price"+price);
    }

}

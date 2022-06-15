import java.util.Arrays;

public class DealerShip {
    private Car[] cars;
    
    public DealerShip(){
        this.cars = new Car[3];
        System.out.println(Arrays.toString(this.cars));
    }
    public void setCart(Car car, int index){
        this.cars[index] = new Car(car);
    }
}

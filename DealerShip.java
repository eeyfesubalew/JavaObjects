import java.util.Arrays;

public class DealerShip {
    private Car[] cars;
    
    public DealerShip(){
        this.cars = new Car[3];
        System.out.println(Arrays.toString(this.cars));
    }
    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index){
        return new Car(this.cars[index]);
    }

    public String searchCar(String make,int budget){
        for (int i = 0; i < cars.length; i++) {
            if(this.cars[i]==null){
                continue;
            }
            if(this.cars[i].getMake().equals(make) && this.cars[i].getPrice()<=budget){
                return "\n We foung one "+i+"\n"+ this.cars[i].toString();
            }
        }
        return "Sorry we couldn't find any cars";
    }
}

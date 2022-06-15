
public class Main{
    public static void main(String[] args) {
        String[] parts={"Key","Tires"};

        Car[] cars = new Car[]{
            new Car("Nissan",5000,2020,"Black",parts),
            new Car("Nissan",5000,2021,"Yellow",parts),
            new Car("Ford",5000,2020,"Black",parts),
        };

        DealerShip dealerShip = new DealerShip();
        for (int i = 0; i < cars.length; i++) {
            dealerShip.setCar(cars[i], i);
        }

        Car newCar = dealerShip.getCar(0);
        System.out.println(dealerShip.searchCar("Ford", 5000));

    }
}
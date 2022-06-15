import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String[] parts={"Key","Tires"};
        Car nissan = new Car("Nissan",5000,2020,"Black",parts);
        nissan.setColor("red");
        Car nisssan2 = new Car(nissan);
        nisssan2.setColor ("yellow");
      
     
        nissan.drive();

        DealerShip dealerShip = new DealerShip();

        // dealerShip.setCars(nissan,0)
        // dealerShip.setCars(nisssan2,1)
      

        // System.out.println(nisssan2.getMake());
        // System.out.println(nisssan2.getColor());
    }
}
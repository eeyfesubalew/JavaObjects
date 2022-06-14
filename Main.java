import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String[] parts={"Key","Tires"};
        Car nissan = new Car("Nissan",5000,2020,"Black",parts);
        nissan.setColor("red");
        Car nisssan2 = new Car(nissan);
        nisssan2.setColor ("yellow");
      
     
        nissan.drive();
        nisssan2.setParts(new String[]  {"tires","filter"});
        System.out.println(Arrays.toString(nissan.getParts()));
        System.out.println(Arrays.toString(nisssan2.getParts()));
    
        System.out.println(nissan);
        System.out.println(nisssan2);

        // System.out.println(nisssan2.getMake());
        // System.out.println(nisssan2.getColor());
    }
}
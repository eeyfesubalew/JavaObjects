public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"Black");
        nissan.setColor("red");
        Car nisssan2 = new Car(nissan);
        nisssan2.setColor ("yellow");

        double newPrice =nissan.getPrice()/2;
        nissan.setPrice(newPrice);
        System.out.println(nissan.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getColor());
        System.out.println(nisssan2.getMake());
        System.out.println(nisssan2.getColor());
    }
}
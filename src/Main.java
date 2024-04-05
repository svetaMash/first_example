import Test.LicensePlate;
import Test.LicensePlateMaker;

public class Main {
    public static void main(String[] args) {
        LicensePlateMaker lisplate1maker = new LicensePlateMaker("CA");
        LicensePlate lp1 = new LicensePlate(lisplate1maker.makeNextPlate());
        LicensePlate lp2 = new LicensePlate(lisplate1maker.makeNextPlate());
        LicensePlate lp3 = new LicensePlate(lisplate1maker.makeNextPlate());

        LicensePlateMaker lisplate2maker = new LicensePlateMaker("NY");
        LicensePlate lp4 = new LicensePlate(lisplate2maker.makeNextPlate());
        LicensePlate lp5 = new LicensePlate(lisplate2maker.makeNextPlate());
        LicensePlate lp6 = new LicensePlate(lisplate2maker.makeNextPlate());

        System.out.println(lp1.getPlate());
        System.out.println(lp1.getPlate() +" "+  lp2.getPlate() +" "+ lp3.getPlate() +" "+ lp4.getPlate() +" "+ lp5.getPlate() +" "+ lp6.getPlate());

    }
}

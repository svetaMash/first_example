package Test;

public class LicensePlateMaker {
    private String prefix;
    private  int index = 0 ;

    public LicensePlateMaker(String prefix) {
        this.prefix = prefix;
    }


    public String makeNextPlate(){
        index++;
        return this.prefix + "-" + index;
    }
}
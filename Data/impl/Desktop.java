package Data.impl;
import Data.Computer;

public class Desktop extends Computer {

    private Integer powerSupply;

    public Desktop(String sn, String producer, String color, Integer powerSupply) {
        super(sn, producer, color);
        this.powerSupply = powerSupply;
    }

    public Integer getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Integer powerSupply) {
        this.powerSupply = powerSupply;
    } 

    @Override
    public String toString() {

        return "Desktop{" + getSn() + " " + getProducer() + " " + getColor() + " " + getPowerSupply() + "}";
    }
}

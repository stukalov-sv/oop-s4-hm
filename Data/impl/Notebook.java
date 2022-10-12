package Data.impl;
import Data.Computer;

public class Notebook extends Computer{

    private Integer batteryCapacity;

    public Notebook(String sn, String producer, String color, Integer batteryCapacity) {
        super(sn, producer, color);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {

        return "Notebook{" + getSn() + " " + getProducer() + " " + getColor() + " " + getBatteryCapacity() + "}";
    }
}

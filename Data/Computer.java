package Data;
public abstract class Computer {
    String sn;
    String producer;
    String color;
    
    public Computer(String sn, String producer, String color) {
        this.sn = sn;
        this.producer = producer;
        this.color = color;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

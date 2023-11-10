package bg.smg;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{
    private int id;
    private double area;
    private Date whenBuilt;

    House(int id, double area, Date whenBuilt){
        this.id = id;
        this.area = area;
        this.whenBuilt = whenBuilt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public void setWhenBuilt(Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        House houseClone = (House)super.clone();
        houseClone.whenBuilt= (Date) whenBuilt.clone();
        return houseClone;
    }

    @Override
    public int compareTo(House o) {
        return 0;
    }
}

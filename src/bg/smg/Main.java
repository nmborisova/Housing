package bg.smg;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        House h = new House(1, 102.45, new Date(2020,2,1));
        House h1 = h;
        House h2 = (House) h.clone();
        h2.setArea(200.10);
        System.out.println(h1.getArea()+ " "+ h2.getArea());
    }
}

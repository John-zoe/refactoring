package section.catalog.creational.fm;

public class Truck implements Transport {

    @Override
    public void delivery() {
        System.out.println("delivery cargo by road");
    }
}

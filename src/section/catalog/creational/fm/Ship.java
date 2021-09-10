package section.catalog.creational.fm;

public class Ship implements Transport {

    @Override
    public void delivery() {
        System.out.println("deliver cargo by sea");
    }
}

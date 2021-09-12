package section.catalog.creational.singleton;

public class BlockSingleton {

    private static final BlockSingleton singleton;

    private BlockSingleton() {
    }

    static {
        try {
            singleton = new BlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static BlockSingleton getInstance() {
        return singleton;
    }

}

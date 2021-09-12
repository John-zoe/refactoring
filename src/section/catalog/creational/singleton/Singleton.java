package section.catalog.creational.singleton;

public class Singleton {

    private static Singleton instance;

    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    //lazy initialization
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    //thread-safe Singleton with lazy loading
    public static Singleton getInstanceThreadSafe(String value) {
        if (instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

}

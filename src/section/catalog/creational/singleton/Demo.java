package section.catalog.creational.singleton;

public class Demo {

    public static void main(String[] args) {
//        singleThread();
        multiThread();
    }

    private static void singleThread() {
        Singleton singleton1 = Singleton.getInstance("Foo");
        Singleton singleton2 = Singleton.getInstance("BAR");

        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }

    private static void multiThread() {
        Thread threadFoo = new Thread(() -> {
            Singleton singleton = Singleton.getInstanceThreadSafe("FOO");
            System.out.println(singleton.value);
        });

        Thread threadBar = new Thread(() -> {
            Singleton singleton = Singleton.getInstanceThreadSafe("Bar");
            System.out.println(singleton.value);
        });

        threadFoo.start();
        threadBar.start();
    }

}

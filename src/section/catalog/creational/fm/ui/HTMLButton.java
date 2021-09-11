package section.catalog.creational.fm.ui;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("return browser's style button.");
    }

    @Override
    public void onClick() {
        System.out.println("ok function call back.");
    }
}

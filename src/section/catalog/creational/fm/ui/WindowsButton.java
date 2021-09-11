package section.catalog.creational.fm.ui;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("return window's style button.");
    }

    @Override
    public void onClick() {
        System.out.println("ok function call back.");
    }
}

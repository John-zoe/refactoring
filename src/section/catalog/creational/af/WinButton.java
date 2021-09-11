package section.catalog.creational.af;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a button in Windows style.");
    }
}

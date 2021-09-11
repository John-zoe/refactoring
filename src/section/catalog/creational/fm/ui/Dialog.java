package section.catalog.creational.fm.ui;

public abstract class Dialog {

    void render() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }

    public abstract Button createButton();

}

package section.catalog.creational.af;

import section.catalog.creational.AppConfig;

import java.util.Objects;

public class ApplicationConfiguration {

    public static void main(String[] args) throws Exception {
        GUIFactory factory;

        AppConfig config = readApplicationConfigFile();

        if (Objects.equals(config.os, "Windows")) {
            factory = new WinFactory();
        } else if (Objects.equals(config.os, "Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();

    }

    private static AppConfig readApplicationConfigFile() {
        return new AppConfig("Windows");
//      return new AppConfig("Web");
    }

}

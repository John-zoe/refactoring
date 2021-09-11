package section.catalog.creational.fm.ui;

import section.catalog.creational.AppConfig;

import java.util.Objects;

public class Application {

   private static Dialog dialog;

   public static void main(String[] args) throws Exception {
      initialize();
      dialog.render();
   }

   public static void initialize() throws Exception {
      AppConfig config = readApplicationConfigFile();

      if (Objects.equals(config.os, "Windows")) {
         dialog = new WindowsDialog();
      } else if (Objects.equals(config.os, "Web")) {
         dialog = new WebDialog();
      } else {
         throw new Exception("Error! Unknown operating system.");
      }

   }

   private static AppConfig readApplicationConfigFile() {
      return new AppConfig("Windows");
//      return new AppConfig("Web");
   }

}

package org.drankfrabbin.maventest;

import org.drankfrabbin.maventest.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;

public class Application
{
   public static void main(String[] args) throws Exception
   {
      SpringApplication app = new SpringApplication(ApplicationConfiguration.class);
      app.setShowBanner(false);
      app.run(args);
   }
}

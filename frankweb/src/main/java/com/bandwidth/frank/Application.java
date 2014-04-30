package com.bandwidth.frank;

import org.springframework.boot.SpringApplication;

import com.bandwidth.frank.configuration.ApplicationConfiguration;

public class Application
{
   public static void main(String[] args) throws Exception
   {
      SpringApplication app = new SpringApplication(ApplicationConfiguration.class);
      app.setShowBanner(false);
      app.run(args);
   }
}

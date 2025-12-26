package application;

import application.MenuBehaviour;
import jakarta.persistence.Entity;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@ComponentScan(basePackages={"application", "repository", "model", "service"})
@EntityScan(basePackages={"model.types", "model.general_model"})
public class Main {
  public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
    ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
    try {
      MenuBehaviour menuBehaviour = context.getBean(MenuBehaviour.class);
      Object tyan = menuBehaviour.gameMenu(in);
      if (tyan != null)
        menuBehaviour.tyanMenu(tyan, in);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally{
      in.close();
    }
    
  }
}

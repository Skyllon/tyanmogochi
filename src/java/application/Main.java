package application;

import application.MenuBehaviour;
import jakarta.persistence.Entity;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@ComponentScan(basePackages={"application", "repository", "model", "service"})
@EntityScan(basePackages={"model.types", "model.general_model"})
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
    Scanner in =  new Scanner(System.in);
    Object tyan = MenuBehaviour.gameMenu(in);
    MenuBehaviour.tyanMenu(tyan, in);
    in.close();
  }
}

package application;

import application.MenuBehaviour;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
    Scanner in =  new Scanner(System.in);
    Object tyan = MenuBehaviour.gameMenu(in);
    MenuBehaviour.tyanMenu(tyan, in);
    in.close();
  }
}

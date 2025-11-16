package application;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
    Object tyan = MenuBehaviour.gameMenu(in);
    MenuBehaviour.tyanMenu(tyan, in);
    in.close();
  }
}

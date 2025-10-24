package src.java;
import java.util.Scanner;
import src.java.model.types.TsundereCharacter;
import src.java.model.types.YandereCharacter;
import src.java.model.types.CatgirlCharacter;
import src.java.model.types.MaidCharacter;
import src.java.model.general_model.states.*;

public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Set her name: ");
    String name = console.next();
    System.out.println("Set her surname: ");
    String surname = console.next();
    System.out.println("Set her age: ");
    int age = console.nextInt();
    TsundereCharacter tsundere = new TsundereCharacter(
      name,
      surname,
      null,
      age,
      50.0,
      50.0,
      50.0,
      true,
      true,
      MoodState.HAPPY,
      TyanType.YANDERE,
      false
    );
    while (true){
    System.out.println("What do you wanna do?~\n1.Feed\n2.Play\n3.Make a compliment\n4.Exit");
    try {
      int choice = console.nextInt();
      switch (choice) {
        case 1:
        System.out.println("Choose the type of food you wanna feed me ♡(>ᴗ•)\n1.Matcha latte\n2.Mochi\n3.Sushi\4.Tayaki\n5.Ramen");
          int food = console.nextInt();
          tsundere.feed();
          break;
        case 2:
        
          tsundere.play();
          break;
        case 3:
            String compliment = console.next();
          tsundere.sayCompliment();
          break;
        case 4:
        console.close();
          System.exit(0);
          break;
        default:
          System.out.println("Invalid input");
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid input");
    }
    }
  }
}
//TODO: add other girls
//TODO: make a list of grls to make a choice
// TODO: make functionally based play-mode(?)
// TODO: later will be calculated by type of food
package application;
import java.util.Scanner;
import model.types.TsundereCharacter;
import model.types.YandereCharacter;
import model.types.CatgirlCharacter;
import model.types.MaidCharacter;
import model.general_model.states.*;

public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    Object[] tyans = { TyanType.TSUNDERE, TyanType.YANDERE, TyanType.MAID, TyanType.CATGIRL };
    System.out.println("Choose your chan (･ω<)☆\n1.Tsundere\n2.Yandere\n3.Maid\n4.Catgirl");
    int chanChoice = console.nextInt();
    console.nextLine();
    System.out.print("Set her name: ");
    String name = console.nextLine();
    System.out.print("Set her surname: ");
    String surname = console.nextLine();
    System.out.print("Set her age: ");
    int age = console.nextInt();
    console.nextLine();
    
    Object chan=null;
    try {
      switch (chanChoice){
        case 1:
          TsundereCharacter tsundere = new TsundereCharacter(
                name, surname, null, age, 50.0, 50.0, 50.0,
                true, true, MoodState.HAPPY, TyanType.TSUNDERE, false
            );
            tsundere.setName(name);
            tsundere.setSurname(surname);
            tsundere.setAge(age);
            chan = tsundere;
            break;
        case 2:
          YandereCharacter yandere = new YandereCharacter(
                name, surname, null, age, 50.0, 50.0, 50.0,
                true, true, MoodState.HAPPY, TyanType.YANDERE
            );
            yandere.setName(name);
            yandere.setSurname(surname);
            yandere.setAge(age);
            chan = yandere;
            break;
        case 3:
          MaidCharacter maid = new MaidCharacter(
                name, surname, null, age, 50.0, 50.0, 50.0,
                true, true, MoodState.HAPPY, TyanType.MAID
            );
            maid.setName(name);
            maid.setSurname(surname);
            maid.setAge(age);
            chan = maid;
            break;
        case 4:
          CatgirlCharacter catgirl = new CatgirlCharacter(
                name, surname, null, age, 50.0, 50.0, 50.0,
                true, true, MoodState.HAPPY, TyanType.CATGIRL
            );
            catgirl.setName(name);
            catgirl.setSurname(surname);
            catgirl.setAge(age);
            chan = catgirl;
            break;
        default:
          throw new IllegalArgumentException("Invalid input");
      }

    } catch (NumberFormatException e){
      System.out.println("Invalid input");
    }

    while (true){
      if (chan instanceof TsundereCharacter){
        TsundereCharacter tsundere = (TsundereCharacter) chan;
        System.out.println("\n"+"-".repeat(20));
        System.out.println("\nYour: "+tsundere.getName()+" "+tsundere.getSurname()+"♡");
        System.out.println("-".repeat(20));
        System.out.println("HUNGER: "+tsundere.getHunger());
        System.out.println("ENERGY: "+tsundere.getEnergy());
        System.out.println("HORNY: "+tsundere.getHorny());
        System.out.println("MOOD: "+tsundere.getMood());
        System.out.println("-".repeat(20)+"\n");
      }
    System.out.println("What do you wanna do?~\n1.Feed\n2.Play\n3.Make a compliment\n4.Exit");
    try {
      int choice = console.nextInt();
      switch (choice) {
        case 1:
        System.out.println("Choose the type of food you wanna feed me ♡(>ᴗ•)\n1.Matcha latte\n2.Mochi\n3.Sushi\n4.Tayaki\n5.Ramen");
          int food = console.nextInt();
          console.nextLine();
          if (chan instanceof TsundereCharacter){
            ((TsundereCharacter) chan).feed();
          }
          break;
        case 2:
        
          if (chan instanceof TsundereCharacter){
            ((TsundereCharacter) chan).play();
          }
          break;
        case 3:
            String compliment = console.next();
            if (chan instanceof TsundereCharacter){
              ((TsundereCharacter) chan).sayCompliment();
            }
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
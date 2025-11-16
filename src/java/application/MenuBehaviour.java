package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

import model.general_model.states.MoodState;
import model.general_model.states.TyanType;
import model.types.*;

public class MenuBehaviour {
  public static Object gameMenu(Scanner in) {
    Random  rand                = new Random();
    Integer tyanType            = 0;
    Integer tyanAge             = 0;
    String  tyanName            = null;
    String  tyanSurname         = null;
    Object chan                 = null;
    final Double randLowerBound = 0.;
    final Double randUpperBound = 1e2;

    // Tyan choice
    System.out.println("Choose your chan (･ω<)☆\n1.Tsundere\n2.Yandere\n3.Maid\n4.Catgirl");
    while (true) {
      try {
        tyanType = in.nextInt();

        if (tyanType >= (1 << 1) - 1 && tyanType <= (1 << 2)) break;
        else System.out.printf("Your choice should be from 1 to 4!\n");
      } catch (InputMismatchException e) {
        System.out.printf("Input should be a value!\n");
        in.next();
      }
    }
    in.nextLine();

    // Tyan name
    System.out.print("Set tyan name: ");
    while (true) {
      tyanName = in.nextLine();

      if (!tyanName.isEmpty()) break;
      else System.out.printf("Name shouldn't be empty\n");
    }

    // Tyan surname
    System.out.print("Set tyan surname: ");
    while (true) {
      tyanSurname = in.nextLine();

      if (!tyanSurname.isEmpty()) break;
      else System.out.printf("Name shouldn't be empty\n");
    }

    // Tyan age
    System.out.print("Set tyan age: ");
    while (true) {
      try {
        tyanAge = in.nextInt();

        if (tyanAge >= (1 << 4) - 1 && tyanAge <= 1e2) break;
        else System.out.printf("Age of tyan should be from 15 to 100\n");
      } catch(InputMismatchException e) {
        System.out.printf("Age should be a value!\n");
        in.next();
      }
    }

    try {
      switch (tyanType) {
        case 1:
          TsundereCharacter tsundere = new TsundereCharacter(
            tyanName,
            tyanSurname,
            "No. No.. You're just kidding. Baka",
            tyanAge,
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            true,
            true,
            MoodState.HAPPY,
            TyanType.TSUNDERE,
            false
          );
          tsundere.setName(tyanName);
          tsundere.setSurname(tyanSurname);
          tsundere.setAge(tyanAge);
          chan = tsundere;
          break;
        case 2:
          YandereCharacter yandere = new YandereCharacter(
            tyanName,
            tyanSurname,
            "I kill everyone for you!!! V_V",
            tyanAge,
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            true,
            true,
            MoodState.HAPPY,
            TyanType.YANDERE
          );
          yandere.setName(tyanName);
          yandere.setSurname(tyanSurname);
          yandere.setAge(tyanAge);
          chan = yandere;
          break;
        case 3:
          MaidCharacter maid = new MaidCharacter(
            tyanName,
            tyanSurname,
            "Whatever you say, my lord!",
            tyanAge,
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            true,
            true,
            MoodState.HAPPY,
            TyanType.MAID
          );
          maid.setName(tyanName);
          maid.setSurname(tyanSurname);
          maid.setAge(tyanAge);
          chan = maid;
          break;
        case 4:
          CatgirlCharacter catgirl = new CatgirlCharacter(
            tyanName,
            tyanSurname,
            "Murrr meooow",
            tyanAge,
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            randLowerBound + (randUpperBound - randLowerBound) * rand.nextDouble(),
            true,
            true,
            MoodState.HAPPY,
            TyanType.CATGIRL
          );
          catgirl.setName(tyanName);
          catgirl.setSurname(tyanSurname);
          catgirl.setAge(tyanAge);
          chan = catgirl;
          break;
        default:
          throw new IllegalArgumentException("Invalid input");
      }
    } catch (NumberFormatException e){
      System.out.println("Invalid input");
    }

    return chan;
  }

  public static void tyanMenu(Object chan, Scanner in) {
    Integer userChoice = 0;

    while (true) {
      try {
        if (chan instanceof TsundereCharacter) {
          TsundereCharacter tsundere = (TsundereCharacter) chan;
          System.out.println("\n" + "-".repeat(20));
          System.out.println("\nYour " + tsundere.getName() +
          " " + tsundere.getSurname() + " ♡ " + tsundere.getAge() + " years old");
          System.out.println("-".repeat(20));
          System.out.println("HUNGER: " + tsundere.getHunger());
          System.out.println("ENERGY: " + tsundere.getEnergy());
          System.out.println("HORNY: " + tsundere.getHorny());
          System.out.println("MOOD: " + tsundere.getMood().tyanmodji());
          System.out.println("-".repeat(20) + "\n");
        } else if (chan instanceof YandereCharacter) {
          YandereCharacter yandere = (YandereCharacter) chan;
          System.out.println("\n" + "-".repeat(20));
          System.out.println("\nYour " + yandere.getName() + " " + yandere.getSurname() + " ♡"+yandere.getAge()+" "+" years old");
          System.out.println("-".repeat(20));
          System.out.println("HUNGER: " + yandere.getHunger());
          System.out.println("ENERGY: " + yandere.getEnergy());
          System.out.println("HORNY: " + yandere.getHorny());
          System.out.println("MOOD: " + yandere.getMood().tyanmodji());
          System.out.println("-".repeat(20) + "\n");
        } else if (chan instanceof MaidCharacter) {
          MaidCharacter maid = (MaidCharacter) chan;
          System.out.println("\n" + "-".repeat(20));
          System.out.println("\nYour " + maid.getName() + " " + maid.getSurname() + " ♡"+maid.getAge()+" "+" years old");
          System.out.println("-".repeat(20));
          System.out.println("HUNGER: " + maid.getHunger());
          System.out.println("ENERGY: " + maid.getEnergy());
          System.out.println("HORNY: " + maid.getHorny());
          System.out.println("MOOD: " + maid.getMood().tyanmodji());
          System.out.println("-".repeat(20) + "\n");
        } else if (chan instanceof CatgirlCharacter) {
          CatgirlCharacter catgirl = (CatgirlCharacter) chan;
          System.out.println("\n" + "-".repeat(20));
          System.out.println("\nYour " + catgirl.getName() + " "
            + catgirl.getSurname() + " ♡ " + catgirl.getAge()+ " years old");
          System.out.println("-".repeat(20));
          System.out.println("HUNGER: " + catgirl.getHunger());
          System.out.println("ENERGY: " + catgirl.getEnergy());
          System.out.println("HORNY: " + catgirl.getHorny());
          System.out.println("MOOD: " + catgirl.getMood().tyanmodji());
          System.out.println("-".repeat(20) + "\n");
        }

         System.out.println("What do you want to do?\n" +
          "1.Feed\n" +
          (chan instanceof MaidCharacter ? "2.Cook for me woman <3\n" : "2.Play\n") +
          "3.Make a compliment\n" +
          "4.Exit");

        userChoice = in.nextInt();

        switch(userChoice) {
          case 1:
            System.out.println("Choose the type of food you wanna feed me ♡(>ᴗ•)\n1.Matcha latte\n2.Mochi\n3.Sushi\n4.Tayaki\n5.Ramen");
            int food = in.nextInt();
            in.nextLine();
            if (chan instanceof TsundereCharacter)
              ((TsundereCharacter) chan).feed(food);
            else if (chan instanceof YandereCharacter)
              ((YandereCharacter) chan).feed(food);
            else if (chan instanceof MaidCharacter)
              ((MaidCharacter) chan).feed(food);
            else if (chan instanceof CatgirlCharacter)
              ((CatgirlCharacter) chan).feed(food);
            break;
          case 2:
            if (chan instanceof TsundereCharacter)
              ((TsundereCharacter) chan).play();
            else if (chan instanceof YandereCharacter)
              ((YandereCharacter) chan).play();
            else if (chan instanceof CatgirlCharacter)
              ((CatgirlCharacter) chan).play();
            else if (chan instanceof MaidCharacter)
              ((MaidCharacter) chan).cook();
            break;
          case 3:
            in.nextLine();
            System.out.println("Say something romantic to your tyan: ");
            in.nextLine();
            if (chan instanceof TsundereCharacter)
              ((TsundereCharacter) chan).sayCompliment();
            else if (chan instanceof YandereCharacter)
              ((YandereCharacter) chan).sayCompliment();
            else if (chan instanceof MaidCharacter)
              ((MaidCharacter) chan).sayCompliment();
            else if (chan instanceof CatgirlCharacter)
              ((CatgirlCharacter) chan).sayCompliment();
            break;
          case 4:
            return;
          default:
            System.out.println("Enter value from 1 to 4");
        }
      } catch(InputMismatchException e) {
        System.out.printf("You should enter a value!\n");
        in.next();
      }
    }
  }
}

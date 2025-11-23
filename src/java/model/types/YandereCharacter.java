package model.types;

import model.general_model.BaseCharacter;
import model.general_model.states.*;
import model.interfaces.Playable;

public class YandereCharacter
extends BaseCharacter
implements Playable
{
  public YandereCharacter(
    String    name,
    String    surname,
    String    lovelyPhrase,
    Integer   age,
    Double    hunger,
    Double    energy,
    Double    horny,
    Boolean   isFeedable,
    Boolean   isPlayable,
    MoodState mood,
    TyanType  type
  ) {
    super(
      name,
      surname,
      lovelyPhrase,
      age,
      hunger,
      energy,
      horny,
      isFeedable,
      isPlayable,
      mood,
      type
    );
  }

  public void play() {
    this.energy -= 5.;
    this.hunger += 10.5;
    this.horny += 3.5;
    stats();

  }
  public void sayCompliment() {
    if (mood == MoodState.ANGRY) {
      System.out.println("NOT ENOUGH!!!!!");
      this.horny -= 10.5;
      System.out.printf("[NEWS]: a girl was killed by student called %s %s\n",
      this.name, this.surname);
    }
    if (mood == MoodState.HAPPY) {
      this.horny += 10.5;
      System.out.println("You are my only one...");
    }
    if (mood==MoodState.HORNY) {
      this.horny += 15.5;
      System.out.println("You're so so so hot, man!");
    }
    if (mood==MoodState.PLAYFUL) {
      this.horny += 5.5;
      System.out.println("Oh, do u wanna play?");
    }
    if (mood==MoodState.TIRED || mood==MoodState.SAD) {
      this.horny += 5.5;
      System.out.println("You're so sweet.. thank you...");
    }
    stats();
  }
  public void feed(final int food) {
    switch (food) {
      case 1: // Matcha latt
        this.hunger -= 1.;
        this.energy += 5.;
        this.horny += 5.;
        break;
      case 2: // Mochi
        this.hunger -= 0.7;
        this.energy += 2.5;
        this.horny += 2.5;
        break;
      case 3: // Sushi
        this.hunger -= 20.5;
        this.energy += 10.;
        this.horny += 10.;
        break;
      case 4: // Tayaki
        this.hunger -= 5.;
        this.energy += 4.5;
        this.horny += 5.;
        break;
      case 5: // Ramen
        this.hunger -= 30.;
        this.energy += 20.5;
        this.horny += 5.5;
        break;
    }

    stats();

  }
  public void stats(){
    if (this.energy < 0)   this.energy = 0.;
    if (this.hunger < 0)   this.hunger = 0.;
    if (this.horny < 0)    this.horny  = 0.;
    if (this.energy > 100) this.energy = 100.;
    if (this.hunger > 100) this.hunger = 100.;
    if (this.horny > 100)  this.horny  = 100.;
    if (this.horny > 70 && this.energy > 50) this.mood = MoodState.HORNY;
    if (this.horny > 20 && this.energy > 60 && this.hunger < 50) this.mood = MoodState.HAPPY;
    if (this.energy < 30) {
      this.mood = MoodState.TIRED;
      this.horny -= 5.5;
    }
    if ( this.energy < 30 && this.hunger > 60) {
      this.mood = MoodState.SAD;
      this.horny -= 5.5;
      if (this.horny < 0)    this.horny = 0.;
    }
    if (this.horny < 5) this.mood = MoodState.ANGRY;
  }
}

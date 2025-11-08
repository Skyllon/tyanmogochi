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
  }
  public void sayCompliment() {
    this.horny += 10.5;
    System.out.printf("[NEWS]: a girl was killed by student called %s %s\n",
      this.name, this.surname);
  }
  public void feed(final int food) {
    switch (food) {
      case 1: // Matcha latt
        this.hunger -= 1.;
        this.energy += 5.;
        break;
      case 2: // Mochi
        this.hunger -= 0.7;
        this.energy += 2.5;
        break;
      case 3: // Sushi
        this.hunger -= 20.5;
        this.energy += 10.;
        break;
      case 4: // Tayaki
        this.hunger -= 5.;
        this.energy += 4.5;
        break;
      case 5: // Ramen
        this.hunger -= 30.;
        this.energy += 20.5;
        break;
    }

    // Boundaries check
    if (this.hunger < 0)   this.hunger = 0.;
    if (this.energy > 1e2) this.energy = 1e2;

    // Mood check
    if (this.hunger > 80 && this.energy > 80)
      this.mood = MoodState.HAPPY;
    else if (this.hunger < 30 && this.energy < 40)
      this.mood = MoodState.SAD;
  
  }
  // TODO: think about additional methods or fields that can describe this type well
  // maybe need to think about some level of violence that will be increase because
  // of others girls attention
  
}

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
  public void feed() {
    this.hunger -= 10.5;
    this.energy+=3.;
    this.horny += 1.5;}
  // TODO: think about additional methods or fields that can describe this type well
  // maybe need to think about some level of violence that will be increase because
  // of others girls attention
  
}

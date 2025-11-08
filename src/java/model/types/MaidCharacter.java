package model.types;


import model.general_model.BaseCharacter;
import model.general_model.states.*;
import model.interfaces.Feedable;

public class MaidCharacter
extends BaseCharacter
implements Feedable
{
  public MaidCharacter(
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

  public void feed(final int food) {
    this.energy += 20.;
    this.hunger -= 10.5;
    System.out.printf("%s\n", getLovelyPhrase());
  }

  public void sayCompliment() {
    setMood(MoodState.HAPPY);
    this.horny += 20.25;
    this.energy += 5.5;
  }

  public void cook() {
    this.energy -= 15.5;
    setMood(MoodState.TIRED);
    System.out.printf("Cooked a pie!\n");
  }
}

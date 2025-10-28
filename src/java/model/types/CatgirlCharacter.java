package model.types;

import model.general_model.BaseCharacter;
import model.general_model.states.*;
import model.interfaces.Feedable;
import model.interfaces.Playable;

public class CatgirlCharacter
extends BaseCharacter
implements Playable, Feedable
{
  public CatgirlCharacter(
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

  public void feed() { 
    this.hunger -= 2.5; 
    System.out.println(getLovelyPhrase());
    if (this.hunger > 70){
      this.mood = MoodState.HAPPY;
    }
  }

  public void play() {
    this.energy -= 10.5;
    this.hunger += 17.5;
    setMood(MoodState.PLAYFUL);
  }
  

  public void sayCompliment() {
    this.horny += 20.25;
    System.out.println(this.getLovelyPhrase());
    setMood(MoodState.HAPPY);
  }
}

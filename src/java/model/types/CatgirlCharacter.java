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
    stats();
  }

  public void play() {
    this.energy -= 10.5;
    this.hunger += 17.5;
    if (this.energy > 65 && this.hunger < 40)
      setMood(MoodState.PLAYFUL);
    stats();
  }


  public void sayCompliment() {
    this.horny += 20.25;
    System.out.println(this.getLovelyPhrase());
    setMood(MoodState.HAPPY);
    stats();
  }

  public void stats(){
    if (this.energy < 0)   this.energy = 0.;
    if (this.hunger < 0)   this.hunger = 0.;
    if (this.horny < 0)    this.horny  = 0.;
    if (this.energy > 100) this.energy = 100.;
    if (this.hunger > 100) this.hunger = 100.;
    if (this.horny > 100)  this.horny  = 100.;

    if (this.hunger < 40 && this.energy > 80 && this.horny > 40)
      this.mood = MoodState.HAPPY;
    else if (this.energy < 40 && this.hunger > 90)
      setMood(MoodState.TIRED);
    if (this.horny > 80 && this.hunger < 30 && this.mood==MoodState.HAPPY && this.energy > 50){
      this.mood = MoodState.HORNY;
    }
    else if (this.horny < 40 && this.hunger > 60 && this.energy < 40)
      this.mood = MoodState.SAD;
    else if (this.horny < 20 && this.hunger > 70 && this.energy < 20)
      this.mood = MoodState.ANGRY;

  }
}

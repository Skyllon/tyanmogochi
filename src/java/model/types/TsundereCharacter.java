package src.java.model.types;

import src.java.model.general_model.BaseCharacter;
import src.java.model.general_model.states.*;
import src.java.model.interfaces.Feedable;

public class TsundereCharacter
extends BaseCharacter
implements Feedable
{
  private Boolean isEmbarassed;

  public TsundereCharacter(
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
    TyanType  type,
    Boolean   isEmbarassed
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

    this.isEmbarassed = isEmbarassed;
  }

  public void setIsEmbarassed(Boolean isEmbarassed) { this.isEmbarassed = isEmbarassed; }
  public Boolean getIsEmbarassed()                  { return this.isEmbarassed;         }

  // TODO: later will be calculated by type of food
  public void feed() { 
    this.hunger -= 25.1; 
    this.energy += 2.25;
    if (this.hunger > 80 && this.energy > 80){
      this.mood = MoodState.HAPPY;
    } else if (this.hunger < 30 && this.energy < 40){
      this.mood = MoodState.SAD;
    }
  }

  public void sayCompliment() {
    this.isEmbarassed = true;
    this.horny += 5.25;
    if (this.horny >80 && this.mood == MoodState.HAPPY){
      this.mood = MoodState.HORNY;
    }
    System.out.println(this.getLovelyPhrase());
  }
  public void play(){
    if (isEmbarassed ==  true && (this.mood == MoodState.SAD || this.mood == MoodState.ANGRY || this.mood == MoodState.TIRED)){
      return;
    } else if (this.mood == MoodState.HAPPY){
      this.mood = MoodState.PLAYFUL;
      this.energy -= 10.;
      this.hunger += 15.;
    } else if (this.mood == MoodState.HORNY){
      this.energy -= 15.;
      this.hunger += 15.;
    }
  }
  // TODO: add more methods related with this type of girl
  // play if mood = happy (?)
}

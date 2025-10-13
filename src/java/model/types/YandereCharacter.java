package src.java.model.types;

import src.java.model.general_model.BaseCharacter;
import src.java.model.general_model.states.*;
import src.java.model.interfaces.Feedable;

public class YandereCharacter
extends BaseCharacter
implements Feedable
{
  private Boolean isEmbarassed;

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
  public void feed() { setHunger(20.2); }

  public void sayCompliment() {
    this.isEmbarassed = true;
    this.horny += 5.25;
    System.out.println(this.getLovelyPhrase());
  }

  // TODO: add more methods related with this type of girl
}

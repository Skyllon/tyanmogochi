package model.types;

import model.general_model.BaseCharacter;
import model.general_model.states.*;
import model.interfaces.Feedable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "tsundere")
public class TsundereCharacter
extends BaseCharacter
implements Feedable
{
  private Boolean isEmbarassed;

  public TsundereCharacter() { super(); }

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

  public void sayCompliment() {
    setMood(MoodState.HAPPY);
    this.isEmbarassed = true;
    this.horny += 5.25;

    if (this.horny > 80 && this.mood == MoodState.HAPPY)
      this.mood = MoodState.HORNY;

    System.out.println(this.getLovelyPhrase());
    stats();
  }
  public void play(){
    if (isEmbarassed ==  true &&
    (this.mood == MoodState.SAD
    || this.mood == MoodState.ANGRY
    || this.mood == MoodState.TIRED)) {
      System.out.println("What? No");
      return;
    } else if (this.mood == MoodState.HAPPY || this.mood == MoodState.PLAYFUL) {
      this.mood = MoodState.PLAYFUL;
      this.energy -= 10.;
      this.hunger += 15.;
    } else if (this.mood == MoodState.HORNY) {
      this.energy -= 15.;
      this.hunger += 15.;
    }
    stats();
  }
  public void stats(){
    if (this.energy<0)   this.energy = 0.;
    if (this.hunger<0)   this.hunger = 0.;
    if (this.horny<0)    this.horny = 0.;
    if (this.energy>100) this.energy = 100.;
    if (this.hunger>100) this.hunger = 100.;
    if (this.horny>100)  this.horny = 100.;

    if (this.hunger < 30 && this.energy > 80)
      this.mood = MoodState.HAPPY;
    else if (this.hunger > 80 && this.energy < 40)
      this.mood = MoodState.SAD;
  }
}

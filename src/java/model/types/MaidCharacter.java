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
    if (this.hunger < 40 && this.energy > 70)
      this.mood = MoodState.HAPPY;
    else if (this.hunger > 40 && this.energy < 40)
      this.mood = MoodState.SAD;
    else if (this.hunger >80 )
      this.mood = MoodState.ANGRY;
    System.out.printf("%s\n", getLovelyPhrase());
  }

  public void sayCompliment() {
    setMood(MoodState.HAPPY);
    this.horny += 20.25;
    this.energy += 5.5;
    if (this.horny > 80 && this.hunger>60 && this.mood==MoodState.HAPPY){
      this.mood = MoodState.HORNY;
    }
    if (this.horny > 100)
      this.horny = 100.0;
    else if (this.horny < 0)
      this.horny = 0.0;
  }

  public void cook() {
    this.energy -= 15.5;
    setMood(MoodState.TIRED);
    System.out.printf("Cooked a pie!\n");
  }
}

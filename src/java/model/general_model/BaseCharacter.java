package src.java.model.general_model;

import src.java.model.general_model.states.*;

public abstract class BaseCharacter {
  private String    name;
  private String    surname;
  private String    lovelyPhrase;

  private Integer   age;
  private Integer   hunger;
  private Integer   energy;

  private MoodState mood;
  private TyanType  type;


}

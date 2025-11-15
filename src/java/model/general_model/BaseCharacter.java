package model.general_model;

import model.general_model.states.*;

public abstract class BaseCharacter {
  protected String    name;
  protected String    surname;
  protected String    lovelyPhrase;
  protected Integer   age;
  protected Double    hunger;
  protected Double    energy;
  protected Double    horny;
  protected Boolean   isFeedable;
  protected Boolean   isPlayable;
  protected MoodState mood;
  protected TyanType  type;

  public BaseCharacter(
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
    this.name         = name;
    this.surname      = surname;
    this.lovelyPhrase = lovelyPhrase;
    this.age          = age;
    this.hunger       = hunger;
    this.energy       = energy;
    this.horny        = horny;
    this.isFeedable   = isFeedable;
    this.isPlayable   = isPlayable;
    this.mood         = mood;
    this.type         = type;
  }

  public void setName(String name) {
    try {
      if (name instanceof String)
        this.name = name;
    } catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Name must be a string");
    }
  }
  public void setSurname(String surname) {
    try {
      if (surname instanceof String)
        this.surname = surname;
    } catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Surname must be a string");
    }
  }
  public void setLovelyPhrase(String lovelyPhrase) {
    try {
      if (lovelyPhrase instanceof String)
        this.lovelyPhrase = lovelyPhrase;
    } catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Lovely phrase must be a string");
    }
  }
  public void setAge(Integer age) {
    try {
      if (age instanceof Integer) {
        if (age > 0 && age < 100)
          this.age = age;
        else 
          return;
      } 
    } 
    catch(Exception e) { e.printStackTrace(); }
  }
  public void setHunger(Double hunger) {
    try {
      if (hunger instanceof Double) {
        if (hunger > 0 && hunger < 100)
          this.hunger = hunger;
        else
          throw new IllegalArgumentException("Hunger must be between 0 and 100");
      } else {
        throw new IllegalArgumentException("Hunger must be a double");
      }
    } catch(Exception e) { e.printStackTrace(); }
  }
  public void setEnergy(Double energy) {
    try {
      if (energy instanceof Double) {
        if (energy > 0 && energy < 100)
          this.energy = energy;
        else
          throw new IllegalArgumentException("Energy must be between 0 and 100");
      } else {
        throw new IllegalArgumentException("Energy must be a double");
      }
    } catch(Exception e) { e.printStackTrace(); }
  }
  public void setHorny(Double horny) {
    try {
      if (horny instanceof Double) {
        if (horny > 0 && horny < 100)
          this.horny = horny;
        else
          throw new IllegalArgumentException("Horny must be between 0 and 100");
      } else {
        throw new IllegalArgumentException("Horny must be a double");
      }
    } catch(Exception e) { e.printStackTrace(); }
  }
  public void setFeedable(Boolean isFeedable)  { this.isFeedable   = isFeedable; }
  public void setPlayable(Boolean isPlayable)  { this.isPlayable   = isPlayable; }
  public void setMood(MoodState mood)          { this.mood         = mood;       }
  public void setType(TyanType type)           { this.type         = type;       }

  public String    getName()                     { return this.name;         }
  public String    getSurname()                  { return this.surname;      }
  public String    getLovelyPhrase()             { return this.lovelyPhrase; }
  public Integer   getAge()                      { return this.age;          }
  public Double    getHunger()                   { return this.hunger;       }
  public Double    getEnergy()                   { return this.energy;       }
  public Double    getHorny()                    { return this.horny;        }
  public Boolean   getFeedable()                 { return this.isFeedable;   }
  public Boolean   getPlayable()                 { return this.isPlayable;   }
  public MoodState getMood()                     { return this.mood;         }
  public TyanType  getType()                     { return this.type;         }

  abstract public void sayCompliment();
}

package src.java.model.general_model;

import src.java.model.general_model.states.*;

public abstract class BaseCharacter {
  private String    name;
  private String    surname;
  private String    lovelyPhrase;
  private Integer   age;
  private Double    hunger;
  private Double    energy;
  private Double    horny;
  private Boolean   isFeedable;
  private Boolean   isPlayable;
  private MoodState mood;
  private TyanType  type;

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

  public void setName(String name)                  { this.name         = name;         }
  public void setSurname(String surname)            { this.surname      = surname;      }
  public void setLovelyPhrase(String lovelyPhrase)  { this.lovelyPhrase = lovelyPhrase; }
  public void setAge(Integer age)                   { this.age          = age;          }
  public void setHunger(Double hunger)              { this.hunger       = hunger;       }
  public void setEnergy(Double energy)              { this.energy       = energy;       }
  public void setHorny(Double horny)                { this.horny        = horny;        }
  public void setFeedable(Boolean isFeedable)       { this.isFeedable   = isFeedable;   }
  public void setPlayable(Boolean isPlayable)       { this.isPlayable   = isPlayable;   }
  public void setMood(MoodState mood)               { this.mood         = mood;         }
  public void setType(TyanType type)                { this.type         = type;         }

  public String getName()                           { return this.name;         }
  public String getSurname()                        { return this.surname;      }
  public String getLovelyPhrase()                   { return this.lovelyPhrase; }
  public Integer getAge()                           { return this.age;          }
  public Double getHunger()                         { return this.hunger;       }
  public Double getEnergy()                         { return this.energy;       }
  public Double getHorny()                          { return this.horny;        }
  public Boolean getFeedable()                      { return this.isFeedable;   }
  public Boolean getPlayable()                      { return this.isPlayable;   }
  public MoodState getMood()                        { return this.mood;         }
  public TyanType getType()                         { return this.type;         }

  public void sayCompliment() { this.horny += 0.25; }
}

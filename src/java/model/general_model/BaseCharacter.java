package src.java.model.general_model;

import src.java.model.general_model.states.*;

public abstract class BaseCharacter {
  private String    name;
  private String    surname;
  private String    lovelyPhrase;
  private Integer   age;
  private Double    hunger;
  private Double    energy;
  private Boolean   isFeedable;
  private Boolean   isPlayable;
  private MoodState mood;
  private TyanType  type;


  public void setName(String name)                  { this.name         = name;         }
  public void setSurname(String surname)            { this.surname      = surname;      }
  public void setLovelyPhrase(String lovelyPhrase)  { this.lovelyPhrase = lovelyPhrase; }
  public void setAge(Integer age)                   { this.age          = age;          }
  public void setHunger(Double hunger)              { this.hunger       = hunger;       }
  public void setEnergy(Double energy)              { this.energy       = energy;       }
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
  public Boolean getFeedable()                      { return this.isFeedable;   }
  public Boolean getPlayable()                      { return this.isPlayable;   }
  public MoodState getMood()                        { return this.mood;         }
  public TyanType getType()                         { return this.type;         }
}

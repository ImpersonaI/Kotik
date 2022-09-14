package main.java.animals;

public class Kotik {

  private final static int METHODS = 5;
  private static int count = 0;
  private String name;
  private String voice;
  private double satiety;
  private double weight;

  public Kotik() {
    count++;
  }

  public Kotik(String name, String voice, double satiety, double weight) {
    count++;
    this.setName(name);
    this.setVoice(voice);
    this.setSatiety(satiety);
    this.setWeight(weight);
  }

  public static int getCount() {
    return count;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setVoice(String voice) {
    this.voice = voice;
  }

  public String getVoice() {
    return this.voice;
  }

  public void setSatiety(double satiety) {
    this.satiety = satiety;
  }

  public double getSatiety() {
    return this.satiety;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void eat(double satiety) {
    this.satiety += satiety;
  }

  public void eat(double satiety, String food) {
    eat(satiety);
  }

  public void eat() {
    eat(2.5, "Pizza");
  }

  private boolean isNotHungry() {
    if (satiety > 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean play() {
    if (isNotHungry()) {
      satiety -= 5;
      System.out.println("Cat is playing");
      return true;
    } else {
      return false;
    }
  }

  public boolean sleep() {
    if (isNotHungry()) {
      satiety -= 1;
      System.out.println("Cat is sleeping");
      return true;
    } else {
      return false;
    }
  }

  public boolean wash() {
    if (isNotHungry()) {
      satiety -= 4;
      System.out.println("Cat is washing");
      return true;
    } else {
      return false;
    }
  }

  public boolean walk() {
    if (isNotHungry()) {
      satiety -= 2;
      System.out.println("Cat is walking");
      return true;
    } else {
      return false;
    }
  }

  public boolean hunt() {
    if (isNotHungry()) {
      satiety -= 8;
      System.out.println("Cat is hunting");
      return true;
    } else {
      return false;
    }
  }

  private int getRandomNumber() {
    return ((int) (Math.random() * METHODS) + 1);
  }

  public void liveAnotherDay() {
    String[] result = new String[24];
    for (int i = 0; i < result.length; i++) {
      switch (getRandomNumber()) {
        case 1:
          if (play()) {
            result[i] = String.valueOf(i) + " - " + "играл";
          } else {
            eat();
            result[i] = String.valueOf(i) + " - " + "ел";
          }
          break;
        case 2:
          if (sleep()) {
            result[i] = String.valueOf(i) + " - " + "спал";
          } else {
            eat();
            result[i] = String.valueOf(i) + " - " + "ел";
          }
          break;
        case 3:
          if (wash()) {
            result[i] = String.valueOf(i) + " - " + "мылся";
          } else {
            eat();
            result[i] = String.valueOf(i) + " - " + "ел";
          }
          break;
        case 4:
          if (walk()) {
            result[i] = String.valueOf(i) + " - " + "гулял";
          } else {
            eat();
            result[i] = String.valueOf(i) + " - " + "ел";
          }
          break;
        case 5:
          if (hunt()) {
            result[i] = String.valueOf(i) + " - " + "охотился";
          } else {
            eat();
            result[i] = String.valueOf(i) + " - " + "ел";
          }
          break;

        default:
          break;
      }
    }
    for (String iterable_element : result) {
      System.out.println(String.valueOf(iterable_element));
    }
  }
}

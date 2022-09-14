package main.java;

import main.java.animals.Kotik;

public class Application {

  static boolean compareVoice(Kotik one, Kotik two) {
    if (one.getVoice().equals(two.getVoice())) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {

    Kotik kotik1 = new Kotik("Kotik1", "Ahhhhhhhhh", 3.5, 5);

    Kotik kotik2 = new Kotik();
    kotik2.setName("Kotik2");
    kotik2.setVoice("Mew-mew-mew");
    kotik2.setSatiety(5);
    kotik2.setWeight(0.5);

    kotik1.liveAnotherDay();
    System.out.println("Имя котика = " + kotik2.getName() + ", вес котика = " + kotik2.getWeight());
    System.out.println(compareVoice(kotik1, kotik2));
    System.out.println("Количество созданных котиков = " + Kotik.getCount());
  }
}

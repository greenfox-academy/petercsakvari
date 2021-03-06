package animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    super(name);
    setStrength(1);
    setWeight(2);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void eat() {
    setWeight(getWeight() + 2);
  }

  @Override
  public void goToGym() {
    setStrength(getStrength() + 1);
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}

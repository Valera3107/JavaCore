package module_16;

import java.util.Objects;

public class Alien extends Creation {
  public String planet;
  private String name;

  public Alien(String planet, String name) {
    this.planet = planet;
    this.name = name;
  }

  public Alien(String name) {
    this.name = name;
    this.planet = "Earth";
  }

  public void myMethod(String str, int... args) {
    int f = args[0];
    for (int i = 1; i < args.length; i++) {
      f += args[i];
    }
    System.out.println(str + " " + f + "km");
  }

  public void myMethod(int... args) {
    int f = args[0];
    for (int i = 1; i < args.length; i++) {
      f += args[i];
    }
    System.out.println(f + "km");
  }

  public String getPlanet() {
    return planet;
  }

  public void setPlanet(String planet) {
    this.planet = planet;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Alien{" +
      "planet='" + planet + '\'' +
      ", name='" + name + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Alien)) return false;
    Alien alien = (Alien) o;
    return Objects.equals(planet, alien.planet) &&
      Objects.equals(name, alien.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(planet, name);
  }
}

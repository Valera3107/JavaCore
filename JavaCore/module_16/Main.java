package module_16;

import java.lang.reflect.*;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
    Class alienClass = Alien.class;

    System.out.println("Name of the class: " + alienClass.getSimpleName());
    System.out.println("Package: " + alienClass.getPackageName());
    System.out.println("Superclass: " + alienClass.getSuperclass().getSimpleName());
    int modifier = alienClass.getModifiers();
    System.out.println("Class modification: " + Modifier.toString(modifier));
    System.out.println("Is static: " + Modifier.isStatic(modifier));
    System.out.println("Is abstract: " + Modifier.isAbstract(modifier));
    System.out.println("Is final: " + Modifier.isFinal(modifier));
    System.out.println("Is interface: " + Modifier.isInterface(modifier));


    System.out.println("\nConstructors: ");
    Constructor[] alienClassConstructors = alienClass.getConstructors();
    for (Constructor c :
      alienClassConstructors) {
      System.out.println(c);
    }

    System.out.println("\nFields:");
    Field[] alienClassFields = alienClass.getDeclaredFields();
    for (Field f :
      alienClassFields) {
      System.out.println(f);
    }

    System.out.println("\nMethods:");
    Method[] methods = alienClass.getMethods();
    for (Method m :
      methods) {
      System.out.println(m);
    }


   //==================

    System.out.println("\n\n");
    Constructor<Alien> constructor = alienClass.getConstructor(String.class, String.class);
    Alien reflectionAlien = constructor.newInstance("Mars", "Fobius");
    System.out.println(reflectionAlien.toString());

    Field newPlanet = alienClass.getField("planet");
    newPlanet.set(reflectionAlien, "Jupiter");
    System.out.println(reflectionAlien);
    methods[4].invoke(reflectionAlien,"hhh");
    System.out.println(reflectionAlien);

    //===================

//    methods[5].invoke(reflectionAlien,"hhh", 3,45,34,534,5);
//    methods[6].invoke(reflectionAlien,6,5,36,53,6,53,6,356,536);

  }
}

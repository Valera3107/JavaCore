package module_14.max;

import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Commodity {
  private Set<Product> products = new HashSet<>();

  public Set<Product> getProducts() {
    return products;
  }

  public void addProduct(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input name:");
    String name = sc.nextLine();
    System.out.println("Input length:");
    int length = sc.nextInt();
    System.out.println("Input width:");
    int width = sc.nextInt();
    System.out.println("Input weight:");
    int weight = sc.nextInt();
    products.add(new Product(name, length, width, weight));
    System.out.println("Product have been added!");
  }

  public void deleteProduct(){
    products.forEach(System.out::println);
    System.out.println("Input index of product to delete:(0-"+(products.size()-1)+")");
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    products.remove(products.toArray()[index]);
    System.out.println("Product have been deleted.");
  }

  public void replaceProduct(){
    products.forEach(System.out::println);
    System.out.println("Input index of product: (0-"+(products.size()-1)+")");
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    Product product = (Product) products.toArray()[index];
    System.out.println("Change 1 - name, 2 - length, 3 - weight, 4 - width:");
    int choice = sc.nextInt();
    sc.nextLine();
    System.out.println("Input value:");
    String answer = sc.nextLine();
    switch (choice){
      case 1: product.setName(answer);break;
      case 2: product.setLength(Integer.parseInt(answer));break;
      case 3: product.setWeight(Integer.parseInt(answer));break;
      case 4: product.setWidth(Integer.parseInt(answer));break;
      default:
        System.out.println("Invalid input!");return;
    }
    System.out.println("Changed successfully!!!");
  }

  public void sortByName(){
    List<Product> list = new ArrayList<>(products);
    list.sort(new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    list.forEach(System.out::println);
  }

  public void sortByLength(){
    List<Product> list = new ArrayList<>(products);
    list.sort(new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getLength() - o2.getLength();
      }
    });
    list.forEach(System.out::println);
  }

  public void sortBywidth(){
    List<Product> list = new ArrayList<>(products);
    list.sort(new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getWidth() - o2.getWidth();
      }
    });
    list.forEach(System.out::println);
  }

  public void sortByWeight(){
    List<Product> list = new ArrayList<>(products);
    list.sort(new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getWeight() - o2.getWeight();
      }
    });
    list.forEach(System.out::println);
  }

  public void printElement(){
    products.forEach(System.out::println);
    System.out.println("Input index of product: (0-"+(products.size()-1)+")");
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    System.out.println(products.toArray()[index]);
  }
}

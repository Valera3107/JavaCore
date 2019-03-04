package module_14.max;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean isStop = false;
    Commodity commodity = new Commodity();
    commodity.getProducts().add(new Product("Coca-Cola", 20, 14, 5));
    commodity.getProducts().add(new Product("Pepsi", 16, 12, 8));
    commodity.getProducts().add(new Product("Box", 21, 19, 6));
    commodity.getProducts().add(new Product("Lego", 6, 34, 3));
    commodity.getProducts().add(new Product("Milk", 27, 20, 9));
    commodity.getProducts().add(new Product("Chocolate", 56, 18, 1));

    int choice;
    Scanner scanner = new Scanner(System.in);
    printFuctional();
    while (!isStop) {
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          commodity.addProduct();
          break;
        case 2:
          commodity.deleteProduct();
          break;
        case 3:
          commodity.replaceProduct();
          break;
        case 4:
          commodity.sortByName();
          break;
        case 5:
          commodity.sortByLength();
          break;
        case 6:
          commodity.sortBywidth();
          break;
        case 7:
          commodity.sortByWeight();
          break;
        case 8:
          isStop = true;
          break;
        case 9:
          System.exit(0);
        case 10:
          printFuctional();
          break;
        default:
          System.out.println("Invalid input!");
          break;
      }

    }
  }

  private static void printFuctional() {
    System.out.println("1 - add product\n" +
      "2 - delete product\n" +
      "3 - replace product\n" +
      "4 - sort by name\n" +
      "5 - sort by length\n" +
      "6 - sort by width\n" +
      "7 - sort by weight\n" +
      "8 - stop work\n" +
      "9 - stop all\n" +
      "10 - print options");
  }
}

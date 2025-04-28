import pattern.flyweight.Forest;
import pattern.proxy.ProxyImage;
import pattern.state.Document;

public class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.println("1. Flyweight");
      System.out.println("2. Proxy");
      System.out.println("3. State");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");

      int choice = new java.util.Scanner(System.in).nextInt();

      if (choice == 4) {
        break;
      }

      switch (choice) {
        case 1:
          handleFlyweight();
          break;
        case 2:
          handleProxy();
          break;
        case 3:
          handleState();
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void handleFlyweight() {
    Forest forest = new Forest(); // (Oak, Birch)

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        forest.plantTree(i, i, "Oak", "green", "rough");
      } else {
        forest.plantTree(i, i, "Birch", "white", "smooth");
      }
    }

    forest.draw("canvas");
  }

  private static void handleProxy() {
    ProxyImage image = new ProxyImage("mona-lisa.jpg");

    image.display();
  }

  private static void handleState() {
    Document doc = new Document();

    doc.publish();
    doc.publish();
    doc.publish();
  }
}
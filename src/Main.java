import pattern.proxy.ProxyImage;
import pattern.state.Document;

public class Main {
  public static void main(String[] args) {
    handleProxy();
    handleState();
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
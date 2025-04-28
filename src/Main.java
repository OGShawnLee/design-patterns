import pattern.state.Document;

public class Main {
  public static void main(String[] args) {
    handleState();
  }

  private static void handleState() {
    Document doc = new Document();

    doc.publish();
    doc.publish();
    doc.publish();
  }
}
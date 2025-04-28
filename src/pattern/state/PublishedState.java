package pattern.state;

class PublishedState implements DocumentState {
  @Override
  public void publish(Document document) {
    System.out.println("Document is already Published.");
  }
}

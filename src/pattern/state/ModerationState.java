package pattern.state;

class ModerationState implements DocumentState {
  @Override
  public void publish(Document document) {
    System.out.println("Document is moved from Moderation to Published.");
    document.setState(new PublishedState());
  }
}

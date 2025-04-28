package pattern.state;

class DraftState implements DocumentState {
  @Override
  public void publish(Document document) {
    System.out.println("Document is moved from Draft to Moderation.");
    document.setState(new ModerationState());
  }
}

package pattern.state;

public class Document {
  private DocumentState state;

  public Document() {
    this.state = new DraftState();
  }

  public void setState(DocumentState state) {
    this.state = state;
  }

  public void publish() {
    state.publish(this);
  }
}
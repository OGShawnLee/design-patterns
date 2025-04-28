package pattern.proxy;

public abstract class Image {
  private final String fileName;

  public Image(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public abstract void display();
}

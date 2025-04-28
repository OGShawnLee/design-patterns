package pattern.proxy;

public class ProxyImage extends Image {
  private RealImage realImage;

  public ProxyImage(String fileName) {
    super(fileName);
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(getFileName());
    }

    realImage.display();
  }
}

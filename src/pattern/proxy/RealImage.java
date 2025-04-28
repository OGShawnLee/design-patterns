package pattern.proxy;

class RealImage extends Image {
  public RealImage(String fileName) {
    super(fileName);
    loadFromDisk();
  }

  private void loadFromDisk() {
    System.out.println("Loading " + getFileName());
  }

  @Override
  public void display() {
    System.out.println("Displaying " + getFileName());
  }
}

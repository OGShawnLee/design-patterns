package pattern.flyweight;

public class Tree {
  private final String name;
  private final String color;
  private final String texture;

  public Tree(String name, String color, String texture) {
    this.name = name;
    this.color = color;
    this.texture = texture;
  }

  @Override
  public String toString() {
    return name + " { " + color + ", " + texture + " }";
  }

  public void draw(String canvas, int x, int y) {
    System.out.println("Drawing " + this + " on " + canvas + " at (" + x + ", " + y + ")");
  }
}

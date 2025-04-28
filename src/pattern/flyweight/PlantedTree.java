package pattern.flyweight;

public class PlantedTree {
  private int x;
  private int y;
  private final Tree tree;

  public PlantedTree(int x, int y, Tree tree) {
    this.x = x;
    this.y = y;
    this.tree = tree;
  }

  public void relocate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void draw(String canvas) {
    tree.draw(canvas, x, y);
  }
}

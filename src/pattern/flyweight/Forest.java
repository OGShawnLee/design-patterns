package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
  private final List<PlantedTree> plantedTrees = new ArrayList<>();

  public void plantTree(int x, int y, String name, String color, String texture) {
    Tree tree = TreeFactory.getTree(name, color, texture, x, y);
    PlantedTree plantedTree = new PlantedTree(x, y, tree);
    plantedTrees.add(plantedTree);
  }

  public void draw(String canvas) {
    for (PlantedTree plantedTree : plantedTrees) {
      plantedTree.draw(canvas);
    }
  }
}

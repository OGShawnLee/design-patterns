package pattern.flyweight;

import java.util.HashMap;

public class TreeFactory {
  private static final HashMap<String, Tree> trees = new HashMap<>();

  public static Tree getTree(String name, String color, String texture, int x, int y) {
    String key = name + "-" + color + "-" + texture;

    if (trees.containsKey(key)) {
      System.out.println("Reusing existing Tree: " + key);
      return trees.get(key);
    } else {
      System.out.println("Creating new Tree: " + key);
      trees.put(key, new Tree(name, color, texture));
      return trees.get(key);
    }
  }
}

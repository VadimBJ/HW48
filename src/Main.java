import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(2, 4);
    Rectangle rectangle2 = new Rectangle(4, 2);
    Rectangle rectangle3 = new Rectangle(4, 6);
    Rectangle rectangle4 = new Rectangle(6, 8);
    List<Rectangle> listRect = new ArrayList<>();
    listRect.add(rectangle1);
    listRect.add(rectangle2);
    listRect.add(rectangle3);
    listRect.add(rectangle4);
    listRect.sort(new RectangleComparator());
    for (Rectangle rectangle : listRect) {
      System.out.println(rectangle);
    }

  }
}
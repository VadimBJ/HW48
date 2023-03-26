import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RectangleComparatorTest {
  @Test
  public void RectangleComparator(){
    Rectangle rectangle1 = new Rectangle(2, 4);
    Rectangle rectangle2 = new Rectangle(4, 4);
    Rectangle rectangle3 = new Rectangle(3, 4);
    List<Rectangle> listAct = new ArrayList<>();
    listAct.add(rectangle1);
    listAct.add(rectangle2);
    listAct.add(rectangle3);
    List<Rectangle> listExp = new ArrayList<>();
    listExp.add(rectangle1);
    listExp.add(rectangle3);
    listExp.add(rectangle2);
    listAct.sort(new RectangleComparator());
    assertEquals(listExp,listAct);
  }
}

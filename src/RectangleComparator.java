import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
  @Override
  public int compare(Rectangle o1, Rectangle o2) {
    double square1 = o1.getLength() * o1.getWidth();
    double square2 = o2.getLength() * o2.getWidth();
    return Double.compare(square1, square2);
  }
}

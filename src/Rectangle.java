public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    if (length <= 0||width<=0) {
      throw new IllegalArgumentException("Значение не может быть <=0!");
    }
    this.length = length;
    this.width = width;
  }

  @Override
  public String toString() {
    return String.format("length=%.2f, width=%.2f, square=%.2f",
        length, width, length * width);

  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }
}

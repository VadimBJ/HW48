import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class RectangleTests {

  @Test
  public void ZeroLength() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(0, 2));
  }

  @Test
  public void ZeroWeight() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(2, 0));
  }

  @Test
  public void NegativeWeight() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(2, -2));
  }

  @Test
  public void NegativeLength() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(-2, 2));
  }

  @Test
  public void MaxLength() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(Double.MAX_VALUE, 2));
  }

  @Test
  public void MaxWeight() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(2, Double.MAX_VALUE));
  }

  @Test
  public void ZeroAll() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(0, 0));
  }

  @Test
  public void NegativeAll() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(-2, -2));
  }

  @Test
  public void MaxAll() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(Double.MAX_VALUE, Double.MAX_VALUE));
  }
}

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
  public void ZeroAll() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(0, 0));
  }

  @Test
  public void NegativeAll() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(-2, -2));
  }

}

// Rule 07. Exceptional Behavior (ERR)
// ERR03-J. Restore prior object state on method failure

class Dimensions {
  private int length;
  private int width;
  private int height;
  static public final int PADDING = 2;
  static public final int MAX_DIMENSION = 10;
 
  public Dimensions(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }
 
protected int getVolumePackage(int weight) {
  length += PADDING;
  width  += PADDING;
  height += PADDING;
  try {
    if (length <= PADDING || width <= PADDING || height <= PADDING ||
      length > MAX_DIMENSION + PADDING ||
      width > MAX_DIMENSION + PADDING ||
      height > MAX_DIMENSION + PADDING ||
      weight <= 0 || weight > 20) {
      throw new IllegalArgumentException();
    }
 
    int volume = length * width * height;
    return volume;
  } catch (Throwable t) {
    MyExceptionReporter mer = new MyExceptionReporter();
    mer.report(t); // Sanitize
    return -1; // Non-positive error code
  } finally {
    // Revert
    length -= PADDING; width -= PADDING; height -= PADDING;
  }
}
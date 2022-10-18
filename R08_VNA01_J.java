// Immutable Helper
public final class Helper {
  private final int n;
 
  public Helper(int n) {
    this.n = n;
  }
  // ...
}

final class Foo {
  private Helper helper;
 
  public Helper getHelper() {
    return helper;
  }
 
  public void setHelper(int num) {
    helper = new Helper(num);
  }
}
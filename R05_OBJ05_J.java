class MutableClass {
  private Date[] date;
 
  public MutableClass() {
    date = new Date[20];
    for (int i = 0; i < date.length; i++) {
      date[i] = new Date();
    }
  }
 
  public Date[] getDate() {
    return date; // Or return date.clone()
  }
}
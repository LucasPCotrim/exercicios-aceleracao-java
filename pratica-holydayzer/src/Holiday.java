public class Holiday extends Date {
  public String name;

  public Holiday(String date, String name){
    super(date);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

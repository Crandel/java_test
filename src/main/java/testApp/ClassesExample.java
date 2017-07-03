package testApp;

public class ClassesExample {

  public class Root{

    private int x = 0;
    protected int z = 0;
    private static final double xyz = 54.05;

    public Root() {
      System.out.println("Start first constructor in Root");
      this.x = 42;
      System.out.println("Finish first constructor in Root");
    }

    public int getX(){
      return x;
    }

    public void setX(int x){
      this.x = x;
    }

    public int getZ(){
      return z;
    }

    public void setZ(int z){
      this.z = z;
    }
  }

  public class Child extends Root {
    public void prn(){
      System.out.println(getZ());
    }
  }

  public class DeepChild extends Child {

  }
}

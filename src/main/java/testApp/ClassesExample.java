package testApp;

public class ClassesExample {

  public class Root{

    private int x = 0;
    protected int z = 0;
    private static final double xyz = 54.05;

    public Root() {
      this(42);
      System.out.println("Empty constructor in Root");
    }

    public Root(int x){
      this.x = x;
    }

    public Root(int x, int z){
      this.x = x;
      this.z = z;
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
    public Child(){
      this(33);
      System.out.println("Empty constructor in Child class");
    }

    public Child(int x){
      this.setX(x);
      System.out.println("One parameter Child constructor");
    }

    public Child(int x, int z){
      super(x, z);
    }

    public void prn(){
      System.out.println(getZ());
    }
  }

  public class DeepChild extends Child {

  }
}

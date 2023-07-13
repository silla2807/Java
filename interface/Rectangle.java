class Rectangle implements Shape
{

  private double length, breadth;

  public Rectangle (double length, double breadth)
  {
    this.length = length;
    this.breadth = breadth;
  }
   @Override public void getArea ()
  {
    System.out.println (length * breadth);
  }
}


public class Area extends Shape
{

  @Override public void RectangleArea (double length, double breadth)
  {
    System.out.print (length * breadth);
    System.out.println ("");

  }
   @Override public void SquareArea (double length)
  {
    System.out.print (length * length);
    System.out.println ("");
  }
  @Override public void CircleArea (double length)
  {
    System.out.print (3.14 * length * length);
    System.out.println ("");
  }
}

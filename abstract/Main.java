class Main
{
  public static void main (String[]args)
  {
    Area a = new Area ();
    double length = 9.0;
    double breadth = 8.0;
    double side = 4.0;
    double radius = 2.0;
      a.RectangleArea (length, breadth);
      a.SquareArea (side);
      a.CircleArea (radius);
  }
}

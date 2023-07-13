public class Main
{
  public static <T > boolean compareArrays (T[]array1, T[]array2)
  {
    if (array1.length != array2.length)
      {

	System.out.println ("haha the lengths of the arrays are not matching");
	return false;
      }

    for (int i = 0; i < array1.length; i++)
      {
	if (!array1[i].equals (array2[i]))

	  {
	    return false;
	  }

      }
    return true;

  }

  public static void main (String[]args)
  {
    Character[]array1 =
    {
    'a', 'b'};
    Character[]array2 =
    {
    'c', 'b', 'c'};
    System.out.println (compareArrays (array1, array2));

  }
}

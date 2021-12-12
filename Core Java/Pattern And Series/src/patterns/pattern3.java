package patterns;

/* E F G H I
    F G H I
    G H I
    H I
    I
  */
class pattern3
{
public static void main(String[] args)	
{
    for(int i=1;i<=5;i++)
    {
       for(int j=i;j<=5;j++)
        {
        System.out.print((char)(j+68)+" ");    
        }
       System.out.println();   
      }

}
}
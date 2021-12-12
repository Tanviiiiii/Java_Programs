/*  E E E E E
     D D D D
     C C C
     B B
     A   */
class pattern2
{
public static void main(String[] args)
{
int alphabet=69; 
    for(int i=1;i<=5;i++)
    {
       for(int j=5;j>=i;j--)
        {
          System.out.print((char)(alphabet)+" ");       
        }
alphabet--;
       System.out.println();   
    }

}
}
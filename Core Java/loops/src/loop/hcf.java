package loop;

class hcf
{
public static void main(String[] args)
{
int x=12,y=18;
int s=x<y?x:y;
  while(true)
  {
      if(x%s==0 && y%s==0)
       {
	break;
        }
     s--;
  }
System.out.println(s);
}}
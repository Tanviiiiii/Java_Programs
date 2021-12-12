package loop;

class lcm
{
public static void main(String[] args)
{
int x=12,y=18,lcm;
int max=x>y?x:y;
while(true)
{
 if(max%x==0 && max%y==0)
 {
 lcm=max;
 break;
 }
max++;
}
System.out.println(lcm);
}}
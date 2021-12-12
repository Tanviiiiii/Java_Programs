package throw_and_throws_exception;
public class cal
{
  static int add(int n1, int n2)throws NumberException
{
if (n1<0 || n2<0)
{
NumberException ex=new NumberException(" numbers are negative");
throw ex;
}
else
return n1+n2;
}
}
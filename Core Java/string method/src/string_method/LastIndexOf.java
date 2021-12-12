package string_method;

class LastIndexOf
{
        public static void main(String []args)
        {
                   String str="international";
                   int i=str.lastIndexOf('m');
                   int j=str.lastIndexOf('n');
               
             System.out.println(i);//-1
             System.out.println(j);//10
        }
}
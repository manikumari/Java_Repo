public class ForLoop_Practice{
    public static void Print_Ten_Numbers()
    {
        
        for(int i=1; i<=10;i++)
        {
           System.out.println(i);
        }
        
    }
    public static void Nested_Loop_sample(char symbol,int rows, int columns)
    {
        for( int i=1; i<=rows; i++)
        {
            for(int k= 1; k<=columns;k++)
                System.out.print(symbol);
            System.out.println();
        }

    }
}

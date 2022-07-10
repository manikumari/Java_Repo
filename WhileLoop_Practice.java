import java.util.Scanner;

public class WhileLoop_Practice{
     public static void Check_if_Number_Is_Range(int number, int start, int end)
    {
        while(number>=start && number<=end)
         {
            System.out.println(number+ "is in range.");
            return;
        }
        
        System.out.println(number+ "is not in range.");


    }
    public static void Check_if_Number_Is_Range(int start, int end)
    {

        while(true)
        {
            System.out.println("To enter this loop an integer value between the range" + start+"-"+end);
            Scanner reader = new Scanner(System.in);
            int number=reader.nextInt();
        
            if(number>=start && number<=end)
            {
                System.out.println(number+ "is in range"+start+ "-"+ end);
                break;
            }
           
        }
        
    }
    public static void Reading_A_Value_WrongVersion()
    {
        int value=0;
        final int SENTINEL = -999;
        Scanner reader = new Scanner(System.in);
        while (value !=  SENTINEL)
        {
            System.out.println("Processed value: "+ value);
            System.out.println("Enter a new value");
            value=reader.nextInt();
        }
        reader.close();
    }
    public static void Reading_A_Value_CorrectVersion()
    {
        int value;
        final int SENTINEL = -999;
        Scanner reader = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a new value");
            value=reader.nextInt();
            if(value!=SENTINEL)
            {
                System.out.println("Processed value: "+ value);
            }
            else
            {
                break;
            }
        }
        reader.close();
    }
    public static void x_y_values()
    {
        int x=10,y=0;
        while (x>5)
        {
            y=3;
            while(y < x)
            {
                y*=2;
                if (y%x==1)
                    y+=x;

            }
            x-=3;
        }
        System.out.println("x: "+ x + " "+ "y: "+y);




    }

    
}

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
    
}

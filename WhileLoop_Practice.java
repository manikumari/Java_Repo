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
    
}

public class Math_Util {
    public static void Pow_Of_X(int base, int exponent)
    {
        int product=1;
        for(int i=base; i<=exponent;i++)
        {
            product = product*base;
        }
        System.out.println(base + "Power " + exponent + "is: "+product);
        
    }
    
}

public class LogicalOperations {
    public static void main(String [] args)
    {
        int x =10;
        int y=20;
        int a=30;
        int b=40;
        boolean result1 = x < y && a < b;
        boolean result2 = x > y && a > b;
        boolean result3 = x < y && a > b;
        boolean result4 = x > y && a < b;
        boolean result5 = x < y || a < b;
        boolean result6 = x > y || a > b;
        boolean result7 = x < y || a > b;
        boolean result8 = x > y || a < b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);

    }
    
}

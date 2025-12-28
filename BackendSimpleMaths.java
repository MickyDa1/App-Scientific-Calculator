
public class BackendSimpleMaths{

    public static void Add(int a, int b){
       int intTotal = a + b;
       String total = String.valueOf(intTotal);
       base.result("Simple Addition", total);
    }

    public static void Divide(int a, int b){
       int intTotal = a / b;
       String total = String.valueOf(intTotal);
       base.result("Simple Division", total);
    }
    
    public static void Multiply(int a, int b){
       int intTotal = a * b;
       String total = String.valueOf(intTotal);
       base.result("Simple Multiplication", total);
    }
    
    public static void Subtract(int a, int b){
       int intTotal = a - b;
       String total = String.valueOf(intTotal);
       base.result("Simple Subtraction", total);
    }

}
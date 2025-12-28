
import java.math.BigInteger;


public class BackendHardMaths {

    public static void azimuth(double x1, double x2, double y1, double y2){//west, east, south, north - HONESLTY DONT KNOW WHY
        double totalX = x2 - x1;
        double totalY = y2 - y1;

        double azimuthRad = Math.atan2(totalX, totalY);
        double azimuthDeg = Math.toDegrees(azimuthRad);
        
        if (azimuthDeg < 0){
            azimuthDeg = azimuthDeg + 360;
        }

        String total = String.valueOf(azimuthDeg);
        base.result("Azimuth", total);
    }

    public static BigInteger factorial(int input) { // has to be big integer as when testing the number 75 was too much
        if (input == 1) {
            return BigInteger.valueOf(1);
        }

        return BigInteger.valueOf(input).multiply(factorial(input - 1));
    }

    public static void primeChecker(int input){
        boolean result;

        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                result = false;
                base.result("Prime Checker1", String.valueOf(result));
                break;
            }

            if (input % i > 0) {
                result = true;
                base.result("Prime Checker", String.valueOf(result));
                break;
            }
        }
    }

}



public class BackendHardMaths {

    public static void azimuth(double x1, double x2, double y1, double y2){//west, east, south, north - HONESLTY DONT KNOW WHY
        double totalX = x2 - x1;
        double totalY = y2 - y1;

        double azimuthRad = Math.atan2(totalX, totalY);
        double azimuthDeg = Math.toDegrees(azimuthRad);
        
        if (azimuthDeg < 0){
            azimuthDeg = azimuthDeg + 360;
        }

        System.out.println(azimuthDeg);
        
    }

    public static int factorial(int input) {
        if (input == 1) {
            return 1;
        }

        return input * factorial(input - 1);
    }


    
    


}

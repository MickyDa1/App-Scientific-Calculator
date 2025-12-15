public class BackendMediumMaths{

    public static void keneticEnergy(int mass, int Velocity){
        int intTotal = (int) 0.5 * mass * (Velocity * Velocity);
        String total = convertingTotal(intTotal);
        base.result("Kenetic Energy", total);
    }

    public static void weight(int mass, int gfs){ //gfs = Gravitational Field Strength
        int intTotal = mass * gfs;
        String total = convertingTotal(intTotal);
        base.result("Weight", total);
    }
    
    public static void hydrostaticPressure(int height, int density, int gfs){ //Pressure of a liquid at rest.
        int intTotal = height * density * gfs;
        String total = convertingTotal(intTotal);
        base.result("Hydrostatic Pressure", total);
    }

    public static void elasticPotentialEnergy(int springConstant, int Extenstion){
        int intTotal = (int) (0.5 * springConstant * (Extenstion * Extenstion));
        String total = convertingTotal(intTotal);
        base.result("Elastic Potential Energy", total);
    }

    public static String convertingTotal(int intTotal){
        return String.valueOf(intTotal);
    }

}
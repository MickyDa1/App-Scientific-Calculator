public class BackendMediumMaths{

    public static void keneticEnergy(double mass, double Velocity){
        double DTotal = 0.5 * mass * (Velocity * Velocity);
        String total = convertingTotal(DTotal);
        base.result("Kenetic Energy", total);
    }

    public static void weight(double mass, double gfs){ //gfs = Gravitational Field Strength
        double DTotal = mass * gfs;
        String total = convertingTotal(DTotal);
        base.result("Weight", total);
    }
    
    public static void hydrostaticPressure(double height, double density, double gfs){ //Pressure of a liquid at rest.
        double DTotal = height * density * gfs;
        String total = convertingTotal(DTotal);
        base.result("Hydrostatic Pressure", total);
    }

    public static void elasticPotentialEnergy(double springConstant, double Extenstion){ // energy stored in an object when it is stretched or compressed
        double DTotal = 0.5 * springConstant * (Extenstion * Extenstion);
        String total = convertingTotal(DTotal);
        base.result("Elastic Potential Energy", total);
    }

    public static String convertingTotal(double DTotal){ // to reduce the amount of code
        return String.valueOf(DTotal);
    }

}
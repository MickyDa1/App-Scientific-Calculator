public class BackendMediumMaths{

    public static void keneticEnergy(int mass, int Velocity){
        int intTotal = 0.5 x mass x (Velocity x Velocity);
        convertingTotal(intTotal);
        base.result("Kenetic Energy", total);
    }

    public static void weight(int mass, int gfs){ //gfs = Gravitational Field Strength
        int intTotal = mass x gfs;
        convertingTotal(intTotal);
        base.result("Weight", total);
    }
    
    public static void hydrostaticPressure(int height, int density, int gfs){ //Pressure of a liquid at rest.
        int intTotal = height x density x gfs;
        convertingTotal(intTotal);
        base.result("Hydrostatic Pressure", total);
    }

    public static void elasticPotentialEnergy(int springConstant, int Extenstion){
        int intTotal = 0.5 x sprintConstant x (Extenstion x Extenstion);
        convertingTotal(intTtoal);
        base.result("Elastic Potential Energy", total);
    }

    public static convertingTotal(int intTotal){
        String total = String.valueOf(intTotal);
        return total;
    }

}
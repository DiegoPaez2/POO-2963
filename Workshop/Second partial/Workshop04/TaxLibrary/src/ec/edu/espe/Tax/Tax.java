package ec.edu.espe.Tax;

/**
 *  Tax Computer Iva
 *  @author Diego Paez
 *  @version 0.0.1
 *  @since 2019-11-21
 */
public class Tax {
    /**
     * This is the iva percentage of Ecuador
     */
    private static float ivaPercentage = 12f;
    /**
     * This function calculate iva
     * @param base is the value of the product without Iva
     * @return  Iva value
     */
    public static float computeIva(float base) {
        float iva;
        iva = base*(ivaPercentage/100);
        return iva;
    }
}
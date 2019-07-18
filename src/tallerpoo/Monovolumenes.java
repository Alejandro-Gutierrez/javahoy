
package tallerpoo;

/**
 *
 * @author CBN
 */
public class Monovolumenes extends Vehiculos{
    
    private int numerosPuerta, numerosAsiento;
    private String tipoMotor;
    private double capacidadCarga;
    private boolean puertasLaterales;
    
    
    public Monovolumenes(String Marca, String Placa, int numero_Serie, double kilometro_Recorrido, double cantidadCombustibleActual,
                         int numerosPuerta, int numerosAsiento, String tipoMotor, double capacidadCarga, boolean puertasLaterales) {
        super(Marca, Placa, numero_Serie, kilometro_Recorrido, cantidadCombustibleActual);
        this.numerosPuerta=numerosPuerta;
        this.numerosAsiento=numerosAsiento;
        this.tipoMotor=tipoMotor;
        this.capacidadCarga=capacidadCarga;
        this.puertasLaterales= puertasLaterales;
                
       
    }
    
    public String mostrarInfoMV(){
        String resultado;
        String respuesta;
        
        resultado=mostrarInfo()+"Numeros de Puerta: "+ numerosPuerta + "\n"+
                                "Numeros de Asientos: "+ numerosAsiento+"\n"+
                                "Tipo de Motor: "+ tipoMotor+"\n"+
                                "Capacidad de Carga: "+ capacidadCarga+"\n"+
                                "Puertas Laterales: "+ puertasLaterales;
        
        return resultado;
                                
    }
    
    
    
}

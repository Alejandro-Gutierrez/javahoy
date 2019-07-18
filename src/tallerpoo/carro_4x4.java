/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo;

/**
 *
 * @author CBN
 */
public class carro_4x4 extends Vehiculos{
    private String tipoMotor;
    private int numeroAsiento;

    public carro_4x4(String Marca, String Placa, int numero_Serie, double kilometro_Recorrido, double cantidadCombustibleActual,
           String tipoMotor, int numeroAsiento ) {
        super(Marca, Placa, numero_Serie, kilometro_Recorrido, cantidadCombustibleActual);
        
        this.tipoMotor=tipoMotor;
        this.numeroAsiento=numeroAsiento;
    }
    
    public String mostrarInfoCx(){
        String resultado;
        
        resultado=mostrarInfo()+ "\n"+"Tipo Motor: "+ tipoMotor+ "\n"+   
                                 "Numero de Asientos: "+ numeroAsiento;
        
        return resultado;
    }
    
    
}

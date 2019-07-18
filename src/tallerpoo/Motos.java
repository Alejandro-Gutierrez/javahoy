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
public class Motos extends Vehiculos{
    
    public Motos(String Marca, String Placa, int numero_Serie, double kilometro_Recorrido, double cantidadCombustibleActual) {
        super(Marca, Placa, numero_Serie, kilometro_Recorrido, cantidadCombustibleActual);
    }
    
    
    public String mostrarInfoM(){
        String resultado;
        
        resultado=mostrarInfo();
        
        return resultado;
    }
    
}

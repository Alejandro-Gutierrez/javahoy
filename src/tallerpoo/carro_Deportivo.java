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
public class carro_Deportivo extends Vehiculos{
    private int numerosPuerta, numerosAsiento;
    private boolean Turbo;
    private double caballoPotencia;

    public carro_Deportivo(String Marca, String Placa, int numero_Serie, double kilometro_Recorrido, double cantidadCombustibleActual,
                           int numerosPuerta, int numerosAsiento, boolean Turbo, double caballoPotencia){
        super(Marca, Placa, numero_Serie, kilometro_Recorrido, cantidadCombustibleActual);
        
        this.numerosPuerta=numerosPuerta;
        this.numerosAsiento= numerosAsiento;
        this.Turbo= Turbo;
        this.caballoPotencia=caballoPotencia;
    }
    
    public String mostrarInfoC(){
        String resultado;
        String respuesta;
        if(this.Turbo){
            respuesta="Si";
            
        }else{
            respuesta="No";
        }
        resultado=mostrarInfo()+"\n"+"Numeros de Puerta: "+ Integer.toBinaryString(numerosPuerta) + "\n"+
                                "Numeros de Asientos: "+ Integer.toBinaryString(numerosAsiento)+"\n"+
                                "Turbo "+ respuesta+"\n"+
                                "Caballo de Potencia: "+ Double.toString(caballoPotencia);
        return resultado;
                                
    }
    
}

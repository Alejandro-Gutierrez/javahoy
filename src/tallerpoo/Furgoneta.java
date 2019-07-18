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
public class Furgoneta extends Vehiculos {
    private double capacidadaCarga, Altura;

    public Furgoneta(String Marca, String Placa, int numero_Serie, double kilometro_Recorrido, double cantidadCombustibleActual,
            double capacidadaCarga,double Altura ) {
        super(Marca, Placa, numero_Serie, kilometro_Recorrido, cantidadCombustibleActual);
        
        this.capacidadaCarga=capacidadaCarga;
        this.Altura=Altura;
        
        
    }
    
    public String mostrarInfoF(){
        String Resultado;
        
        Resultado=mostrarInfo()+"\n"+"Capacidad de carga: "+capacidadaCarga+"\n"+
                                "Altura: "+Altura;
        
        return Resultado;
    }
    
    
}

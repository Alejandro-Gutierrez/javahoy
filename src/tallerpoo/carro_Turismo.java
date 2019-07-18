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
public class carro_Turismo extends Vehiculos{
    private String Tipo, TipoMotor;
    private int numeropuerta;

    public carro_Turismo(String Marca, String Placa, int numero_Serie, double kilometro_Recorrido, double cantidadCombustibleActual,
            String Tipo, String TipoMotor,int numeropuerta ) {
        super(Marca, Placa, numero_Serie, kilometro_Recorrido, cantidadCombustibleActual);
        
        this.Tipo=Tipo;
        this.TipoMotor=TipoMotor;
        this.numeropuerta=numeropuerta;
    }
    
    public String mostrarInfoCT(){
        String resultado;
        
        resultado=mostrarInfo()+"\n"+"Tipo: "+Tipo+"\n"+
                                "Tipo Motor: "+TipoMotor+"\n"+
                                "Numero puerta: "+ Integer.toString(numeropuerta);
        
        return resultado;
    }
    
            
    
}

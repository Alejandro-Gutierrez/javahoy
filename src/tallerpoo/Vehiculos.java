
package tallerpoo;


public class Vehiculos {
    protected String Marca, Placa;
    protected int numero_Serie;
    protected double kilometro_Recorrido, cantidadCombustibleActual;
    
    public Vehiculos(String Marca, String Placa, 
                    int numero_Serie,
                    double kilometro_Recorrido, 
                    double cantidadCombustibleActual){
        
        this.Marca=Marca;
        this.Placa= Placa;
        this.numero_Serie=numero_Serie;
        this.kilometro_Recorrido = kilometro_Recorrido;
        this.cantidadCombustibleActual=cantidadCombustibleActual;   
    }
    
    public String mostrarInfo(){
        String resultado;
        resultado="Marca: "+Marca+"\n"+"Placa: "+ Placa+"\n"+
                  "Numero de serie: "+ Integer.toString(numero_Serie)+"\n"+
                  "Kilometro Recorrido: "+ Double.toString(kilometro_Recorrido)+ "\n"+
                  "Cantidad de Combustible: "+ cantidadCombustibleActual;
        
        return resultado;
    }
    
    public void setcantidadCombustibleActual( double combustible){
        this.cantidadCombustibleActual=combustible;
    }
    
    public void setkilometroRecorrido(double Kilimetraje){
        this.kilometro_Recorrido=Kilimetraje;
        
    }
    
}

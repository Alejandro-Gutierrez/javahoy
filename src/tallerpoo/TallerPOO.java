
package tallerpoo;

/**
 *
 * @author CBN
 */
public class TallerPOO {

    
    public static void main(String[] args) {
        
       Monovolumenes mono;
       carro_Deportivo carro1;
       carro_Turismo carro2;
       carro_4x4 carro4x4;
       Furgoneta furgo;
       Motos moto;
        System.out.println("Monovolumen: ");
        System.out.println("");
       mono= new Monovolumenes("Montoya","a5sd4aa65s4", 5335, 56.6, 63.5, 2, 6, "acpm", 52.2, true );
       System.out.println(mono.mostrarInfoMV());
       
       System.out.println("Carro deportivo: ");
        System.out.println("");
        System.out.println("");
       carro1=new carro_Deportivo("susuki","a5sdsad4a65s4", 5335, 56.6, 63.5, 2, 6, true, 523.5);
       
        System.out.println(carro1.mostrarInfoC());
        
        
        System.out.println("Carro Turismo: ");
        
        System.out.println("");
        carro2=new carro_Turismo("monosilaba","a5sasdd4a65s4", 5335, 56.6, 63.5,"aceite","acpm",4);
        System.out.println(carro2.mostrarInfoCT());
        
        
        System.out.println("Carro 4x4: ");
        
        System.out.println("");
        carro4x4=new carro_4x4("susuki","a5sasd4a65s4", 5335, 56.6, 63.5,"acpm",4);
        System.out.println(carro4x4.mostrarInfoCx());
        
        System.out.println("Furgoneta: ");
        System.out.println("");
        furgo= new Furgoneta("susuki","asdasa65s4", 5335, 56.6, 63.5,53.5, 2.5);
        System.out.println(furgo.mostrarInfoF());
        
        System.out.println("Motos: ");
        System.out.println("");
        moto= new Motos("susuki","asdasa65s4", 5335, 56.6, 63.5);
        System.out.println(moto.mostrarInfoM());
               
        System.out.println("Modifaciones: ");
        carro1.setcantidadCombustibleActual(56.988);
        
        System.out.println("");
        System.out.println(carro1.mostrarInfoC());
               
      
       
    }
    
}

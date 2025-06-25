package paquete1;

public class Clase2 extends Clase1 {

    // Clase2 hereda de Clase1 y ambas estan en el mismo paquete
    // Por eso Clase2 puede usar los dtaos de Clase1 como si fueran suyos

    public void setData(){
        super.x = 12; // variable Publica
        this.y = 9; // variable Protected
        setZ(18);   // Ambas se utilizan igual solo que una es publica y una es privada 
        this.w = 19; // Default
       
    }

    public String getData(){
            return "Datos de Clase 2: x= " + this.x + "y= " + this.y + "z= " + getZ();
        }
    
}

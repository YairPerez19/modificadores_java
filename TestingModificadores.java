import paquete1.Clase2;

public class TestingModificadores {

    public static void main(String[] args) {
        Padre papa = new Padre();
        Hijo chamaco = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objeto2 = new Clase2();
    

        // Asignar valores a miembros de la clase padre
        // A signar valores es un metodo de acceso a los miembros 

        papa.setVariable2(6); // Propiedad variable privada
        papa.variable1 = 25; // Propiedad publica
        
        // leer valores de los miembros de la clse Padre 
        // leer valores es otro metodo de acceso a los miembros
        System.out.println("Valor Variable 2: " + papa.getVariable2());
        System.out.println("Valor Variable 1: " + papa.variable1);

        chamaco.setVariable3(16);
        chamaco.setVariablePadre();
        System.out.println("Info del chamaco: " + chamaco.toString());

        chamaca.setVariable3(98);
        chamaca.variable1 = 32; // Modificacion desde el Testing
        chamaca.setVariable2(29);// Modificacion desde el Testing 
        System.out.println("Info de la chamaca: " + chamaca.toString());

        System.out.println();
        objeto2.x = 500;
        // Esto no se puede hacer por que y es protejida y testing esta fuera del paquete1
        // objeto2.y = 100;
        objeto2.setZ(48);
        System.out.println(objeto2.getData());
        


        
        


        



        
        
    }
    
}

import paquete1.Clase1;

public class Hijo extends Padre {
    private int variable3;

    public Hijo (){
        super();
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }
    //Modificar las variables de la clase Padre
    public void setVariablePadre(){
        super.variable1 = 500; // Propiedad publica del padre
        variable1 = 250; // Propiedad publica del hijo
        super.setVariable2(-12); // Propiedad privada del padre

    }

    public void setDataClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15;
        //Datos protegidos no se pueden usar fuera del paquetre1
        objeto1.y = 22;
        objeto1.setZ(87);
        // Datos tipo default no se pueden usar fuera del paquete1
        //ccomportamiento semejante a protected
        objeto1.w = 38;
    }

    @Override
    public String toString() {
        return super.toString() + "Hijo [variable3=" + variable3 + ", variable1=" + this.variable1 + "]";
    }
    

    
    
    
}

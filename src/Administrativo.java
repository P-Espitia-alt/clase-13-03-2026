public class Administrativo extends Empleado{

    private double bonificacion;

    public Administrativo() {
    }
    //super() invoca el constructor de la super clase
    public Administrativo(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return super.toString()+'\n'
        +"Administrativo{" +'\n'
                +"bonificacion=" + bonificacion +
                '}';
    }

    //metodo comstrarInfo() va con polimorfismo a las clases hijas
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre:"+nombre+ '\n'
                +" Edad:"+edad+'\n'
                +" Salario Base:"+salarioBase+'\n'
                +" Bonificacion:"+bonificacion);
    }
}

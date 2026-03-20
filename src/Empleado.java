public class Empleado {
    protected String nombre;
    protected int edad;
    protected  double salarioBase;
    protected int cedula;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salarioBase, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return '\n'+
                ""+'\n'+
                "Cedula ▶"+cedula+'\n'+
                "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("Nombre:"+nombre+ '\n'
                +" Edad:"+edad+'\n'
                +" Salario Base:"+salarioBase);
    }
    public double calcularSalario(){
        return 0.0;
    }

}

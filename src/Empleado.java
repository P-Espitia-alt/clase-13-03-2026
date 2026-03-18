public class Empleado {
    protected String nombre;
    protected int edad;
    protected  double salarioBase;
    protected int codigo;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salarioBase, int codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return '\n'+
                ""+'\n'+
                "Codigo ▶"+ codigo+'\n'
                +"Empleado{" +
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


}

public class PorHoras extends Empleado{
    private double horasTrabajadas;
    private double valorHora;

    public PorHoras() {
    }

    public PorHoras(String nombre, int edad, double salarioBase, double horasTrabajadas, double valorHora) {
        super(nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString()+'\n'
                 +"PorHoras{" +'\n'
                +"horasTrabajadas=" + horasTrabajadas +'\n'
                +"valorHora=" + valorHora +
                '}';
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre:"+nombre+ '\n'
                +" Edad:"+edad+'\n'
                +" Salario Base:"+salarioBase+'\n'
                +" Horas Trabajadas:"+horasTrabajadas+'\n'
                +" Valor Por Hora:"+valorHora);
    }
}

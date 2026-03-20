public class Ventas extends Empleado{
    private double totalVentasMes;
    private double porcentajeComision;

    public Ventas() {
    }

    public Ventas(String nombre, int edad, double salarioBase, int codigo, double totalVentasMes, double porcentajeComision) {
        super(nombre, edad, salarioBase, codigo);
        this.totalVentasMes = totalVentasMes;
        this.porcentajeComision = porcentajeComision;
    }

    public double getTotalVentasMes() {
        return totalVentasMes;
    }

    public void setTotalVentasMes(double totalVentasMes) {
        this.totalVentasMes = totalVentasMes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String toString() {
        return super.toString()+'\n'
                +"Ventas{" +'\n'
                +"Total de ventas este mes:" + totalVentasMes +'\n'
                +"Porcentaje de Comision=" + porcentajeComision +
                '}';
    }




    @Override
    public void mostrarInfo(){
        System.out.println("Nombre:"+nombre+ '\n'
                +" Edad:"+edad+'\n'
                +" Salario Base:"+salarioBase+'\n'
                +" Total de ventas este mes:"+totalVentasMes
                +" Comision:"+porcentajeComision);
    }

    @Override
    public double calcularSalario(){
        double decimalP= getPorcentajeComision()/100;
        double salarioC=(getSalarioBase()+(getSalarioBase()*getTotalVentasMes()*decimalP));
        return salarioC;
    }
}

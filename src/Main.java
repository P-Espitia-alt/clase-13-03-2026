import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        List<Empleado> empleadosList = new ArrayList<>();
        int op0, op1;

        while (true){
            System.out.println("");
            System.out.println("Bienvendido al sistema de registro de la empresa Paulis"+'\n'+
                    "Digite la opcion que desee:"+'\n'+
                    "1. Registrar Empleado."+'\n'+
                    "2. Mostrar Empleados."+'\n'+
                    "3. Buscar por codigo."+'\n'+
                    "4. Aumentar Salario Base."+'\n'+
                    "5. Mostrar Empleados Mayores de Edad."+'\n'+
                    "0. Salir");
            System.out.print("Su eleccion: ");
            op0= tc.nextInt();
            tc.nextLine();
            if (op0 == 0){
                System.out.println("Saliendo...");
                break;
            }
            switch (op0){

                case 1:
                    System.out.println("");
                    System.out.println( "1. Registrar Empleado."+'\n'+
                            "Que tipo de empleado quiere registrar?"+'\n'+
                            "1. Empleado Administrativo"+'\n'+
                            "2. Empleado de Ventas"+'\n'+
                            "3. Empleado Por Horas");
                    System.out.print("Su eleccion: ");
                    op1=tc.nextInt();
                    switch (op1){
                        case 1:
                            int codigoA=0;
                            tc.nextLine();
                            System.out.println("");
                            System.out.println("1. Empleado Administrativo");
                            //public Administrativo(String nombre, int edad, double salarioBase, double bonificacion) {
                            System.out.println("Ingrese");
                            System.out.print("Nombre del Empleado: ");
                            String nA=tc.nextLine();
                            System.out.print("Edad: ");
                            int eA=tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbA=tc.nextDouble();
                            System.out.print("Bonificacion: ");
                            double  bA=tc.nextDouble();

                            Empleado empA = new Administrativo(nA, eA, sbA, codigoA, bA);
                            empleadosList.add(empA);
                            break;
                        case 2:
                            int codigoV=0;
                            tc.nextLine();
                            System.out.println("");
                            System.out.println("2. Empleado de Ventas");
                            // public Ventas(String nombre, int edad, double salarioBase, double totalVentasMes, double porcentajeComision) {
                            System.out.println("Ingrese");
                            System.out.print("Nombre del Empleado: ");
                            String nV=tc.nextLine();
                            System.out.print("Edad: ");
                            int eV=tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbV=tc.nextDouble();
                            System.out.print("Total de Ventas Este Mes: ");
                            double  vmV=tc.nextDouble();
                            System.out.print("Porcentaje de Comision: ");
                            double  pV=tc.nextDouble();

                            Empleado empV = new Ventas(nV, eV, sbV, codigoV, vmV, pV);
                            empleadosList.add(empV);

                            break;
                        case 3:
                            int codigoH=0;
                            tc.nextLine();
                            System.out.println("");
                            System.out.println("3. Empleado Por Horas");
                            // public PorHoras(String nombre, int edad, double salarioBase, double horasTrabajadas, double valorHora) {
                            System.out.println("Ingrese");
                            System.out.print("Nombre del Empleado: ");
                            String nH=tc.nextLine();
                            System.out.print("Edad: ");
                            int eH=tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbH=tc.nextDouble();
                            System.out.println("Horas Trabajadas");
                            double htH= tc.nextDouble();
                            System.out.println("Valor por Hora");
                            double vhH= tc.nextDouble();

                            Empleado empH = new PorHoras(nH, eH, sbH, codigoH, htH, vhH);
                            empleadosList.add(empH);
                            break;
                        default:
                            System.out.println("Opcion invalida"+'\n'+
                                    "Intentelo mas tarde. Regresando al menu principal...");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("2. Mostrar Empleados.");
                    for (Empleado p : empleadosList){
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("3. Buscar por codigo.");
                    System.out.print("ingrese el codigo ▶ ");
                    int buscar= tc.nextInt();
                    if(empleadosList.isEmpty()){
                        System.out.println("La lista esta vacia");
                    }
                    for (Empleado p : empleadosList){
                        if(p.getCodigo() == buscar){
                            System.out.println(p.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("4. Aumentar Salario Base.");
                    System.out.print("Ingrese el Nombre del Empleado"+'\n'+
                            "Nombre: ");
                    String buscarN= tc.nextLine();
                    if(empleadosList.isEmpty()){
                        System.out.println("La lista esta vacia");
                    }
                    for (Empleado p : empleadosList){
                        if(p.getNombre().equalsIgnoreCase(buscarN)){
                            System.out.println(p.toString());
                            System.out.print("Nuevo Sabario Base: ");
                            double nsb = tc.nextDouble();
                            p.setSalarioBase(nsb);
                        }
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("5. Mostrar Empleados Mayores de Edad.");
                    if(empleadosList.isEmpty()){
                        System.out.println("La lista esta vacia");
                    }
                    for (Empleado p: empleadosList){
                        if (p.getEdad() >= 18){
                            System.out.println("Empleados Mayores de Edad:");
                            System.out.println(p);
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion invalida"+'\n'+
                            "Intentelo mas tarde. Saliendo...");
                    break;
            }
        }





    }
}
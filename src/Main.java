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
                    "3. Buscar Empleado, Modificar Salario Base y Calcular Salario Bruto"+'\n'+
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
                            tc.nextLine();
                            System.out.println("");
                            System.out.println("1. Empleado Administrativo");
                            //public Administrativo(String nombre, int edad, double salarioBase, double bonificacion) {
                            System.out.println("Ingrese");
                            System.out.print("Nombre del Empleado: ");
                            String nA=tc.nextLine();
                            System.out.print("Edad: ");
                            int eA=tc.nextInt();
                            System.out.print("Cedula: ");
                            int cedulaA= tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbA=tc.nextDouble();
                            System.out.print("Bonificacion: ");
                            double  bA=tc.nextDouble();

                            Empleado empA = new Administrativo(nA, eA, sbA, cedulaA, bA);
                            empleadosList.add(empA);
                            break;
                        case 2:

                            tc.nextLine();
                            System.out.println("");
                            System.out.println("2. Empleado de Ventas");
                            // public Ventas(String nombre, int edad, double salarioBase, double totalVentasMes, double porcentajeComision) {
                            System.out.println("Ingrese");
                            System.out.print("Nombre del Empleado: ");
                            String nV=tc.nextLine();
                            System.out.print("Edad: ");
                            int eV=tc.nextInt();
                            System.out.print("Cedula: ");
                            int cedulaV= tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbV=tc.nextDouble();
                            System.out.print("Total de Ventas Este Mes: ");
                            double  vmV=tc.nextDouble();
                            System.out.print("Porcentaje de Comision (%): ");
                            double  pV=tc.nextDouble();

                            Empleado empV = new Ventas(nV, eV, sbV, cedulaV, vmV, pV);
                            empleadosList.add(empV);

                            break;
                        case 3:

                            tc.nextLine();
                            System.out.println("");
                            System.out.println("3. Empleado Por Horas");
                            // public PorHoras(String nombre, int edad, double salarioBase, double horasTrabajadas, double valorHora) {
                            System.out.println("Ingrese");
                            System.out.print("Nombre del Empleado: ");
                            String nH=tc.nextLine();
                            System.out.print("Edad: ");
                            int eH=tc.nextInt();
                            System.out.print("Cedula: ");
                            int cedulaH= tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbH=tc.nextDouble();
                            System.out.print("Horas Trabajadas: ");
                            double htH= tc.nextDouble();
                            System.out.print("Valor por Hora: ");
                            double vhH= tc.nextDouble();

                            Empleado empH = new PorHoras(nH, eH, sbH, cedulaH, htH, vhH);
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
                    System.out.println("Ingrese Segun Corresponda:"+'\n'+
                            "1. Mostrar Todos Los Empleados"+'\n'+
                            "2. Mostrar Empleados Administrativos"+'\n'+
                            "3. Mostrar Empleados De Ventas"+'\n'+
                            "4. Mostrar Empleados Por Horas");
                    int op2= tc.nextInt();
                    switch (op2){
                        case 1:
                            if(empleadosList.isEmpty()){
                                System.out.println("La lista esta vacia");
                            }
                            for (Empleado p : empleadosList){
                                System.out.println(p.toString());
                            }
                            break;

                        case 2:
                            if(empleadosList.isEmpty()){
                                System.out.println("La lista esta vacia");
                            }
                            for(Empleado p : empleadosList){
                                if (p instanceof Administrativo){
                                    System.out.println(p);
                                    break;
                                }else{
                                    System.out.println("No Se Registraron Empleados");
                                }
                            }
                            break;
                        case 3:
                            if(empleadosList.isEmpty()){
                            System.out.println("La lista esta vacia");
                            }
                            for(Empleado p : empleadosList){
                                if (p instanceof Ventas){
                                    System.out.println(p);
                                    break;
                                }else{
                                    System.out.println("No Se Registraron Empleados");
                                }
                            }
                            break;
                        case 4:
                            for(Empleado p : empleadosList){
                                if (p instanceof PorHoras){
                                    System.out.println(p);
                                    break;
                                }else{
                                    System.out.println("No Se Registraron Empleados");
                                }
                            }
                            break;
                        default:
                            System.out.println("Opcion invalida"+'\n'+
                                    "Intentelo mas tarde. Volviendo al menu principal...");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("");
                    System.out.println("3. Buscar Empleado, Modificar Salario Base y Calcular Salario Bruto.");
                    System.out.print("Ingrese la cedula del Empleado ▶ ");
                    int buscar= tc.nextInt();
                    if(empleadosList.isEmpty()){
                        System.out.println("La lista esta vacia");
                        break;
                    }else{
                        for (Empleado p : empleadosList){
                            if(p.getCedula() == buscar){
                                System.out.println(p.toString());
                            }
                        }
                        while (true){
                            //unaVezSeBuscaElEmpleadoIngresaALasAcciones
                            System.out.println('\n'+"Ingrese Segun Corresponda:"+'\n'+
                                    "1. Aumentar Salario Base"+'\n'+
                                    "2. Calcular Salario bruto."+'\n'+
                                    "0. Volver Al Menu Principal");
                            System.out.print("Su eleccion: ");
                            int op3= tc.nextInt();

                            if (op3 == 0){
                                System.out.println("Volviendo al menu principal...");
                                break;
                            }
                            switch (op3){
                                case 1:
                                    System.out.println("");
                                    System.out.println("1. Aumentar Salario Base.");
                                    if(empleadosList.isEmpty()){
                                        System.out.println("La lista esta vacia");
                                    }else{
                                        for (Empleado p : empleadosList){
                                            if(p.getCedula()==buscar){
                                                System.out.print("Nuevo Sabario Base: ");
                                                p.setSalarioBase(buscar);
                                                double nsb = tc.nextDouble();
                                                p.setSalarioBase(nsb);
                                                System.out.println(p.toString());
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("");
                                    System.out.println("2. Calcular Salario Bruto.");
                                    for (Empleado p : empleadosList){
                                        if(p.getCedula()==buscar){
                                            System.out.println(p.calcularSalario());
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Opcion invalida."+'\n'+
                                            "Volviendo Al Menu Principal");
                                    break;
                            }
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
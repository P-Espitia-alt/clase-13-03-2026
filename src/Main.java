import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        List<Empleado> empleadosList = new ArrayList<>();
        int op0, op1;

        while (true){
            System.out.println("Bienvendido al sistema de registro de la empresa Paulis"+'\n'+
                    "Digite la opcion que desee:"+'\n'+
                    "1. Registrar Empleado."+'\n'+
                    "2. Mostrar Empleados."+'\n'+
                    "3. buscar por id."+'\n'+
                    "4. Aumentar Salario Base."+'\n'+
                    "5. Mostrar Empleados Mayores de Edad."+'\n'+
                    "0. Salir");
            op0= tc.nextInt();
            tc.nextLine();
            if (op0 == 0){
                System.out.println("Saliendo...");
                break;
            }
            switch (op0){

                case 1:
                    System.out.println( "1. Registrar Empleado."+'\n'+
                            "Que tipo de empleado quiere registrar?"+'\n'+
                            "1. Empleado Administrativo"+'\n'+
                            "2. Empleado de Ventas"+'\n'+
                            "3. Empleado Por Horas");
                    op1=tc.nextInt();
                    switch (op1){
                        case 1:
                            tc.nextLine();
                            System.out.println("1. Empleado Administrativo");
                            //public Administrativo(String nombre, int edad, double salarioBase, double bonificacion) {
                            System.out.println("Ingrese:");
                            System.out.print("Nombre del Empleado: ");
                            String nA=tc.nextLine();
                            System.out.print("Edad: ");
                            int eA=tc.nextInt();
                            System.out.print("Salario Base: ");
                            double sbA=tc.nextDouble();
                            System.out.print("Bonificacion: ");
                            double  bA=tc.nextDouble();

                            Empleado empA = new Administrativo(nA, eA, sbA, bA);
                            empleadosList.add(empA);
                            break;
                        case 2:
                            System.out.println("2. Empleado de Ventas");

                            break;
                        case 3:
                            System.out.println("3. Empleado Por Horas");
                            break;
                        default:
                            System.out.println("Opcion invalida"+'\n'+
                                    "Intentelo mas tarde. Regresando al menu principal...");
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida"+'\n'+
                            "Intentelo mas tarde. Saliendo...");
                    break;
            }
        }





    }
}
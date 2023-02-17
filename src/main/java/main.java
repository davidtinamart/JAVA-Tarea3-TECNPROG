import java.util.Scanner;

//@author DavidTinaut

public class main {


    public static void main(String[] args) {

        //1. El tiempo versión 1 ------------------------------------------------------------


        System.out.println("Introduce la temperatura: ");
        Scanner teclado = new Scanner(System.in);
        int temperatura = teclado.nextInt();

        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else {
            System.out.println("No hay riesgo de hielo");
        }


        //2. El tiempo versión 2
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura2 = teclado2.nextInt();

        if (temperatura2 < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temperatura2 >= 2 && temperatura2 < 15) {
            System.out.println("Hace frío");
        } else if (temperatura2 >= 15 && temperatura2 < 30) {
            System.out.println("Buena temperatura");
        } else if (temperatura2 >= 30) {
            System.out.println("Demasiado calor");
        }

        //3. El nombre del mes ------------------------------------------------------------
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Introduce el número del mes: ");
        int mes = teclado3.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No existe ese mes");

                break;
        }

        // 4. El tiempo de coccion ------------------------------------------------------------
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Introduce el tipo de carne: vacuno o cordero ");
        String carne = teclado4.nextLine();
        System.out.println("Introduce el modo de cocción: casi cruda, al punto o bien hecha ");
        String coccion = teclado4.nextLine();
        /*System.out.println("Introduce el peso: ");
        int peso = teclado4.nextInt();*/


        if (carne.equals("vacuno")) {
            if (coccion.equals("casi cruda")) {
                System.out.println("El tiempo de cocción es de " + (60 * 10) + " segundos");
            } else if (coccion.equals("al punto")) {
                System.out.println("El tiempo de cocción es de " + (60 * 17) + " segundos");
            } else if (coccion.equals("bien hecha")) {
                System.out.println("El tiempo de cocción es de " + (60 * 25) + " segundos");
            }
        }
        else if (carne.equals("cordero")) {
            if (coccion.equals("casi cruda")) {
                System.out.println("El tiempo de cocción es de " + (60 * 15) + " segundos");
            } else if (coccion.equals("al punto")) {
                System.out.println("El tiempo de cocción es de " + (60 * 25) + " segundos");
            } else if (coccion.equals("bien hecha")) {
                System.out.println("El tiempo de cocción es de " + (60 * 40) + " segundos");
            }
            else {
                System.out.println("no existe ese tiempo de coccion");
            }
        }
        else{
            System.out.println("no existe ese tipo de carne");
        }

        //5. La Nómina ------------------------------------------------------------

        Scanner teclado5 = new Scanner(System.in);
        System.out.println("¿Apellido de la persona?");
        String apellido = teclado5.nextLine();
        System.out.println("¿Nombre de la persona?");
        String nombre = teclado5.nextLine();
        System.out.println("¿Puesto?");
        System.out.println("1 - Agente de servicio");
        System.out.println("2 - Empleado de oficina");
        System.out.println("3 - Directivo");
        int puesto = teclado5.nextInt();
        System.out.println("Número de horas trabajadas");
        int horas = teclado5.nextInt();
        System.out.println("¿Tarifa horaria?");
        double tarifa = teclado5.nextDouble();
        System.out.println("¿Número de hijos?");
        int hijos = teclado5.nextInt();
        double salarioBruto = 0;
        double salarioNeto = 0;
        double primaFamiliar = 0;
        double deducciones = 0;
        double salarioNetoPagar = 0;
        String estado = "";

        if (puesto == 1) {
            estado = "Agente de servicio";
        } else if (puesto == 2) {
            estado = "Empleado de oficina";
        } else if (puesto == 3) {
            estado = "Directivo";
        }

        if (horas <= 169) {
            salarioBruto = horas * tarifa;
        } else if (horas > 169 && horas <= 180) {
            salarioBruto = (169 * tarifa) + ((horas - 169) * (tarifa * 1.5));
        } else if (horas > 180) {
            salarioBruto = (169 * tarifa) + (11 * (tarifa * 1.5)) + ((horas - 180) * (tarifa * 1.6));
        }
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos > 2) {
            primaFamiliar = 70 + ((hijos - 2) * 20);
        }
        deducciones = (salarioBruto * 0.0349) + (salarioBruto * 0.0615) + (salarioBruto * 0.0095) + (salarioBruto * 0.0844) + (salarioBruto * 0.0305) + (salarioBruto * 0.0381) + (salarioBruto * 0.0102);
        salarioNeto = salarioBruto - deducciones;
        salarioNetoPagar = salarioNeto + primaFamiliar;
        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.println("Estado : " + estado);
        System.out.println("Salario bruto: " + salarioBruto + " € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)");
        System.out.println("Cálculo de deducciones:");
        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible");
        System.out.println(salarioBruto + " € × 3,49 % = " + (salarioBruto * 0.0349) + " €");
        System.out.println("Contribución de contingencias comunes no imponible");
        System.out.println(salarioBruto + " € × 6,15 % = " + (salarioBruto * 0.0615) + " €");
        System.out.println("Seguro médico");
        System.out.println(salarioBruto + " € × 0,95 % = " + (salarioBruto * 0.0095) + " €");
        System.out.println("Fondo de pensiones");
        System.out.println(salarioBruto + " € × 8,44 % = " + (salarioBruto * 0.0844) + " €");
        System.out.println("Seguro de desempleo");
        System.out.println(salarioBruto + " € × 3,05 % = " + (salarioBruto * 0.0305) + " €");
        System.out.println("Pensión complementaria (Entidad privada)");
        System.out.println(salarioBruto + " € × 3,81 % = " + (salarioBruto * 0.0381) + " €");
        System.out.println("Contribución de jubilación anticipada");
        System.out.println(salarioBruto + " € × 1,02 % = " + (salarioBruto * 0.0102) + " €");
        System.out.println("Deducciones totales de los empleados: " + deducciones + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");
        System.out.println("Prima familiar: " + primaFamiliar + " €");
        System.out.println("Salario neto a pagar: " + salarioNetoPagar + " €");




    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        int opcion;

        System.out.println("Sistema de ventas y comisiones");

        do {
            // menu principal
            System.out.println("\n1. Registrar empleado");
            System.out.println("2. Registrar venta");
            System.out.println("3. Ver comision de un empleado");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre del empleado: ");
                String nombre = sc.nextLine();
                Empleado nuevo = new Empleado(nombre);
                empleados.add(nuevo);
                System.out.println("Empleado guardado");

            } else if (opcion == 2) {
                if (empleados.size() == 0) {
                    System.out.println("Primero tienes que registrar un empleado");
                } else {

                    System.out.println("Empleados:");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
                    }
                    System.out.print("Cual empleado vendio? ");
                    int numEmp = sc.nextInt() - 1;
                    sc.nextLine();

                    if (numEmp < 0 || numEmp >= empleados.size()) {
                        System.out.println("Ese numero no existe");
                    } else {
                        Empleado emp = empleados.get(numEmp);

                        System.out.println("1. Casa");
                        System.out.println("2. Lote");
                        System.out.println("3. Apartamento");
                        System.out.print("Que tipo de propiedad vendio? ");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Valor de la venta: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        Propiedad p = null;

                        switch (tipo) {
                            case 1:
                                p = new Casa(valor);
                                break;
                            case 2:
                                p = new Lote(valor);
                                break;
                            case 3:
                                p = new Apartamento(valor);
                                break;
                            default:
                                System.out.println("Tipo invalido");
                        }

                        if (p != null) {
                            emp.registrarVenta(p);
                            System.out.println("Venta registrada");
                        }
                    }
                }

            } else if (opcion == 3) {
                if (empleados.size() == 0) {
                    System.out.println("No hay empleados registrados todavia");
                } else {
                    System.out.println("Empleados:");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
                    }
                    System.out.print("De cual quieres ver la comision? ");
                    int numEmp = sc.nextInt() - 1;

                    if (numEmp >= 0 && numEmp < empleados.size()) {
                        Empleado emp = empleados.get(numEmp);
                        double comision = emp.calcularComisionTotal();
                        System.out.println(emp.getNombre() + " gano $" + comision + " en comisiones");
                    } else {
                        System.out.println("Ese empleado no existe");
                    }
                }

            } else if (opcion == 0) {
                System.out.println("Chao, gracias por usar el programa");

            } else {
                System.out.println("Esa opcion no existe");
            }

        } while (opcion != 0);

        sc.close();
    }
}
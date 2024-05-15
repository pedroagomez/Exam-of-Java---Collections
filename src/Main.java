import java.sql.SQLOutput;
import java.util.Scanner;
import Entrada.*;
public class Main {

    public static void main(String [] args)
    {
        menu();
    }
    public static void menu()
    {
        Recital recital=new Recital("Heavy","Domingo","Mar del plata");
        int opcion;
        Scanner scanner= new Scanner(System.in);
        do {
            String cadena = """
                Bienvenidos al sistema
                \t[1]Cargar entradas
                \t[2]Listar entradas disponibles
                \t[3]Ver la cantidad de entradas vendidas por tipo
                \t[4]Ver total recaudado
                \t[5]Vender entrada
                \t[0] Salir
                """;
            System.out.println(cadena);
            opcion= scanner.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    ingresarEntradas(scanner,recital);
                    break;
                }
                case 2:
                {
                    listarEntradas(recital);
                    break;
                }
                case 3:
                {
                    verEntradasVendidas(scanner,recital);
                    break;
                }
                case 4:
                {
                    verTotalRecaudado(recital);
                    break;
                }
                case 5:
                {
                    venderEntrada(scanner,recital);
                    break;
                }
            }
        }while(opcion!=0);

    }

    public static void ingresarEntradas(Scanner scanner,Recital recital)
    {
        Entrada entrada1= new EntradaVip(3000,true,"Comida");
        Entrada entrada2= new EntradaVip(3000,true,"Comida");
        Entrada entrada3= new EntradaNormal(2500,true,ZonaEntrada.Campo);
        Entrada entrada4= new EntradaNormal(2200,true,ZonaEntrada.Codo);
        Entrada entrada5= new EntradaNormal(2800,true,ZonaEntrada.Platea);
        recital.cargarEntradas("Entrada Vip",entrada1);
        recital.cargarEntradas("Entrada Vip",entrada2);
        recital.cargarEntradas("Entrada Normal",entrada3);
        recital.cargarEntradas("Entrada Normal",entrada4);
        recital.cargarEntradas("Entrada Normal",entrada5);
    }

    public static void listarEntradas(Recital recital)
    {
        System.out.println(recital.listarEntradasDisponibles());
    }
    public static void verEntradasVendidas(Scanner scanner,Recital recital)
    {
        scanner.nextLine();
        System.out.println("Ingrese el tipo de entrada (Entrada Vip / Entrada Normal)");
        String entrada=scanner.nextLine();
        System.out.println("La cantidad de entradas vendidas del tipo " + entrada+ " es " +recital.cantidadEntradasPorTipo(entrada));
    }

    public static void verTotalRecaudado(Recital recital)
    {
        System.out.println("El total recaudado es : " +recital.totalRecaudado());
    }

    public static void venderEntrada(Scanner scanner, Recital recital)
    {
        scanner.nextLine();
        System.out.println("Ingrese el tipo de entrada que desea comprar (Entrada Vip / Entrada Normal)");
        String entrada=scanner.nextLine();
        System.out.println(recital.venderEntrada(entrada));
    }
}



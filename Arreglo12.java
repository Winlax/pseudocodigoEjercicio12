import java.util.*;

public class Arreglo12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int mujeres = 0;
        int hombres = 0;
        int edades = 0;
        double sumaMujeres = 0;
        double sumaHombres = 0;
        double sumaEdades = 0;
        String sexo;
        int edad;
        double altura = 0;

        do {

            System.out.print("Ingrese su sexo (F/M): ");
            sexo = teclado.next();

            System.out.print("Ingrese su edad: ");
            edad = teclado.nextInt();

            if ("F".equalsIgnoreCase(sexo)) {

                System.out.print("Ingrese su altura: ");
                altura = teclado.nextDouble();

                sumaMujeres += altura;
                mujeres += 1;

            }

            if ("M".equalsIgnoreCase(sexo)) {

                System.out.print("Ingrese su altura: ");
                altura = teclado.nextDouble();

                sumaHombres += altura;
                hombres += 1;
                
            }

            sumaEdades += edad;
            edades += 1;

        } while (altura >= 0);

        double promedioAlturaM = sumaMujeres / mujeres;
	    double promedioAlturaH = sumaHombres / hombres;
	    double promedioEdades = sumaEdades / edades;

        System.out.println("El promedio de altura de las mujeres es: "+promedioAlturaM);
        System.out.println("El promedio de altura de los hombres es: "+promedioAlturaH);
        System.out.println("El promedio de edad de los participantes es: "+promedioEdades);

    }
}
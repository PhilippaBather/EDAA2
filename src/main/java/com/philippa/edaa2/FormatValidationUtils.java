package com.philippa.edaa2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatValidationUtils {

    //declaramos las variables
    private static final Scanner sc = new Scanner(System.in);

    private FormatValidationUtils() {}

    /**
     * Devuelve valor de integer válido.
     *
     * @return int
     */
    public static int validateInteger(){
        int response = -1;
        boolean isError;

        do{
            try {
                response = sc.nextInt();
                isError = false;
            } catch (InputMismatchException ime) {
                sc.next();
                System.out.println("Entrada inválida.  Introduzca un número por favor: ");
                isError = true;
            }
        } while (isError);

        return response;
    }

    /**
     * Devuelve un valor de double válido.
     *
     * @return
     */
    public static double validateDouble(){
        double response = -1;
        boolean isError;

        do{
            try {
                response = sc.nextDouble();
                isError = false;
            } catch (InputMismatchException ime) {
                sc.next();
                System.out.println("Entrada inválida.  Introduzca un número por favor: ");
                isError = true;
            }
        } while (isError);

        return response;
    }


    /**
     * Devuelve un valor de booleano válido.
     *
     * @return
     */
    public static boolean validateBoolean(){
        boolean isError;
        boolean response = false;

        do{
            try {
                response = sc.nextBoolean();
                isError = false;
            } catch (InputMismatchException ime) {
                sc.next();
                System.out.println("Entrada inválida.  Introduzca un booleano por favor: ");
                isError = true;
            }
        } while (isError);

        return response;
    }

}

package com.philippa.edaa2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatValidationUtils {

    //declaramos las variables
    private static final Scanner sc = new Scanner(System.in);

    private FormatValidationUtils() {}

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
}

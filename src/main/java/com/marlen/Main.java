package com.marlen;

import com.marlen.exepciones.NumeroInvalidoExcepcion;
import com.marlen.operaciones.Operacion;
import com.marlen.operaciones.OperacionFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int operacionSeleccionada = solicitarOperacionAEjecutar();
            Operacion operacion = OperacionFactory.obtenerOperacion(operacionSeleccionada);
            assert operacion != null;
            operacion.ejecutarOperacion();
        } catch (NumeroInvalidoExcepcion error) {
            System.out.println(error.getMessage());
            main(new String[0]);
        }

    }

    private static int solicitarOperacionAEjecutar() throws NumeroInvalidoExcepcion {
        int operacionSeleccionada = 0;
        try {
            Scanner entradaEscaner = new Scanner (System.in);

            System.out.println ("Por favor introduzca el número de la operación que desea realizar:");
            System.out.println ("1. suma:");
            System.out.println ("2. resta:");
            System.out.println ("3. multiplicación:");
            System.out.println ("4. división:");

            operacionSeleccionada = entradaEscaner.nextInt();
        } catch (InputMismatchException error) {
            throw new NumeroInvalidoExcepcion("La opción no es valida, intenta nuevamente");
        }
        return operacionSeleccionada;
    }

}
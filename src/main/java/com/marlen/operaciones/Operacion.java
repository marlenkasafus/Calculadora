package com.marlen.operaciones;

import com.marlen.exepciones.NumeroInvalidoExcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Operacion {
    protected int primerValor;
    protected int segundoValor;

    public Operacion() throws NumeroInvalidoExcepcion {
        try {
            Scanner entradaEscaner = new Scanner (System.in);
            System.out.println ("Ingresa el primer número");
            primerValor = entradaEscaner.nextInt();

            System.out.println ("Ingresa el segundo número");
            segundoValor = entradaEscaner.nextInt();
        } catch (InputMismatchException error) {
            throw new NumeroInvalidoExcepcion("Se ha ingresado un número invalido, intenta nuevamente");
        }

    }

    public abstract void ejecutarOperacion() throws NumeroInvalidoExcepcion;
}

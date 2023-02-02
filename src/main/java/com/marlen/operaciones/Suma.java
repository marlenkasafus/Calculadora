package com.marlen.operaciones;

import com.marlen.exepciones.NumeroInvalidoExcepcion;

public class Suma extends Operacion{
    public Suma() throws NumeroInvalidoExcepcion {
        super();
    }

    @Override
    public void ejecutarOperacion() {
        int resultado = primerValor + segundoValor;
        System.out.println("El resultado de la suma es: " + resultado);

    }
}

package com.marlen.operaciones;

import com.marlen.exepciones.NumeroInvalidoExcepcion;

public class Resta extends Operacion{
    public Resta() throws NumeroInvalidoExcepcion {
        super();
    }

    @Override
    public void ejecutarOperacion() {
        int resultado = primerValor - segundoValor;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}

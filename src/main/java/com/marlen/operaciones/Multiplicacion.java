package com.marlen.operaciones;

import com.marlen.exepciones.NumeroInvalidoExcepcion;

public class Multiplicacion extends Operacion{
    public Multiplicacion() throws NumeroInvalidoExcepcion {
        super();
    }

    @Override
    public void ejecutarOperacion() {
        int resultado = primerValor * segundoValor;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

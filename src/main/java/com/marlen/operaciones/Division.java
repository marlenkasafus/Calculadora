package com.marlen.operaciones;

import com.marlen.exepciones.NumeroInvalidoExcepcion;

import java.math.BigDecimal;
import java.math.MathContext;

public class Division extends Operacion{
    public Division() throws NumeroInvalidoExcepcion {
        super();
    }

    @Override
    public void ejecutarOperacion() throws NumeroInvalidoExcepcion {
        if (primerValor == 0 || segundoValor == 0) {
            throw new NumeroInvalidoExcepcion("Para dividir ningún numero puede ser 0");
        }
        BigDecimal resultado = BigDecimal.valueOf(primerValor).divide(BigDecimal.valueOf(segundoValor), MathContext.DECIMAL32);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

package com.marlen.operaciones;

import com.marlen.exepciones.NumeroInvalidoExcepcion;

public class OperacionFactory {

    public static Operacion obtenerOperacion(int operacionSeleccionada){
        try {
            if (operacionSeleccionada == 1){
                return new Suma();
            } else if (operacionSeleccionada == 2) {
                return new Resta();
            } else if (operacionSeleccionada == 3) {
                return new Multiplicacion();
            } else if (operacionSeleccionada == 4) {
                return new Division();
            }

        }catch (NumeroInvalidoExcepcion error) {
            System.out.println(error.getMessage());
            return obtenerOperacion(operacionSeleccionada);
        }
        return null;
    }
}

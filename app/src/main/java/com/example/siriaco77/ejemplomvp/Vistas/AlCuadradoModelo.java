package com.example.siriaco77.ejemplomvp.Vistas;

public class AlCuadradoModelo  implements AlCuadrado.modelo {

    private AlCuadrado.presentador presentador;
    private double resultado;


    public AlCuadradoModelo(AlCuadrado.presentador presentador) {
        this.presentador = presentador;
    }

    @Override
    public void alCuadrado(String data) {

        resultado =  Double.valueOf(data)*2;

        presentador.showResults(String.valueOf(resultado));
//commit
    }
}

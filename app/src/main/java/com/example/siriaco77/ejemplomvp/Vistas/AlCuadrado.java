package com.example.siriaco77.ejemplomvp.Vistas;

public interface AlCuadrado {

    //funciones que deberan impementar las clses del patron todassss

    interface view{
        void showResults(String result);
    }

    interface presentador{

        void showResults(String result);
        void alCuadrado(String data);

    }

    interface modelo{
        void alCuadrado(String data);
    }
}

package com.example.siriaco77.ejemplomvp.Vistas;

public class AlCuadradoPresentador implements AlCuadrado.presentador {

    //declaramos la interfaces de vista y modelo

    private AlCuadrado.view view ;
    private AlCuadrado.modelo modelo;

    public AlCuadradoPresentador(AlCuadrado.view view) {
        this.view= view;
        modelo = new AlCuadradoModelo(this);

    }


    @Override
    public void showResults(String result) {
        if(view !=null){
            view.showResults(result);
        }


    }

    @Override
    public void alCuadrado(String data) {

        if(view !=null){
            modelo.alCuadrado(data);
        }

    }


}

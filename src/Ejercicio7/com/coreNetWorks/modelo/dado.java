package Ejercicio7.com.coreNetWorks.modelo;

import java.util.Random;

public class dado {
    //1.atributos
    private int dado;
    //metodos
    Random numeroAleatorio = new Random();
    private  String ObtenerImagen(int numeroAleatorio) {
        switch (numeroAleatorio) {
            case 1:
                return dibujarUno();
            //break;
            case 2:
                return dibujarDos();
            //break;
            case 3:
                return dibujartres();
            //break;
            case 4:
                return dibujarCuatro();
            //break;
            case 5:
                return dibujarCinco();
            //break;
            case 6:
                return dibujarSeis();
            //break;
        }

        return null;
    }
    //dibujos del 1 al 6
    public String dibujarUno(){
        return "x" ;
    }
    public String dibujarDos(){
        return "x x" ;
    }
    public String dibujartres(){
        return "x x x" ;
    }
    public String dibujarCuatro(){
        return "x x"+"/n"+"xx" ;
    }
    public String dibujarCinco(){
        return "x x\"+ '\\'' +\" x\"+ '\\'' +\" x x" ;
    }
    public String dibujarSeis(){
        return "x x x"+ '\'' +" x x x" ;
    }

        public void setDado() {
        this.dado = numeroAleatorio.nextInt(1,6);
    }

    //constructores

    public dado() {
    }

    //getters y setters


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Random getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(Random numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
}

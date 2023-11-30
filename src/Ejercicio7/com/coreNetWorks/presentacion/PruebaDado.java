package Ejercicio7.com.coreNetWorks.presentacion;

import Ejercicio7.com.coreNetWorks.modelo.dado;

import java.util.Scanner;

public class PruebaDado {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        dado d1= new dado();
        d1.setDado();
        d1.lanzar(d1.getDado());
        System.out.println(d1.lanzar(d1.getDado()));
        System.out.println("Quiere continuar S/N");
        char sino2 = sc.next().charAt(0);
  /*      sc.next();*/
        boolean sino = true;

        while ( sino==true ) {
                System.out.println(d1.lanzar(d1.getDado()));
                if (sino2 =='s' || sino2=='S'){
                d1.setDado();
                d1.lanzar(d1.getDado());
                sino2 = sc.next().charAt(0);

            }else if (sino2 == 'n' || sino2=='N') {
            System.out.println("Gracias por jugar");
            sino = false;

        }else {
            System.out.println("Carácter no válido");
        }
            }

    }
}

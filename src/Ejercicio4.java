public class Ejercicio4 {
    public static void main(String[] args) {
        //encontrar el número mayor y el número menor de una serie de numeros definidos en un array indicar cuantas veces se repite cada uno
        //1. Declaración de variables
        int numeroMayor= 0;
        int numeroMenor= 0;
        int contadorMayor=0;
        int contadorMenor=0;
        int [] numeros;
        //rellenar array
        numeros = new int[]{2, -4, -13, 1, -3, 15, 1, 9, 6, -8, 4, 23, 7, -13, 13, 23, 15, -13, 9, 0};
        for (int i = 0; i< numeros.length; i++){
            if (numeros[i]>numeroMayor){
                numeroMayor = numeros[i];
                contadorMenor++;
            }else if (numeros[i]<numeroMenor){
                numeroMenor= numeros[i];
                contadorMayor++;
            }
        }
        System.out.println("El mayor es: "+numeroMayor+" y se repite "+contadorMayor+" veces");
        System.out.println("El menor es: "+numeroMenor+" y se repite "+contadorMenor+" veces");
    }
}

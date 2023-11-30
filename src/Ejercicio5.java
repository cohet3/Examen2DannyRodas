public class Ejercicio5 {
    public static void main(String[] args) {
        //crear la cadena de texto "Nunca mates una mosca sobre la cabeza de un tigre."
        String frase= "Nunca mates una mosca sobre la cabeza de un tigre.";
        //MOstrar la cadena en mayúsculas
        System.out.println(frase.toUpperCase());
        //Mostrar la cadena en minúsculas
        System.out.println(frase.toLowerCase());
        //MOstrar solo la palabra sobre
        System.out.println("Extraer sobre (" + frase.substring(frase.indexOf("sobre"),frase.indexOf("sobre")+"sobre".length())+")");
        //Mostrar la posición de la primera m
        System.out.println("Posición de la letra m-> "+frase.indexOf("m"));
        //Devolver la longitud de la cadena
        System.out.println("Longitud total de la frase-> "+frase.length());
    }
}

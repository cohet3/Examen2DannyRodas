import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class Ejercicio6 {
    public static void main(String[] args) {
    //calcular la edad en años de una persona que nacion el 30 de agosto de 1992.
        LocalDate yearBorn = LocalDate.of(1992, 8, 30);
        Period edad = Period.between(yearBorn, LocalDate.now());
        System.out.println("Edad: " + edad.getYears());
        //MOstrar la fecha de hoy
        LocalDate dateNow = LocalDate.now();
        System.out.println("Fecha actual: "+dateNow);
        //añadir dos meses a la fecha de inicio del curso 9 de octubre del 2023
        LocalDate startCurso = LocalDate.of(2023, Month.OCTOBER, 9);
        LocalDate inicioCursoMas2Meses = startCurso.plusMonths(2);
        System.out.println("Fecha de final del curso +2 meses: " + inicioCursoMas2Meses);
    }
}

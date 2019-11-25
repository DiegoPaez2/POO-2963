package ec.edu.espe.Date;
/**
 *  Tax Computer Iva
 *  @author Diego Paez
 *  @version 0.2.0
 *  @since 2019-11-24
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateLibrary {
    /**
     * This function validates the birthday
     * @param date is the birthday of the form "dd/MM/yyyy"
     * @return true
     */

    public static boolean validateDate(String date) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    /**
     * This function shows the years
     * @param date is the birthday of the form "dd/MM/yyyy"
     * @return  int that is the years
     */

    public static int showYears(String date) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(date, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        return periodo.getYears();
    }/**
     * This function shows the days
     * @paramdate is the birthday of the form "dd/MM/yyyy"
     * @return  int that is the days
     */

    public static int showDays(String date) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(date, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        return periodo.getDays();
    }/**
     * This function shows the months
     * @param date is the birthday of the form "dd/MM/yyyy"
     * @return  int that is the months
     */

    public static int showMonths(String date) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(date, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        return periodo.getMonths();
    }
    /**
     * This function shows if you were born
     * @paramdate is the birthday of the form "dd/MM/yyyy"
     * @return  a boolean
     */

    public static boolean checkIfBorn(String date) {
        String[] parts = date.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];

        int day = Integer.parseInt(part1);
        int month = Integer.parseInt(part2);
        int year = Integer.parseInt(part3);

        Calendar today = Calendar.getInstance();
        
        if (year > today.get(Calendar.YEAR) && month > today.get(Calendar.MONTH) && day > today.get(Calendar.DAY_OF_MONTH)) {
            return false;
        } else {
            return true;
        }
    }
}

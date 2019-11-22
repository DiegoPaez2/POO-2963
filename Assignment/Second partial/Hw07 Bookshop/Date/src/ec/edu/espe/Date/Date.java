package ec.edu.espe.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date {

    private static int actualYear = 2019;

    private static String date = "09/11/1999";

    public static boolean insertDate(String date) {
       
        boolean res = true;
        
        res = validarFecha(date);
        if (res == true) {
            return true;
        } else
            return false;
    }

    public static boolean validarFecha(String date) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            /**
             * el setLenientno hace que el "32 de Enero" dará un error. si no se
             * utiliza java automaticamente coloca 1 de Febrero
             */
            formatoFecha.setLenient(false);
            formatoFecha.parse(date);

        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static int ifBorn(String date) {
        String[] parts = date.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];

        int day = Integer.parseInt(part1);
        int month = Integer.parseInt(part2);
        int year = Integer.parseInt(part3);

        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(Calendar.YEAR, year);
        birthDate.set(Calendar.MONTH, month);
        birthDate.set(Calendar.DAY_OF_MONTH, day);
        int diffYear = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        int diffMonth = today.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);
        int diffDay = today.get(Calendar.DAY_OF_MONTH) - birthDate.get(Calendar.DAY_OF_MONTH);
        if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
            diffYear = diffYear - 1;
        }
        return diffYear;
    }

    public static int age(String date) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(date, fmt);
        LocalDate today = LocalDate.now();

        Period periodo = Period.between(birthDate, today);
        int actualYears = periodo.getYears();
        int actualMoths = periodo.getMonths();
        int actualDays = periodo.getDays();
        return actualDays;
    }
}

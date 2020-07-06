/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerairconditional;

import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author choco
 */
public class DateTimeCheck {

    public DateTimeCheck() {
    }

    public boolean checkDate(String dateCheck, String dateFromat) {
        if (dateCheck.trim().length() != 10) {
            return false;
        }
        if (dateCheck == null) {
            return false;
        }
        SimpleDateFormat check = new SimpleDateFormat(dateFromat);
        check.setLenient(false);
        try {
            Date date = check.parse(dateCheck);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }

    public boolean checkExpriredDate(String cDate, String eDate) {
        if (strToDate(eDate).isBefore(strToDate(cDate))) {
            return false;
        } else {
            return true;
        }
    }

    public LocalDate strToDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String dateToStr(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

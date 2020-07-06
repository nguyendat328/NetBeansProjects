/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt001;

import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author choco
 */
public class DateTimeConvert {

    public DateTimeConvert() {
    }

    public LocalDate strToDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String dateToStr(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

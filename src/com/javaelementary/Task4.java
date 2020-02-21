package com.javaelementary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task4 {

    /*
    4*. Задана строка с датой вида "22.01.2019 19:15:00". Написать метод который преобразовывает ее в формат
    "22 Jan, 7:15 PM". Предусмотреть обработку ситуации если входящая дата в недопустимом формате.
    */

    private static final String INPUT_DATE = "22.01.2019 19:15:00";
    private static final String INPUT_DATE_FORMAT = "dd.MM.yyyy HH:mm:ss";
    private static final String OUTPUT_DATE_FORMAT = "d MMM, h:mm a";

    public static void main(String[] args) {
        formatDate();
    }

    private static void formatDate() {
        SimpleDateFormat dateFormatInput = new SimpleDateFormat(INPUT_DATE_FORMAT);
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat(OUTPUT_DATE_FORMAT, Locale.US);
        try {
            Date dateInput = dateFormatInput.parse(INPUT_DATE);
            String dateOutput = dateFormatOutput.format(dateInput);
            System.out.println(dateOutput);
        } catch (ParseException e) {
            System.out.println("Unparseable date: " + INPUT_DATE);
        }
    }
}
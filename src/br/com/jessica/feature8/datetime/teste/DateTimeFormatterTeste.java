package br.com.jessica.feature8.datetime.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class DateTimeFormatterTeste {
    public static void main(String[] args) {
        //Classe para formatar datas da nova API => DateTimeFormatter

        //DateTimeFormatter.ISO_DATE_TIME; => usado para transferir datas entre sistemas, mandar em um Json por exemplo
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime ldtNow = LocalDateTime.now();
        String formatIso = isoDateTime.format(ldtNow);
        System.out.println("Formato ISO: " + formatIso);

        // mais usados para exibir data para o usuário final:

        System.out.println("---Tranformando de data para String---");

        // DateTimeFormatter.ofLocalizedDate(...) imprime somente a data
        // permite formato SHORT, MEDIUM, LONG e FULL
        //O FormatStyle depende do Locale, vai imprimir conforme o Locale

        //Locale.setDefault(Locale.US);

        DateTimeFormatter style = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String formatStyle = style.format(ldtNow);
        System.out.println("Formato de data para usuário final: " + formatStyle);

        // DateTimeFormatter.ofLocalizedDateTime(...) imprime data e hora,
        //Não permite formato LONG e FULL

        DateTimeFormatter style2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String formatStyle2 = style2.format(ldtNow);
        System.out.println("Formato de data e hora para usuário final: " + formatStyle2);

        // para imprimir com fuso-horário:
        DateTimeFormatter style3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        ZonedDateTime zdtNow = ZonedDateTime.now();
        String formatStyle3 = style3.format(zdtNow);
        System.out.println("Formato de data, hora e fuso para usuário final: " + formatStyle3);

        // para definir um formato, usar o .ofPattern:
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatPattern = pattern.format(ldtNow);
        System.out.println("Formato personalizado: " + formatPattern);

        System.out.println("---Tranformando de String para o formato Data e hora padrão---");

        TemporalAccessor parse = pattern.parse("17/02/2020 12:30:40");
        LocalDateTime from = LocalDateTime.from(parse);
        System.out.println(from);

        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        TemporalAccessor parse2 = formatterHora.parse("12:36:50");
        LocalTime from2 = LocalTime.from(parse2);
        System.out.println(from2);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataBR = "18/02/2020";
        LocalDate parse3 = LocalDate.parse(dataBR, formatterBR);
        System.out.println(parse3);

        // pode-se passar um Locale para o Pattern:

        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String formatFR = LocalDate.now().format(formatterFR);
        System.out.println(formatFR);

        LocalDate parse4 = LocalDate.parse("17.février.2020", formatterFR);
        System.out.println(parse4);

    }
}

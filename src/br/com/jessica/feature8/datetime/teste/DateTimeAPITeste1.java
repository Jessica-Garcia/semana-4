package br.com.jessica.feature8.datetime.teste;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DateTimeAPITeste1 {
    public static void main(String[] args) {
        //Datas API antiga:

        //System.out.println(new Date());
        //System.out.println(Calendar.getInstance());

       //para trabalhar apenas com datas: Classe LocalDate
        System.out.println("-----------LocalDate------------");

        // para criar uma data específica:
        LocalDate date = LocalDate.of(2020,3,16);
        LocalDate date2 = LocalDate.of(2020, Month.MARCH, 16);
        // para obter os dados:
        System.out.println("Data: " + date);
        System.out.println("Ano: " + date.getYear());
        System.out.println("Mês: " + date.getMonth());
        System.out.println("Mês: " + date.getMonthValue());
        System.out.println("Dia do mês: " + date.getDayOfMonth());
        System.out.println("Dia da Semana: " + date.getDayOfWeek());
       // System.out.println("Número de dias do mês: " + date.lengthOfMonth());
       // System.out.println("Ano Bissexto? " + date.isLeapYear());
        System.out.println("Data mínima: " + LocalDate.MIN);
        System.out.println("Data Máxima: " + LocalDate.MAX);

        //para somar e subtrair dias, meses e anos nas datas:

        System.out.println("somando dias: " +  date.plusDays(2));
//        System.out.println("somando semanas: " +  date.plusWeeks(2));
//        System.out.println("somando meses: " +  date.plusMonths(2));

        System.out.println("Subtraindo dias: " + date.minusDays(5));
//        System.out.println("Subtraindo semanas: " + date.minusWeeks(3) );
//        System.out.println("Subtraindo meses: " + date.minusMonths(2) );

        LocalDate ld = date2.plusWeeks(2).plusDays(3).minusMonths(2);
        System.out.println("Soma e subtração: " + ld);

        //para obter a data atual:
        LocalDate now = LocalDate.now();
        System.out.println("Data atual: " + now);


        //para trabalhar apenas com horários: Classe LocalTime

        System.out.println("----------LocalTime------------");
        //para criar um horário específico:
        LocalTime time = LocalTime.of(22,15,20);

        //para obter os dados:
        System.out.println("horário:" + time);
        System.out.println("hora: " + time.getHour());
        System.out.println("minuto: " + time.getMinute());
        System.out.println("Horário máximo: " + LocalTime.MAX);
        System.out.println("horário mínimo: " + LocalTime.MIN);
        LocalTime agora = LocalTime.now();
        System.out.println("Horário atual: " + agora);

        System.out.println("------------Parse-----------");
        //passa de string para data ou horário sem tratamento de exceção obrigatório
        LocalDate parseDate = LocalDate.parse("2020-02-15");
        LocalTime parseTime = LocalTime.parse("18:12:59");
        System.out.println(parseDate);
        System.out.println(parseTime);

        // para trabalhar com hora e data ao mesmo tempo:

        System.out.println("------------LocalDateTime-----------");

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2020,2,16,18,20);
        LocalDateTime ldt = LocalDateTime.of(date, time);

        System.out.println("data e hora atual: " + ldt1);
        System.out.println("data e hora criada: " + ldt2);
        System.out.println("data e hora existentes: " + ldt);

        //adicionando horário em uma data:
//        LocalDateTime ldt3 = date.atTime(18,25,03);
//        LocalDateTime ldt4 = date.atTime(LocalTime.now());
//        System.out.println(ldt3);
//        System.out.println(ldt4);

        //adicionando data em um horário:

//        LocalDateTime ldt5 = time.atDate(LocalDate.now());
//        LocalDateTime ldt6 = time.atDate(date2);
//        System.out.println(ldt5);
//        System.out.println(ldt6);


        System.out.println("-------Instant-------------");
        //Classe Instant: milissegundos a partir de 01/01/1970,
        // traz data e hora no GMT/UTC
        Instant instantNow = Instant.now();
        System.out.println(instantNow);


        System.out.println("----------ZonedDateTime----------");
        // Traz informações de fuso-horário
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZoneId zoneId = ZoneId.of("America/Montevideo");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(ldt2,zoneId);
        System.out.println(zonedDateTime2);


    }
}

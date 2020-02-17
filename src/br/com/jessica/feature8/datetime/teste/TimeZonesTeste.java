package br.com.jessica.feature8.datetime.teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class TimeZonesTeste {
    public static void main(String[] args) {
        // para obter todos os zoneId:

        for(Map.Entry<String, String> zonas : ZoneId.SHORT_IDS.entrySet()){
            System.out.println(zonas.getKey() + " " + zonas.getValue());
        }

        System.out.println("-----------------------------------------");
        // para obter a zona default do sistema:

        System.out.println(ZoneId.systemDefault());

        //criando um zoneId:

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        // adicionando um ZoneId em um LocalDateTime:

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        ZonedDateTime zonedDateTime = dateTime.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        // adicionando um ZoneId em um Instant:

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        // se sabemos apenas os fusos horários e não os ZoneId:

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset manausOffSet = ZoneOffset.of("-04:00");
        LocalDateTime dateTime2 = LocalDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime2, manausOffSet);
        OffsetDateTime offsetDateTime2 = dateTime2.atOffset(manausOffSet);

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime2);

        // possibilidade de trabalhar com outros calendários:

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

    }
}

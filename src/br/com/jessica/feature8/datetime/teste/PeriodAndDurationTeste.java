package br.com.jessica.feature8.datetime.teste;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTeste {
    public static void main(String[] args) {
        System.out.println("------Period (para datas)-------");
        //Period trabalha apenas com data, não usar horas, min, segundo...

        // se já possui os valores do perído:

        Period periodo = Period.of(1,5,2);
        System.out.println("Período de ano, mês e dias: " + periodo);

        Period periodo1 = Period.ofYears(5);
        System.out.println(periodo1);

        //periodo em semana retorna o numero de dias da semana:
        Period periodo2 = Period.ofWeeks(5);
        System.out.println(periodo2);

        // se precisar calcular o período em anos, meses e dias:
        LocalDate data1 = LocalDate.of(1991,12,16);
        LocalDate data2 = LocalDate.now();

        Period idadeBetween = Period.between(data1,data2);
        System.out.println(idadeBetween);

        Period idadeUntil = data1.until(data2);
        System.out.println(idadeUntil);

        // pode-se adicionar um Period em um LocalDate

        System.out.println(data1);
        LocalDate plus = data1.plus(periodo1);
        System.out.println(plus);
        LocalDate plus2 = data1.plus(periodo);
        System.out.println(plus2);

        System.out.println("------Duration (para tempo)------");
        // trabalha com tempo: horas, minuto, segundo...

        // Duration em dias retorna em horas
        Duration ofDays = Duration.ofDays(1);
        System.out.println(ofDays);
        Duration ofHours = Duration.ofHours(1);
        System.out.println(ofHours);
        // Duration em minutos retorna em horas
        Duration ofMinutes = Duration.ofMinutes(500);
        System.out.println(ofMinutes);

        // cálculo da duração do tempo em horas

        LocalTime agora = LocalTime.now();
        LocalTime depois = LocalTime.of(23,25,07);

        Duration between = Duration.between(agora, depois);
        System.out.println(between);

        Duration plusMin = between.plusMinutes(10);
        System.out.println(plusMin);

        System.out.println("------CHRONOUNIT------");

        LocalDateTime nascimento = LocalDateTime.of(1991,12,16,8,30);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Idade em dias: " + ChronoUnit.DAYS.between(nascimento, now));
        System.out.println("Idade em semanas: " + ChronoUnit.WEEKS.between(nascimento, now));
        System.out.println("Idade em meses: " + ChronoUnit.MONTHS.between(nascimento, now));
        System.out.println("Idade em anos: " + ChronoUnit.YEARS.between(nascimento, now));

    }
}

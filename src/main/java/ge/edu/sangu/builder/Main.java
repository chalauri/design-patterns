package ge.edu.sangu.builder;

import ge.edu.sangu.builder.dto.Citizen;
import ge.edu.sangu.builder.implementations.AmericanBirthDateBuilder;
import ge.edu.sangu.builder.implementations.EuropeanBirthDateBuilder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Citizen americanCitizen = new Citizen(new AmericanBirthDateBuilder());
        americanCitizen.constructBirthDate(LocalDate.of(1990, 12, 25));
        System.out.println(americanCitizen.getBirthDate());

        Citizen europeanCitizen = new Citizen(new EuropeanBirthDateBuilder());
        europeanCitizen.constructBirthDate(LocalDate.of(1993, 7, 20));
        System.out.println(europeanCitizen.getBirthDate());
    }
}

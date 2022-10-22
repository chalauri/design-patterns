package ge.edu.sangu.builder;

import ge.edu.sangu.builder.dto.Citizen;
import ge.edu.sangu.builder.implementations.AmericanBirthDateBuilder;
import ge.edu.sangu.builder.implementations.EuropeanBirthDateBuilder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1990, 12, 25);

        Citizen americanCitizen = new Citizen(new AmericanBirthDateBuilder());
        americanCitizen.constructBirthDate(birthDate);
        System.out.println(americanCitizen.getBirthDate());

        Citizen europeanCitizen = new Citizen(new EuropeanBirthDateBuilder());
        europeanCitizen.constructBirthDate(birthDate);
        System.out.println(europeanCitizen.getBirthDate());
    }
}

package ge.edu.sangu.builder;

import ge.edu.sangu.builder.dto.Citizen;
import ge.edu.sangu.builder.dto.CitizenParametrized;
import ge.edu.sangu.builder.implementations.AmericanBirthDateBuilder;
import ge.edu.sangu.builder.implementations.CustomBirthDateBuilder;
import ge.edu.sangu.builder.implementations.EuropeanBirthDateBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        LocalDate birthDate = LocalDate.of(1990, 12, 25);

        Citizen americanCitizen = new Citizen(new AmericanBirthDateBuilder());
        americanCitizen.constructBirthDate(birthDate);
        System.out.println(americanCitizen.getBirthDate());

        Citizen europeanCitizen = new Citizen(new EuropeanBirthDateBuilder());
        europeanCitizen.constructBirthDate(birthDate);
        System.out.println(europeanCitizen.getBirthDate());

        Citizen georgianCitizen = new Citizen(new CustomBirthDateBuilder());
        georgianCitizen.constructBirthDate(birthDate);
        System.out.println(georgianCitizen.getBirthDate());

        CitizenParametrized citizen = new CitizenParametrized(birthDate);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Citizenship");

        // Reading data using readLine
        String citizenship = reader.readLine();


        switch (citizenship) {
            case "American" -> citizen.setBirthDateBuilder(new AmericanBirthDateBuilder());
            case "European" -> citizen.setBirthDateBuilder(new EuropeanBirthDateBuilder());
            case "Georgian" -> citizen.setBirthDateBuilder(new CustomBirthDateBuilder());
            default -> throw new Exception("Builder Not Found!");
        }

        System.out.println(citizen.getBirthDate());
    }
}

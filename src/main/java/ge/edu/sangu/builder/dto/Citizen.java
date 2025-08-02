package ge.edu.sangu.builder.dto;

import ge.edu.sangu.builder.interfaces.BirthDateBuilder;

import java.time.LocalDate;

public class Citizen {

    private String birthDate;
    private final BirthDateBuilder abstractBuilder;

    public Citizen(BirthDateBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    public void constructBirthDate(LocalDate birthDate) {
        this.birthDate = abstractBuilder.buildBirthData(birthDate);
    }

    public String getBirthDate() {
        return this.birthDate;
    }
}

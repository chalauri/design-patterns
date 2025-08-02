package ge.edu.sangu.builder.dto;

import ge.edu.sangu.builder.interfaces.BirthDateBuilder;

import java.time.LocalDate;

public class CitizenParametrized {

    private final LocalDate birthDate;
    private BirthDateBuilder abstractBuilder;

    public CitizenParametrized(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthDateBuilder(BirthDateBuilder builder) {
        this.abstractBuilder = builder;
    }

    public String getBirthDate() {
        return this.abstractBuilder.buildBirthData(this.birthDate);
    }
}

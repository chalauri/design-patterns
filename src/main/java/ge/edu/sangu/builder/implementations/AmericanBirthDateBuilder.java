package ge.edu.sangu.builder.implementations;

import ge.edu.sangu.builder.interfaces.BirthDateBuilder;

import java.time.LocalDate;

public class AmericanBirthDateBuilder implements BirthDateBuilder {

    @Override
    public String buildBirthData(LocalDate localDate) {
        return localDate.getMonthValue() + "/" + localDate.getDayOfMonth() + "/" + localDate.getYear();
    }
}

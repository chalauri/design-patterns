package ge.edu.sangu.builder.implementations;

import ge.edu.sangu.builder.interfaces.BirthDateBuilder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CustomBirthDateBuilder implements BirthDateBuilder {

    private static  final  List<String> MONTHS = Arrays.asList(
            "",
            "იანვარი",
            "თებერვალი",
            "მარტი",
            "აპრილი",
            "მაისი",
            "ივნისი",
            "ივლისი",
            "აგვისტო",
            "სექტემბერი",
            "ოქტომბერი",
            "ნოემბერი",
            "დეკემბერი"
    );

    @Override
    public String buildBirthData(LocalDate localDate) {
        return new StringBuilder()
                .append(localDate.getYear())
                .append(" წლის ")
                .append(localDate.getDayOfMonth())
                .append(" ")
                .append(MONTHS.get(localDate.getMonthValue()))
                .toString();
    }
}

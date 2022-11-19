package ge.edu.sangu.facade.implementations;

import ge.edu.sangu.facade.dto.PersonalInformation;
import ge.edu.sangu.facade.interfaces.Reader;

public class DatabaseReader implements Reader {

    @Override
    public PersonalInformation read(String filePath) {

        System.out.println("Reading personal info from database");

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setPersonalNumber("23213232");
        personalInformation.setFirstName("FDatabaseName");
        personalInformation.setLastName("LDatabaseName");

        return personalInformation;
    }
}

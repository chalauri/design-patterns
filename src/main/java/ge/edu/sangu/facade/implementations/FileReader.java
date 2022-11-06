package ge.edu.sangu.facade.implementations;

import ge.edu.sangu.facade.dto.PersonalInformation;
import ge.edu.sangu.facade.interfaces.Reader;

public class FileReader implements Reader {

    @Override
    public PersonalInformation read(String filePath) {

        System.out.println("Reading personal info from file");

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setPersonalNumber("12312312312");
        personalInformation.setFirstName("FName");
        personalInformation.setLastName("LName");

        return personalInformation;
    }
}

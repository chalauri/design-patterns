package ge.edu.sangu.facade.implementations;

import ge.edu.sangu.facade.dto.PersonalInformation;
import ge.edu.sangu.facade.dto.PersonalInformationResponse;
import ge.edu.sangu.facade.interfaces.Parser;

public class PersonalInformationParser implements Parser {

    @Override
    public PersonalInformationResponse parse(PersonalInformation personalInformation) {
        System.out.println("Parses personal information " + personalInformation);

        return PersonalInformationResponse.from(personalInformation);
    }
}

package ge.edu.sangu.facade.interfaces;

import ge.edu.sangu.facade.dto.PersonalInformation;
import ge.edu.sangu.facade.dto.PersonalInformationResponse;

public interface Parser {

    PersonalInformationResponse parse(PersonalInformation personalInformation);
}

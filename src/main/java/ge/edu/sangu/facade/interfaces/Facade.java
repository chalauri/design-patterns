package ge.edu.sangu.facade.interfaces;

import ge.edu.sangu.facade.dto.PersonalInformationResponse;

public interface Facade {
    PersonalInformationResponse getPersonalInformation(String destination);
}

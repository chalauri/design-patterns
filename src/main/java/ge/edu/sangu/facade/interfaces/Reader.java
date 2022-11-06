package ge.edu.sangu.facade.interfaces;

import ge.edu.sangu.facade.dto.PersonalInformation;

public interface Reader {

    PersonalInformation read(String filePath);
}

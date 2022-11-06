package ge.edu.sangu.facade.implementations;

import ge.edu.sangu.facade.dto.PersonalInformation;
import ge.edu.sangu.facade.dto.PersonalInformationResponse;
import ge.edu.sangu.facade.interfaces.Facade;
import ge.edu.sangu.facade.interfaces.Parser;
import ge.edu.sangu.facade.interfaces.Reader;

public class FacadeImpl implements Facade {

    private Parser parser;
    private Reader reader;

    public FacadeImpl(Parser parser, Reader reader) {
        this.parser = parser;
        this.reader = reader;
    }

    public PersonalInformationResponse getPersonalInformation(String destination) {
        PersonalInformation personalInformation = reader.read(destination);
        return parser.parse(personalInformation);
    }
}

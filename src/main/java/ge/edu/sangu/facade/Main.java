package ge.edu.sangu.facade;

import ge.edu.sangu.facade.implementations.FacadeImpl;
import ge.edu.sangu.facade.implementations.FileReader;
import ge.edu.sangu.facade.implementations.PersonalInformationParser;
import ge.edu.sangu.facade.interfaces.Facade;

public class Main {

    public static void main(String[] args) {
        Facade personalInformationFacade = new FacadeImpl(new PersonalInformationParser(), new FileReader());

        System.out.println(personalInformationFacade.getPersonalInformation("SOME_FILE_DESTINATION"));
    }
}

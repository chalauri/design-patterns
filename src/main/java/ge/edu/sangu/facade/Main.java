package ge.edu.sangu.facade;

import ge.edu.sangu.facade.implementations.DatabaseReader;
import ge.edu.sangu.facade.implementations.FacadeImpl;
import ge.edu.sangu.facade.implementations.FileReader;
import ge.edu.sangu.facade.implementations.PersonalInformationParser;
import ge.edu.sangu.facade.interfaces.Facade;

public class Main {

    public static void main(String[] args) {
        PersonalInformationParser personalInformationParser = new PersonalInformationParser();

        Facade personalInformationFacade = new FacadeImpl(personalInformationParser, new FileReader());
        System.out.println(personalInformationFacade.getPersonalInformation("SOME_FILE_DESTINATION"));

        System.out.println("\n");

        Facade personalInformationFacadeFromDatabase = new FacadeImpl(personalInformationParser, new DatabaseReader());
        System.out.println(personalInformationFacadeFromDatabase.getPersonalInformation("SOME_FILE_DESTINATION"));
    }
}

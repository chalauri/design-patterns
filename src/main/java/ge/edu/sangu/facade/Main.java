package ge.edu.sangu.facade;

import ge.edu.sangu.facade.implementations.DatabaseReader;
import ge.edu.sangu.facade.implementations.FacadeImpl;
import ge.edu.sangu.facade.implementations.FileReader;
import ge.edu.sangu.facade.implementations.PersonalInformationParser;
import ge.edu.sangu.facade.interfaces.Facade;

public class Main {

    public static void main(String[] args) {
        Facade personalInformationFacade = new FacadeImpl(new PersonalInformationParser(), new FileReader());
        System.out.println(personalInformationFacade.getPersonalInformation("SOME_FILE_DESTINATION"));

        System.out.println("\n");

        Facade personalInformationFacadeFromDatabase = new FacadeImpl(new PersonalInformationParser(), new DatabaseReader());
        System.out.println(personalInformationFacadeFromDatabase.getPersonalInformation("SOME_FILE_DESTINATION"));
    }
}

package ge.edu.sangu.facade.dto;

public class PersonalInformationResponse {

    private String firstName;
    private String lastName;
    private String personalNumber;

    private PersonalInformationResponse(String firstName, String lastName, String personalNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
    }

    public static PersonalInformationResponse from(PersonalInformation personalInformation) {
        return new PersonalInformationResponse(
            personalInformation.getFirstName(),
            personalInformation.getLastName(),
            personalInformation.getPersonalNumber()
        );
    }

    @Override
    public String toString() {
        return "PersonalInformationResponse{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", personalNumber='" + personalNumber + '\'' +
            '}';
    }
}

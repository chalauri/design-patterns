package ge.edu.sangu.facade.dto;

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String personalNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "PersonalInformation{"
            + "firstName='" + firstName + '\''
            + ", lastName='" + lastName + '\''
            + ", personalNumber='" + personalNumber + '\''
            + '}';
    }
}

package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {

    private String firstName;
    private String lasstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasstName() {
        return lasstName;
    }

    public void setLasstName(String lasstName) {
        this.lasstName = lasstName;
    }
}

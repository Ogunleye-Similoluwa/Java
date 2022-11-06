package chap8;

public class Native {
    public Day dateOfBirth;
    public Native(Day dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Day getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Day dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

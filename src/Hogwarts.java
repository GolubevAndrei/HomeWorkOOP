public class Hogwarts {
    private String firstName;
    private String lastName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String firstName, String lastName, int magicPower, int transgressionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

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

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Ученик Хогвартса " + getFirstName() + " " + getLastName() + " магическая сила " +
        getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance();
    }
}

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

    public static String HogwartsStudentPrint(Hogwarts hogwarts) {
        return hogwarts.toString();
    }

    public static String bestStudentHogwarts(Hogwarts hogwarts,Hogwarts hogwarts1) {
        int propertiesSum = hogwarts.getMagicPower() + hogwarts.getTransgressionDistance();
        int propertiesSum1 = hogwarts1.getMagicPower() + hogwarts1.getTransgressionDistance();
        if (propertiesSum > propertiesSum1) {
            return "Побеждет студент(ка) Хогвартса = " + hogwarts.getFirstName() + " " + hogwarts.getLastName();
        } else {
            return "Побеждет студент(ка) Хогвартса = " + hogwarts1.getFirstName() + " " + hogwarts1.getLastName();
        }
    }
}

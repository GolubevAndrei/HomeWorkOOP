public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(firstName,lastName,magicPower,transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String getHogwarts() {
        return "Ученик Хогвартса " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance();
    }

    @Override
    public String toString() {
        return "Ученик Хогвартса, факультета Гриффиндор " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
    public static String bestFacultetStudent(Gryffindor gryffindor,Gryffindor gryffindor1) {
        int propertiesSum = gryffindor.getNobility() + gryffindor.getBravery() + gryffindor.getHonor();
        int propertiesSum1 = gryffindor1.getNobility() + gryffindor1.getBravery() + gryffindor1.getHonor();
        if (propertiesSum > propertiesSum1) {
            return "Побеждет студент(ка) Гриффиндора = " + gryffindor.getFirstName() + " " + gryffindor.getLastName();
        } else {
            return "Побеждет студент(ка) Гриффиндора = " + gryffindor1.getFirstName() + " " + gryffindor1.getLastName();
        }
    }

}

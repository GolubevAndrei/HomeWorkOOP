public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;

    public Slytherin(String firstName, String lastName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustPower) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    public String getHogwarts() {
        return "Ученик Хогвартса " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance();
    }

    @Override
    public String toString() {
        return "Ученик Хогвартса, факультета Слизерин " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustPower=" + lustPower;
    }
    public static String bestFacultetStudent(Slytherin slytherin,Slytherin slytherin1) {
        int propertiesSum = slytherin.getCunning() + slytherin.getAmbition() + slytherin.getDetermination() + slytherin.getLustPower() + slytherin.getResourcefulness();
        int propertiesSum1 = slytherin1.getCunning() + slytherin1.getAmbition() + slytherin1.getDetermination() + slytherin1.getLustPower() + slytherin1.getResourcefulness();
        if (propertiesSum > propertiesSum1) {
            return "Побеждет студент(ка) Слизерина = " + slytherin.getFirstName() + " " + slytherin.getLastName();
        } else {
            return "Побеждет студент(ка) Слизерина = " + slytherin1.getFirstName() + " " + slytherin1.getLastName();
        }
    }
}

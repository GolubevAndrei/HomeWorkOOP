public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String getHogwarts() {
        return "Ученик Хогвартса " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance();
    }

    @Override
    public String toString() {
        return "Ученик Хогвартса, факультета Райвенкло " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
    public static String bestFacultetStudent(Ravenclaw ravenclaw,Ravenclaw ravenclaw1) {
        int propertiesSum = ravenclaw.getMind() + ravenclaw.getCreativity() + ravenclaw.getWisdom() + ravenclaw.getWit();
        int propertiesSum1 = ravenclaw1.getMind() + ravenclaw1.getCreativity() + ravenclaw1.getWisdom() + ravenclaw1.getWit();
        if (propertiesSum > propertiesSum1) {
            return "Побеждет студент(ка) Райвенкло = " + ravenclaw.getFirstName() + " " + ravenclaw.getLastName();
        } else {
            return "Побеждет студент(ка) Райвенкло = " + ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName();
        }
    }
}

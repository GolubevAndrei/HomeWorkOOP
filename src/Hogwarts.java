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

    public static String bestFacultetStudent(Gryffindor gryffindor,Gryffindor gryffindor1) {
        int propertiesSum = gryffindor.getNobility() + gryffindor.getBravery() + gryffindor.getHonor();
        int propertiesSum1 = gryffindor1.getNobility() + gryffindor1.getBravery() + gryffindor1.getHonor();
        if (propertiesSum > propertiesSum1) {
            return "Побеждет студент(ка) Гриффиндора = " + gryffindor.getFirstName() + " " + gryffindor.getLastName();
        } else {
            return "Побеждет студент(ка) Гриффиндора = " + gryffindor1.getFirstName() + " " + gryffindor1.getLastName();
        }
    }

    public static String bestFacultetStudent(Hufflepuff hufflepuff,Hufflepuff hufflepuff1) {
        int propertiesSum = hufflepuff.getIndustriousness() + hufflepuff.getHonesty() + hufflepuff.getLoyalty();
        int propertiesSum1 = hufflepuff1.getIndustriousness() + hufflepuff1.getHonesty() + hufflepuff1.getLoyalty();
        if (propertiesSum > propertiesSum1) {
            return "Побеждет студент(ка) Пуффендуя = " + hufflepuff.getFirstName() + " " + hufflepuff.getLastName();
        } else {
            return "Побеждет студент(ка) Пуффендуя = " + hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName();
        }
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

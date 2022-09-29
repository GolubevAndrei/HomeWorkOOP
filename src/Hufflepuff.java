public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(firstName,lastName,magicPower,transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String getHogwarts() {
        return "Ученик Хогвартса " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance();
    }

    @Override
    public String toString() {
        return "Ученик Хогвартса, факультета Пуффендуй " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
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
}

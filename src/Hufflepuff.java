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

    @Override
    public String toString() {
        return "Ученик Хогвартса, факультета Пуффендуй " + getFirstName() + " " + getLastName() + " магическая сила " +
                getMagicPower() + ", расстояние трансгресии " + getTransgressionDistance() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}

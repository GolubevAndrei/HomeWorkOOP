public class PrintService {
    private int P = 0;
    private int propertiesSum = 0;
    private int propertiesSum1 = 0;

    public void print(Hogwarts[] hogwarts) {
        P = 0;
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hog = hogwarts[i];
            propertiesSum = hog.getMagicPower() + hog.getTransgressionDistance();
            if (propertiesSum > propertiesSum1) {
                propertiesSum1 = propertiesSum;
                P = i;
            }
        }
        System.out.println("Лучший ученик Хогвартса = " + hogwarts[P].getFirstName() + " " + hogwarts[P].getLastName());
    }

    public void print(Gryffindor[] griffindor) {
        P = 0;
        for (int i = 0; i < griffindor.length; i++) {
            Gryffindor grif = griffindor[i];
            propertiesSum = grif.getNobility() + grif.getBravery() + grif.getHonor();
            if (propertiesSum > propertiesSum1) {
                propertiesSum1 = propertiesSum;
                P = i;
            }
        }
        System.out.println("Лучший ученик Гриффиндора = " + griffindor[P].getFirstName() + " " + griffindor[P].getLastName());
    }

    public void print(Hufflepuff[] hufflepuff) {
        P = 0;
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff huff = hufflepuff[i];
            propertiesSum = huff.getIndustriousness() + huff.getHonesty() + huff.getLoyalty();
            if (propertiesSum > propertiesSum1) {
                propertiesSum1 = propertiesSum;
                P = i;
            }
        }
        System.out.println("Лучший ученик Пуффендуя = " + hufflepuff[P].getFirstName() + " " + hufflepuff[P].getLastName());
    }

    public void print(Ravenclaw[] ravenclaw) {
        P = 0;
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw rave = ravenclaw[i];
            propertiesSum = rave.getMind() + rave.getCreativity() + rave.getWisdom() + rave.getWit();
            if (propertiesSum > propertiesSum1) {
                propertiesSum1 = propertiesSum;
                P = i;
            }
        }
        System.out.println("Лучший ученик Райвенкло = " + ravenclaw[P].getFirstName() + " " + ravenclaw[P].getLastName());
    }

    public void print(Slytherin[] slytherin) {
        P = 0;
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slyt = slytherin[i];
            propertiesSum = slyt.getCunning() + slyt.getAmbition() + slyt.getDetermination() + slyt.getLustPower() + slyt.getResourcefulness();
            if (propertiesSum > propertiesSum1) {
                propertiesSum1 = propertiesSum;
                P = i;
            }
        }
        System.out.println("Лучший ученик Слизерина = " + slytherin[P].getFirstName() + " " + slytherin[P].getLastName());
    }
}

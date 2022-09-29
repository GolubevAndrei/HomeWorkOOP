public class Main {

    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Гарри", "Поттер", 10, 12, 7, 6, 8);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 15, 8, 5, 5, 6);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 3, 4, 3, 6, 5);

        Hufflepuff zachar = new Hufflepuff("Захария", "Смит", 9, 8,7,8,5);
        Hufflepuff sedric = new Hufflepuff("Седрик", "Диггори", 8, 14,6,9,7);
        Hufflepuff djastin = new Hufflepuff("Джастин", "Финч-Флетчли", 7, 12,5,9,8);

        Ravenclaw chou = new Ravenclaw("Чжоу", "Чанг", 6, 8,5,3,7,6);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 5, 14,6,4,8,2);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 9, 8,4,9,5,3);

        Slytherin draco = new Slytherin("Драко", "Малфой", 9, 9,5,8,6,4,12);
        Slytherin grechem = new Slytherin("Грэхэм", "Монтегю", 8, 4,6,4,8,3,9);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 7, 12,3,7,9,6,8);

        //   Вывод на печать студента Хогвартса
        System.out.println(germiona.getHogwarts());
        //   Вывод на печать студента факультета Хогвартса
        System.out.println(Hogwarts.HogwartsStudentPrint(sedric));
        //   Вывод на печать сравнения студентов факультета Хогвартса
        System.out.println(Ravenclaw.bestFacultetStudent(padma,chou));
        //   Вывод на печать сравнения студентов Хогвартса
        System.out.println(Hogwarts.bestStudentHogwarts(draco,germiona));
    }
}
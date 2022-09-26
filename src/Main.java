public class Main {
    public static void HogwartsStudentPrint(Hogwarts hogwarts[],int number) {
        System.out.println(hogwarts[number].toString());
    }
    public static void GryffindorStudentPrint(Gryffindor gryffindor[],int number) {
        System.out.println(gryffindor[number].toString());
    }
    public static void HufflepuffStudentPrint(Hufflepuff hufflepuff[],int number) {
        System.out.println(hufflepuff[number].toString());
    }
    public static void RavenclawStudentPrint(Ravenclaw ravenclaw[],int number) {
        System.out.println(ravenclaw[number].toString());
    }
    public static void SlytherinStudentPrint(Slytherin slytherin[],int number) {
        System.out.println(slytherin[number].toString());
    }

    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", 10, 12),
                new Hogwarts("Гермиона", "Грейнджер", 15, 8),
                new Hogwarts("Рон", "Уизли", 3, 4),
                new Hogwarts("Захария", "Смит", 9, 8),
                new Hogwarts("Седрик", "Диггори", 8, 14),
                new Hogwarts("Джастин", "Финч-Флетчли", 7, 12),
                new Hogwarts("Чжоу", "Чанг", 6, 8),
                new Hogwarts("Падма", "Патил", 5, 14),
                new Hogwarts("Маркус", "Белби", 9, 8),
                new Hogwarts("Драко", "Малфой", 9, 9),
                new Hogwarts("Грэхэм", "Монтегю", 8, 4),
                new Hogwarts("Грегори", "Гойл", 7, 12),

        };
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", 10, 12, 7, 6, 8),
                new Gryffindor("Гермиона", "Грейнджер", 15, 8, 5, 5, 6),
                new Gryffindor("Рон", "Уизли", 3, 4, 3, 6, 5),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 9, 8,7,8,5),
                new Hufflepuff("Седрик", "Диггори", 8, 14,6,9,7),
                new Hufflepuff("Джастин", "Финч-Флетчли", 7, 12,5,9,8),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 6, 8,5,3,7,6),
                new Ravenclaw("Падма", "Патил", 5, 14,6,4,8,2),
                new Ravenclaw("Маркус", "Белби", 9, 8,4,9,5,3),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 9, 9,5,8,6,4,12),
                new Slytherin("Грэхэм", "Монтегю", 8, 4,6,4,8,3,9),
                new Slytherin("Грегори", "Гойл", 7, 12,3,7,9,6,8),

        };


        HogwartsStudentPrint(hogwarts,1);
        GryffindorStudentPrint(gryffindor,2);
        HufflepuffStudentPrint(hufflepuffs,1);
        RavenclawStudentPrint(ravenclaws,1);
        SlytherinStudentPrint(slytherins,1);

        PrintService printService = new PrintService();
        printService.print(hogwarts);
        printService.print(gryffindor);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
    }
}
public class Theatre {
    public static void main(String[] args) {
        System.out.println("=== ТЕАТР НАЧИНАЕТ РАБОТУ ===\n");

        Actor actor1 = new Actor("Иван", "Теноров", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Сопрано", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Пётр", "Баритон", Gender.MALE, 175);

        Director director1 = new Director("Антон", "Режиссёров", Gender.MALE, 15);
        Director director2 = new Director("Елена", "Постановкина", Gender.FEMALE, 8);

        Show ordinaryShow = new Show("Вишнёвый сад", 180, director1);
        Opera opera = new Opera("Травиата", 150, director2, "Джузеппе Верди",
                "Либретто Травиаты: История любви Виолетты и Альфреда...", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 120, director1,
                "Пётр Чайковский", "Либретто Лебединого озера: Принцесса Одетта...",
                "Мариус Петипа");

        System.out.println("--- Добавление актёров ---");
        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);
        ordinaryShow.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor1);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println();

        System.out.println("--- Списки актёров ---");
        ordinaryShow.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();
        System.out.println();

        System.out.println("--- Замена актёра (должно сработать) ---");
        Actor newActor = new Actor("Анна", "Меццо", Gender.FEMALE, 170);
        ordinaryShow.replaceActor("Сопрано", newActor);
        System.out.println("После замены:");
        ordinaryShow.printActors();
        System.out.println();

        System.out.println("--- Замена актёра (должно выдать ошибку) ---");
        ordinaryShow.replaceActor("Петров", newActor);
        System.out.println();

        System.out.println("--- Либретто оперы ---");
        opera.printLibretto();
        System.out.println();

        System.out.println("--- Либретто балета ---");
        ballet.printLibretto();
        System.out.println();

        System.out.println("--- Информация о режиссёрах ---");
        ordinaryShow.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();

        System.out.println("\n=== ТЕАТР ЗАКОНЧИЛ РАБОТУ ===");
    }
}
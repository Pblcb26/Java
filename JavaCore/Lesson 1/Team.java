public class Team{
    private String teamName;
    
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Cat[] cats = {
        new Cat("Мистер Кусака", 700, 12, 10, 0),
        new Cat("Клаус", 600, 8, 7, 0),
        new Cat("Миссис Моська", 510, 2, 1, 0),
        new Cat("Кусемось", 400, 9, 5, 0)
    };

    public void teamInfo() {
        System.out.println("Команда " + teamName + ":");
        for (Cat cat : cats) {
            cat.catInfo();
        }
        System.out.println(" ");
    }

    public void showResults() {
        for (Cat cat : cats) {
            cat.isVinner();
        }
    }
}
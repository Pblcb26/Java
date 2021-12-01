import java.util.Random;

public class Course {
    Random random = new Random();
    private int run = random.nextInt(700);
    private int jump = random.nextInt(12);
    private int swim = random.nextInt(10);
    int[] track = {run, jump, swim};

    public void courseInfo() {
        System.out.println("Добро пожаловать на соревнования по пересечению полосы препятствий!\n\nУчастникам надо пробежать " + run + " м, перепрыгнуть яму длинной " + jump + " м и проплыть " + swim + " м!");
        System.out.println("");
    }

    public void doIt(Team team) {
        System.out.println("Пушистые участники, готовьтесь к старту!\nНа старт!\nВнимание!\nМарш!");
        for (Cat cat : team.cats) {
            for (int y = 0; y < track.length; y++) {
                if (cat.getRunDistance() >= run && cat.getJumpDistance() >= jump && cat.getSwimingDistance() >= swim) {
                    cat.setCourseClear(1);
                }
            }
        }
        System.out.println("");
    }
}
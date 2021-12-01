public class Cat{
    private String name;
    private int runDistance;
    private int jumpDistance;
    private int swimingDistance;
    private int courseClear;


    Cat(String name, int runDistance, int jumpDistance, int swimingDistance, int courseClear) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
        this.swimingDistance = swimingDistance;
        this.courseClear = courseClear;
    }

    public String getName (String name) {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public int getSwimingDistance() {
        return swimingDistance;
    }

    public int getCourseClear() {
        return courseClear;
    }

    public void setCourseClear(int courseClear) {
        this.courseClear = courseClear;
    }

    public void isVinner() {
        if (courseClear > 0) {
            System.out.println(name + " - полоса препятствий преодолена!");
        }
    }

    public void catInfo () {
        System.out.println(name + " может пробежать " + runDistance + " м, прыгнуть на " + jumpDistance + " м и проплыть " + swimingDistance + " м!");
    }
}
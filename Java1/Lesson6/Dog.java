class Dog extends Animal{
    private int maxRun = 500;
    private int maxSwim = 10;

    Dog(String name, int swimingDistance, int runDistance) {
        super(name, swimingDistance, runDistance);
    }

    @Override
    public void run() {
        wasRun = (runDistance > maxRun)? "then ran 500 meters and fell to the ground." : "ran " + runDistance + " meters.";
    }

    @Override
     public void swim() {
        wasSwim = (swimingDistance > maxSwim)? "swam 10 meters and sadly looked at cats" : "swam " + swimingDistance + " meters and";
    }
}
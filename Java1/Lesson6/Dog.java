class Dog extends Animal{
    private int maxRun = 500;
    private int maxSwim = 10;

    Dog(String name, int swimingDistance, int runDistance) {
        super(name, swimingDistance, runDistance);
    }

    @Override
    public void run() {
        if (runDistance > maxRun) {
            wasRun = "then ran 500 meters and fell to the ground.";
        } else {
            wasRun = "ran " + runDistance + " meters.";   
        }
    }

    @Override
     public void swim() {
        if (swimingDistance > maxSwim) {
            wasSwim = "swam 10 meters and sadly looked at cats";
        } else { 
            wasSwim = "swam " + swimingDistance + " meters and";
        }
    }
}
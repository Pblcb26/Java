class Dog extends Animal{

    Dog(String name, int swimingDistance, int runDistance, int maxSwim, int maxRun) {
        super(name, swimingDistance, runDistance, maxSwim, maxRun);
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
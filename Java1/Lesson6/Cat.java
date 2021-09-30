class Cat extends Animal{
    private int maxRun = 200;
    private int maxSwim = 0;
    
    Cat(String name, int swimingDistance, int runDistance) {
        super(name, swimingDistance, runDistance);
    }

    @Override
    public void run() {
        if (runDistance > maxRun) {
            wasRun = "then ran 200 meters and fell asleep.";
        } else {
            wasRun = "ran " + runDistance + " meters.";   
        }
    }

    @Override
     public void swim() {
        if (swimingDistance != maxSwim) {
            wasSwim = "scratch you then";
        } else { 
            this.wasSwim = "looks with curiosity at the floating dogs";
        }
    }
}
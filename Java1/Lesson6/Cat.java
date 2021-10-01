class Cat extends Animal{
    private int maxRun = 200;
    private int maxSwim = 0;
    
    Cat(String name, int swimingDistance, int runDistance) {
        super(name, swimingDistance, runDistance);
    }

    @Override
    public void run() {
        wasRun = (runDistance > maxRun)? "then ran 200 meters and fell asleep." : "ran " + runDistance + " meters.";   
    }

    @Override
     public void swim() {
        wasSwim = (swimingDistance != maxSwim)? "scratch you then" : "looks with curiosity at the floating dogs";
    }
}
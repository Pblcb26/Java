class Cat extends Animal{
    
    Cat(String name, int swimingDistance, int runDistance, int maxSwim, int maxRun) {
        super(name, swimingDistance, runDistance, maxSwim, maxRun);
    }

    @Override
    public void run() {
        wasRun = (runDistance > maxRun)? "then ran 200 meters and fell asleep." : "ran " + runDistance + " meters.";   
    }

    @Override
     public void swim() {
        wasSwim = (swimingDistance != maxSwim)? "scratched you then" : "looks with curiosity at the floating dogs";
    }
}
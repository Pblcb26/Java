abstract class Animal implements AnimalInt{
    protected String name;
    protected int swimingDistance;
    protected int runDistance;
    protected String wasRun;
    protected String wasSwim;
    

    Animal(String name, int swimingDistance, int runDistance) {
        this.name = name;
        this.swimingDistance = swimingDistance;
        this.runDistance = runDistance;
    }

    @Override
    public String toString () {
        return "You want from "+ name + " to swim " + swimingDistance + " meters and run " + runDistance + ". " + name + " " + wasSwim + " " + wasRun;
    }
}
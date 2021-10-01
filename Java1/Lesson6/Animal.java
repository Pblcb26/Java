abstract class Animal implements AnimalInt{
    protected String name;
    protected int swimingDistance;
    protected int runDistance;
    protected String wasRun;
    protected String wasSwim;
    protected int maxRun;
    protected int maxSwim;
    private String className;//Получение имени класса
    //private static int countOfAnimals;//Счетчик животных из статик значения
       

    Animal(String name, int swimingDistance, int runDistance, int maxSwim, int maxRun) {
        this.name = name;
        this.swimingDistance = swimingDistance;
        this.runDistance = runDistance;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
        className = getClass().getSimpleName();//Получение имени класса
        //countOfAnimals++;//Счетчик животных из статик значения
    }

    public String getClassName() {//Получение имени класса
        return className;
    }
    
    /*public int getCountOfAnimals() {//Счетчик животных из статик значения
        return countOfAnimals;
    }*/

    @Override
    public String toString () {
        return "You want from " + className + " " + name + " to swim " + swimingDistance + " meters and run " + runDistance + ". " + name + " " + wasSwim + " " + wasRun;
    }
}
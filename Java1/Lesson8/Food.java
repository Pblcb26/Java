import java.util.Random;

/**
 * Java. Classic Game Snake
 *
 * @author Sergey Iryupin
 */

public class Food extends Cell{
    private Random random;
    private Snake snake;

    /*inherited from Cell
    protected int x, y; //coordinats
    protected int size; //object size px
    protected Color color;

    public super(int x, int y, int size, Color color)
    public void setset(x, y)
    public int getX()
    public int getY()
    public void paint(Graphics g)*/

    public Food(Snake snake) {
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.FOOD_COLOR); //отрицательные координаты - отсутствие еды на экране
        random = new Random();
        this.snake = snake;
    }

    public boolean isFood(int x, int y) {
        return (getX() == x) && (getY() == y);
    }

    public boolean isEaten() {
        return getX() == -1;
    }

    public void eat() {
        set(-1, -1);
    }

    public void appear() {
        int x, y;
        do {
            x = (random.nextInt(GameSnake.CANVAS_WIDTH));
            y = (random.nextInt(GameSnake.CANVAS_HEIGHT));
        } while (snake.isInSnake(x, y));
        set(x, y);
    }
}

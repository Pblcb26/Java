import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Java. Classic Game Snake
 *
 * @author Sergey Iryupin
 */

public class Cell {
    protected int x, y; //coordinats
    protected int size; //object size px
    protected Color color;

    public Cell(int x, int y, int size, Color color) {
        set(x, y);
        this.size = size;
        this.color = color;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public void paint(Graphics2D g) {     //render
        g.setColor(color);
        g.fillOval(x * size, y * size, //upper left corner
        size, size);                   //width & height
    }
    
}

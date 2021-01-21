package game;

import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;


    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
        this.tileSize = 110;

    }

    /** This method is rendering game tile **/
    public void render(Graphics g) {
        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;


        if (this.row % 2 == this.col % 2) {
            g.setColor(Color.decode("#FF6347"));
        } else {
            g.setColor(Color.decode("#8A2BE2"));
        }

        g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
        g.setColor(Color.blue);
        g.fillOval(255, 255, 40, 40);

    }
}





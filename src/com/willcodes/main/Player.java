package com.willcodes.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {
    Random r = new Random();

    boolean left = true;
    public Player(int x, int y, ID id) {
        super(x, y, id);

//        velX = 1;
//        velY = 1;


    }

    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 32);
        y = Game.clamp(y, 0, Game.HEIGHT - 62);

    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);

    }


}

package com.willcodes.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {
    Random r = new Random();
    Handler handler;

    boolean left = true;
    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

//        velX = 1;
//        velY = 1;


    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 32);
        y = Game.clamp(y, 0, Game.HEIGHT - 62);
        handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.1f, handler));
        collision();

    }

    private void collision() {
        for (int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);

            if (tempObject.getId() == ID.BasicEnemy) {
                if(getBounds().intersects(tempObject.getBounds())) {
                    HUD.HEALTH -= 2;
                }
            }

        }
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);

    }


}

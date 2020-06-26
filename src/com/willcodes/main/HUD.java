package com.willcodes.main;

import java.awt.*;

public class HUD {
    public static int HEALTH = 100;

    public static void tick() {
        HEALTH--;
        HEALTH = Game.clamp(HEALTH, 0, 100);
    }
    public static void render(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 32);
        g.setColor(Color.green);
        g.fillRect(15, 15, HEALTH * 2, 32);
        g.setColor(Color.white);
        g.drawRect(15, 15, 200, 32);
    }
}

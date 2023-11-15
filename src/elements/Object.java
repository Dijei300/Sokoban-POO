package elements;

import test.SokobanGUI;

public abstract class Object {
    private int r;
     private int c;
     private final String icon;
    private final SokobanGUI game;

    public Object(int r, int c, String icon, SokobanGUI game) {
        this.r = r;
        this.c = c;
        this.icon = icon;
        this.game = game;
    }

    public int getC() {
        return c;
    }

    public int getR() {
        return r;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getIcon() {
        return icon;
    }

    public SokobanGUI getGame() {
        return game;
    }
}

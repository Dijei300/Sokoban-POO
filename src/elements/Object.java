package elements;

import test.SokobanGUI;

public abstract class Object {
    int r;
    int c;
    String icon;
    SokobanGUI game;

    public Object(int r, int c, String icon, SokobanGUI game) {
        this.r = r;
        this.c = c;
        this.icon = icon;
        this.game = game;
    }
}

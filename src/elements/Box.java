package elements;

import test.SokobanGUI;

public class Box extends Movable {
    public Box(int r, int c, String icon, SokobanGUI game) {
        super(r, c, "images/Box.png", game);
    }
}

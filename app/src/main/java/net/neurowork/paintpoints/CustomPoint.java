package net.neurowork.paintpoints;

import android.graphics.Point;

public class CustomPoint extends Point {
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}

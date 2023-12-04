package cc.cloudist.acplibrary.components;
/* loaded from: classes3.dex */
public class PetalCoordinate {
    private int endX;
    private int endY;
    private int startX;
    private int startY;

    public PetalCoordinate(int i, int i2, int i3, int i4) {
        this.startX = i;
        this.startY = i2;
        this.endX = i3;
        this.endY = i4;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getStartY() {
        return this.startY;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getEndY() {
        return this.endY;
    }
}

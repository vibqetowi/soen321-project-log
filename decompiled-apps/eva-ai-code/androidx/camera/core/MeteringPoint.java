package androidx.camera.core;

import android.util.Rational;
/* loaded from: classes.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private Rational mSurfaceAspectRatio;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MeteringPoint(float f, float f2, float f3, Rational rational) {
        this.mNormalizedX = f;
        this.mNormalizedY = f2;
        this.mSize = f3;
        this.mSurfaceAspectRatio = rational;
    }

    public float getX() {
        return this.mNormalizedX;
    }

    public float getY() {
        return this.mNormalizedY;
    }

    public float getSize() {
        return this.mSize;
    }

    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }
}

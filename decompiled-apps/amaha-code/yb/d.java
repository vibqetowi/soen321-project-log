package yb;
/* compiled from: CutCornerTreatment.java */
/* loaded from: classes.dex */
public final class d extends df.b {
    public final float B;

    public d() {
        super(13);
        this.B = -1.0f;
    }

    @Override // df.b
    public final void m(float f, float f2, l lVar) {
        lVar.e(f2 * f, 180.0f, 90.0f);
        double d10 = f2;
        double d11 = f;
        lVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}

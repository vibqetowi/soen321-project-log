package yb;
/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes.dex */
public final class h extends df.b {
    public final float B;

    public h() {
        super(13);
        this.B = -1.0f;
    }

    @Override // df.b
    public final void m(float f, float f2, l lVar) {
        lVar.e(f2 * f, 180.0f, 90.0f);
        float f10 = f2 * 2.0f * f;
        lVar.a(0.0f, 0.0f, f10, f10, 180.0f, 90.0f);
    }
}

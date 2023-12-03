package t6;

import q6.i;
/* compiled from: BarHighlighter.java */
/* loaded from: classes.dex */
public class a extends b<u6.a> {
    public a(u6.a aVar) {
        super(aVar);
    }

    @Override // t6.b, t6.d
    public c a(float f, float f2) {
        c a10 = super.a(f, f2);
        if (a10 == null) {
            return null;
        }
        i.a aVar = i.a.LEFT;
        T t3 = this.f32417a;
        y6.b b10 = t3.c(aVar).b(f, f2);
        v6.a aVar2 = (v6.a) ((u6.a) t3).getBarData().b(a10.f);
        if (aVar2.V()) {
            if (((r6.c) aVar2.h0((float) b10.f38273b, (float) b10.f38274c)) == null) {
                return null;
            }
            return a10;
        }
        y6.b.c(b10);
        return a10;
    }

    @Override // t6.b
    public final r6.d c() {
        return ((u6.a) this.f32417a).getBarData();
    }

    @Override // t6.b
    public float d(float f, float f2, float f10, float f11) {
        return Math.abs(f - f10);
    }
}

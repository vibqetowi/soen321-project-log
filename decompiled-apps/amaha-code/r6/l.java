package r6;
/* compiled from: PieData.java */
/* loaded from: classes.dex */
public final class l extends h<v6.g> {
    @Override // r6.h
    public final v6.g b(int i6) {
        if (i6 == 0) {
            return i();
        }
        return null;
    }

    @Override // r6.h
    public final j e(t6.c cVar) {
        return i().x((int) cVar.f32419a);
    }

    public final v6.g i() {
        return (v6.g) this.f30512i.get(0);
    }

    public final float j() {
        float f = 0.0f;
        for (int i6 = 0; i6 < i().c0(); i6++) {
            f += i().x(i6).f30503u;
        }
        return f;
    }
}

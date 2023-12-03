package x6;
/* compiled from: BarLineScatterCandleBubbleRenderer.java */
/* loaded from: classes.dex */
public abstract class c extends d {
    public c(n6.a aVar, y6.g gVar) {
        super(aVar, gVar);
    }

    public static boolean p(v6.b bVar) {
        if (bVar.isVisible() && (bVar.W() || bVar.m())) {
            return true;
        }
        return false;
    }

    public final boolean o(r6.j jVar, v6.b bVar) {
        if (jVar == null) {
            return false;
        }
        this.f37621c.getClass();
        if (bVar.b0(jVar) >= bVar.c0() * 1.0f) {
            return false;
        }
        return true;
    }
}

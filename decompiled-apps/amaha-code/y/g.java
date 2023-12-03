package y;

import java.util.Iterator;
/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f38164m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f38157e = 2;
        } else {
            this.f38157e = 3;
        }
    }

    @Override // y.f
    public final void d(int i6) {
        if (this.f38161j) {
            return;
        }
        this.f38161j = true;
        this.f38158g = i6;
        Iterator it = this.f38162k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}

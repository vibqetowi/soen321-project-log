package w3;

import androidx.appcompat.widget.l;
import w3.j;
/* compiled from: Plugin.kt */
/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: w  reason: collision with root package name */
    public u3.b f36357w;

    /* renamed from: u  reason: collision with root package name */
    public final j.a f36355u = j.a.Destination;

    /* renamed from: v  reason: collision with root package name */
    public final l f36356v = new l(5);

    /* renamed from: x  reason: collision with root package name */
    public final boolean f36358x = true;

    @Override // w3.j
    public final j.a a() {
        return this.f36355u;
    }

    @Override // w3.j
    public final void c(u3.b bVar) {
        this.f36357w = bVar;
    }

    @Override // w3.j
    public void g(u3.b bVar) {
        c(bVar);
        l lVar = this.f36356v;
        lVar.getClass();
        lVar.f1472w = bVar;
    }

    @Override // w3.j
    public final v3.a h(v3.a aVar) {
        return null;
    }

    public final void i(v3.a aVar) {
        if (!this.f36358x) {
            return;
        }
        j.a aVar2 = j.a.Before;
        l lVar = this.f36356v;
        v3.a h10 = lVar.h(j.a.Enrichment, lVar.h(aVar2, aVar));
        if (h10 != null) {
            if (h10 instanceof v3.c) {
                e((v3.c) h10);
            } else if (h10 instanceof v3.b) {
                f((v3.b) h10);
            } else if (h10 instanceof v3.f) {
                b((v3.f) h10);
            } else {
                d(h10);
            }
        }
    }

    @Override // w3.g
    public void flush() {
    }

    @Override // w3.g
    public v3.f b(v3.f fVar) {
        return fVar;
    }

    @Override // w3.g
    public v3.a d(v3.a aVar) {
        return aVar;
    }

    @Override // w3.g
    public v3.c e(v3.c cVar) {
        return cVar;
    }

    @Override // w3.g
    public v3.b f(v3.b bVar) {
        return bVar;
    }
}

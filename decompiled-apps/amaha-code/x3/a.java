package x3;

import kotlin.jvm.internal.i;
import ta.v;
import v3.c;
import w3.d;
import w3.e;
import w3.f;
import w3.k;
/* compiled from: AmplitudeDestination.kt */
/* loaded from: classes.dex */
public final class a extends w3.a {

    /* renamed from: y  reason: collision with root package name */
    public f f37606y;

    @Override // w3.a, w3.g
    public final v3.f b(v3.f fVar) {
        j(fVar);
        return fVar;
    }

    @Override // w3.a, w3.g
    public final v3.a d(v3.a aVar) {
        j(aVar);
        return aVar;
    }

    @Override // w3.a, w3.g
    public final c e(c cVar) {
        j(cVar);
        return cVar;
    }

    @Override // w3.a, w3.g
    public final v3.b f(v3.b bVar) {
        j(bVar);
        return bVar;
    }

    @Override // w3.a, w3.g
    public final void flush() {
        f fVar = this.f37606y;
        if (fVar != null) {
            fVar.f36376b.q(new k(2, null));
            return;
        }
        i.q("pipeline");
        throw null;
    }

    @Override // w3.a, w3.j
    public final void g(u3.b bVar) {
        super.g(bVar);
        f fVar = new f(bVar);
        this.f37606y = fVar;
        fVar.f = true;
        v.H(bVar.f33768c, bVar.f, 0, new e(fVar, null), 2);
        v.H(bVar.f33768c, bVar.f33770e, 0, new d(fVar, null), 2);
        b bVar2 = new b();
        if (this.f36357w != null) {
            this.f36356v.f(bVar2);
        } else {
            i.q("amplitude");
            throw null;
        }
    }

    public final void j(v3.a aVar) {
        if (aVar.b()) {
            f fVar = this.f37606y;
            if (fVar != null) {
                fVar.f36376b.q(new k(1, aVar));
                return;
            }
            i.q("pipeline");
            throw null;
        }
        u3.b bVar = this.f36357w;
        if (bVar != null) {
            bVar.f33774j.f(i.n(aVar.a(), "Event is invalid for missing information like userId and deviceId. Dropping event: "));
            return;
        }
        i.q("amplitude");
        throw null;
    }
}

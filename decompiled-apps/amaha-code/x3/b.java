package x3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import w3.j;
import z3.c;
import z3.d;
import z3.e;
/* compiled from: IdentityEventSender.kt */
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: u  reason: collision with root package name */
    public d f37607u;

    @Override // w3.j
    public final j.a a() {
        return j.a.Before;
    }

    @Override // w3.j
    public final void g(u3.b bVar) {
        Object obj = c.f39147b;
        this.f37607u = c.a.a(bVar.f33766a.e()).f39149a;
    }

    @Override // w3.j
    public final v3.a h(v3.a aVar) {
        z3.b bVar;
        if (aVar.N != null) {
            d dVar = this.f37607u;
            if (dVar != null) {
                e eVar = e.IDENTIFY;
                z3.a aVar2 = new z3.a(aVar.a(), aVar.M, aVar.N, aVar.O, aVar.P);
                synchronized (dVar.f39150a) {
                    LinkedHashMap linkedHashMap = dVar.f39151b;
                    Object obj = linkedHashMap.get(eVar);
                    if (obj == null) {
                        obj = new z3.b(eVar);
                        linkedHashMap.put(eVar, obj);
                    }
                    bVar = (z3.b) obj;
                }
                bVar.a(aVar2);
            } else {
                i.q("eventBridge");
                throw null;
            }
        }
        return aVar;
    }

    @Override // w3.j
    public final void c(u3.b bVar) {
    }
}

package l9;

import java.util.HashSet;
import java.util.Iterator;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class b0 extends e.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f24161a;

    public /* synthetic */ b0(c cVar) {
        this.f24161a = cVar;
    }

    @Override // k9.e.c
    public final void a(int i6) {
        Iterator it = new HashSet(this.f24161a.f24164d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).a(i6);
        }
    }

    @Override // k9.e.c
    public final void b(int i6) {
        c cVar = this.f24161a;
        c.j(cVar, i6);
        cVar.c(i6);
        Iterator it = new HashSet(cVar.f24164d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).b(i6);
        }
    }

    @Override // k9.e.c
    public final void c(k9.d dVar) {
        Iterator it = new HashSet(this.f24161a.f24164d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).c(dVar);
        }
    }

    @Override // k9.e.c
    public final void d() {
        Iterator it = new HashSet(this.f24161a.f24164d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).d();
        }
    }

    @Override // k9.e.c
    public final void e(int i6) {
        Iterator it = new HashSet(this.f24161a.f24164d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).e(i6);
        }
    }

    @Override // k9.e.c
    public final void f() {
        Iterator it = new HashSet(this.f24161a.f24164d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).f();
        }
    }
}

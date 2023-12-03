package w4;

import he.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import le.o;
import s1.s;
/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36414a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36415b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f36416c;

    /* renamed from: d  reason: collision with root package name */
    public Object f36417d;

    public l(int i6) {
        this.f36414a = i6;
        if (i6 == 1) {
            this.f36416c = new Object();
            return;
        }
        this.f36416c = Collections.newSetFromMap(new WeakHashMap());
        this.f36417d = new ArrayList();
    }

    public final void a(ke.m mVar, o oVar) {
        ((ArrayList) ((s) this.f36416c).f31226x).add(new le.e(mVar, oVar));
    }

    public final boolean b(z4.b bVar) {
        boolean z10 = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f36416c).remove(bVar);
        if (!((List) this.f36417d).remove(bVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            bVar.clear();
        }
        return z10;
    }

    public final IllegalArgumentException c(String str) {
        String str2;
        ke.m mVar = (ke.m) this.f36417d;
        if (mVar != null && !mVar.isEmpty()) {
            str2 = " (found in field " + ((ke.m) this.f36417d).h() + ")";
        } else {
            str2 = "";
        }
        return new IllegalArgumentException(defpackage.b.m("Invalid data. ", str, str2));
    }

    public final boolean d() {
        s sVar = (s) this.f36416c;
        int ordinal = ((f0) sVar.f31224v).ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3 || ordinal == 4) {
            return false;
        }
        ca.a.V("Unexpected case for UserDataSource: %s", ((f0) sVar.f31224v).name());
        throw null;
    }

    public final void e() {
        Iterator it = d5.j.d((Set) this.f36416c).iterator();
        while (it.hasNext()) {
            z4.b bVar = (z4.b) it.next();
            if (!bVar.d() && !bVar.b()) {
                bVar.clear();
                if (!this.f36415b) {
                    bVar.c();
                } else {
                    ((List) this.f36417d).add(bVar);
                }
            }
        }
    }

    public final void f() {
        this.f36415b = false;
        Iterator it = d5.j.d((Set) this.f36416c).iterator();
        while (it.hasNext()) {
            z4.b bVar = (z4.b) it.next();
            if (!bVar.d() && !bVar.isRunning()) {
                bVar.c();
            }
        }
        ((List) this.f36417d).clear();
    }

    public final void g(ya.s sVar) {
        synchronized (this.f36416c) {
            if (((Queue) this.f36417d) == null) {
                this.f36417d = new ArrayDeque();
            }
            ((Queue) this.f36417d).add(sVar);
        }
    }

    public final void h(ya.h hVar) {
        ya.s sVar;
        synchronized (this.f36416c) {
            if (((Queue) this.f36417d) != null && !this.f36415b) {
                this.f36415b = true;
                while (true) {
                    synchronized (this.f36416c) {
                        sVar = (ya.s) ((Queue) this.f36417d).poll();
                        if (sVar == null) {
                            this.f36415b = false;
                            return;
                        }
                    }
                    sVar.a(hVar);
                }
            }
        }
    }

    public final String toString() {
        switch (this.f36414a) {
            case 0:
                return super.toString() + "{numRequests=" + ((Set) this.f36416c).size() + ", isPaused=" + this.f36415b + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(s sVar, ke.m mVar) {
        this(sVar, mVar, false);
        this.f36414a = 2;
    }

    public l(s sVar, ke.m mVar, boolean z10) {
        this.f36414a = 2;
        this.f36416c = sVar;
        this.f36417d = mVar;
        this.f36415b = z10;
    }
}

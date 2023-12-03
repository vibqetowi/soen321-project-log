package ne;

import he.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import je.b1;
/* compiled from: WatchChangeAggregator.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f26202a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f26203b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public HashMap f26204c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public HashMap f26205d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public HashSet f26206e = new HashSet();

    /* compiled from: WatchChangeAggregator.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public d0(a aVar) {
        this.f26202a = aVar;
    }

    public final b0 a(int i6) {
        HashMap hashMap = this.f26203b;
        b0 b0Var = (b0) hashMap.get(Integer.valueOf(i6));
        if (b0Var == null) {
            b0 b0Var2 = new b0();
            hashMap.put(Integer.valueOf(i6), b0Var2);
            return b0Var2;
        }
        return b0Var;
    }

    public final boolean b(int i6) {
        if (c(i6) != null) {
            return true;
        }
        return false;
    }

    public final b1 c(int i6) {
        boolean z10;
        b0 b0Var = (b0) this.f26203b.get(Integer.valueOf(i6));
        if (b0Var != null) {
            if (b0Var.f26178a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
        }
        return (b1) ((x) this.f26202a).f26276c.get(Integer.valueOf(i6));
    }

    public final void d(int i6, ke.i iVar, ke.n nVar) {
        if (!b(i6)) {
            return;
        }
        b0 a10 = a(i6);
        boolean contains = ((x) this.f26202a).f26274a.f(i6).contains(iVar);
        HashMap hashMap = a10.f26179b;
        if (contains) {
            h.a aVar = h.a.REMOVED;
            a10.f26180c = true;
            hashMap.put(iVar, aVar);
        } else {
            a10.f26180c = true;
            hashMap.remove(iVar);
        }
        Set set = (Set) this.f26205d.get(iVar);
        if (set == null) {
            set = new HashSet();
            this.f26205d.put(iVar, set);
        }
        set.add(Integer.valueOf(i6));
        if (nVar != null) {
            this.f26204c.put(iVar, nVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i6) {
        boolean z10;
        boolean z11;
        HashMap hashMap = this.f26203b;
        if (hashMap.get(Integer.valueOf(i6)) != null) {
            z10 = true;
            if (((b0) hashMap.get(Integer.valueOf(i6))).f26178a != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        z10 = false;
        ca.a.u0(z10, "Should only reset active targets", new Object[0]);
        hashMap.put(Integer.valueOf(i6), new b0());
        Iterator<ke.i> it = ((x) this.f26202a).f26274a.f(i6).iterator();
        while (it.hasNext()) {
            d(i6, it.next(), null);
        }
    }
}

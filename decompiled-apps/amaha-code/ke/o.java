package ke;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import rf.n;
import rf.s;
/* compiled from: ObjectValue.java */
/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: u  reason: collision with root package name */
    public rf.s f23290u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f23291v;

    public o(rf.s sVar) {
        this.f23291v = new HashMap();
        ca.a.u0(sVar.i0() == 11, "ObjectValues should be backed by a MapValue", new Object[0]);
        ca.a.u0(!q.c(sVar), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f23290u = sVar;
    }

    public static le.d c(rf.n nVar) {
        boolean z10;
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, rf.s> entry : nVar.P().entrySet()) {
            m mVar = new m(Collections.singletonList(entry.getKey()));
            rf.s value = entry.getValue();
            rf.s sVar = t.f23299a;
            if (value != null && value.i0() == 11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Set<m> set = c(entry.getValue().e0()).f24212a;
                if (set.isEmpty()) {
                    hashSet.add(mVar);
                } else {
                    for (m mVar2 : set) {
                        hashSet.add(mVar.f(mVar2));
                    }
                }
            } else {
                hashSet.add(mVar);
            }
        }
        return new le.d(hashSet);
    }

    public static rf.s d(m mVar, rf.s sVar) {
        boolean z10;
        if (mVar.isEmpty()) {
            return sVar;
        }
        for (int i6 = 0; i6 < mVar.p() - 1; i6++) {
            sVar = sVar.e0().Q(mVar.l(i6));
            rf.s sVar2 = t.f23299a;
            if (sVar != null && sVar.i0() == 11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return null;
            }
        }
        return sVar.e0().Q(mVar.k());
    }

    public static o e(Map<String, rf.s> map) {
        s.a j02 = rf.s.j0();
        n.a S = rf.n.S();
        S.u();
        rf.n.M((rf.n) S.f10073v).putAll(map);
        j02.z(S);
        return new o(j02.r());
    }

    public final rf.n a(m mVar, Map<String, Object> map) {
        boolean z10;
        n.a S;
        boolean z11;
        rf.s d10 = d(mVar, this.f23290u);
        rf.s sVar = t.f23299a;
        if (d10 != null && d10.i0() == 11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            S = d10.e0().a();
        } else {
            S = rf.n.S();
        }
        boolean z12 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                rf.n a10 = a(mVar.d(key), (Map) value);
                if (a10 != null) {
                    s.a j02 = rf.s.j0();
                    j02.A(a10);
                    S.x(j02.r(), key);
                    z12 = true;
                }
            } else {
                if (value instanceof rf.s) {
                    S.x((rf.s) value, key);
                } else {
                    S.getClass();
                    key.getClass();
                    if (((rf.n) S.f10073v).P().containsKey(key)) {
                        if (value == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ca.a.u0(z11, "Expected entry to be a Map, a Value or null", new Object[0]);
                        S.u();
                        rf.n.M((rf.n) S.f10073v).remove(key);
                    }
                }
                z12 = true;
            }
        }
        if (z12) {
            return S.r();
        }
        return null;
    }

    public final rf.s b() {
        synchronized (this.f23291v) {
            rf.n a10 = a(m.f23284w, this.f23291v);
            if (a10 != null) {
                s.a j02 = rf.s.j0();
                j02.A(a10);
                this.f23290u = j02.r();
                this.f23291v.clear();
            }
        }
        return this.f23290u;
    }

    public final Object clone() {
        return new o(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return t.f(b(), ((o) obj).b());
        }
        return false;
    }

    public final void f(m mVar, rf.s sVar) {
        ca.a.u0(!mVar.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        i(mVar, sVar);
    }

    public final void h(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            m mVar = (m) entry.getKey();
            if (entry.getValue() == null) {
                ca.a.u0(!mVar.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
                i(mVar, null);
            } else {
                f(mVar, (rf.s) entry.getValue());
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(m mVar, rf.s sVar) {
        Map hashMap;
        Map map = this.f23291v;
        for (int i6 = 0; i6 < mVar.p() - 1; i6++) {
            String l2 = mVar.l(i6);
            Object obj = map.get(l2);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof rf.s) {
                    rf.s sVar2 = (rf.s) obj;
                    if (sVar2.i0() == 11) {
                        HashMap hashMap2 = new HashMap(sVar2.e0().P());
                        map.put(l2, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap();
                map.put(l2, hashMap);
            }
            map = hashMap;
        }
        map.put(mVar.k(), sVar);
    }

    public final String toString() {
        return "ObjectValue{internalValue=" + t.a(b()) + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        this(r0.r());
        s.a j02 = rf.s.j0();
        j02.A(rf.n.N());
    }
}

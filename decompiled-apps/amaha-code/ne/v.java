package ne;

import com.google.firebase.database.collection.ImmutableSortedSet;
import he.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import je.b1;
import ne.c0;
import ne.e0;
import ne.x;
import oe.a;
import tr.i0;
/* compiled from: RemoteStore.java */
/* loaded from: classes.dex */
public final class v implements e0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f26272a;

    public v(x xVar) {
        this.f26272a = xVar;
    }

    @Override // ne.z
    public final void a(i0 i0Var) {
        boolean z10;
        x xVar = this.f26272a;
        xVar.getClass();
        boolean z11 = true;
        if (i0Var.e()) {
            ca.a.u0(!xVar.g(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        xVar.f26280h = null;
        boolean g5 = xVar.g();
        he.w wVar = he.w.UNKNOWN;
        s sVar = xVar.f26277d;
        if (g5) {
            if (sVar.f26262a == he.w.ONLINE) {
                sVar.b(wVar);
                if (sVar.f26263b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "watchStreamFailures must be 0", new Object[0]);
                if (sVar.f26264c != null) {
                    z11 = false;
                }
                ca.a.u0(z11, "onlineStateTimer must be null", new Object[0]);
            } else {
                int i6 = sVar.f26263b + 1;
                sVar.f26263b = i6;
                if (i6 >= 1) {
                    a.C0452a c0452a = sVar.f26264c;
                    if (c0452a != null) {
                        c0452a.a();
                        sVar.f26264c = null;
                    }
                    sVar.a(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, i0Var));
                    sVar.b(he.w.OFFLINE);
                }
            }
            xVar.i();
            return;
        }
        sVar.c(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // ne.e0.a
    public final void c(ke.r rVar, c0 c0Var) {
        boolean z10;
        c0.c cVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ke.r rVar2;
        boolean z15;
        ke.n nVar;
        ke.i iVar;
        h.a aVar;
        i0 i0Var;
        he.w wVar = he.w.ONLINE;
        x xVar = this.f26272a;
        xVar.f26277d.c(wVar);
        if (xVar.f != null && xVar.f26280h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z16 = c0Var instanceof c0.c;
        if (z16) {
            cVar = (c0.c) c0Var;
        } else {
            cVar = null;
        }
        HashMap hashMap = xVar.f26276c;
        x.a aVar2 = xVar.f26274a;
        if (cVar != null && cVar.f26191a.equals(c0.d.Removed) && (i0Var = cVar.f26194d) != null) {
            for (Integer num : cVar.f26192b) {
                if (hashMap.containsKey(num)) {
                    hashMap.remove(num);
                    xVar.f26280h.f26203b.remove(Integer.valueOf(num.intValue()));
                    aVar2.b(num.intValue(), i0Var);
                }
            }
            return;
        }
        if (c0Var instanceof c0.a) {
            d0 d0Var = xVar.f26280h;
            c0.a aVar3 = (c0.a) c0Var;
            d0Var.getClass();
            Iterator<Integer> it = aVar3.f26185a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                nVar = aVar3.f26188d;
                iVar = aVar3.f26187c;
                if (!hasNext) {
                    break;
                }
                int intValue = it.next().intValue();
                if (nVar != null && nVar.b()) {
                    if (d0Var.b(intValue)) {
                        ImmutableSortedSet<ke.i> f = ((x) d0Var.f26202a).f26274a.f(intValue);
                        ke.i iVar2 = nVar.f23285b;
                        if (f.contains(iVar2)) {
                            aVar = h.a.MODIFIED;
                        } else {
                            aVar = h.a.ADDED;
                        }
                        b0 a10 = d0Var.a(intValue);
                        a10.f26180c = true;
                        a10.f26179b.put(iVar2, aVar);
                        d0Var.f26204c.put(iVar2, nVar);
                        Set set = (Set) d0Var.f26205d.get(iVar2);
                        if (set == null) {
                            set = new HashSet();
                            d0Var.f26205d.put(iVar2, set);
                        }
                        set.add(Integer.valueOf(intValue));
                    }
                } else {
                    d0Var.d(intValue, iVar, nVar);
                }
            }
            for (Integer num2 : aVar3.f26186b) {
                d0Var.d(num2.intValue(), iVar, nVar);
            }
        } else if (c0Var instanceof c0.b) {
            d0 d0Var2 = xVar.f26280h;
            c0.b bVar = (c0.b) c0Var;
            d0Var2.getClass();
            int i6 = bVar.f26190b.f34976b;
            int i10 = bVar.f26189a;
            b1 c10 = d0Var2.c(i10);
            if (c10 != null) {
                he.d0 d0Var3 = c10.f21796a;
                if (d0Var3.e()) {
                    if (i6 == 0) {
                        ke.i iVar3 = new ke.i(d0Var3.f17473d);
                        d0Var2.d(i10, iVar3, ke.n.n(iVar3, ke.r.f23293v));
                    } else {
                        if (i6 == 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ca.a.u0(z14, "Single document existence filter with count: %d", Integer.valueOf(i6));
                    }
                } else {
                    a0 a11 = d0Var2.a(i10).a();
                    if ((a11.f26154c.size() + ((x) d0Var2.f26202a).f26274a.f(i10).size()) - a11.f26156e.size() != i6) {
                        d0Var2.e(i10);
                        d0Var2.f26206e.add(Integer.valueOf(i10));
                    }
                }
            }
        } else {
            ca.a.u0(z16, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            d0 d0Var4 = xVar.f26280h;
            c0.c cVar2 = (c0.c) c0Var;
            d0Var4.getClass();
            ?? r52 = cVar2.f26192b;
            boolean isEmpty = r52.isEmpty();
            HashMap hashMap2 = d0Var4.f26203b;
            if (isEmpty) {
                r52 = new ArrayList();
                for (Integer num3 : hashMap2.keySet()) {
                    if (d0Var4.b(num3.intValue())) {
                        r52.add(num3);
                    }
                }
            }
            for (Integer num4 : r52) {
                int intValue2 = num4.intValue();
                b0 a12 = d0Var4.a(intValue2);
                c0.d dVar = cVar2.f26191a;
                int ordinal = dVar.ordinal();
                com.google.protobuf.h hVar = cVar2.f26193c;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    if (d0Var4.b(intValue2)) {
                                        d0Var4.e(intValue2);
                                        if (!hVar.isEmpty()) {
                                            a12.f26180c = true;
                                            a12.f26181d = hVar;
                                        }
                                    }
                                } else {
                                    ca.a.V("Unknown target watch change state: %s", dVar);
                                    throw null;
                                }
                            } else if (d0Var4.b(intValue2)) {
                                a12.f26180c = true;
                                a12.f26182e = true;
                                if (!hVar.isEmpty()) {
                                    a12.f26180c = true;
                                    a12.f26181d = hVar;
                                }
                            }
                        } else {
                            int i11 = a12.f26178a - 1;
                            a12.f26178a = i11;
                            if (i11 != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                hashMap2.remove(Integer.valueOf(intValue2));
                            }
                            if (cVar2.f26194d == null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ca.a.u0(z13, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                        }
                    } else {
                        int i12 = a12.f26178a - 1;
                        a12.f26178a = i12;
                        if (i12 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            a12.f26180c = false;
                            a12.f26179b.clear();
                        }
                        if (!hVar.isEmpty()) {
                            a12.f26180c = true;
                            a12.f26181d = hVar;
                        }
                    }
                } else if (d0Var4.b(intValue2) && !hVar.isEmpty()) {
                    a12.f26180c = true;
                    a12.f26181d = hVar;
                }
            }
        }
        if (!rVar.equals(ke.r.f23293v) && rVar.compareTo(xVar.f26275b.f21853i.e()) >= 0) {
            ca.a.u0(!rVar.equals(rVar2), "Can't raise event for unknown SnapshotVersion", new Object[0]);
            d0 d0Var5 = xVar.f26280h;
            d0Var5.getClass();
            HashMap hashMap3 = new HashMap();
            for (Map.Entry entry : d0Var5.f26203b.entrySet()) {
                int intValue3 = ((Integer) entry.getKey()).intValue();
                b0 b0Var = (b0) entry.getValue();
                b1 c11 = d0Var5.c(intValue3);
                if (c11 != null) {
                    if (b0Var.f26182e) {
                        he.d0 d0Var6 = c11.f21796a;
                        if (d0Var6.e()) {
                            ke.i iVar4 = new ke.i(d0Var6.f17473d);
                            if (d0Var5.f26204c.get(iVar4) == null && !((x) d0Var5.f26202a).f26274a.f(intValue3).contains(iVar4)) {
                                d0Var5.d(intValue3, iVar4, ke.n.n(iVar4, rVar));
                            }
                        }
                    }
                    if (b0Var.f26180c) {
                        hashMap3.put(Integer.valueOf(intValue3), b0Var.a());
                        b0Var.f26180c = false;
                        b0Var.f26179b.clear();
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry2 : d0Var5.f26205d.entrySet()) {
                ke.i iVar5 = (ke.i) entry2.getKey();
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b1 c12 = d0Var5.c(((Integer) it2.next()).intValue());
                        if (c12 != null && !c12.f21799d.equals(je.a0.LIMBO_RESOLUTION)) {
                            z15 = false;
                            break;
                        }
                    } else {
                        z15 = true;
                        break;
                    }
                }
                if (z15) {
                    hashSet.add(iVar5);
                }
            }
            for (ke.n nVar2 : d0Var5.f26204c.values()) {
                nVar2.f23288e = rVar;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
            q.f fVar = new q.f(rVar, unmodifiableMap, Collections.unmodifiableSet(d0Var5.f26206e), Collections.unmodifiableMap(d0Var5.f26204c), Collections.unmodifiableSet(hashSet), 5);
            d0Var5.f26204c = new HashMap();
            d0Var5.f26205d = new HashMap();
            d0Var5.f26206e = new HashSet();
            for (Map.Entry entry3 : unmodifiableMap.entrySet()) {
                a0 a0Var = (a0) entry3.getValue();
                if (!a0Var.f26152a.isEmpty()) {
                    int intValue4 = ((Integer) entry3.getKey()).intValue();
                    b1 b1Var = (b1) hashMap.get(Integer.valueOf(intValue4));
                    if (b1Var != null) {
                        hashMap.put(Integer.valueOf(intValue4), b1Var.a(a0Var.f26152a, rVar));
                    }
                }
            }
            for (Integer num5 : (Set) fVar.f29106x) {
                int intValue5 = num5.intValue();
                b1 b1Var2 = (b1) hashMap.get(Integer.valueOf(intValue5));
                if (b1Var2 != null) {
                    hashMap.put(Integer.valueOf(intValue5), b1Var2.a(com.google.protobuf.h.f9922v, b1Var2.f21800e));
                    xVar.e(intValue5);
                    xVar.f(new b1(b1Var2.f21796a, intValue5, b1Var2.f21798c, je.a0.EXISTENCE_FILTER_MISMATCH));
                }
            }
            aVar2.e(fVar);
        }
    }

    @Override // ne.z
    public final void onOpen() {
        x xVar = this.f26272a;
        for (b1 b1Var : xVar.f26276c.values()) {
            xVar.f(b1Var);
        }
    }
}

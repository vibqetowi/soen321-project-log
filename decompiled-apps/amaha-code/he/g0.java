package he;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import he.h;
import he.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: View.java */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f17502a;

    /* renamed from: b  reason: collision with root package name */
    public int f17503b = 1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17504c;

    /* renamed from: d  reason: collision with root package name */
    public ke.k f17505d;

    /* renamed from: e  reason: collision with root package name */
    public ImmutableSortedSet<ke.i> f17506e;
    public ImmutableSortedSet<ke.i> f;

    /* renamed from: g  reason: collision with root package name */
    public ImmutableSortedSet<ke.i> f17507g;

    /* compiled from: View.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ke.k f17508a;

        /* renamed from: b  reason: collision with root package name */
        public final i f17509b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17510c;

        /* renamed from: d  reason: collision with root package name */
        public final ImmutableSortedSet<ke.i> f17511d;

        public a(ke.k kVar, i iVar, ImmutableSortedSet immutableSortedSet, boolean z10) {
            this.f17508a = kVar;
            this.f17509b = iVar;
            this.f17511d = immutableSortedSet;
            this.f17510c = z10;
        }
    }

    public g0(y yVar, ImmutableSortedSet<ke.i> immutableSortedSet) {
        this.f17502a = yVar;
        this.f17505d = new ke.k(ke.h.f23272a, new ImmutableSortedSet(Collections.emptyList(), new ke.j(yVar.b(), 0)));
        this.f17506e = immutableSortedSet;
        ImmutableSortedSet<ke.i> immutableSortedSet2 = ke.i.f23274w;
        this.f = immutableSortedSet2;
        this.f17507g = immutableSortedSet2;
    }

    public static int b(h hVar) {
        int ordinal = hVar.f17512a.ordinal();
        if (ordinal != 0) {
            int i6 = 1;
            if (ordinal != 1) {
                i6 = 2;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 2;
                    }
                    throw new IllegalArgumentException("Unknown change type: " + hVar.f17512a);
                }
            }
            return i6;
        }
        return 0;
    }

    public final nd.z a(a aVar, ne.a0 a0Var) {
        List list;
        boolean z10;
        ke.g gVar;
        boolean z11;
        int i6;
        boolean z12;
        boolean z13;
        boolean z14;
        h0 h0Var;
        ca.a.u0(!aVar.f17510c, "Cannot apply changes that need a refill", new Object[0]);
        ke.k kVar = this.f17505d;
        this.f17505d = aVar.f17508a;
        this.f17507g = aVar.f17511d;
        i iVar = aVar.f17509b;
        iVar.getClass();
        ArrayList arrayList = new ArrayList(iVar.f17527a.values());
        Collections.sort(arrayList, new f8.j(1, this));
        if (a0Var != null) {
            Iterator<ke.i> it = a0Var.f26154c.iterator();
            while (it.hasNext()) {
                this.f17506e = this.f17506e.insert(it.next());
            }
            Iterator<ke.i> it2 = a0Var.f26155d.iterator();
            while (it2.hasNext()) {
                ke.i next = it2.next();
                ca.a.u0(this.f17506e.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<ke.i> it3 = a0Var.f26156e.iterator();
            while (it3.hasNext()) {
                this.f17506e = this.f17506e.remove(it3.next());
            }
            this.f17504c = a0Var.f26153b;
        }
        if (!this.f17504c) {
            list = Collections.emptyList();
        } else {
            ImmutableSortedSet<ke.i> immutableSortedSet = this.f;
            this.f = ke.i.f23274w;
            Iterator<ke.g> it4 = this.f17505d.iterator();
            while (it4.hasNext()) {
                ke.g next2 = it4.next();
                ke.i key = next2.getKey();
                if (this.f17506e.contains(key) || (gVar = this.f17505d.f23278u.get(key)) == null || gVar.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    this.f = this.f.insert(next2.getKey());
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f.size() + immutableSortedSet.size());
            Iterator<ke.i> it5 = immutableSortedSet.iterator();
            while (it5.hasNext()) {
                ke.i next3 = it5.next();
                if (!this.f.contains(next3)) {
                    arrayList2.add(new s(s.a.REMOVED, next3));
                }
            }
            Iterator<ke.i> it6 = this.f.iterator();
            while (it6.hasNext()) {
                ke.i next4 = it6.next();
                if (!immutableSortedSet.contains(next4)) {
                    arrayList2.add(new s(s.a.ADDED, next4));
                }
            }
            list = arrayList2;
        }
        if (this.f.size() == 0 && this.f17504c) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i6 = 3;
        } else {
            i6 = 2;
        }
        if (i6 != this.f17503b) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f17503b = i6;
        if (arrayList.size() == 0 && !z12) {
            h0Var = null;
        } else {
            if (i6 == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (a0Var != null && !a0Var.f26152a.isEmpty()) {
                z14 = true;
            } else {
                z14 = false;
            }
            h0Var = new h0(this.f17502a, aVar.f17508a, kVar, arrayList, z13, aVar.f17511d, z12, false, z14);
        }
        return new nd.z(h0Var, 3, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
        if (r5.b().compare(r3, r6) > 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
        if (r5.b().compare(r3, r11) < 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013e, code lost:
        if (r11 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a c(ImmutableSortedMap<ke.i, ke.g> immutableSortedMap, a aVar) {
        i iVar;
        ke.k kVar;
        ImmutableSortedSet<ke.i> immutableSortedSet;
        ke.g gVar;
        ke.g gVar2;
        h.a aVar2;
        boolean z10;
        boolean z11;
        ke.g minEntry;
        ke.g gVar3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ImmutableSortedSet<ke.i> remove;
        boolean z16;
        g0 g0Var = this;
        if (aVar != null) {
            iVar = aVar.f17509b;
        } else {
            iVar = new i();
        }
        if (aVar != null) {
            kVar = aVar.f17508a;
        } else {
            kVar = g0Var.f17505d;
        }
        if (aVar != null) {
            immutableSortedSet = aVar.f17511d;
        } else {
            immutableSortedSet = g0Var.f17507g;
        }
        y yVar = g0Var.f17502a;
        boolean b10 = v.h.b(yVar.f17583h, 1);
        long j10 = yVar.f17582g;
        if (b10 && kVar.size() == j10) {
            gVar = kVar.f23279v.getMaxEntry();
        } else {
            gVar = null;
        }
        int i6 = yVar.f17583h;
        if (v.h.b(i6, 2) && kVar.size() == j10) {
            gVar2 = kVar.f23279v.getMinEntry();
        } else {
            gVar2 = null;
        }
        Iterator<Map.Entry<ke.i, ke.g>> it = immutableSortedMap.iterator();
        ke.k kVar2 = kVar;
        boolean z17 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            aVar2 = h.a.REMOVED;
            if (!hasNext) {
                break;
            }
            Map.Entry<ke.i, ke.g> next = it.next();
            ke.i key = next.getKey();
            Iterator<Map.Entry<ke.i, ke.g>> it2 = it;
            ke.g gVar4 = kVar.f23278u.get(key);
            ke.k kVar3 = kVar;
            if (yVar.i(next.getValue())) {
                gVar3 = next.getValue();
            } else {
                gVar3 = null;
            }
            if (gVar4 != null) {
                z12 = z17;
                if (g0Var.f17507g.contains(gVar4.getKey())) {
                    z13 = true;
                    if (gVar3 == null && (gVar3.d() || (g0Var.f17507g.contains(gVar3.getKey()) && gVar3.c()))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (gVar4 == null && gVar3 != null) {
                        if (!gVar4.getData().equals(gVar3.getData())) {
                            if (gVar4.d() && gVar3.c() && !gVar3.d()) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (!z16) {
                                iVar.a(new h(h.a.MODIFIED, gVar3));
                                if (gVar != null) {
                                }
                                if (gVar2 != null) {
                                }
                                z17 = z12;
                                z15 = true;
                            }
                            z17 = z12;
                            z15 = false;
                        } else {
                            if (z13 != z14) {
                                iVar.a(new h(h.a.METADATA, gVar3));
                                z17 = z12;
                                z15 = true;
                            }
                            z17 = z12;
                            z15 = false;
                        }
                    } else {
                        if (gVar4 != null && gVar3 != null) {
                            iVar.a(new h(h.a.ADDED, gVar3));
                        } else {
                            if (gVar4 != null && gVar3 == null) {
                                iVar.a(new h(aVar2, gVar4));
                                if (gVar == null) {
                                }
                                z15 = true;
                                z17 = true;
                            }
                            z17 = z12;
                            z15 = false;
                        }
                        z17 = z12;
                        z15 = true;
                    }
                    if (z15) {
                        if (gVar3 != null) {
                            kVar2.getClass();
                            ke.k e10 = kVar2.e(gVar3.getKey());
                            kVar2 = new ke.k(e10.f23278u.insert(gVar3.getKey(), gVar3), e10.f23279v.insert(gVar3));
                            if (gVar3.d()) {
                                remove = immutableSortedSet.insert(gVar3.getKey());
                            } else {
                                remove = immutableSortedSet.remove(gVar3.getKey());
                            }
                        } else {
                            kVar2 = kVar2.e(key);
                            remove = immutableSortedSet.remove(key);
                        }
                        immutableSortedSet = remove;
                    }
                    g0Var = this;
                    it = it2;
                    kVar = kVar3;
                }
            } else {
                z12 = z17;
            }
            z13 = false;
            if (gVar3 == null) {
            }
            z14 = false;
            if (gVar4 == null) {
            }
            if (gVar4 != null) {
            }
            if (gVar4 != null) {
                iVar.a(new h(aVar2, gVar4));
                if (gVar == null) {
                }
                z15 = true;
                z17 = true;
                if (z15) {
                }
                g0Var = this;
                it = it2;
                kVar = kVar3;
            }
            z17 = z12;
            z15 = false;
            if (z15) {
            }
            g0Var = this;
            it = it2;
            kVar = kVar3;
        }
        boolean z18 = z17;
        if (j10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (long size = kVar2.size() - j10; size > 0; size--) {
                boolean b11 = v.h.b(i6, 1);
                ImmutableSortedSet<ke.g> immutableSortedSet2 = kVar2.f23279v;
                if (b11) {
                    minEntry = immutableSortedSet2.getMaxEntry();
                } else {
                    minEntry = immutableSortedSet2.getMinEntry();
                }
                ke.g gVar5 = minEntry;
                kVar2 = kVar2.e(gVar5.getKey());
                immutableSortedSet = immutableSortedSet.remove(gVar5.getKey());
                iVar.a(new h(aVar2, gVar5));
            }
        }
        if (z18 && aVar != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ca.a.u0(z11, "View was refilled using docs that themselves needed refilling.", new Object[0]);
        return new a(kVar2, iVar, immutableSortedSet, z18);
    }
}

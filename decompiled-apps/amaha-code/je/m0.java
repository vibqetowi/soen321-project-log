package je;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.database.collection.ImmutableSortedMap;
import he.k;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import je.r;
import je.s0;
import ke.l;
/* compiled from: SQLiteIndexManager.java */
/* loaded from: classes.dex */
public final class m0 implements f {

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f21870k = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final s0 f21871a;

    /* renamed from: b  reason: collision with root package name */
    public final i f21872b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21873c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f21874d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final r.a f21875e = new r.a();
    public final HashMap f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final PriorityQueue f21876g = new PriorityQueue(10, new p0.d(22));

    /* renamed from: h  reason: collision with root package name */
    public boolean f21877h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f21878i = -1;

    /* renamed from: j  reason: collision with root package name */
    public long f21879j = -1;

    public m0(s0 s0Var, i iVar, ge.e eVar) {
        this.f21871a = s0Var;
        this.f21872b = iVar;
        String str = eVar.f16468a;
        this.f21873c = str != null ? str : "";
    }

    public static Object[] j(ke.l lVar, he.d0 d0Var, Collection collection) {
        boolean z10;
        Iterator it;
        Iterator it2;
        Iterator it3;
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ie.c());
        Iterator it4 = collection.iterator();
        Iterator it5 = lVar.c().iterator();
        while (it5.hasNext()) {
            l.c cVar = (l.c) it5.next();
            rf.s sVar = (rf.s) it4.next();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ie.c cVar2 = (ie.c) it6.next();
                ke.m d10 = cVar.d();
                for (he.l lVar2 : d0Var.f17472c) {
                    if (lVar2 instanceof he.k) {
                        he.k kVar = (he.k) lVar2;
                        if (kVar.f17539c.equals(d10)) {
                            k.a aVar = k.a.IN;
                            k.a aVar2 = kVar.f17537a;
                            if (aVar2.equals(aVar) || aVar2.equals(k.a.NOT_IN)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z10 = false;
                if (z10 && ke.t.h(sVar)) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList = new ArrayList();
                    for (rf.s sVar2 : sVar.X().p()) {
                        Iterator it7 = arrayList2.iterator();
                        while (it7.hasNext()) {
                            ie.c cVar3 = new ie.c();
                            ie.f fVar = ((ie.c) it7.next()).f19995a;
                            byte[] copyOf = Arrays.copyOf(fVar.f20002a, fVar.f20003b);
                            ie.f fVar2 = cVar3.f19995a;
                            fVar2.getClass();
                            fVar2.a(copyOf.length);
                            int length = copyOf.length;
                            int i6 = 0;
                            while (i6 < length) {
                                byte b10 = copyOf[i6];
                                Iterator it8 = it4;
                                byte[] bArr = fVar2.f20002a;
                                Iterator it9 = it5;
                                int i10 = fVar2.f20003b;
                                fVar2.f20003b = i10 + 1;
                                bArr[i10] = b10;
                                i6++;
                                it4 = it8;
                                it5 = it9;
                                it6 = it6;
                            }
                            Iterator it10 = it4;
                            com.android.volley.toolbox.a a10 = cVar3.a(cVar.f());
                            ie.b.a(sVar2, a10);
                            a10.v();
                            arrayList.add(cVar3);
                            it4 = it10;
                            it5 = it5;
                            it6 = it6;
                        }
                    }
                    it = it4;
                    it2 = it5;
                    it3 = it6;
                } else {
                    it = it4;
                    it2 = it5;
                    it3 = it6;
                    com.android.volley.toolbox.a a11 = cVar2.a(cVar.f());
                    ie.b.a(sVar, a11);
                    a11.v();
                }
                it4 = it;
                it5 = it2;
                it6 = it3;
            }
        }
        Object[] objArr = new Object[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ie.f fVar3 = ((ie.c) arrayList.get(i11)).f19995a;
            objArr[i11] = Arrays.copyOf(fVar3.f20002a, fVar3.f20003b);
        }
        return objArr;
    }

    public static ke.b m(Collection collection) {
        ca.a.u0(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        l.a a10 = ((ke.l) it.next()).e().a();
        int i6 = a10.i();
        while (it.hasNext()) {
            l.a a11 = ((ke.l) it.next()).e().a();
            if (a11.compareTo(a10) < 0) {
                a10 = a11;
            }
            i6 = Math.max(a11.i(), i6);
        }
        return new ke.b(a10.j(), a10.h(), i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x018d, code lost:
        if (r10 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196 A[SYNTHETIC] */
    @Override // je.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ImmutableSortedMap<ke.i, ke.g> immutableSortedMap) {
        byte[] copyOf;
        final int i6;
        Comparator dVar;
        boolean z10;
        boolean z11;
        int i10 = 0;
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        Iterator<Map.Entry<ke.i, ke.g>> it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Map.Entry<ke.i, ke.g> next = it.next();
            ke.p pVar = next.getKey().f23275u;
            for (ke.l lVar : l(pVar.l(pVar.p() - 2))) {
                ke.i key = next.getKey();
                TreeSet treeSet = new TreeSet();
                s0.d G = this.f21871a.G("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                Object[] objArr = new Object[3];
                objArr[i10] = Integer.valueOf(lVar.d());
                objArr[1] = key.toString();
                objArr[2] = this.f21873c;
                G.a(objArr);
                G.d(new k0(i10, treeSet, lVar, key));
                ke.g value = next.getValue();
                TreeSet treeSet2 = new TreeSet();
                ie.c cVar = new ie.c();
                Iterator it2 = lVar.c().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        l.c cVar2 = (l.c) it2.next();
                        rf.s e10 = value.e(cVar2.d());
                        if (e10 == null) {
                            copyOf = null;
                            break;
                        }
                        com.android.volley.toolbox.a a10 = cVar.a(cVar2.f());
                        ie.b.a(e10, a10);
                        a10.v();
                    } else {
                        ie.f fVar = cVar.f19995a;
                        copyOf = Arrays.copyOf(fVar.f20002a, fVar.f20003b);
                        break;
                    }
                }
                if (copyOf != null) {
                    l.c a11 = lVar.a();
                    if (a11 != null) {
                        rf.s e11 = value.e(a11.d());
                        if (ke.t.h(e11)) {
                            for (rf.s sVar : e11.X().p()) {
                                int d10 = lVar.d();
                                ke.i key2 = value.getKey();
                                ie.c cVar3 = new ie.c();
                                com.android.volley.toolbox.a a12 = cVar3.a(1);
                                ie.b.a(sVar, a12);
                                a12.v();
                                ie.f fVar2 = cVar3.f19995a;
                                treeSet2.add(new ie.a(d10, key2, Arrays.copyOf(fVar2.f20002a, fVar2.f20003b), copyOf));
                            }
                        }
                    } else {
                        int d11 = lVar.d();
                        ke.i key3 = value.getKey();
                        i6 = 0;
                        treeSet2.add(new ie.a(d11, key3, new byte[0], copyOf));
                        if (treeSet.equals(treeSet2)) {
                            final ke.g value2 = next.getValue();
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = value2.getKey();
                            kc.f.A(1, "m0", "Updating index entries for document '%s'", objArr2);
                            oe.d dVar2 = new oe.d(this) { // from class: je.i0

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ m0 f21838b;

                                {
                                    this.f21838b = this;
                                }

                                @Override // oe.d
                                public final void accept(Object obj) {
                                    int i11 = i6;
                                    ke.g gVar = value2;
                                    m0 m0Var = this.f21838b;
                                    switch (i11) {
                                        case 0:
                                            ie.d dVar3 = (ie.d) obj;
                                            m0Var.getClass();
                                            m0Var.f21871a.F("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(dVar3.i()), m0Var.f21873c, dVar3.d(), dVar3.f(), gVar.getKey().toString());
                                            return;
                                        default:
                                            ie.d dVar4 = (ie.d) obj;
                                            m0Var.getClass();
                                            m0Var.f21871a.F("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(dVar4.i()), m0Var.f21873c, dVar4.d(), dVar4.f(), gVar.getKey().toString());
                                            return;
                                    }
                                }
                            };
                            oe.d dVar3 = new oe.d(this) { // from class: je.i0

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ m0 f21838b;

                                {
                                    this.f21838b = this;
                                }

                                @Override // oe.d
                                public final void accept(Object obj) {
                                    int i11 = i6;
                                    ke.g gVar = value2;
                                    m0 m0Var = this.f21838b;
                                    switch (i11) {
                                        case 0:
                                            ie.d dVar32 = (ie.d) obj;
                                            m0Var.getClass();
                                            m0Var.f21871a.F("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(dVar32.i()), m0Var.f21873c, dVar32.d(), dVar32.f(), gVar.getKey().toString());
                                            return;
                                        default:
                                            ie.d dVar4 = (ie.d) obj;
                                            m0Var.getClass();
                                            m0Var.f21871a.F("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(dVar4.i()), m0Var.f21873c, dVar4.d(), dVar4.f(), gVar.getKey().toString());
                                            return;
                                    }
                                }
                            };
                            SecureRandom secureRandom = oe.n.f27432a;
                            Iterator it3 = treeSet.iterator();
                            Iterator it4 = treeSet2.iterator();
                            if (treeSet.comparator() != null) {
                                dVar = treeSet.comparator();
                            } else {
                                dVar = new p0.d(29);
                            }
                            Object a13 = oe.n.a(it3);
                            Object a14 = oe.n.a(it4);
                            while (true) {
                                if (a13 != null || a14 != null) {
                                    if (a13 != null && a14 != null) {
                                        int compare = dVar.compare(a13, a14);
                                        if (compare >= 0) {
                                            if (compare <= 0) {
                                                z10 = false;
                                                z11 = false;
                                                if (z10) {
                                                    dVar2.accept(a14);
                                                    a14 = oe.n.a(it4);
                                                } else if (z11) {
                                                    dVar3.accept(a13);
                                                    a13 = oe.n.a(it3);
                                                } else {
                                                    a13 = oe.n.a(it3);
                                                    a14 = oe.n.a(it4);
                                                }
                                            }
                                            z10 = true;
                                            z11 = false;
                                            if (z10) {
                                            }
                                        }
                                        z10 = false;
                                        z11 = true;
                                        if (z10) {
                                        }
                                    }
                                }
                            }
                        }
                        i10 = 0;
                    }
                }
                i6 = 0;
                if (treeSet.equals(treeSet2)) {
                }
                i10 = 0;
            }
        }
    }

    @Override // je.f
    public final void b(ke.p pVar) {
        boolean z10;
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        if (pVar.p() % 2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Expected a collection path.", new Object[0]);
        if (this.f21875e.a(pVar)) {
            this.f21871a.F("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", pVar.k(), ca.a.R(pVar.t()));
        }
    }

    @Override // je.f
    public final List<ke.i> c(he.d0 d0Var) {
        List<he.x> list;
        String str;
        boolean z10;
        boolean z11;
        Iterator it;
        Collection collection;
        String str2;
        String str3;
        int i6;
        int i10;
        int i11;
        int i12;
        List<rf.s> list2;
        byte[] bArr;
        Pair<rf.s, Boolean> a10;
        Pair<rf.s, Boolean> c10;
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<he.d0> it2 = n(d0Var).iterator();
        while (true) {
            List<rf.s> list3 = null;
            if (it2.hasNext()) {
                he.d0 next = it2.next();
                ke.l k10 = k(next);
                if (k10 == null) {
                    return null;
                }
                arrayList3.add(Pair.create(next, k10));
            } else {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    he.d0 d0Var2 = (he.d0) pair.first;
                    ke.l lVar = (ke.l) pair.second;
                    d0Var2.getClass();
                    l.c a11 = lVar.a();
                    if (a11 != null) {
                        Iterator it4 = d0Var2.d(a11.d()).iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                he.k kVar = (he.k) it4.next();
                                int ordinal = kVar.f17537a.ordinal();
                                rf.s sVar = kVar.f17538b;
                                if (ordinal != 6) {
                                    if (ordinal == 7) {
                                        list3 = sVar.X().p();
                                        break;
                                    }
                                } else {
                                    list3 = Collections.singletonList(sVar);
                                    break;
                                }
                            } else {
                                list3 = null;
                                break;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it5 = lVar.c().iterator();
                    while (it5.hasNext()) {
                        l.c cVar = (l.c) it5.next();
                        Iterator it6 = d0Var2.d(cVar.d()).iterator();
                        while (it6.hasNext()) {
                            he.k kVar2 = (he.k) it6.next();
                            it = it3;
                            int ordinal2 = kVar2.f17537a.ordinal();
                            rf.s sVar2 = kVar2.f17538b;
                            Iterator it7 = it5;
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 != 8) {
                                        if (ordinal2 != 9) {
                                            it3 = it;
                                            it5 = it7;
                                        }
                                    }
                                }
                                linkedHashMap.put(cVar.d(), sVar2);
                                collection = linkedHashMap.values();
                                break;
                            }
                            linkedHashMap.put(cVar.d(), sVar2);
                            it3 = it;
                            it5 = it7;
                        }
                    }
                    it = it3;
                    collection = null;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it8 = lVar.c().iterator();
                    boolean z12 = true;
                    while (it8.hasNext()) {
                        l.c cVar2 = (l.c) it8.next();
                        Iterator it9 = it8;
                        boolean b10 = v.h.b(cVar2.f(), 1);
                        he.e eVar = d0Var2.f17475g;
                        if (b10) {
                            c10 = d0Var2.a(cVar2, eVar);
                        } else {
                            c10 = d0Var2.c(cVar2, eVar);
                        }
                        arrayList4.add((rf.s) c10.first);
                        z12 &= ((Boolean) c10.second).booleanValue();
                        it8 = it9;
                    }
                    he.e eVar2 = new he.e(arrayList4, z12);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it10 = lVar.c().iterator();
                    boolean z13 = true;
                    while (it10.hasNext()) {
                        l.c cVar3 = (l.c) it10.next();
                        Iterator it11 = it10;
                        boolean b11 = v.h.b(cVar3.f(), 1);
                        he.e eVar3 = d0Var2.f17476h;
                        if (b11) {
                            a10 = d0Var2.c(cVar3, eVar3);
                        } else {
                            a10 = d0Var2.a(cVar3, eVar3);
                        }
                        arrayList5.add((rf.s) a10.first);
                        z13 &= ((Boolean) a10.second).booleanValue();
                        it10 = it11;
                    }
                    kc.f.A(1, "m0", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", lVar, d0Var2, list3, eVar2, new he.e(arrayList5, z13));
                    Object[] j10 = j(lVar, d0Var2, eVar2.f17478b);
                    if (eVar2.f17477a) {
                        str2 = ">=";
                    } else {
                        str2 = ">";
                    }
                    Object[] j11 = j(lVar, d0Var2, arrayList5);
                    if (z13) {
                        str3 = "<=";
                    } else {
                        str3 = "<";
                    }
                    Object[] j12 = j(lVar, d0Var2, collection);
                    int d10 = lVar.d();
                    if (list3 != null) {
                        i6 = list3.size();
                    } else {
                        i6 = 1;
                    }
                    int max = Math.max(j10.length, j11.length) * i6;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SELECT document_key, directional_value FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value ");
                    sb2.append(str2);
                    sb2.append(" ? AND directional_value ");
                    sb2.append(str3);
                    sb2.append(" ? ");
                    StringBuilder g5 = oe.n.g(sb2, max, " UNION ");
                    if (j12 != null) {
                        StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
                        sb3.append((CharSequence) g5);
                        sb3.append(") WHERE directional_value NOT IN (");
                        sb3.append((CharSequence) oe.n.g("?", j12.length, ", "));
                        sb3.append(")");
                        g5 = sb3;
                    }
                    if (list3 != null) {
                        i10 = list3.size();
                    } else {
                        i10 = 1;
                    }
                    int i13 = max / i10;
                    int i14 = max * 5;
                    if (j12 != null) {
                        i11 = j12.length;
                    } else {
                        i11 = 0;
                    }
                    Object[] objArr = new Object[i14 + i11];
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < max) {
                        int i17 = i16 + 1;
                        objArr[i16] = Integer.valueOf(d10);
                        int i18 = i17 + 1;
                        objArr[i17] = this.f21873c;
                        int i19 = i18 + 1;
                        if (list3 != null) {
                            i12 = d10;
                            ie.c cVar4 = new ie.c();
                            list2 = list3;
                            com.android.volley.toolbox.a a12 = cVar4.a(1);
                            ie.b.a(list3.get(i15 / i13), a12);
                            a12.v();
                            ie.f fVar = cVar4.f19995a;
                            bArr = Arrays.copyOf(fVar.f20002a, fVar.f20003b);
                        } else {
                            i12 = d10;
                            list2 = list3;
                            bArr = f21870k;
                        }
                        objArr[i18] = bArr;
                        int i20 = i19 + 1;
                        int i21 = i15 % i13;
                        objArr[i19] = j10[i21];
                        i16 = i20 + 1;
                        objArr[i20] = j11[i21];
                        i15++;
                        d10 = i12;
                        list3 = list2;
                    }
                    if (j12 != null) {
                        int length = j12.length;
                        int i22 = 0;
                        while (i22 < length) {
                            objArr[i16] = j12[i22];
                            i22++;
                            i16++;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(g5.toString());
                    arrayList6.addAll(Arrays.asList(objArr));
                    Object[] array = arrayList6.toArray();
                    arrayList.add(String.valueOf(array[0]));
                    arrayList2.addAll(Arrays.asList(array).subList(1, array.length));
                    list3 = null;
                    it3 = it;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(TextUtils.join(" UNION ", arrayList));
                sb4.append("ORDER BY directional_value, document_key ");
                if (v.h.b(d0Var.f17471b.get(list.size() - 1).f17573a, 1)) {
                    str = "asc ";
                } else {
                    str = "desc ";
                }
                sb4.append(str);
                String m10 = defpackage.b.m("SELECT DISTINCT document_key FROM (", sb4.toString(), ")");
                long j13 = d0Var.f;
                if (j13 != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    m10 = m10 + " LIMIT " + j13;
                }
                if (arrayList2.size() < 1000) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ca.a.u0(z11, "Cannot perform query with more than 999 bind elements", new Object[0]);
                s0.d G = this.f21871a.G(m10);
                G.a(arrayList2.toArray());
                ArrayList arrayList7 = new ArrayList();
                G.d(new h0(0, arrayList7));
                kc.f.A(1, "m0", "Index scan returned %s documents", Integer.valueOf(arrayList7.size()));
                return arrayList7;
            }
        }
    }

    @Override // je.f
    public final void d(String str, ke.b bVar) {
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        this.f21879j++;
        for (ke.l lVar : l(str)) {
            ke.a aVar = new ke.a(lVar.d(), lVar.b(), lVar.f(), new ke.c(this.f21879j, bVar));
            ke.r rVar = bVar.f23261w;
            this.f21871a.F("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(lVar.d()), this.f21873c, Long.valueOf(this.f21879j), Long.valueOf(rVar.f23294u.f31450u), Integer.valueOf(rVar.f23294u.f31451v), ca.a.R(bVar.f23262x.f23275u), Integer.valueOf(bVar.f23263y));
            o(aVar);
        }
    }

    @Override // je.f
    public final String e() {
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        ke.l lVar = (ke.l) this.f21876g.peek();
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    @Override // je.f
    public final int f(he.d0 d0Var) {
        int i6;
        List<he.d0> n10 = n(d0Var);
        Iterator<he.d0> it = n10.iterator();
        int i10 = 3;
        while (true) {
            i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            he.d0 next = it.next();
            ke.l k10 = k(next);
            if (k10 == null) {
                i10 = 1;
                break;
            }
            int size = k10.f().size();
            HashSet hashSet = new HashSet();
            for (he.l lVar : next.f17472c) {
                for (he.k kVar : lVar.d()) {
                    if (!kVar.f17539c.v()) {
                        k.a aVar = k.a.ARRAY_CONTAINS;
                        k.a aVar2 = kVar.f17537a;
                        if (!aVar2.equals(aVar) && !aVar2.equals(k.a.ARRAY_CONTAINS_ANY)) {
                            hashSet.add(kVar.f17539c);
                        } else {
                            i6 = 1;
                        }
                    }
                }
            }
            for (he.x xVar : next.f17471b) {
                if (!xVar.f17574b.v()) {
                    hashSet.add(xVar.f17574b);
                }
            }
            if (size < hashSet.size() + i6) {
                i10 = 2;
            }
        }
        if (d0Var.f != -1) {
            i6 = 1;
        }
        if (i6 != 0 && n10.size() > 1 && i10 == 3) {
            return 2;
        }
        return i10;
    }

    @Override // je.f
    public final List<ke.p> g(String str) {
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        s0.d G = this.f21871a.G("SELECT parent FROM collection_parents WHERE collection_id = ?");
        G.a(str);
        G.d(new j0(0, arrayList));
        return arrayList;
    }

    @Override // je.f
    public final ke.b h(he.d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        for (he.d0 d0Var2 : n(d0Var)) {
            ke.l k10 = k(d0Var2);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return m(arrayList);
    }

    @Override // je.f
    public final ke.b i(String str) {
        Collection<ke.l> l2 = l(str);
        ca.a.u0(!l2.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return m(l2);
    }

    public final ke.l k(he.d0 d0Var) {
        boolean z10;
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        ke.s sVar = new ke.s(d0Var);
        String str = d0Var.f17474e;
        if (str == null) {
            str = d0Var.f17473d.k();
        }
        Collection<ke.l> l2 = l(str);
        ke.l lVar = null;
        if (l2.isEmpty()) {
            return null;
        }
        for (ke.l lVar2 : l2) {
            ca.a.u0(lVar2.b().equals(sVar.f23295a), "Collection IDs do not match", new Object[0]);
            l.c a10 = lVar2.a();
            if (a10 == null || sVar.a(a10)) {
                Iterator<he.x> it = sVar.f23298d.iterator();
                ArrayList c10 = lVar2.c();
                int i6 = 0;
                while (i6 < c10.size() && sVar.a((l.c) c10.get(i6))) {
                    i6++;
                }
                z10 = true;
                if (i6 != c10.size()) {
                    he.k kVar = sVar.f23296b;
                    if (kVar != null) {
                        l.c cVar = (l.c) c10.get(i6);
                        if (ke.s.b(kVar, cVar) && ke.s.c(it.next(), cVar)) {
                            i6++;
                        }
                    }
                    while (i6 < c10.size()) {
                        l.c cVar2 = (l.c) c10.get(i6);
                        if (it.hasNext() && ke.s.c(it.next(), cVar2)) {
                            i6++;
                        }
                    }
                }
                if (z10 && (lVar == null || lVar2.f().size() > lVar.f().size())) {
                    lVar = lVar2;
                }
            }
            z10 = false;
            if (z10) {
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public final Collection<ke.l> l(String str) {
        ca.a.u0(this.f21877h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f.get(str);
        if (map == null) {
            return Collections.emptyList();
        }
        return map.values();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r3 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<he.d0> n(he.d0 d0Var) {
        List<he.l> singletonList;
        boolean z10;
        boolean z11;
        HashMap hashMap = this.f21874d;
        if (hashMap.containsKey(d0Var)) {
            return (List) hashMap.get(d0Var);
        }
        ArrayList arrayList = new ArrayList();
        if (d0Var.f17472c.isEmpty()) {
            arrayList.add(d0Var);
        } else {
            boolean z12 = true;
            he.g gVar = new he.g(d0Var.f17472c, 1);
            if (gVar.b().isEmpty()) {
                singletonList = Collections.emptyList();
            } else {
                he.l e10 = oe.k.e(oe.k.f(gVar));
                ca.a.u0(oe.k.g(e10), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
                if (!(e10 instanceof he.k)) {
                    if (e10 instanceof he.g) {
                        he.g gVar2 = (he.g) e10;
                        Iterator it = gVar2.f17499a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((he.l) it.next()) instanceof he.g) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10 && gVar2.f()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    z12 = false;
                    if (!z12) {
                        singletonList = e10.b();
                    }
                }
                singletonList = Collections.singletonList(e10);
            }
            for (he.l lVar : singletonList) {
                arrayList.add(new he.d0(d0Var.f17473d, d0Var.f17474e, lVar.b(), d0Var.f17471b, d0Var.f, d0Var.f17475g, d0Var.f17476h));
            }
        }
        hashMap.put(d0Var, arrayList);
        return arrayList;
    }

    public final void o(ke.a aVar) {
        HashMap hashMap = this.f;
        String str = aVar.f23258c;
        Map map = (Map) hashMap.get(str);
        if (map == null) {
            map = new HashMap();
            hashMap.put(str, map);
        }
        int i6 = aVar.f23257b;
        ke.l lVar = (ke.l) map.get(Integer.valueOf(i6));
        PriorityQueue priorityQueue = this.f21876g;
        if (lVar != null) {
            priorityQueue.remove(lVar);
        }
        map.put(Integer.valueOf(i6), aVar);
        priorityQueue.add(aVar);
        this.f21878i = Math.max(this.f21878i, i6);
        this.f21879j = Math.max(this.f21879j, aVar.f23260e.b());
    }

    @Override // je.f
    public final void start() {
        HashMap hashMap = new HashMap();
        s0 s0Var = this.f21871a;
        s0.d G = s0Var.G("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        G.a(this.f21873c);
        G.d(new j0(1, hashMap));
        s0Var.G("SELECT index_id, collection_group, index_proto FROM index_configuration").d(new l0(this, 0, hashMap));
        this.f21877h = true;
    }
}

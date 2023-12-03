package je;

import android.database.Cursor;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.l1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import je.s0;
import ke.l;
import me.a;
import me.b;
import me.d;
import rf.d;
/* compiled from: SQLiteRemoteDocumentCache.java */
/* loaded from: classes.dex */
public final class u0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f21955a;

    /* renamed from: b  reason: collision with root package name */
    public final i f21956b;

    /* renamed from: c  reason: collision with root package name */
    public f f21957c;

    public u0(s0 s0Var, i iVar) {
        this.f21955a = s0Var;
        this.f21956b = iVar;
    }

    @Override // je.c0
    public final void a(ke.n nVar, ke.r rVar) {
        ca.a.u0(!rVar.equals(ke.r.f23293v), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        i iVar = this.f21956b;
        iVar.getClass();
        a.C0406a V = me.a.V();
        boolean h10 = nVar.h();
        ke.i iVar2 = nVar.f23285b;
        ne.t tVar = iVar.f21836a;
        if (h10) {
            b.a R = me.b.R();
            tVar.getClass();
            String k10 = ne.t.k(tVar.f26267a, iVar2.f23275u);
            R.u();
            me.b.M((me.b) R.f10073v, k10);
            l1 l2 = ne.t.l(nVar.f23287d.f23294u);
            R.u();
            me.b.N((me.b) R.f10073v, l2);
            V.u();
            me.a.N((me.a) V.f10073v, R.r());
        } else if (nVar.b()) {
            d.a T = rf.d.T();
            tVar.getClass();
            String k11 = ne.t.k(tVar.f26267a, iVar2.f23275u);
            T.u();
            rf.d.M((rf.d) T.f10073v, k11);
            Map<String, rf.s> P = nVar.f.b().e0().P();
            T.u();
            rf.d.N((rf.d) T.f10073v).putAll(P);
            l1 l10 = ne.t.l(nVar.f23287d.f23294u);
            T.u();
            rf.d.O((rf.d) T.f10073v, l10);
            V.u();
            me.a.O((me.a) V.f10073v, T.r());
        } else if (nVar.l()) {
            d.a R2 = me.d.R();
            tVar.getClass();
            String k12 = ne.t.k(tVar.f26267a, iVar2.f23275u);
            R2.u();
            me.d.M((me.d) R2.f10073v, k12);
            l1 l11 = ne.t.l(nVar.f23287d.f23294u);
            R2.u();
            me.d.N((me.d) R2.f10073v, l11);
            V.u();
            me.a.P((me.a) V.f10073v, R2.r());
        } else {
            ca.a.V("Cannot encode invalid document %s", nVar);
            throw null;
        }
        boolean c10 = nVar.c();
        V.u();
        me.a.M((me.a) V.f10073v, c10);
        sc.h hVar = rVar.f23294u;
        this.f21955a.F("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", ca.a.R(iVar2.f23275u), Integer.valueOf(iVar2.f23275u.p()), Long.valueOf(hVar.f31450u), Integer.valueOf(hVar.f31451v), V.r().q());
        this.f21957c.b(iVar2.i());
    }

    @Override // je.c0
    public final ke.n b(ke.i iVar) {
        return (ke.n) e(Collections.singletonList(iVar)).get(iVar);
    }

    @Override // je.c0
    public final void c(f fVar) {
        this.f21957c = fVar;
    }

    @Override // je.c0
    public final HashMap d(he.y yVar, l.a aVar, Set set) {
        return h(Collections.singletonList(yVar.f17581e), aVar, SubsamplingScaleImageView.TILE_SIZE_AUTO, new dd.a(yVar, 21, set));
    }

    @Override // je.c0
    public final HashMap e(Iterable iterable) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            arrayList.add(ca.a.R(iVar.f23275u));
            hashMap.put(iVar, ke.n.m(iVar));
        }
        s0.b bVar = new s0.b(this.f21955a, arrayList);
        oe.c cVar = new oe.c();
        while (bVar.f.hasNext()) {
            bVar.a().d(new k0(3, this, cVar, hashMap));
        }
        cVar.a();
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je.c0
    public final void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImmutableSortedMap<ke.i, ?> immutableSortedMap = ke.h.f23272a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            arrayList2.add(ca.a.R(iVar.f23275u));
            immutableSortedMap = immutableSortedMap.insert(iVar, ke.n.n(iVar, ke.r.f23293v));
        }
        List emptyList = Collections.emptyList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(emptyList);
            for (int i6 = 0; it2.hasNext() && i6 < 900 - emptyList.size(); i6++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            this.f21955a.F("DELETE FROM remote_documents WHERE path IN (" + ((Object) oe.n.g("?", array.length, ", ")) + ")", array);
        }
        this.f21957c.a(immutableSortedMap);
    }

    @Override // je.c0
    public final Map<ke.i, ke.n> g(String str, l.a aVar, int i6) {
        List<ke.p> g5 = this.f21957c.g(str);
        ArrayList arrayList = new ArrayList(g5.size());
        for (ke.p pVar : g5) {
            arrayList.add(pVar.d(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return h(arrayList, aVar, i6, null);
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int i11 = i10 + 100;
            hashMap.putAll(h(arrayList.subList(i10, Math.min(arrayList.size(), i11)), aVar, i6, null));
            i10 = i11;
        }
        p0.d dVar = l.a.f23282v;
        SecureRandom secureRandom = oe.n.f27432a;
        if (hashMap.size() > i6) {
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new ke.j(dVar, 1));
            hashMap = new HashMap();
            for (int i12 = 0; i12 < i6; i12++) {
                hashMap.put(((Map.Entry) arrayList2.get(i12)).getKey(), ((Map.Entry) arrayList2.get(i12)).getValue());
            }
        }
        return hashMap;
    }

    public final HashMap h(List list, l.a aVar, int i6, dd.a aVar2) {
        boolean z10;
        sc.h hVar = aVar.j().f23294u;
        ke.i h10 = aVar.h();
        StringBuilder g5 = oe.n.g("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        g5.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        char c10 = 1;
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ke.p pVar = (ke.p) it.next();
            String R = ca.a.R(pVar);
            int i11 = i10 + 1;
            objArr[i10] = R;
            int i12 = i11 + 1;
            StringBuilder sb2 = new StringBuilder(R);
            int length = sb2.length() - c10;
            char charAt = sb2.charAt(length);
            if (charAt == c10) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "successor may only operate on paths generated by encode", new Object[0]);
            sb2.setCharAt(length, (char) (charAt + 1));
            objArr[i11] = sb2.toString();
            int i13 = i12 + 1;
            objArr[i12] = Integer.valueOf(pVar.p() + 1);
            int i14 = i13 + 1;
            objArr[i13] = Long.valueOf(hVar.f31450u);
            int i15 = i14 + 1;
            long j10 = hVar.f31450u;
            objArr[i14] = Long.valueOf(j10);
            int i16 = i15 + 1;
            int i17 = hVar.f31451v;
            objArr[i15] = Integer.valueOf(i17);
            int i18 = i16 + 1;
            objArr[i16] = Long.valueOf(j10);
            int i19 = i18 + 1;
            objArr[i18] = Integer.valueOf(i17);
            objArr[i19] = ca.a.R(h10.f23275u);
            i10 = i19 + 1;
            c10 = 1;
        }
        objArr[i10] = Integer.valueOf(i6);
        oe.c cVar = new oe.c();
        HashMap hashMap = new HashMap();
        s0.d G = this.f21955a.G(g5.toString());
        G.a(objArr);
        Cursor e10 = G.e();
        while (e10.moveToNext()) {
            try {
                i(e10, cVar, aVar2, hashMap);
            } catch (Throwable th2) {
                if (e10 != null) {
                    try {
                        e10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        e10.close();
        cVar.a();
        return hashMap;
    }

    public final void i(Cursor cursor, oe.c cVar, final oe.i iVar, final Map map) {
        final byte[] blob = cursor.getBlob(0);
        final int i6 = cursor.getInt(1);
        final int i10 = cursor.getInt(2);
        Executor executor = cVar;
        if (cursor.isLast()) {
            executor = oe.g.f27421b;
        }
        executor.execute(new Runnable() { // from class: je.t0
            @Override // java.lang.Runnable
            public final void run() {
                u0 u0Var = u0.this;
                byte[] bArr = blob;
                int i11 = i6;
                int i12 = i10;
                oe.i iVar2 = iVar;
                Map map2 = map;
                u0Var.getClass();
                try {
                    ke.n b10 = u0Var.f21956b.b(me.a.W(bArr));
                    b10.f23288e = new ke.r(new sc.h(i12, i11));
                    if (iVar2 == null || ((Boolean) iVar2.apply(b10)).booleanValue()) {
                        synchronized (map2) {
                            map2.put(b10.f23285b, b10);
                        }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    ca.a.V("MaybeDocument failed to parse: %s", e10);
                    throw null;
                }
            }
        });
    }
}

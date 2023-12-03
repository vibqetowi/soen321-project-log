package je;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.h;
import com.google.protobuf.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.s0;
import me.e;
/* compiled from: SQLiteMutationQueue.java */
/* loaded from: classes.dex */
public final class q0 implements w {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f21907a;

    /* renamed from: b  reason: collision with root package name */
    public final i f21908b;

    /* renamed from: c  reason: collision with root package name */
    public final f f21909c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21910d;

    /* renamed from: e  reason: collision with root package name */
    public int f21911e;
    public com.google.protobuf.h f;

    public q0(s0 s0Var, i iVar, ge.e eVar, f fVar) {
        boolean z10;
        this.f21907a = s0Var;
        this.f21908b = iVar;
        String str = eVar.f16468a;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21910d = z10 ? str : "";
        this.f = ne.f0.f26217v;
        this.f21909c = fVar;
    }

    @Override // je.w
    public final void a() {
        s0 s0Var = this.f21907a;
        s0.d G = s0Var.G("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = this.f21910d;
        G.a(str);
        Cursor e10 = G.e();
        try {
            boolean z10 = !e10.moveToFirst();
            e10.close();
            if (!z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            s0.d G2 = s0Var.G("SELECT path FROM document_mutations WHERE uid = ?");
            G2.a(str);
            G2.d(new h0(2, arrayList));
            ca.a.u0(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
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

    @Override // je.w
    public final void b(le.g gVar, com.google.protobuf.h hVar) {
        hVar.getClass();
        this.f = hVar;
        l();
    }

    @Override // je.w
    public final void c(le.g gVar) {
        boolean z10;
        s0 s0Var = this.f21907a;
        SQLiteStatement compileStatement = s0Var.f21927i.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement compileStatement2 = s0Var.f21927i.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i6 = gVar.f24218a;
        String str = this.f21910d;
        if (s0.E(compileStatement, str, Integer.valueOf(i6)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(gVar.f24218a));
        for (le.f fVar : gVar.f24221d) {
            ke.i iVar = fVar.f24215a;
            s0.E(compileStatement2, str, ca.a.R(iVar.f23275u), Integer.valueOf(i6));
            s0Var.f21925g.a(iVar);
        }
    }

    @Override // je.w
    public final void d(com.google.protobuf.h hVar) {
        hVar.getClass();
        this.f = hVar;
        l();
    }

    @Override // je.w
    public final ArrayList e(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(ca.a.R(((ke.i) it.next()).f23275u));
        }
        s0.b bVar = new s0.b(this.f21907a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f21910d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (bVar.f.hasNext()) {
            bVar.a().d(new k0(2, this, hashSet, arrayList2));
        }
        if (bVar.f21934e > 1) {
            Collections.sort(arrayList2, new p0.d(23));
        }
        return arrayList2;
    }

    @Override // je.w
    public final le.g f(int i6) {
        s0.d G = this.f21907a.G("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        G.a(1000000, this.f21910d, Integer.valueOf(i6 + 1));
        return (le.g) G.c(new am.w(5, this));
    }

    @Override // je.w
    public final le.g g(int i6) {
        s0.d G = this.f21907a.G("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        G.a(1000000, this.f21910d, Integer.valueOf(i6));
        Cursor e10 = G.e();
        try {
            if (e10.moveToFirst()) {
                le.g k10 = k(e10.getBlob(0), i6);
                e10.close();
                return k10;
            }
            e10.close();
            return null;
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

    @Override // je.w
    public final com.google.protobuf.h h() {
        return this.f;
    }

    @Override // je.w
    public final le.g i(sc.h hVar, ArrayList arrayList, List list) {
        int i6 = this.f21911e;
        this.f21911e = i6 + 1;
        le.g gVar = new le.g(i6, hVar, arrayList, list);
        i iVar = this.f21908b;
        iVar.getClass();
        e.a W = me.e.W();
        W.u();
        me.e.M((me.e) W.f10073v, gVar.f24218a);
        ne.t tVar = iVar.f21836a;
        tVar.getClass();
        l1 l2 = ne.t.l(gVar.f24219b);
        W.u();
        me.e.P((me.e) W.f10073v, l2);
        for (le.f fVar : gVar.f24220c) {
            rf.t i10 = tVar.i(fVar);
            W.u();
            me.e.N((me.e) W.f10073v, i10);
        }
        for (le.f fVar2 : gVar.f24221d) {
            rf.t i11 = tVar.i(fVar2);
            W.u();
            me.e.O((me.e) W.f10073v, i11);
        }
        String str = this.f21910d;
        Object[] objArr = {str, Integer.valueOf(i6), W.r().q()};
        s0 s0Var = this.f21907a;
        s0Var.F("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", objArr);
        HashSet hashSet = new HashSet();
        SQLiteStatement compileStatement = s0Var.f21927i.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ke.i iVar2 = ((le.f) it.next()).f24215a;
            if (hashSet.add(iVar2)) {
                s0.E(compileStatement, str, ca.a.R(iVar2.f23275u), Integer.valueOf(i6));
                this.f21909c.b(iVar2.i());
            }
        }
        return gVar;
    }

    @Override // je.w
    public final List<le.g> j() {
        ArrayList arrayList = new ArrayList();
        s0.d G = this.f21907a.G("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        G.a(1000000, this.f21910d);
        G.d(new l0(this, 1, arrayList));
        return arrayList;
    }

    public final le.g k(byte[] bArr, int i6) {
        com.google.protobuf.h g5;
        try {
            int length = bArr.length;
            i iVar = this.f21908b;
            if (length < 1000000) {
                return iVar.c(me.e.Y(bArr));
            }
            ArrayList arrayList = new ArrayList();
            h.C0164h c0164h = com.google.protobuf.h.f9922v;
            arrayList.add(com.google.protobuf.h.r(0, bArr, bArr.length));
            boolean z10 = true;
            while (z10) {
                s0.d G = this.f21907a.G("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                G.a(Integer.valueOf((arrayList.size() * 1000000) + 1), 1000000, this.f21910d, Integer.valueOf(i6));
                Cursor e10 = G.e();
                if (e10.moveToFirst()) {
                    byte[] blob = e10.getBlob(0);
                    h.C0164h c0164h2 = com.google.protobuf.h.f9922v;
                    arrayList.add(com.google.protobuf.h.r(0, blob, blob.length));
                    if (blob.length < 1000000) {
                        z10 = false;
                    }
                }
                e10.close();
            }
            int size = arrayList.size();
            if (size == 0) {
                g5 = com.google.protobuf.h.f9922v;
            } else {
                g5 = com.google.protobuf.h.g(arrayList.iterator(), size);
            }
            return iVar.c(me.e.X(g5));
        } catch (InvalidProtocolBufferException e11) {
            ca.a.V("MutationBatch failed to parse: %s", e11);
            throw null;
        }
    }

    public final void l() {
        this.f21907a.F("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f21910d, -1, this.f.N());
    }

    @Override // je.w
    public final void start() {
        ArrayList arrayList = new ArrayList();
        s0 s0Var = this.f21907a;
        s0Var.G("SELECT uid FROM mutation_queues").d(new h0(1, arrayList));
        this.f21911e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s0.d G = s0Var.G("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            G.a((String) it.next());
            G.d(new oe.d(this) { // from class: je.p0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ q0 f21904b;

                {
                    this.f21904b = this;
                }

                @Override // oe.d
                public final void accept(Object obj) {
                    int i6 = r2;
                    q0 q0Var = this.f21904b;
                    switch (i6) {
                        case 0:
                            q0Var.getClass();
                            byte[] blob = ((Cursor) obj).getBlob(0);
                            h.C0164h c0164h = com.google.protobuf.h.f9922v;
                            q0Var.f = com.google.protobuf.h.r(0, blob, blob.length);
                            return;
                        default:
                            q0Var.f21911e = Math.max(q0Var.f21911e, ((Cursor) obj).getInt(0));
                            return;
                    }
                }
            });
        }
        this.f21911e++;
        s0.d G2 = s0Var.G("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        G2.a(this.f21910d);
        if (G2.b(new oe.d(this) { // from class: je.p0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ q0 f21904b;

            {
                this.f21904b = this;
            }

            @Override // oe.d
            public final void accept(Object obj) {
                int i6 = r2;
                q0 q0Var = this.f21904b;
                switch (i6) {
                    case 0:
                        q0Var.getClass();
                        byte[] blob = ((Cursor) obj).getBlob(0);
                        h.C0164h c0164h = com.google.protobuf.h.f9922v;
                        q0Var.f = com.google.protobuf.h.r(0, blob, blob.length);
                        return;
                    default:
                        q0Var.f21911e = Math.max(q0Var.f21911e, ((Cursor) obj).getInt(0));
                        return;
                }
            }
        }) == 0) {
            l();
        }
    }
}

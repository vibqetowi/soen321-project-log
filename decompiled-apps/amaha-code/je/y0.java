package je;

import android.database.sqlite.SQLiteStatement;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.protobuf.l1;
import java.util.Iterator;
import je.s0;
import me.c;
import rf.q;
/* compiled from: SQLiteTargetCache.java */
/* loaded from: classes.dex */
public final class y0 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f21971a;

    /* renamed from: b  reason: collision with root package name */
    public final i f21972b;

    /* renamed from: c  reason: collision with root package name */
    public int f21973c;

    /* renamed from: d  reason: collision with root package name */
    public long f21974d;

    /* renamed from: e  reason: collision with root package name */
    public ke.r f21975e = ke.r.f23293v;
    public long f;

    /* compiled from: SQLiteTargetCache.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ImmutableSortedSet<ke.i> f21976a = ke.i.f23274w;
    }

    /* compiled from: SQLiteTargetCache.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public b1 f21977a;
    }

    public y0(s0 s0Var, i iVar) {
        this.f21971a = s0Var;
        this.f21972b = iVar;
    }

    @Override // je.a1
    public final void a(b1 b1Var) {
        j(b1Var);
        int i6 = this.f21973c;
        int i10 = b1Var.f21797b;
        if (i10 > i6) {
            this.f21973c = i10;
        }
        long j10 = this.f21974d;
        long j11 = b1Var.f21798c;
        if (j11 > j10) {
            this.f21974d = j11;
        }
        this.f++;
        k();
    }

    @Override // je.a1
    public final b1 b(he.d0 d0Var) {
        String b10 = d0Var.b();
        b bVar = new b();
        s0.d G = this.f21971a.G("SELECT target_proto FROM targets WHERE canonical_id = ?");
        G.a(b10);
        G.d(new k0(4, this, d0Var, bVar));
        return bVar.f21977a;
    }

    @Override // je.a1
    public final int c() {
        return this.f21973c;
    }

    @Override // je.a1
    public final ImmutableSortedSet<ke.i> d(int i6) {
        a aVar = new a();
        s0.d G = this.f21971a.G("SELECT path FROM target_documents WHERE target_id = ?");
        G.a(Integer.valueOf(i6));
        G.d(new j0(5, aVar));
        return aVar.f21976a;
    }

    @Override // je.a1
    public final ke.r e() {
        return this.f21975e;
    }

    @Override // je.a1
    public final void f(ImmutableSortedSet<ke.i> immutableSortedSet, int i6) {
        s0 s0Var = this.f21971a;
        SQLiteStatement compileStatement = s0Var.f21927i.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        Iterator<ke.i> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            ke.i next = it.next();
            s0.E(compileStatement, Integer.valueOf(i6), ca.a.R(next.f23275u));
            s0Var.f21925g.a(next);
        }
    }

    @Override // je.a1
    public final void g(b1 b1Var) {
        boolean z10;
        j(b1Var);
        int i6 = this.f21973c;
        boolean z11 = true;
        int i10 = b1Var.f21797b;
        if (i10 > i6) {
            this.f21973c = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f21974d;
        long j11 = b1Var.f21798c;
        if (j11 > j10) {
            this.f21974d = j11;
        } else {
            z11 = z10;
        }
        if (z11) {
            k();
        }
    }

    @Override // je.a1
    public final void h(ke.r rVar) {
        this.f21975e = rVar;
        k();
    }

    @Override // je.a1
    public final void i(ImmutableSortedSet<ke.i> immutableSortedSet, int i6) {
        s0 s0Var = this.f21971a;
        SQLiteStatement compileStatement = s0Var.f21927i.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        Iterator<ke.i> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            ke.i next = it.next();
            s0.E(compileStatement, Integer.valueOf(i6), ca.a.R(next.f23275u));
            s0Var.f21925g.a(next);
        }
    }

    public final void j(b1 b1Var) {
        he.d0 d0Var = b1Var.f21796a;
        String b10 = d0Var.b();
        ke.r rVar = b1Var.f21800e;
        sc.h hVar = rVar.f23294u;
        i iVar = this.f21972b;
        iVar.getClass();
        a0 a0Var = a0.LISTEN;
        a0 a0Var2 = b1Var.f21799d;
        ca.a.u0(a0Var.equals(a0Var2), "Only queries with purpose %s may be stored, got %s", a0Var, a0Var2);
        c.a c0 = me.c.c0();
        c0.u();
        int i6 = b1Var.f21797b;
        me.c.Q((me.c) c0.f10073v, i6);
        c0.u();
        long j10 = b1Var.f21798c;
        me.c.T((me.c) c0.f10073v, j10);
        ne.t tVar = iVar.f21836a;
        tVar.getClass();
        l1 l2 = ne.t.l(b1Var.f.f23294u);
        c0.u();
        me.c.O((me.c) c0.f10073v, l2);
        l1 l10 = ne.t.l(rVar.f23294u);
        c0.u();
        me.c.R((me.c) c0.f10073v, l10);
        c0.u();
        com.google.protobuf.h hVar2 = b1Var.f21801g;
        me.c.S((me.c) c0.f10073v, hVar2);
        if (d0Var.e()) {
            q.b.a Q = q.b.Q();
            String k10 = ne.t.k(tVar.f26267a, d0Var.f17473d);
            Q.u();
            q.b.M((q.b) Q.f10073v, k10);
            c0.u();
            me.c.N((me.c) c0.f10073v, Q.r());
        } else {
            q.c j11 = tVar.j(d0Var);
            c0.u();
            me.c.M((me.c) c0.f10073v, j11);
        }
        this.f21971a.F("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i6), b10, Long.valueOf(hVar.f31450u), Integer.valueOf(hVar.f31451v), hVar2.N(), Long.valueOf(j10), c0.r().q());
    }

    public final void k() {
        this.f21971a.F("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f21973c), Long.valueOf(this.f21974d), Long.valueOf(this.f21975e.f23294u.f31450u), Integer.valueOf(this.f21975e.f23294u.f31451v), Long.valueOf(this.f));
    }
}

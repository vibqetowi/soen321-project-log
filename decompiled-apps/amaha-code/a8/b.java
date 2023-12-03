package a8;

import c9.w;
import i5.n;
import u7.t;
import u7.u;
/* compiled from: IndexSeeker.java */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long f338a;

    /* renamed from: b  reason: collision with root package name */
    public final n f339b;

    /* renamed from: c  reason: collision with root package name */
    public final n f340c;

    /* renamed from: d  reason: collision with root package name */
    public long f341d;

    public b(long j10, long j11, long j12) {
        this.f341d = j10;
        this.f338a = j12;
        n nVar = new n(3);
        this.f339b = nVar;
        n nVar2 = new n(3);
        this.f340c = nVar2;
        nVar.a(0L);
        nVar2.a(j11);
    }

    public final boolean a(long j10) {
        n nVar = this.f339b;
        if (j10 - nVar.b(nVar.f19876u - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // a8.e
    public final long c() {
        return this.f338a;
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // a8.e
    public final long e(long j10) {
        return this.f339b.b(w.c(this.f340c, j10));
    }

    @Override // u7.t
    public final t.a i(long j10) {
        n nVar = this.f339b;
        int c10 = w.c(nVar, j10);
        long b10 = nVar.b(c10);
        n nVar2 = this.f340c;
        u uVar = new u(b10, nVar2.b(c10));
        if (b10 != j10 && c10 != nVar.f19876u - 1) {
            int i6 = c10 + 1;
            return new t.a(uVar, new u(nVar.b(i6), nVar2.b(i6)));
        }
        return new t.a(uVar, uVar);
    }

    @Override // u7.t
    public final long j() {
        return this.f341d;
    }
}

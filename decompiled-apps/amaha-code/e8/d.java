package e8;

import c9.w;
import u7.t;
import u7.u;
/* compiled from: WavSeekMap.java */
/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: a  reason: collision with root package name */
    public final b f13862a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13863b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13864c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13865d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13866e;

    public d(b bVar, int i6, long j10, long j11) {
        this.f13862a = bVar;
        this.f13863b = i6;
        this.f13864c = j10;
        long j12 = (j11 - j10) / bVar.f13857c;
        this.f13865d = j12;
        this.f13866e = a(j12);
    }

    public final long a(long j10) {
        return w.C(j10 * this.f13863b, 1000000L, this.f13862a.f13856b);
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // u7.t
    public final t.a i(long j10) {
        b bVar = this.f13862a;
        long j11 = (bVar.f13856b * j10) / (this.f13863b * 1000000);
        long j12 = this.f13865d;
        long i6 = w.i(j11, 0L, j12 - 1);
        long j13 = this.f13864c;
        long a10 = a(i6);
        u uVar = new u(a10, (bVar.f13857c * i6) + j13);
        if (a10 < j10 && i6 != j12 - 1) {
            long j14 = i6 + 1;
            return new t.a(uVar, new u(a(j14), (bVar.f13857c * j14) + j13));
        }
        return new t.a(uVar, uVar);
    }

    @Override // u7.t
    public final long j() {
        return this.f13866e;
    }
}

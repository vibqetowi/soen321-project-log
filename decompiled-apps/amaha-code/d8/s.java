package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes.dex */
public final class s implements x {

    /* renamed from: a  reason: collision with root package name */
    public com.google.android.exoplayer2.n f12557a;

    /* renamed from: b  reason: collision with root package name */
    public c9.v f12558b;

    /* renamed from: c  reason: collision with root package name */
    public u7.v f12559c;

    public s(String str) {
        n.a aVar = new n.a();
        aVar.f6665k = str;
        this.f12557a = new com.google.android.exoplayer2.n(aVar);
    }

    @Override // d8.x
    public final void a(c9.q qVar) {
        long c10;
        long j10;
        sc.b.E(this.f12558b);
        int i6 = c9.w.f5205a;
        c9.v vVar = this.f12558b;
        synchronized (vVar) {
            long j11 = vVar.f5203c;
            if (j11 != -9223372036854775807L) {
                c10 = j11 + vVar.f5202b;
            } else {
                c10 = vVar.c();
            }
            j10 = c10;
        }
        long d10 = this.f12558b.d();
        if (j10 != -9223372036854775807L && d10 != -9223372036854775807L) {
            com.google.android.exoplayer2.n nVar = this.f12557a;
            if (d10 != nVar.J) {
                n.a aVar = new n.a(nVar);
                aVar.f6669o = d10;
                com.google.android.exoplayer2.n nVar2 = new com.google.android.exoplayer2.n(aVar);
                this.f12557a = nVar2;
                this.f12559c.e(nVar2);
            }
            int i10 = qVar.f5188c - qVar.f5187b;
            this.f12559c.a(i10, qVar);
            this.f12559c.d(j10, 1, i10, 0, null);
        }
    }

    @Override // d8.x
    public final void b(c9.v vVar, u7.j jVar, d0.d dVar) {
        this.f12558b = vVar;
        dVar.a();
        dVar.b();
        u7.v n10 = jVar.n(dVar.f12351d, 5);
        this.f12559c = n10;
        n10.e(this.f12557a);
    }
}

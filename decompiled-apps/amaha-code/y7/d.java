package y7;

import u7.j;
import u7.t;
import u7.u;
import u7.v;
/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: u  reason: collision with root package name */
    public final long f38329u;

    /* renamed from: v  reason: collision with root package name */
    public final j f38330v;

    /* compiled from: StartOffsetExtractorOutput.java */
    /* loaded from: classes.dex */
    public class a implements t {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f38331a;

        public a(t tVar) {
            this.f38331a = tVar;
        }

        @Override // u7.t
        public final boolean d() {
            return this.f38331a.d();
        }

        @Override // u7.t
        public final t.a i(long j10) {
            t.a i6 = this.f38331a.i(j10);
            u uVar = i6.f33906a;
            long j11 = uVar.f33911a;
            long j12 = uVar.f33912b;
            long j13 = d.this.f38329u;
            u uVar2 = new u(j11, j12 + j13);
            u uVar3 = i6.f33907b;
            return new t.a(uVar2, new u(uVar3.f33911a, uVar3.f33912b + j13));
        }

        @Override // u7.t
        public final long j() {
            return this.f38331a.j();
        }
    }

    public d(long j10, j jVar) {
        this.f38329u = j10;
        this.f38330v = jVar;
    }

    @Override // u7.j
    public final void e() {
        this.f38330v.e();
    }

    @Override // u7.j
    public final void i(t tVar) {
        this.f38330v.i(new a(tVar));
    }

    @Override // u7.j
    public final v n(int i6, int i10) {
        return this.f38330v.n(i6, i10);
    }
}

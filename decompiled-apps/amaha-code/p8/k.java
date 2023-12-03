package p8;

import java.util.List;
/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes.dex */
public abstract class k extends r7.e implements f {

    /* renamed from: w  reason: collision with root package name */
    public f f28025w;

    /* renamed from: x  reason: collision with root package name */
    public long f28026x;

    @Override // p8.f
    public final int d(long j10) {
        f fVar = this.f28025w;
        fVar.getClass();
        return fVar.d(j10 - this.f28026x);
    }

    @Override // p8.f
    public final long f(int i6) {
        f fVar = this.f28025w;
        fVar.getClass();
        return fVar.f(i6) + this.f28026x;
    }

    @Override // p8.f
    public final List<a> h(long j10) {
        f fVar = this.f28025w;
        fVar.getClass();
        return fVar.h(j10 - this.f28026x);
    }

    @Override // p8.f
    public final int i() {
        f fVar = this.f28025w;
        fVar.getClass();
        return fVar.i();
    }

    public final void p(long j10, f fVar, long j11) {
        this.f30540v = j10;
        this.f28025w = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f28026x = j10;
    }
}

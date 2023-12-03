package com.google.android.exoplayer2.source;

import c9.w;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.i;
import java.io.IOException;
import o7.x;
/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes.dex */
public final class f implements h, h.a {
    public long A = -9223372036854775807L;

    /* renamed from: u  reason: collision with root package name */
    public final i.a f6878u;

    /* renamed from: v  reason: collision with root package name */
    public final long f6879v;

    /* renamed from: w  reason: collision with root package name */
    public final b9.i f6880w;

    /* renamed from: x  reason: collision with root package name */
    public i f6881x;

    /* renamed from: y  reason: collision with root package name */
    public h f6882y;

    /* renamed from: z  reason: collision with root package name */
    public h.a f6883z;

    public f(i.a aVar, b9.i iVar, long j10) {
        this.f6878u = aVar;
        this.f6880w = iVar;
        this.f6879v = j10;
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public final void a(h hVar) {
        h.a aVar = this.f6883z;
        int i6 = w.f5205a;
        aVar.a(this);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public final void b(h hVar) {
        h.a aVar = this.f6883z;
        int i6 = w.f5205a;
        aVar.b(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long c() {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.c();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean d(long j10) {
        h hVar = this.f6882y;
        if (hVar != null && hVar.d(j10)) {
            return true;
        }
        return false;
    }

    public final void e(i.a aVar) {
        long j10 = this.A;
        if (j10 == -9223372036854775807L) {
            j10 = this.f6879v;
        }
        i iVar = this.f6881x;
        iVar.getClass();
        h a10 = iVar.a(aVar, this.f6880w, j10);
        this.f6882y = a10;
        if (this.f6883z != null) {
            a10.t(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean f() {
        h hVar = this.f6882y;
        if (hVar != null && hVar.f()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long g() {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.g();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final void h(long j10) {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        hVar.h(j10);
    }

    public final void i() {
        if (this.f6882y != null) {
            i iVar = this.f6881x;
            iVar.getClass();
            iVar.l(this.f6882y);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long k(z8.d[] dVarArr, boolean[] zArr, o8.k[] kVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.A;
        if (j12 != -9223372036854775807L && j10 == this.f6879v) {
            this.A = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.k(dVarArr, zArr, kVarArr, zArr2, j11);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void l() {
        try {
            h hVar = this.f6882y;
            if (hVar != null) {
                hVar.l();
                return;
            }
            i iVar = this.f6881x;
            if (iVar != null) {
                iVar.j();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long m(long j10) {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.m(j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void r(boolean z10, long j10) {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        hVar.r(z10, j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long s() {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.s();
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void t(h.a aVar, long j10) {
        this.f6883z = aVar;
        h hVar = this.f6882y;
        if (hVar != null) {
            long j11 = this.A;
            if (j11 == -9223372036854775807L) {
                j11 = this.f6879v;
            }
            hVar.t(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final o8.p u() {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.u();
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long w(long j10, x xVar) {
        h hVar = this.f6882y;
        int i6 = w.f5205a;
        return hVar.w(j10, xVar);
    }
}

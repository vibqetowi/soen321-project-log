package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.n;
/* compiled from: BaseRenderer.java */
/* loaded from: classes.dex */
public abstract class e implements z, o7.u {
    public n[] A;
    public long B;
    public boolean D;
    public boolean E;

    /* renamed from: u  reason: collision with root package name */
    public final int f6458u;

    /* renamed from: w  reason: collision with root package name */
    public o7.v f6460w;

    /* renamed from: x  reason: collision with root package name */
    public int f6461x;

    /* renamed from: y  reason: collision with root package name */
    public int f6462y;

    /* renamed from: z  reason: collision with root package name */
    public o8.k f6463z;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.appcompat.widget.l f6459v = new androidx.appcompat.widget.l(12, 0);
    public long C = Long.MIN_VALUE;

    public e(int i6) {
        this.f6458u = i6;
    }

    public abstract void A(boolean z10, long j10);

    public abstract void E(n[] nVarArr, long j10, long j11);

    public final int F(androidx.appcompat.widget.l lVar, DecoderInputBuffer decoderInputBuffer, int i6) {
        o8.k kVar = this.f6463z;
        kVar.getClass();
        int f = kVar.f(lVar, decoderInputBuffer, i6);
        if (f == -4) {
            if (decoderInputBuffer.k(4)) {
                this.C = Long.MIN_VALUE;
                if (this.D) {
                    return -4;
                }
                return -3;
            }
            long j10 = decoderInputBuffer.f6362y + this.B;
            decoderInputBuffer.f6362y = j10;
            this.C = Math.max(this.C, j10);
        } else if (f == -5) {
            n nVar = (n) lVar.f1472w;
            nVar.getClass();
            if (nVar.J != Long.MAX_VALUE) {
                n.a b10 = nVar.b();
                b10.f6669o = nVar.J + this.B;
                lVar.f1472w = b10.a();
            }
        }
        return f;
    }

    @Override // com.google.android.exoplayer2.z
    public final void e() {
        boolean z10 = true;
        if (this.f6462y != 1) {
            z10 = false;
        }
        sc.b.C(z10);
        this.f6459v.i();
        this.f6462y = 0;
        this.f6463z = null;
        this.A = null;
        this.D = false;
        y();
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean f() {
        if (this.C == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.z
    public final void g() {
        this.D = true;
    }

    @Override // com.google.android.exoplayer2.z
    public final int getState() {
        return this.f6462y;
    }

    @Override // com.google.android.exoplayer2.z
    public final void h(o7.v vVar, n[] nVarArr, o8.k kVar, long j10, boolean z10, boolean z11, long j11, long j12) {
        boolean z12;
        if (this.f6462y == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        sc.b.C(z12);
        this.f6460w = vVar;
        this.f6462y = 1;
        z(z10, z11);
        l(nVarArr, kVar, j11, j12);
        A(z10, j10);
    }

    @Override // com.google.android.exoplayer2.z
    public final void l(n[] nVarArr, o8.k kVar, long j10, long j11) {
        sc.b.C(!this.D);
        this.f6463z = kVar;
        if (this.C == Long.MIN_VALUE) {
            this.C = j10;
        }
        this.A = nVarArr;
        this.B = j11;
        E(nVarArr, j10, j11);
    }

    @Override // o7.u
    public int m() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.z
    public final o8.k p() {
        return this.f6463z;
    }

    @Override // com.google.android.exoplayer2.z
    public final void q() {
        o8.k kVar = this.f6463z;
        kVar.getClass();
        kVar.b();
    }

    @Override // com.google.android.exoplayer2.z
    public final long r() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.z
    public final void reset() {
        boolean z10;
        if (this.f6462y == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        this.f6459v.i();
        B();
    }

    @Override // com.google.android.exoplayer2.z
    public final void s(long j10) {
        this.D = false;
        this.C = j10;
        A(false, j10);
    }

    @Override // com.google.android.exoplayer2.z
    public final void setIndex(int i6) {
        this.f6461x = i6;
    }

    @Override // com.google.android.exoplayer2.z
    public final void start() {
        boolean z10 = true;
        if (this.f6462y != 1) {
            z10 = false;
        }
        sc.b.C(z10);
        this.f6462y = 2;
        C();
    }

    @Override // com.google.android.exoplayer2.z
    public final void stop() {
        boolean z10;
        if (this.f6462y == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        this.f6462y = 1;
        D();
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean t() {
        return this.D;
    }

    @Override // com.google.android.exoplayer2.z
    public c9.k u() {
        return null;
    }

    @Override // com.google.android.exoplayer2.z
    public final int v() {
        return this.f6458u;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExoPlaybackException w(int i6, n nVar, Exception exc, boolean z10) {
        int i10;
        int i11;
        if (nVar != null && !this.E) {
            this.E = true;
            try {
                i10 = a(nVar) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.E = false;
            }
            String name = getName();
            int i12 = this.f6461x;
            if (nVar != null) {
                i11 = 4;
            } else {
                i11 = i10;
            }
            return new ExoPlaybackException(1, exc, i6, name, i12, nVar, i11, z10);
        }
        i10 = 4;
        String name2 = getName();
        int i122 = this.f6461x;
        if (nVar != null) {
        }
        return new ExoPlaybackException(1, exc, i6, name2, i122, nVar, i11, z10);
    }

    public final ExoPlaybackException x(MediaCodecUtil.DecoderQueryException decoderQueryException, n nVar) {
        return w(4002, nVar, decoderQueryException, false);
    }

    public abstract void y();

    public void B() {
    }

    public void C() {
    }

    public void D() {
    }

    @Override // com.google.android.exoplayer2.z
    public final e i() {
        return this;
    }

    @Override // com.google.android.exoplayer2.z
    public /* synthetic */ void k(float f, float f2) {
    }

    @Override // com.google.android.exoplayer2.x.b
    public void o(int i6, Object obj) {
    }

    public void z(boolean z10, boolean z11) {
    }
}

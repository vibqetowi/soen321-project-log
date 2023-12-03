package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.l;
import c9.m;
import c9.u;
import c9.w;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.n;
import com.google.android.gms.internal.p000firebaseauthapi.le;
import f8.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o8.k;
import q7.p;
/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.e {
    public static final byte[] X0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, JsonWriter.ARRAY_END, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public final c.b F;
    public boolean F0;
    public final e G;
    public int G0;
    public final boolean H;
    public int H0;
    public final float I;
    public int I0;
    public final DecoderInputBuffer J;
    public boolean J0;
    public final DecoderInputBuffer K;
    public boolean K0;
    public final DecoderInputBuffer L;
    public boolean L0;
    public final f8.f M;
    public long M0;
    public final u N;
    public long N0;
    public final ArrayList<Long> O;
    public boolean O0;
    public final MediaCodec.BufferInfo P;
    public boolean P0;
    public final long[] Q;
    public boolean Q0;
    public final long[] R;
    public boolean R0;
    public final long[] S;
    public ExoPlaybackException S0;
    public n T;
    public le T0;
    public n U;
    public long U0;
    public DrmSession V;
    public long V0;
    public DrmSession W;
    public int W0;
    public MediaCrypto X;
    public boolean Y;
    public final long Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f6590a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f6591b0;
    public c c0;

    /* renamed from: d0  reason: collision with root package name */
    public n f6592d0;
    public MediaFormat e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6593f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f6594g0;

    /* renamed from: h0  reason: collision with root package name */
    public ArrayDeque<d> f6595h0;

    /* renamed from: i0  reason: collision with root package name */
    public DecoderInitializationException f6596i0;

    /* renamed from: j0  reason: collision with root package name */
    public d f6597j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6598k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6599l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6600m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6601n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6602o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6603p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f6604q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6605r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f6606s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f6607t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f6608u0;

    /* renamed from: v0  reason: collision with root package name */
    public g f6609v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f6610w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6611x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6612y0;

    /* renamed from: z0  reason: collision with root package name */
    public ByteBuffer f6613z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i6, b bVar, float f) {
        super(i6);
        defpackage.e eVar = e.f6644a;
        this.F = bVar;
        this.G = eVar;
        this.H = false;
        this.I = f;
        this.J = new DecoderInputBuffer(0);
        this.K = new DecoderInputBuffer(0);
        this.L = new DecoderInputBuffer(2);
        f8.f fVar = new f8.f();
        this.M = fVar;
        this.N = new u();
        this.O = new ArrayList<>();
        this.P = new MediaCodec.BufferInfo();
        this.f6590a0 = 1.0f;
        this.f6591b0 = 1.0f;
        this.Z = -9223372036854775807L;
        this.Q = new long[10];
        this.R = new long[10];
        this.S = new long[10];
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        fVar.r(0);
        fVar.f6360w.order(ByteOrder.nativeOrder());
        this.f6594g0 = -1.0f;
        this.f6598k0 = 0;
        this.G0 = 0;
        this.f6611x0 = -1;
        this.f6612y0 = -1;
        this.f6610w0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.H0 = 0;
        this.I0 = 0;
    }

    @Override // com.google.android.exoplayer2.e
    public void A(boolean z10, long j10) {
        int i6;
        this.O0 = false;
        this.P0 = false;
        this.R0 = false;
        if (this.C0) {
            this.M.n();
            this.L.n();
            this.D0 = false;
        } else if (O()) {
            X();
        }
        u uVar = this.N;
        synchronized (uVar) {
            i6 = uVar.f5198b;
        }
        if (i6 > 0) {
            this.Q0 = true;
        }
        this.N.b();
        int i10 = this.W0;
        if (i10 != 0) {
            this.V0 = this.R[i10 - 1];
            this.U0 = this.Q[i10 - 1];
            this.W0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void E(n[] nVarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.V0 == -9223372036854775807L) {
            if (this.U0 != -9223372036854775807L) {
                z10 = false;
            }
            sc.b.C(z10);
            this.U0 = j10;
            this.V0 = j11;
            return;
        }
        int i6 = this.W0;
        long[] jArr = this.R;
        if (i6 == jArr.length) {
            long j12 = jArr[i6 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
            Log.w("MediaCodecRenderer", sb2.toString());
        } else {
            this.W0 = i6 + 1;
        }
        int i10 = this.W0;
        int i11 = i10 - 1;
        this.Q[i11] = j10;
        jArr[i11] = j11;
        this.S[i10 - 1] = this.M0;
    }

    public final boolean G(long j10, long j11) {
        boolean z10;
        f8.f fVar;
        boolean z11;
        boolean z12;
        boolean z13;
        sc.b.C(!this.P0);
        f8.f fVar2 = this.M;
        int i6 = fVar2.D;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i0(j10, j11, null, fVar2.f6360w, this.f6612y0, 0, i6, fVar2.f6362y, fVar2.l(), fVar2.k(4), this.U)) {
                fVar = fVar2;
                e0(fVar.C);
                fVar.n();
            } else {
                return false;
            }
        } else {
            fVar = fVar2;
        }
        if (this.O0) {
            this.P0 = true;
            return false;
        }
        boolean z14 = this.D0;
        DecoderInputBuffer decoderInputBuffer = this.L;
        if (z14) {
            sc.b.C(fVar.u(decoderInputBuffer));
            this.D0 = false;
        }
        if (this.E0) {
            if (fVar.D > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                return true;
            }
            J();
            this.E0 = false;
            X();
            if (!this.C0) {
                return false;
            }
        }
        sc.b.C(!this.O0);
        l lVar = this.f6459v;
        lVar.i();
        decoderInputBuffer.n();
        while (true) {
            decoderInputBuffer.n();
            int F = F(lVar, decoderInputBuffer, 0);
            if (F != -5) {
                if (F != -4) {
                    if (F != -3) {
                        throw new IllegalStateException();
                    }
                } else if (decoderInputBuffer.k(4)) {
                    this.O0 = true;
                    break;
                } else {
                    if (this.Q0) {
                        n nVar = this.T;
                        nVar.getClass();
                        this.U = nVar;
                        d0(nVar, null);
                        this.Q0 = false;
                    }
                    decoderInputBuffer.t();
                    if (!fVar.u(decoderInputBuffer)) {
                        this.D0 = true;
                        break;
                    }
                }
            } else {
                c0(lVar);
                break;
            }
        }
        if (fVar.D > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            fVar.t();
        }
        if (fVar.D > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !this.O0 && !this.E0) {
            return false;
        }
        return true;
    }

    public abstract r7.f H(d dVar, n nVar, n nVar2);

    public MediaCodecDecoderException I(IllegalStateException illegalStateException, d dVar) {
        return new MediaCodecDecoderException(illegalStateException, dVar);
    }

    public final void J() {
        this.E0 = false;
        this.M.n();
        this.L.n();
        this.D0 = false;
        this.C0 = false;
    }

    public final boolean K() {
        if (this.J0) {
            this.H0 = 1;
            if (!this.f6600m0 && !this.f6602o0) {
                this.I0 = 2;
            } else {
                this.I0 = 3;
                return false;
            }
        } else {
            t0();
        }
        return true;
    }

    public final boolean L(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        MediaCodec.BufferInfo bufferInfo;
        boolean i02;
        boolean z13;
        int g5;
        boolean z14;
        boolean z15;
        if (this.f6612y0 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.P;
        if (!z10) {
            if (this.f6603p0 && this.K0) {
                try {
                    g5 = this.c0.g(bufferInfo2);
                } catch (IllegalStateException unused) {
                    h0();
                    if (this.P0) {
                        k0();
                    }
                    return false;
                }
            } else {
                g5 = this.c0.g(bufferInfo2);
            }
            if (g5 < 0) {
                if (g5 == -2) {
                    this.L0 = true;
                    MediaFormat c10 = this.c0.c();
                    if (this.f6598k0 != 0 && c10.getInteger("width") == 32 && c10.getInteger("height") == 32) {
                        this.f6607t0 = true;
                    } else {
                        if (this.f6605r0) {
                            c10.setInteger("channel-count", 1);
                        }
                        this.e0 = c10;
                        this.f6593f0 = true;
                    }
                    return true;
                }
                if (this.f6608u0 && (this.O0 || this.H0 == 2)) {
                    h0();
                }
                return false;
            } else if (this.f6607t0) {
                this.f6607t0 = false;
                this.c0.j(g5, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                h0();
                return false;
            } else {
                this.f6612y0 = g5;
                ByteBuffer n10 = this.c0.n(g5);
                this.f6613z0 = n10;
                if (n10 != null) {
                    n10.position(bufferInfo2.offset);
                    this.f6613z0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f6604q0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j12 = this.M0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j12;
                    }
                }
                long j13 = bufferInfo2.presentationTimeUs;
                ArrayList<Long> arrayList = this.O;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        if (arrayList.get(i6).longValue() == j13) {
                            arrayList.remove(i6);
                            z14 = true;
                            break;
                        }
                        i6++;
                    } else {
                        z14 = false;
                        break;
                    }
                }
                this.A0 = z14;
                long j14 = this.N0;
                long j15 = bufferInfo2.presentationTimeUs;
                if (j14 == j15) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.B0 = z15;
                u0(j15);
            }
        }
        if (this.f6603p0 && this.K0) {
            try {
                z11 = false;
                z12 = true;
                try {
                    i02 = i0(j10, j11, this.c0, this.f6613z0, this.f6612y0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.A0, this.B0, this.U);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    h0();
                    if (this.P0) {
                        k0();
                    }
                    return z11;
                }
            } catch (IllegalStateException unused3) {
                z11 = false;
            }
        } else {
            z11 = false;
            z12 = true;
            bufferInfo = bufferInfo2;
            i02 = i0(j10, j11, this.c0, this.f6613z0, this.f6612y0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.A0, this.B0, this.U);
        }
        if (i02) {
            e0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f6612y0 = -1;
            this.f6613z0 = null;
            if (!z13) {
                return z12;
            }
            h0();
        }
        return z11;
    }

    public final boolean M() {
        boolean z10;
        r7.c cVar;
        c cVar2 = this.c0;
        if (cVar2 != null && this.H0 != 2 && !this.O0) {
            int i6 = this.f6611x0;
            DecoderInputBuffer decoderInputBuffer = this.K;
            if (i6 < 0) {
                int f = cVar2.f();
                this.f6611x0 = f;
                if (f < 0) {
                    return false;
                }
                decoderInputBuffer.f6360w = this.c0.l(f);
                decoderInputBuffer.n();
            }
            if (this.H0 == 1) {
                if (!this.f6608u0) {
                    this.K0 = true;
                    this.c0.h(this.f6611x0, 0, 4, 0L);
                    this.f6611x0 = -1;
                    decoderInputBuffer.f6360w = null;
                }
                this.H0 = 2;
                return false;
            } else if (this.f6606s0) {
                this.f6606s0 = false;
                decoderInputBuffer.f6360w.put(X0);
                this.c0.h(this.f6611x0, 38, 0, 0L);
                this.f6611x0 = -1;
                decoderInputBuffer.f6360w = null;
                this.J0 = true;
                return true;
            } else {
                if (this.G0 == 1) {
                    for (int i10 = 0; i10 < this.f6592d0.H.size(); i10++) {
                        decoderInputBuffer.f6360w.put(this.f6592d0.H.get(i10));
                    }
                    this.G0 = 2;
                }
                int position = decoderInputBuffer.f6360w.position();
                l lVar = this.f6459v;
                lVar.i();
                try {
                    int F = F(lVar, decoderInputBuffer, 0);
                    if (f()) {
                        this.N0 = this.M0;
                    }
                    if (F == -3) {
                        return false;
                    }
                    if (F == -5) {
                        if (this.G0 == 2) {
                            decoderInputBuffer.n();
                            this.G0 = 1;
                        }
                        c0(lVar);
                        return true;
                    }
                    if (decoderInputBuffer.k(4)) {
                        if (this.G0 == 2) {
                            decoderInputBuffer.n();
                            this.G0 = 1;
                        }
                        this.O0 = true;
                        if (!this.J0) {
                            h0();
                            return false;
                        }
                        try {
                            if (!this.f6608u0) {
                                this.K0 = true;
                                this.c0.h(this.f6611x0, 0, 4, 0L);
                                this.f6611x0 = -1;
                                decoderInputBuffer.f6360w = null;
                            }
                            return false;
                        } catch (MediaCodec.CryptoException e10) {
                            throw w(w.n(e10.getErrorCode()), this.T, e10, false);
                        }
                    } else if (!this.J0 && !decoderInputBuffer.k(1)) {
                        decoderInputBuffer.n();
                        if (this.G0 == 2) {
                            this.G0 = 1;
                        }
                        return true;
                    } else {
                        boolean k10 = decoderInputBuffer.k(1073741824);
                        r7.c cVar3 = decoderInputBuffer.f6359v;
                        if (k10) {
                            if (position == 0) {
                                cVar3.getClass();
                            } else {
                                if (cVar3.f30532d == null) {
                                    int[] iArr = new int[1];
                                    cVar3.f30532d = iArr;
                                    cVar3.f30536i.numBytesOfClearData = iArr;
                                }
                                int[] iArr2 = cVar3.f30532d;
                                iArr2[0] = iArr2[0] + position;
                            }
                        }
                        if (this.f6599l0 && !k10) {
                            ByteBuffer byteBuffer = decoderInputBuffer.f6360w;
                            byte[] bArr = m.f5155a;
                            int position2 = byteBuffer.position();
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 < position2) {
                                    int i14 = byteBuffer.get(i11) & 255;
                                    if (i12 == 3) {
                                        if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i11 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                    } else if (i14 == 0) {
                                        i12++;
                                    }
                                    if (i14 != 0) {
                                        i12 = 0;
                                    }
                                    i11 = i13;
                                } else {
                                    byteBuffer.clear();
                                    break;
                                }
                            }
                            if (decoderInputBuffer.f6360w.position() == 0) {
                                return true;
                            }
                            this.f6599l0 = false;
                        }
                        long j10 = decoderInputBuffer.f6362y;
                        g gVar = this.f6609v0;
                        if (gVar != null) {
                            n nVar = this.T;
                            if (gVar.f14908c == 0) {
                                gVar.f14907b = j10;
                            }
                            if (!gVar.f14909d) {
                                ByteBuffer byteBuffer2 = decoderInputBuffer.f6360w;
                                byteBuffer2.getClass();
                                int i15 = 0;
                                int i16 = 0;
                                for (int i17 = 4; i15 < i17; i17 = 4) {
                                    i16 = (i16 << 8) | (byteBuffer2.get(i15) & 255);
                                    i15++;
                                }
                                int b10 = p.b(i16);
                                if (b10 == -1) {
                                    gVar.f14909d = true;
                                    gVar.f14908c = 0L;
                                    gVar.f14907b = decoderInputBuffer.f6362y;
                                    Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    j10 = decoderInputBuffer.f6362y;
                                } else {
                                    z10 = k10;
                                    long max = Math.max(0L, ((gVar.f14908c - 529) * 1000000) / nVar.T) + gVar.f14907b;
                                    gVar.f14908c += b10;
                                    j10 = max;
                                    long j11 = this.M0;
                                    g gVar2 = this.f6609v0;
                                    n nVar2 = this.T;
                                    gVar2.getClass();
                                    cVar = cVar3;
                                    this.M0 = Math.max(j11, Math.max(0L, ((gVar2.f14908c - 529) * 1000000) / nVar2.T) + gVar2.f14907b);
                                }
                            }
                            z10 = k10;
                            long j112 = this.M0;
                            g gVar22 = this.f6609v0;
                            n nVar22 = this.T;
                            gVar22.getClass();
                            cVar = cVar3;
                            this.M0 = Math.max(j112, Math.max(0L, ((gVar22.f14908c - 529) * 1000000) / nVar22.T) + gVar22.f14907b);
                        } else {
                            z10 = k10;
                            cVar = cVar3;
                        }
                        if (decoderInputBuffer.l()) {
                            this.O.add(Long.valueOf(j10));
                        }
                        if (this.Q0) {
                            this.N.a(j10, this.T);
                            this.Q0 = false;
                        }
                        this.M0 = Math.max(this.M0, j10);
                        decoderInputBuffer.t();
                        if (decoderInputBuffer.k(268435456)) {
                            V(decoderInputBuffer);
                        }
                        g0(decoderInputBuffer);
                        try {
                            if (z10) {
                                this.c0.o(this.f6611x0, cVar, j10);
                            } else {
                                this.c0.h(this.f6611x0, decoderInputBuffer.f6360w.limit(), 0, j10);
                            }
                            this.f6611x0 = -1;
                            decoderInputBuffer.f6360w = null;
                            this.J0 = true;
                            this.G0 = 0;
                            this.T0.getClass();
                            return true;
                        } catch (MediaCodec.CryptoException e11) {
                            throw w(w.n(e11.getErrorCode()), this.T, e11, false);
                        }
                    }
                } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
                    Z(e12);
                    j0(0);
                    N();
                    return true;
                }
            }
        }
        return false;
    }

    public final void N() {
        try {
            this.c0.flush();
        } finally {
            m0();
        }
    }

    public final boolean O() {
        if (this.c0 == null) {
            return false;
        }
        if (this.I0 != 3 && !this.f6600m0 && ((!this.f6601n0 || this.L0) && (!this.f6602o0 || !this.K0))) {
            N();
            return false;
        }
        k0();
        return true;
    }

    public final List<d> P(boolean z10) {
        n nVar = this.T;
        e eVar = this.G;
        List<d> S = S(eVar, nVar, z10);
        if (S.isEmpty() && z10) {
            S = S(eVar, this.T, false);
            if (!S.isEmpty()) {
                String str = this.T.F;
                String valueOf = String.valueOf(S);
                StringBuilder n10 = defpackage.e.n(valueOf.length() + ri.e.c(str, 99), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", valueOf);
                n10.append(".");
                Log.w("MediaCodecRenderer", n10.toString());
            }
        }
        return S;
    }

    public boolean Q() {
        return false;
    }

    public abstract float R(float f, n[] nVarArr);

    public abstract List<d> S(e eVar, n nVar, boolean z10);

    public final s7.g T(DrmSession drmSession) {
        r7.b f = drmSession.f();
        if (f != null && !(f instanceof s7.g)) {
            String valueOf = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
            sb2.append("Expecting FrameworkCryptoConfig but found: ");
            sb2.append(valueOf);
            throw w(6001, this.T, new IllegalArgumentException(sb2.toString()), false);
        }
        return (s7.g) f;
    }

    public abstract c.a U(d dVar, n nVar, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0149, code lost:
        if ("stvm8".equals(r4) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(d dVar, MediaCrypto mediaCrypto) {
        float R;
        String str;
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str2;
        boolean z17;
        boolean z18;
        String str3;
        String str4 = dVar.f6638a;
        int i10 = w.f5205a;
        float f = -1.0f;
        if (i10 < 23) {
            R = -1.0f;
        } else {
            float f2 = this.f6591b0;
            n[] nVarArr = this.A;
            nVarArr.getClass();
            R = R(f2, nVarArr);
        }
        if (R > this.I) {
            f = R;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf(str4);
        if (valueOf.length() != 0) {
            str = "createCodec:".concat(valueOf);
        } else {
            str = new String("createCodec:");
        }
        kc.f.j(str);
        this.c0 = this.F.a(U(dVar, this.T, mediaCrypto, f));
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f6597j0 = dVar;
        this.f6594g0 = f;
        this.f6592d0 = this.T;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str4)) {
            String str5 = w.f5208d;
            if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                i6 = 2;
                this.f6598k0 = i6;
                n nVar = this.f6592d0;
                if (i10 >= 21 && nVar.H.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f6599l0 = z10;
                if (i10 < 18 && ((i10 != 18 || (!"OMX.SEC.avc.dec".equals(str4) && !"OMX.SEC.avc.dec.secure".equals(str4))) && (i10 != 19 || !w.f5208d.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str4) && !"OMX.Exynos.avc.dec.secure".equals(str4))))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.f6600m0 = z11;
                if (i10 != 29 && "c2.android.aac.decoder".equals(str4)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f6601n0 = z12;
                if (i10 <= 23 || !"OMX.google.vorbis.decoder".equals(str4)) {
                    if (i10 <= 19) {
                        String str6 = w.f5206b;
                        if (!"hb2000".equals(str6)) {
                        }
                        if (!"OMX.amlogic.avc.decoder.awesome".equals(str4)) {
                        }
                    }
                    z13 = false;
                    this.f6602o0 = z13;
                    if (i10 != 21 && "OMX.google.aac.decoder".equals(str4)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f6603p0 = z14;
                    if (i10 < 21 && "OMX.SEC.mp3.dec".equals(str4) && "samsung".equals(w.f5207c)) {
                        str3 = w.f5206b;
                        if (!str3.startsWith("baffin") || str3.startsWith("grand") || str3.startsWith("fortuna") || str3.startsWith("gprimelte") || str3.startsWith("j2y18lte") || str3.startsWith("ms01")) {
                            z15 = true;
                            this.f6604q0 = z15;
                            n nVar2 = this.f6592d0;
                            if (i10 > 18 && nVar2.S == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            this.f6605r0 = z16;
                            str2 = dVar.f6638a;
                            if ((i10 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || ((i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || ("Amazon".equals(w.f5207c) && "AFTS".equals(w.f5208d) && dVar.f)))) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17 && !Q()) {
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            this.f6608u0 = z18;
                            this.c0.b();
                            if ("c2.android.mp3.decoder".equals(str2)) {
                                this.f6609v0 = new g();
                            }
                            if (this.f6462y == 2) {
                                this.f6610w0 = SystemClock.elapsedRealtime() + 1000;
                            }
                            this.T0.getClass();
                            a0(elapsedRealtime2, str4, elapsedRealtime2 - elapsedRealtime);
                        }
                    }
                    z15 = false;
                    this.f6604q0 = z15;
                    n nVar22 = this.f6592d0;
                    if (i10 > 18) {
                    }
                    z16 = false;
                    this.f6605r0 = z16;
                    str2 = dVar.f6638a;
                    if (i10 > 25) {
                    }
                    z17 = false;
                    if (z17) {
                    }
                    z18 = true;
                    this.f6608u0 = z18;
                    this.c0.b();
                    if ("c2.android.mp3.decoder".equals(str2)) {
                    }
                    if (this.f6462y == 2) {
                    }
                    this.T0.getClass();
                    a0(elapsedRealtime2, str4, elapsedRealtime2 - elapsedRealtime);
                }
                z13 = true;
                this.f6602o0 = z13;
                if (i10 != 21) {
                }
                z14 = false;
                this.f6603p0 = z14;
                if (i10 < 21) {
                    str3 = w.f5206b;
                    if (!str3.startsWith("baffin")) {
                    }
                    z15 = true;
                    this.f6604q0 = z15;
                    n nVar222 = this.f6592d0;
                    if (i10 > 18) {
                    }
                    z16 = false;
                    this.f6605r0 = z16;
                    str2 = dVar.f6638a;
                    if (i10 > 25) {
                    }
                    z17 = false;
                    if (z17) {
                    }
                    z18 = true;
                    this.f6608u0 = z18;
                    this.c0.b();
                    if ("c2.android.mp3.decoder".equals(str2)) {
                    }
                    if (this.f6462y == 2) {
                    }
                    this.T0.getClass();
                    a0(elapsedRealtime2, str4, elapsedRealtime2 - elapsedRealtime);
                }
                z15 = false;
                this.f6604q0 = z15;
                n nVar2222 = this.f6592d0;
                if (i10 > 18) {
                }
                z16 = false;
                this.f6605r0 = z16;
                str2 = dVar.f6638a;
                if (i10 > 25) {
                }
                z17 = false;
                if (z17) {
                }
                z18 = true;
                this.f6608u0 = z18;
                this.c0.b();
                if ("c2.android.mp3.decoder".equals(str2)) {
                }
                if (this.f6462y == 2) {
                }
                this.T0.getClass();
                a0(elapsedRealtime2, str4, elapsedRealtime2 - elapsedRealtime);
            }
        }
        if (i10 < 24 && ("OMX.Nvidia.h264.decode".equals(str4) || "OMX.Nvidia.h264.decode.secure".equals(str4))) {
            String str7 = w.f5206b;
            if ("flounder".equals(str7) || "flounder_lte".equals(str7) || "grouper".equals(str7) || "tilapia".equals(str7)) {
                i6 = 1;
                this.f6598k0 = i6;
                n nVar3 = this.f6592d0;
                if (i10 >= 21) {
                }
                z10 = false;
                this.f6599l0 = z10;
                if (i10 < 18) {
                }
                z11 = true;
                this.f6600m0 = z11;
                if (i10 != 29) {
                }
                z12 = false;
                this.f6601n0 = z12;
                if (i10 <= 23) {
                }
                if (i10 <= 19) {
                }
                z13 = false;
                this.f6602o0 = z13;
                if (i10 != 21) {
                }
                z14 = false;
                this.f6603p0 = z14;
                if (i10 < 21) {
                }
                z15 = false;
                this.f6604q0 = z15;
                n nVar22222 = this.f6592d0;
                if (i10 > 18) {
                }
                z16 = false;
                this.f6605r0 = z16;
                str2 = dVar.f6638a;
                if (i10 > 25) {
                }
                z17 = false;
                if (z17) {
                }
                z18 = true;
                this.f6608u0 = z18;
                this.c0.b();
                if ("c2.android.mp3.decoder".equals(str2)) {
                }
                if (this.f6462y == 2) {
                }
                this.T0.getClass();
                a0(elapsedRealtime2, str4, elapsedRealtime2 - elapsedRealtime);
            }
        }
        i6 = 0;
        this.f6598k0 = i6;
        n nVar32 = this.f6592d0;
        if (i10 >= 21) {
        }
        z10 = false;
        this.f6599l0 = z10;
        if (i10 < 18) {
        }
        z11 = true;
        this.f6600m0 = z11;
        if (i10 != 29) {
        }
        z12 = false;
        this.f6601n0 = z12;
        if (i10 <= 23) {
        }
        if (i10 <= 19) {
        }
        z13 = false;
        this.f6602o0 = z13;
        if (i10 != 21) {
        }
        z14 = false;
        this.f6603p0 = z14;
        if (i10 < 21) {
        }
        z15 = false;
        this.f6604q0 = z15;
        n nVar222222 = this.f6592d0;
        if (i10 > 18) {
        }
        z16 = false;
        this.f6605r0 = z16;
        str2 = dVar.f6638a;
        if (i10 > 25) {
        }
        z17 = false;
        if (z17) {
        }
        z18 = true;
        this.f6608u0 = z18;
        this.c0.b();
        if ("c2.android.mp3.decoder".equals(str2)) {
        }
        if (this.f6462y == 2) {
        }
        this.T0.getClass();
        a0(elapsedRealtime2, str4, elapsedRealtime2 - elapsedRealtime);
    }

    public final void X() {
        n nVar;
        boolean z10;
        if (this.c0 == null && !this.C0 && (nVar = this.T) != null) {
            if (this.W == null && q0(nVar)) {
                n nVar2 = this.T;
                J();
                String str = nVar2.F;
                boolean equals = "audio/mp4a-latm".equals(str);
                f8.f fVar = this.M;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    fVar.getClass();
                    fVar.E = 1;
                } else {
                    fVar.getClass();
                    fVar.E = 32;
                }
                this.C0 = true;
                return;
            }
            o0(this.W);
            String str2 = this.T.F;
            DrmSession drmSession = this.V;
            if (drmSession != null) {
                if (this.X == null) {
                    s7.g T = T(drmSession);
                    if (T == null) {
                        if (this.V.getError() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(T.f31301a, T.f31302b);
                            this.X = mediaCrypto;
                            if (!T.f31303c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.Y = z10;
                        } catch (MediaCryptoException e10) {
                            throw w(6006, this.T, e10, false);
                        }
                    }
                }
                if (s7.g.f31300d) {
                    int state = this.V.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        DrmSession.DrmSessionException error = this.V.getError();
                        error.getClass();
                        throw w(error.f6422u, this.T, error, false);
                    }
                }
            }
            try {
                Y(this.X, this.Y);
            } catch (DecoderInitializationException e11) {
                throw w(4001, this.T, e11, false);
            }
        }
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        if (this.f6595h0 == null) {
            try {
                List<d> P = P(z10);
                ArrayDeque<d> arrayDeque = new ArrayDeque<>();
                this.f6595h0 = arrayDeque;
                if (this.H) {
                    arrayDeque.addAll(P);
                } else if (!P.isEmpty()) {
                    this.f6595h0.add(P.get(0));
                }
                this.f6596i0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(-49998, this.T, e10, z10);
            }
        }
        if (!this.f6595h0.isEmpty()) {
            while (this.c0 == null) {
                d peekFirst = this.f6595h0.peekFirst();
                if (!p0(peekFirst)) {
                    return;
                }
                try {
                    W(peekFirst, mediaCrypto);
                } catch (Exception e11) {
                    String valueOf = String.valueOf(peekFirst);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 30);
                    sb2.append("Failed to initialize decoder: ");
                    sb2.append(valueOf);
                    ca.a.B1("MediaCodecRenderer", sb2.toString(), e11);
                    this.f6595h0.removeFirst();
                    n nVar = this.T;
                    String str2 = peekFirst.f6638a;
                    String valueOf2 = String.valueOf(nVar);
                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + ri.e.c(str2, 23));
                    sb3.append("Decoder init failed: ");
                    sb3.append(str2);
                    sb3.append(", ");
                    sb3.append(valueOf2);
                    String sb4 = sb3.toString();
                    String str3 = nVar.F;
                    if (w.f5205a >= 21 && (e11 instanceof MediaCodec.CodecException)) {
                        str = ((MediaCodec.CodecException) e11).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    DecoderInitializationException decoderInitializationException = new DecoderInitializationException(sb4, e11, str3, z10, peekFirst, str);
                    Z(decoderInitializationException);
                    DecoderInitializationException decoderInitializationException2 = this.f6596i0;
                    if (decoderInitializationException2 == null) {
                        this.f6596i0 = decoderInitializationException;
                    } else {
                        this.f6596i0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f6614u, decoderInitializationException2.f6615v, decoderInitializationException2.f6616w, decoderInitializationException2.f6617x);
                    }
                    if (this.f6595h0.isEmpty()) {
                        throw this.f6596i0;
                    }
                }
            }
            this.f6595h0 = null;
            return;
        }
        throw new DecoderInitializationException(-49999, this.T, null, z10);
    }

    public abstract void Z(Exception exc);

    @Override // o7.u
    public final int a(n nVar) {
        try {
            return r0(this.G, nVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw x(e10, nVar);
        }
    }

    public abstract void a0(long j10, String str, long j11);

    @Override // com.google.android.exoplayer2.z
    public boolean b() {
        return this.P0;
    }

    public abstract void b0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:103:0x011a, code lost:
        if (K() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0132, code lost:
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0134, code lost:
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r12 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d4, code lost:
        if (K() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f8, code lost:
        if (r5.L == r6.L) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0106, code lost:
        if (K() == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r7.f c0(l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6;
        s7.g T;
        boolean e10;
        boolean z13 = true;
        this.Q0 = true;
        n nVar = (n) lVar.f1472w;
        nVar.getClass();
        String str = nVar.F;
        if (str != null) {
            DrmSession drmSession = (DrmSession) lVar.f1471v;
            DrmSession drmSession2 = this.W;
            if (drmSession2 != drmSession) {
                if (drmSession != null) {
                    drmSession.a(null);
                }
                if (drmSession2 != null) {
                    drmSession2.b(null);
                }
            }
            this.W = drmSession;
            this.T = nVar;
            if (this.C0) {
                this.E0 = true;
                return null;
            }
            c cVar = this.c0;
            if (cVar == null) {
                this.f6595h0 = null;
                X();
                return null;
            }
            d dVar = this.f6597j0;
            n nVar2 = this.f6592d0;
            DrmSession drmSession3 = this.V;
            if (drmSession3 != drmSession) {
                if (drmSession != null && drmSession3 != null && w.f5205a >= 23) {
                    UUID uuid = o7.b.f27184e;
                    if (!uuid.equals(drmSession3.c()) && !uuid.equals(drmSession.c()) && (T = T(drmSession)) != null) {
                        if (T.f31303c) {
                            e10 = false;
                        } else {
                            e10 = drmSession.e(str);
                        }
                        if (!dVar.f) {
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                    if (this.J0) {
                        this.H0 = 1;
                        this.I0 = 3;
                    } else {
                        k0();
                        X();
                    }
                    return new r7.f(dVar.f6638a, nVar2, nVar, 0, 128);
                }
                if (this.W != this.V) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && w.f5205a < 23) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                sc.b.C(z12);
                r7.f H = H(dVar, nVar2, nVar);
                int i10 = H.f30544d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                if (s0(nVar)) {
                                    this.f6592d0 = nVar;
                                    if (z11) {
                                    }
                                }
                                i6 = 16;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (s0(nVar)) {
                                this.F0 = true;
                                this.G0 = 1;
                                int i11 = this.f6598k0;
                                if (i11 != 2) {
                                    if (i11 == 1) {
                                        if (nVar.K == nVar2.K) {
                                        }
                                    }
                                    z13 = false;
                                }
                                this.f6606s0 = z13;
                                this.f6592d0 = nVar;
                                if (z11) {
                                }
                            }
                            i6 = 16;
                        }
                    } else {
                        if (s0(nVar)) {
                            this.f6592d0 = nVar;
                            if (!z11) {
                                if (this.J0) {
                                    this.H0 = 1;
                                    if (!this.f6600m0 && !this.f6602o0) {
                                        this.I0 = 1;
                                    } else {
                                        this.I0 = 3;
                                        z13 = false;
                                    }
                                }
                            }
                        }
                        i6 = 16;
                    }
                    if (H.f30544d == 0 && (this.c0 != cVar || this.I0 == 3)) {
                        return new r7.f(dVar.f6638a, nVar2, nVar, 0, i6);
                    }
                    return H;
                } else if (this.J0) {
                    this.H0 = 1;
                    this.I0 = 3;
                } else {
                    k0();
                    X();
                }
                i6 = 0;
                if (H.f30544d == 0) {
                }
                return H;
            }
            z10 = false;
            if (!z10) {
            }
        } else {
            throw w(4005, nVar, new IllegalArgumentException(), false);
        }
    }

    public abstract void d0(n nVar, MediaFormat mediaFormat);

    public void e0(long j10) {
        while (true) {
            int i6 = this.W0;
            if (i6 != 0) {
                long[] jArr = this.S;
                if (j10 >= jArr[0]) {
                    long[] jArr2 = this.Q;
                    this.U0 = jArr2[0];
                    long[] jArr3 = this.R;
                    this.V0 = jArr3[0];
                    int i10 = i6 - 1;
                    this.W0 = i10;
                    System.arraycopy(jArr2, 1, jArr2, 0, i10);
                    System.arraycopy(jArr3, 1, jArr3, 0, this.W0);
                    System.arraycopy(jArr, 1, jArr, 0, this.W0);
                    f0();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public abstract void f0();

    public abstract void g0(DecoderInputBuffer decoderInputBuffer);

    public final void h0() {
        int i6 = this.I0;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    this.P0 = true;
                    l0();
                    return;
                }
                k0();
                X();
                return;
            }
            N();
            t0();
            return;
        }
        N();
    }

    public abstract boolean i0(long j10, long j11, c cVar, ByteBuffer byteBuffer, int i6, int i10, int i11, long j12, boolean z10, boolean z11, n nVar);

    @Override // com.google.android.exoplayer2.z
    public boolean isReady() {
        boolean isReady;
        boolean z10;
        if (this.T == null) {
            return false;
        }
        if (f()) {
            isReady = this.D;
        } else {
            k kVar = this.f6463z;
            kVar.getClass();
            isReady = kVar.isReady();
        }
        if (!isReady) {
            if (this.f6612y0 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (this.f6610w0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f6610w0)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j0(int i6) {
        l lVar = this.f6459v;
        lVar.i();
        DecoderInputBuffer decoderInputBuffer = this.J;
        decoderInputBuffer.n();
        int F = F(lVar, decoderInputBuffer, i6 | 4);
        if (F == -5) {
            c0(lVar);
            return true;
        } else if (F == -4 && decoderInputBuffer.k(4)) {
            this.O0 = true;
            h0();
            return false;
        } else {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.z
    public void k(float f, float f2) {
        this.f6590a0 = f;
        this.f6591b0 = f2;
        s0(this.f6592d0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.drm.DrmSession, android.media.MediaCrypto] */
    public final void k0() {
        try {
            c cVar = this.c0;
            if (cVar != null) {
                cVar.a();
                this.T0.getClass();
                b0(this.f6597j0.f6638a);
            }
            this.c0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.c0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.X;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.e, o7.u
    public final int m() {
        return 8;
    }

    public void m0() {
        this.f6611x0 = -1;
        this.K.f6360w = null;
        this.f6612y0 = -1;
        this.f6613z0 = null;
        this.f6610w0 = -9223372036854775807L;
        this.K0 = false;
        this.J0 = false;
        this.f6606s0 = false;
        this.f6607t0 = false;
        this.A0 = false;
        this.B0 = false;
        this.O.clear();
        this.M0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        g gVar = this.f6609v0;
        if (gVar != null) {
            gVar.f14907b = 0L;
            gVar.f14908c = 0L;
            gVar.f14909d = false;
        }
        this.H0 = 0;
        this.I0 = 0;
        this.G0 = this.F0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[LOOP:1: B:27:0x0047->B:37:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[LOOP:2: B:38:0x0068->B:48:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068 A[EDGE_INSN: B:86:0x0068->B:89:0x0068 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0084 A[EDGE_INSN: B:87:0x0084->B:49:0x0084 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.exoplayer2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (this.R0) {
            this.R0 = false;
            h0();
        }
        ExoPlaybackException exoPlaybackException = this.S0;
        if (exoPlaybackException == null) {
            try {
                if (this.P0) {
                    l0();
                } else if (this.T == null && !j0(2)) {
                } else {
                    X();
                    if (this.C0) {
                        kc.f.j("bypassRender");
                        while (G(j10, j11)) {
                        }
                        kc.f.B();
                    } else if (this.c0 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        kc.f.j("drainAndFeed");
                        while (L(j10, j11)) {
                            long j12 = this.Z;
                            if (j12 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                                z13 = false;
                                if (z13) {
                                    break;
                                }
                            }
                            z13 = true;
                            if (z13) {
                            }
                        }
                        while (M()) {
                            long j13 = this.Z;
                            if (j13 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j13) {
                                z12 = false;
                                if (z12) {
                                    break;
                                }
                            }
                            z12 = true;
                            if (z12) {
                            }
                        }
                        kc.f.B();
                    } else {
                        this.T0.getClass();
                        k kVar = this.f6463z;
                        kVar.getClass();
                        kVar.c(j10 - this.B);
                        j0(1);
                    }
                    synchronized (this.T0) {
                    }
                }
            } catch (IllegalStateException e10) {
                int i6 = w.f5205a;
                if (i6 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        z10 = false;
                        if (!z10) {
                            Z(e10);
                            if (i6 >= 21) {
                                if (e10 instanceof MediaCodec.CodecException) {
                                    z11 = ((MediaCodec.CodecException) e10).isRecoverable();
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    z14 = true;
                                }
                            }
                            if (z14) {
                                k0();
                            }
                            throw w(4003, this.T, I(e10, this.f6597j0), z14);
                        }
                        throw e10;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
        } else {
            this.S0 = null;
            throw exoPlaybackException;
        }
    }

    public final void n0() {
        m0();
        this.S0 = null;
        this.f6609v0 = null;
        this.f6595h0 = null;
        this.f6597j0 = null;
        this.f6592d0 = null;
        this.e0 = null;
        this.f6593f0 = false;
        this.L0 = false;
        this.f6594g0 = -1.0f;
        this.f6598k0 = 0;
        this.f6599l0 = false;
        this.f6600m0 = false;
        this.f6601n0 = false;
        this.f6602o0 = false;
        this.f6603p0 = false;
        this.f6604q0 = false;
        this.f6605r0 = false;
        this.f6608u0 = false;
        this.F0 = false;
        this.G0 = 0;
        this.Y = false;
    }

    public final void o0(DrmSession drmSession) {
        DrmSession drmSession2 = this.V;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.a(null);
            }
            if (drmSession2 != null) {
                drmSession2.b(null);
            }
        }
        this.V = drmSession;
    }

    public boolean p0(d dVar) {
        return true;
    }

    public boolean q0(n nVar) {
        return false;
    }

    public abstract int r0(e eVar, n nVar);

    public final boolean s0(n nVar) {
        if (w.f5205a >= 23 && this.c0 != null && this.I0 != 3 && this.f6462y != 0) {
            float f = this.f6591b0;
            n[] nVarArr = this.A;
            nVarArr.getClass();
            float R = R(f, nVarArr);
            float f2 = this.f6594g0;
            if (f2 == R) {
                return true;
            }
            if (R == -1.0f) {
                if (this.J0) {
                    this.H0 = 1;
                    this.I0 = 3;
                    return false;
                }
                k0();
                X();
                return false;
            } else if (f2 == -1.0f && R <= this.I) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", R);
                this.c0.d(bundle);
                this.f6594g0 = R;
            }
        }
        return true;
    }

    public final void t0() {
        try {
            this.X.setMediaDrmSession(T(this.W).f31302b);
            o0(this.W);
            this.H0 = 0;
            this.I0 = 0;
        } catch (MediaCryptoException e10) {
            throw w(6006, this.T, e10, false);
        }
    }

    public final void u0(long j10) {
        boolean z10;
        n nVar;
        n nVar2 = (n) this.N.g(j10);
        if (nVar2 == null && this.f6593f0) {
            u uVar = this.N;
            synchronized (uVar) {
                if (uVar.f5198b == 0) {
                    nVar = null;
                } else {
                    nVar = uVar.h();
                }
            }
            nVar2 = nVar;
        }
        if (nVar2 != null) {
            this.U = nVar2;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.f6593f0 && this.U != null)) {
            d0(this.U, this.e0);
            this.f6593f0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void y() {
        this.T = null;
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.W0 = 0;
        O();
    }

    /* loaded from: classes.dex */
    public static class DecoderInitializationException extends Exception {

        /* renamed from: u  reason: collision with root package name */
        public final String f6614u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f6615v;

        /* renamed from: w  reason: collision with root package name */
        public final d f6616w;

        /* renamed from: x  reason: collision with root package name */
        public final String f6617x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DecoderInitializationException(int i6, n nVar, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z10) {
            this(r4, decoderQueryException, r6, z10, null, r1.toString());
            String valueOf = String.valueOf(nVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
            sb2.append("Decoder init failed: [");
            sb2.append(i6);
            sb2.append("], ");
            sb2.append(valueOf);
            String sb3 = sb2.toString();
            String str = nVar.F;
            String str2 = i6 < 0 ? "neg_" : "";
            int abs = Math.abs(i6);
            StringBuilder sb4 = new StringBuilder(str2.length() + 71);
            sb4.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb4.append(str2);
            sb4.append(abs);
        }

        public DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, d dVar, String str3) {
            super(str, th2);
            this.f6614u = str2;
            this.f6615v = z10;
            this.f6616w = dVar;
            this.f6617x = str3;
        }
    }

    public void l0() {
    }

    public void V(DecoderInputBuffer decoderInputBuffer) {
    }
}

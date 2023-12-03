package com.google.android.exoplayer2.source;

import android.media.MediaCodec;
import c9.w;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.p;
import java.nio.ByteBuffer;
import java.util.Arrays;
import r7.c;
import u7.v;
/* compiled from: SampleDataQueue.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final b9.i f6963a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6964b;

    /* renamed from: c  reason: collision with root package name */
    public final c9.q f6965c;

    /* renamed from: d  reason: collision with root package name */
    public a f6966d;

    /* renamed from: e  reason: collision with root package name */
    public a f6967e;
    public a f;

    /* renamed from: g  reason: collision with root package name */
    public long f6968g;

    /* compiled from: SampleDataQueue.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f6969a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6970b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6971c;

        /* renamed from: d  reason: collision with root package name */
        public b9.a f6972d;

        /* renamed from: e  reason: collision with root package name */
        public a f6973e;

        public a(int i6, long j10) {
            this.f6969a = j10;
            this.f6970b = j10 + i6;
        }
    }

    public o(b9.i iVar) {
        this.f6963a = iVar;
        int i6 = iVar.f4138b;
        this.f6964b = i6;
        this.f6965c = new c9.q(32);
        a aVar = new a(i6, 0L);
        this.f6966d = aVar;
        this.f6967e = aVar;
        this.f = aVar;
    }

    public static a c(a aVar, long j10, ByteBuffer byteBuffer, int i6) {
        while (j10 >= aVar.f6970b) {
            aVar = aVar.f6973e;
        }
        while (i6 > 0) {
            int min = Math.min(i6, (int) (aVar.f6970b - j10));
            b9.a aVar2 = aVar.f6972d;
            byteBuffer.put(aVar2.f4109a, ((int) (j10 - aVar.f6969a)) + aVar2.f4110b, min);
            i6 -= min;
            j10 += min;
            if (j10 == aVar.f6970b) {
                aVar = aVar.f6973e;
            }
        }
        return aVar;
    }

    public static a d(a aVar, long j10, byte[] bArr, int i6) {
        while (j10 >= aVar.f6970b) {
            aVar = aVar.f6973e;
        }
        int i10 = i6;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (aVar.f6970b - j10));
            b9.a aVar2 = aVar.f6972d;
            System.arraycopy(aVar2.f4109a, ((int) (j10 - aVar.f6969a)) + aVar2.f4110b, bArr, i6 - i10, min);
            i10 -= min;
            j10 += min;
            if (j10 == aVar.f6970b) {
                aVar = aVar.f6973e;
            }
        }
        return aVar;
    }

    public static a e(a aVar, DecoderInputBuffer decoderInputBuffer, p.a aVar2, c9.q qVar) {
        boolean z10;
        if (decoderInputBuffer.k(1073741824)) {
            long j10 = aVar2.f6999b;
            int i6 = 1;
            qVar.x(1);
            a d10 = d(aVar, j10, qVar.f5186a, 1);
            long j11 = j10 + 1;
            byte b10 = qVar.f5186a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            r7.c cVar = decoderInputBuffer.f6359v;
            byte[] bArr = cVar.f30529a;
            if (bArr == null) {
                cVar.f30529a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = d(d10, j11, cVar.f30529a, i10);
            long j12 = j11 + i10;
            if (z10) {
                qVar.x(2);
                aVar = d(aVar, j12, qVar.f5186a, 2);
                j12 += 2;
                i6 = qVar.v();
            }
            int[] iArr = cVar.f30532d;
            if (iArr == null || iArr.length < i6) {
                iArr = new int[i6];
            }
            int[] iArr2 = cVar.f30533e;
            if (iArr2 == null || iArr2.length < i6) {
                iArr2 = new int[i6];
            }
            if (z10) {
                int i11 = i6 * 6;
                qVar.x(i11);
                aVar = d(aVar, j12, qVar.f5186a, i11);
                j12 += i11;
                qVar.A(0);
                for (int i12 = 0; i12 < i6; i12++) {
                    iArr[i12] = qVar.v();
                    iArr2[i12] = qVar.t();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f6998a - ((int) (j12 - aVar2.f6999b));
            }
            v.a aVar3 = aVar2.f7000c;
            int i13 = w.f5205a;
            byte[] bArr2 = aVar3.f33914b;
            byte[] bArr3 = cVar.f30529a;
            cVar.f = i6;
            cVar.f30532d = iArr;
            cVar.f30533e = iArr2;
            cVar.f30530b = bArr2;
            cVar.f30529a = bArr3;
            int i14 = aVar3.f33913a;
            cVar.f30531c = i14;
            int i15 = aVar3.f33915c;
            cVar.f30534g = i15;
            int i16 = aVar3.f33916d;
            cVar.f30535h = i16;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f30536i;
            cryptoInfo.numSubSamples = i6;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (w.f5205a >= 24) {
                c.a aVar4 = cVar.f30537j;
                aVar4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = aVar4.f30539b;
                pattern.set(i15, i16);
                aVar4.f30538a.setPattern(pattern);
            }
            long j13 = aVar2.f6999b;
            int i17 = (int) (j12 - j13);
            aVar2.f6999b = j13 + i17;
            aVar2.f6998a -= i17;
        }
        if (decoderInputBuffer.k(268435456)) {
            qVar.x(4);
            a d11 = d(aVar, aVar2.f6999b, qVar.f5186a, 4);
            int t3 = qVar.t();
            aVar2.f6999b += 4;
            aVar2.f6998a -= 4;
            decoderInputBuffer.r(t3);
            a c10 = c(d11, aVar2.f6999b, decoderInputBuffer.f6360w, t3);
            aVar2.f6999b += t3;
            int i18 = aVar2.f6998a - t3;
            aVar2.f6998a = i18;
            ByteBuffer byteBuffer = decoderInputBuffer.f6363z;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                decoderInputBuffer.f6363z.clear();
            } else {
                decoderInputBuffer.f6363z = ByteBuffer.allocate(i18);
            }
            return c(c10, aVar2.f6999b, decoderInputBuffer.f6363z, aVar2.f6998a);
        }
        decoderInputBuffer.r(aVar2.f6998a);
        return c(aVar, aVar2.f6999b, decoderInputBuffer.f6360w, aVar2.f6998a);
    }

    public final void a(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f6966d;
            if (j10 < aVar.f6970b) {
                break;
            }
            b9.i iVar = this.f6963a;
            b9.a aVar2 = aVar.f6972d;
            synchronized (iVar) {
                b9.a[] aVarArr = iVar.f4139c;
                aVarArr[0] = aVar2;
                iVar.a(aVarArr);
            }
            a aVar3 = this.f6966d;
            aVar3.f6972d = null;
            a aVar4 = aVar3.f6973e;
            aVar3.f6973e = null;
            this.f6966d = aVar4;
        }
        if (this.f6967e.f6969a < aVar.f6969a) {
            this.f6967e = aVar;
        }
    }

    public final int b(int i6) {
        b9.a aVar;
        a aVar2 = this.f;
        if (!aVar2.f6971c) {
            b9.i iVar = this.f6963a;
            synchronized (iVar) {
                iVar.f4141e++;
                int i10 = iVar.f;
                if (i10 > 0) {
                    b9.a[] aVarArr = iVar.f4142g;
                    int i11 = i10 - 1;
                    iVar.f = i11;
                    aVar = aVarArr[i11];
                    aVar.getClass();
                    iVar.f4142g[iVar.f] = null;
                } else {
                    aVar = new b9.a(new byte[iVar.f4138b], 0);
                }
            }
            a aVar3 = new a(this.f6964b, this.f.f6970b);
            aVar2.f6972d = aVar;
            aVar2.f6973e = aVar3;
            aVar2.f6971c = true;
        }
        return Math.min(i6, (int) (this.f.f6970b - this.f6968g));
    }
}

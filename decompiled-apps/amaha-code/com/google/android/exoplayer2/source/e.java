package com.google.android.exoplayer2.source;

import android.net.Uri;
import b9.t;
import b9.u;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.o;
import java.util.List;
import java.util.Map;
/* compiled from: IcyDataSource.java */
/* loaded from: classes.dex */
public final class e implements b9.f {

    /* renamed from: a  reason: collision with root package name */
    public final b9.f f6873a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6874b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6875c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f6876d;

    /* renamed from: e  reason: collision with root package name */
    public int f6877e;

    /* compiled from: IcyDataSource.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public e(t tVar, int i6, a aVar) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.f6873a = tVar;
        this.f6874b = i6;
        this.f6875c = aVar;
        this.f6876d = new byte[1];
        this.f6877e = i6;
    }

    @Override // b9.f
    public final void c(u uVar) {
        uVar.getClass();
        this.f6873a.c(uVar);
    }

    @Override // b9.f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // b9.f
    public final Uri getUri() {
        return this.f6873a.getUri();
    }

    @Override // b9.f
    public final long h(b9.h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b9.f
    public final Map<String, List<String>> j() {
        return this.f6873a.j();
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        long max;
        o oVar;
        int i11 = this.f6877e;
        b9.f fVar = this.f6873a;
        if (i11 == 0) {
            byte[] bArr2 = this.f6876d;
            int i12 = 0;
            if (fVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    int i15 = 0;
                    while (i14 > 0) {
                        int read = fVar.read(bArr3, i15, i14);
                        if (read == -1) {
                            break;
                        }
                        i15 += read;
                        i14 -= read;
                    }
                    while (i13 > 0) {
                        int i16 = i13 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i13 = i16;
                    }
                    if (i13 > 0) {
                        m.a aVar = (m.a) this.f6875c;
                        if (!aVar.f6937n) {
                            max = aVar.f6933j;
                        } else {
                            Map<String, String> map = m.f6913g0;
                            max = Math.max(m.this.q(), aVar.f6933j);
                        }
                        long j10 = max;
                        int i17 = i13 + 0;
                        p pVar = aVar.f6936m;
                        pVar.getClass();
                        int i18 = i17;
                        while (true) {
                            oVar = pVar.f6974a;
                            if (i18 <= 0) {
                                break;
                            }
                            int b10 = oVar.b(i18);
                            o.a aVar2 = oVar.f;
                            b9.a aVar3 = aVar2.f6972d;
                            byte[] bArr4 = bArr3;
                            int i19 = i17;
                            System.arraycopy(bArr4, i12, aVar3.f4109a, ((int) (oVar.f6968g - aVar2.f6969a)) + aVar3.f4110b, b10);
                            int i20 = i12 + b10;
                            i18 -= b10;
                            long j11 = oVar.f6968g + b10;
                            oVar.f6968g = j11;
                            o.a aVar4 = oVar.f;
                            if (j11 == aVar4.f6970b) {
                                oVar.f = aVar4.f6973e;
                            }
                            i12 = i20;
                            bArr3 = bArr4;
                            i17 = i19;
                        }
                        oVar.getClass();
                        pVar.d(j10, 1, i17, 0, null);
                        aVar.f6937n = true;
                        i12 = 1;
                    }
                }
                i12 = 1;
            }
            if (i12 != 0) {
                this.f6877e = this.f6874b;
            } else {
                return -1;
            }
        }
        int read2 = fVar.read(bArr, i6, Math.min(this.f6877e, i10));
        if (read2 != -1) {
            this.f6877e -= read2;
        }
        return read2;
    }
}

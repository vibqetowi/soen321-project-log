package c8;

import c9.q;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
/* compiled from: OggPageHeader.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f5096a;

    /* renamed from: b  reason: collision with root package name */
    public long f5097b;

    /* renamed from: c  reason: collision with root package name */
    public int f5098c;

    /* renamed from: d  reason: collision with root package name */
    public int f5099d;

    /* renamed from: e  reason: collision with root package name */
    public int f5100e;
    public final int[] f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final q f5101g = new q(255);

    public final boolean a(u7.i iVar, boolean z10) {
        boolean z11;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
        this.f5096a = 0;
        this.f5097b = 0L;
        this.f5098c = 0;
        this.f5099d = 0;
        this.f5100e = 0;
        q qVar = this.f5101g;
        qVar.x(27);
        try {
            z11 = iVar.d(qVar.f5186a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (!z11 || qVar.r() != 1332176723) {
            return false;
        }
        if (qVar.q() != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.b("unsupported bit stream revision");
        }
        this.f5096a = qVar.q();
        byte[] bArr = qVar.f5186a;
        qVar.f5187b = qVar.f5187b + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.f5097b = ((bArr[i16] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 24) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 40) | ((bArr[i15] & 255) << 48);
        qVar.g();
        qVar.g();
        qVar.g();
        int q10 = qVar.q();
        this.f5098c = q10;
        this.f5099d = q10 + 27;
        qVar.x(q10);
        try {
            z12 = iVar.d(qVar.f5186a, 0, this.f5098c, z10);
        } catch (EOFException e11) {
            if (z10) {
                z12 = false;
            } else {
                throw e11;
            }
        }
        if (!z12) {
            return false;
        }
        for (int i17 = 0; i17 < this.f5098c; i17++) {
            int q11 = qVar.q();
            this.f[i17] = q11;
            this.f5100e += q11;
        }
        return true;
    }

    public final boolean b(u7.i iVar, long j10) {
        boolean z10;
        int i6;
        boolean z11;
        if (iVar.getPosition() == iVar.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        q qVar = this.f5101g;
        qVar.x(4);
        while (true) {
            i6 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i6 != 0 && iVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z11 = iVar.d(qVar.f5186a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            qVar.A(0);
            if (qVar.r() == 1332176723) {
                iVar.k();
                return true;
            }
            iVar.l(1);
        }
        do {
            if (i6 != 0 && iVar.getPosition() >= j10) {
                break;
            }
        } while (iVar.i(1) != -1);
        return false;
    }
}

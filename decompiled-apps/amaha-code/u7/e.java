package u7;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b  reason: collision with root package name */
    public final b9.d f33870b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33871c;

    /* renamed from: d  reason: collision with root package name */
    public long f33872d;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f33874g;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f33873e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f33869a = new byte[4096];

    static {
        o7.m.a("goog.exo.extractor");
    }

    public e(b9.f fVar, long j10, long j11) {
        this.f33870b = fVar;
        this.f33872d = j10;
        this.f33871c = j11;
    }

    @Override // u7.i
    public final boolean a(byte[] bArr, int i6, int i10, boolean z10) {
        int min;
        int i11 = this.f33874g;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f33873e, 0, bArr, i6, min);
            p(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = o(bArr, i6, i10, i12, z10);
        }
        if (i12 != -1) {
            this.f33872d += i12;
        }
        if (i12 == -1) {
            return false;
        }
        return true;
    }

    @Override // u7.i
    public final void b(int i6, byte[] bArr, int i10) {
        d(bArr, i6, i10, false);
    }

    @Override // u7.i
    public final boolean d(byte[] bArr, int i6, int i10, boolean z10) {
        if (!m(i10, z10)) {
            return false;
        }
        System.arraycopy(this.f33873e, this.f - i10, bArr, i6, i10);
        return true;
    }

    @Override // u7.i
    public final long e() {
        return this.f33872d + this.f;
    }

    @Override // u7.i
    public final void f(int i6) {
        m(i6, false);
    }

    @Override // u7.i
    public final int g(int i6, byte[] bArr, int i10) {
        int min;
        n(i10);
        int i11 = this.f33874g;
        int i12 = this.f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            min = o(this.f33873e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f33874g += min;
        } else {
            min = Math.min(i10, i13);
        }
        System.arraycopy(this.f33873e, this.f, bArr, i6, min);
        this.f += min;
        return min;
    }

    @Override // u7.i
    public final long getLength() {
        return this.f33871c;
    }

    @Override // u7.i
    public final long getPosition() {
        return this.f33872d;
    }

    @Override // u7.i
    public final int i(int i6) {
        int min = Math.min(this.f33874g, i6);
        p(min);
        if (min == 0) {
            byte[] bArr = this.f33869a;
            min = o(bArr, 0, Math.min(i6, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f33872d += min;
        }
        return min;
    }

    @Override // u7.i
    public final void k() {
        this.f = 0;
    }

    @Override // u7.i
    public final void l(int i6) {
        int min = Math.min(this.f33874g, i6);
        p(min);
        int i10 = min;
        while (i10 < i6 && i10 != -1) {
            i10 = o(this.f33869a, -i10, Math.min(i6, this.f33869a.length + i10), i10, false);
        }
        if (i10 != -1) {
            this.f33872d += i10;
        }
    }

    @Override // u7.i
    public final boolean m(int i6, boolean z10) {
        n(i6);
        int i10 = this.f33874g - this.f;
        while (i10 < i6) {
            i10 = o(this.f33873e, this.f, i6, i10, z10);
            if (i10 == -1) {
                return false;
            }
            this.f33874g = this.f + i10;
        }
        this.f += i6;
        return true;
    }

    public final void n(int i6) {
        int i10 = this.f + i6;
        byte[] bArr = this.f33873e;
        if (i10 > bArr.length) {
            this.f33873e = Arrays.copyOf(this.f33873e, c9.w.h(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int o(byte[] bArr, int i6, int i10, int i11, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f33870b.read(bArr, i6 + i11, i10 - i11);
            if (read == -1) {
                if (i11 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + read;
        }
        throw new InterruptedIOException();
    }

    public final void p(int i6) {
        byte[] bArr;
        int i10 = this.f33874g - i6;
        this.f33874g = i10;
        this.f = 0;
        byte[] bArr2 = this.f33873e;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i6, bArr, 0, i10);
        this.f33873e = bArr;
    }

    @Override // u7.i, b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        int i11 = this.f33874g;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f33873e, 0, bArr, i6, min);
            p(min);
            i12 = min;
        }
        if (i12 == 0) {
            i12 = o(bArr, i6, i10, 0, true);
        }
        if (i12 != -1) {
            this.f33872d += i12;
        }
        return i12;
    }

    @Override // u7.i
    public final void readFully(byte[] bArr, int i6, int i10) {
        a(bArr, i6, i10, false);
    }
}

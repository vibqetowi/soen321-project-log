package kotlin.reflect.jvm.internal.impl.protobuf;

import gu.c;
import gu.n;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class CodedOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f23472a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23473b;

    /* renamed from: c  reason: collision with root package name */
    public int f23474c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final OutputStream f23475d;

    /* loaded from: classes2.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f23475d = outputStream;
        this.f23472a = bArr;
        this.f23473b = bArr.length;
    }

    public static int a(int i6, int i10) {
        return c(i10) + h(i6);
    }

    public static int b(int i6, int i10) {
        return c(i10) + h(i6);
    }

    public static int c(int i6) {
        if (i6 >= 0) {
            return f(i6);
        }
        return 10;
    }

    public static int d(int i6, n nVar) {
        int h10 = h(i6);
        int b10 = nVar.b();
        return f(b10) + b10 + h10;
    }

    public static int e(n nVar) {
        int b10 = nVar.b();
        return f(b10) + b10;
    }

    public static int f(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        if ((i6 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int g(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        if ((j10 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int h(int i6) {
        return f((i6 << 3) | 0);
    }

    public static CodedOutputStream j(OutputStream outputStream, int i6) {
        return new CodedOutputStream(outputStream, new byte[i6]);
    }

    public final void i() {
        if (this.f23475d != null) {
            k();
        }
    }

    public final void k() {
        OutputStream outputStream = this.f23475d;
        if (outputStream != null) {
            outputStream.write(this.f23472a, 0, this.f23474c);
            this.f23474c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public final void l(int i6, int i10) {
        x(i6, 0);
        n(i10);
    }

    public final void m(int i6, int i10) {
        x(i6, 0);
        n(i10);
    }

    public final void n(int i6) {
        if (i6 >= 0) {
            v(i6);
        } else {
            w(i6);
        }
    }

    public final void o(int i6, n nVar) {
        x(i6, 2);
        p(nVar);
    }

    public final void p(n nVar) {
        v(nVar.b());
        nVar.f(this);
    }

    public final void q(int i6) {
        byte b10 = (byte) i6;
        if (this.f23474c == this.f23473b) {
            k();
        }
        int i10 = this.f23474c;
        this.f23474c = i10 + 1;
        this.f23472a[i10] = b10;
    }

    public final void r(c cVar) {
        int size = cVar.size();
        int i6 = this.f23474c;
        int i10 = this.f23473b;
        int i11 = i10 - i6;
        byte[] bArr = this.f23472a;
        if (i11 >= size) {
            cVar.m(0, i6, size, bArr);
            this.f23474c += size;
            return;
        }
        cVar.m(0, i6, i11, bArr);
        int i12 = i11 + 0;
        int i13 = size - i11;
        this.f23474c = i10;
        k();
        if (i13 <= i10) {
            cVar.m(i12, 0, i13, bArr);
            this.f23474c = i13;
        } else if (i12 >= 0) {
            if (i13 >= 0) {
                int i14 = i12 + i13;
                if (i14 <= cVar.size()) {
                    if (i13 > 0) {
                        cVar.K(this.f23475d, i12, i13);
                        return;
                    }
                    return;
                }
                throw new IndexOutOfBoundsException(b.h(39, "Source end offset exceeded: ", i14));
            }
            throw new IndexOutOfBoundsException(b.h(23, "Length < 0: ", i13));
        } else {
            throw new IndexOutOfBoundsException(b.h(30, "Source offset < 0: ", i12));
        }
    }

    public final void s(byte[] bArr) {
        int length = bArr.length;
        int i6 = this.f23474c;
        int i10 = this.f23473b;
        int i11 = i10 - i6;
        byte[] bArr2 = this.f23472a;
        if (i11 >= length) {
            System.arraycopy(bArr, 0, bArr2, i6, length);
            this.f23474c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i6, i11);
        int i12 = i11 + 0;
        int i13 = length - i11;
        this.f23474c = i10;
        k();
        if (i13 <= i10) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f23474c = i13;
            return;
        }
        this.f23475d.write(bArr, i12, i13);
    }

    public final void t(int i6) {
        q(i6 & 255);
        q((i6 >> 8) & 255);
        q((i6 >> 16) & 255);
        q((i6 >> 24) & 255);
    }

    public final void u(long j10) {
        q(((int) j10) & 255);
        q(((int) (j10 >> 8)) & 255);
        q(((int) (j10 >> 16)) & 255);
        q(((int) (j10 >> 24)) & 255);
        q(((int) (j10 >> 32)) & 255);
        q(((int) (j10 >> 40)) & 255);
        q(((int) (j10 >> 48)) & 255);
        q(((int) (j10 >> 56)) & 255);
    }

    public final void v(int i6) {
        while ((i6 & (-128)) != 0) {
            q((i6 & 127) | 128);
            i6 >>>= 7;
        }
        q(i6);
    }

    public final void w(long j10) {
        while (((-128) & j10) != 0) {
            q((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        q((int) j10);
    }

    public final void x(int i6, int i10) {
        v((i6 << 3) | i10);
    }
}

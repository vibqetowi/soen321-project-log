package com.google.protobuf;

import com.google.protobuf.r1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class CodedOutputStream extends com.android.volley.toolbox.a {

    /* renamed from: w  reason: collision with root package name */
    public static final Logger f9865w = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f9866x = q1.f10021e;

    /* renamed from: v  reason: collision with root package name */
    public k f9867v;

    /* loaded from: classes.dex */
    public static abstract class a extends CodedOutputStream {
        public int A;

        /* renamed from: y  reason: collision with root package name */
        public final byte[] f9868y;

        /* renamed from: z  reason: collision with root package name */
        public final int f9869z;

        public a(int i6) {
            if (i6 >= 0) {
                byte[] bArr = new byte[Math.max(i6, 20)];
                this.f9868y = bArr;
                this.f9869z = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void E0(int i6) {
            int i10 = this.A;
            int i11 = i10 + 1;
            byte[] bArr = this.f9868y;
            bArr[i10] = (byte) (i6 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i6 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i6 >> 16) & 255);
            this.A = i13 + 1;
            bArr[i13] = (byte) ((i6 >> 24) & 255);
        }

        public final void F0(long j10) {
            int i6 = this.A;
            int i10 = i6 + 1;
            byte[] bArr = this.f9868y;
            bArr[i6] = (byte) (j10 & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((j10 >> 8) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 16) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (255 & (j10 >> 24));
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
            this.A = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        }

        public final void G0(int i6, int i10) {
            H0((i6 << 3) | i10);
        }

        public final void H0(int i6) {
            boolean z10 = CodedOutputStream.f9866x;
            byte[] bArr = this.f9868y;
            if (z10) {
                while ((i6 & (-128)) != 0) {
                    int i10 = this.A;
                    this.A = i10 + 1;
                    q1.s(bArr, (byte) ((i6 & 127) | 128), i10);
                    i6 >>>= 7;
                }
                int i11 = this.A;
                this.A = i11 + 1;
                q1.s(bArr, (byte) i6, i11);
                return;
            }
            while ((i6 & (-128)) != 0) {
                int i12 = this.A;
                this.A = i12 + 1;
                bArr[i12] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
            }
            int i13 = this.A;
            this.A = i13 + 1;
            bArr[i13] = (byte) i6;
        }

        public final void I0(long j10) {
            boolean z10 = CodedOutputStream.f9866x;
            byte[] bArr = this.f9868y;
            if (z10) {
                while ((j10 & (-128)) != 0) {
                    int i6 = this.A;
                    this.A = i6 + 1;
                    q1.s(bArr, (byte) ((((int) j10) & 127) | 128), i6);
                    j10 >>>= 7;
                }
                int i10 = this.A;
                this.A = i10 + 1;
                q1.s(bArr, (byte) j10, i10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                int i11 = this.A;
                this.A = i11 + 1;
                bArr[i11] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            int i12 = this.A;
            this.A = i12 + 1;
            bArr[i12] = (byte) j10;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends CodedOutputStream {
        public int A;

        /* renamed from: y  reason: collision with root package name */
        public final byte[] f9870y;

        /* renamed from: z  reason: collision with root package name */
        public final int f9871z;

        public b(int i6, byte[] bArr, int i10) {
            if (bArr != null) {
                int i11 = i6 + i10;
                if ((i6 | i10 | (bArr.length - i11)) >= 0) {
                    this.f9870y = bArr;
                    this.A = i6;
                    this.f9871z = i11;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i10)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A0(int i6, int i10) {
            z0(i6, 0);
            B0(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i6) {
            while (true) {
                int i10 = i6 & (-128);
                byte[] bArr = this.f9870y;
                if (i10 == 0) {
                    int i11 = this.A;
                    this.A = i11 + 1;
                    bArr[i11] = (byte) i6;
                    return;
                }
                try {
                    int i12 = this.A;
                    this.A = i12 + 1;
                    bArr[i12] = (byte) ((i6 & 127) | 128);
                    i6 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f9871z), 1), e10);
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f9871z), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C0(int i6, long j10) {
            z0(i6, 0);
            D0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void D0(long j10) {
            boolean z10 = CodedOutputStream.f9866x;
            int i6 = this.f9871z;
            byte[] bArr = this.f9870y;
            if (z10 && i6 - this.A >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.A;
                    this.A = i10 + 1;
                    q1.s(bArr, (byte) ((((int) j10) & 127) | 128), i10);
                    j10 >>>= 7;
                }
                int i11 = this.A;
                this.A = i11 + 1;
                q1.s(bArr, (byte) j10, i11);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = this.A;
                    this.A = i12 + 1;
                    bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(i6), 1), e10);
                }
            }
            int i13 = this.A;
            this.A = i13 + 1;
            bArr[i13] = (byte) j10;
        }

        public final int E0() {
            return this.f9871z - this.A;
        }

        public final void F0(byte[] bArr, int i6, int i10) {
            try {
                System.arraycopy(bArr, i6, this.f9870y, this.A, i10);
                this.A += i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f9871z), Integer.valueOf(i10)), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(byte b10) {
            try {
                byte[] bArr = this.f9870y;
                int i6 = this.A;
                this.A = i6 + 1;
                bArr[i6] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f9871z), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i6, boolean z10) {
            z0(i6, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(byte[] bArr, int i6) {
            B0(i6);
            F0(bArr, 0, i6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(int i6, h hVar) {
            z0(i6, 2);
            m0(hVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(h hVar) {
            B0(hVar.size());
            hVar.Q(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i6, int i10) {
            z0(i6, 5);
            o0(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(int i6) {
            try {
                byte[] bArr = this.f9870y;
                int i10 = this.A;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (i6 & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((i6 >> 8) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i6 >> 16) & 255);
                this.A = i13 + 1;
                bArr[i13] = (byte) ((i6 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f9871z), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i6, long j10) {
            z0(i6, 1);
            q0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(long j10) {
            try {
                byte[] bArr = this.f9870y;
                int i6 = this.A;
                int i10 = i6 + 1;
                bArr[i6] = (byte) (((int) j10) & 255);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
                this.A = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A), Integer.valueOf(this.f9871z), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i6, int i10) {
            z0(i6, 0);
            s0(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i6) {
            if (i6 >= 0) {
                B0(i6);
            } else {
                D0(i6);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(int i6, q0 q0Var, g1 g1Var) {
            z0(i6, 2);
            B0(((com.google.protobuf.a) q0Var).r(g1Var));
            g1Var.b(q0Var, this.f9867v);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void u0(q0 q0Var) {
            B0(q0Var.b());
            q0Var.f(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void v0(int i6, q0 q0Var) {
            z0(1, 3);
            A0(2, i6);
            z0(3, 2);
            u0(q0Var);
            z0(1, 4);
        }

        @Override // com.android.volley.toolbox.a
        public final void w(int i6, byte[] bArr, int i10) {
            F0(bArr, i6, i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w0(int i6, h hVar) {
            z0(1, 3);
            A0(2, i6);
            l0(3, hVar);
            z0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x0(int i6, String str) {
            z0(i6, 2);
            y0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void y0(String str) {
            int i6 = this.A;
            try {
                int e0 = CodedOutputStream.e0(str.length() * 3);
                int e02 = CodedOutputStream.e0(str.length());
                int i10 = this.f9871z;
                byte[] bArr = this.f9870y;
                if (e02 == e0) {
                    int i11 = i6 + e02;
                    this.A = i11;
                    int d10 = r1.f10029a.d(str, bArr, i11, i10 - i11);
                    this.A = i6;
                    B0((d10 - i6) - e02);
                    this.A = d10;
                } else {
                    B0(r1.c(str));
                    int i12 = this.A;
                    this.A = r1.f10029a.d(str, bArr, i12, i10 - i12);
                }
            } catch (r1.d e10) {
                this.A = i6;
                h0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void z0(int i6, int i10) {
            B0((i6 << 3) | i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        public final OutputStream B;

        public c(OutputStream outputStream, int i6) {
            super(i6);
            if (outputStream != null) {
                this.B = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A0(int i6, int i10) {
            K0(20);
            G0(i6, 0);
            H0(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i6) {
            K0(5);
            H0(i6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C0(int i6, long j10) {
            K0(20);
            G0(i6, 0);
            I0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void D0(long j10) {
            K0(10);
            I0(j10);
        }

        public final void J0() {
            this.B.write(this.f9868y, 0, this.A);
            this.A = 0;
        }

        public final void K0(int i6) {
            if (this.f9869z - this.A < i6) {
                J0();
            }
        }

        public final void L0(byte[] bArr, int i6, int i10) {
            int i11 = this.A;
            int i12 = this.f9869z;
            int i13 = i12 - i11;
            byte[] bArr2 = this.f9868y;
            if (i13 >= i10) {
                System.arraycopy(bArr, i6, bArr2, i11, i10);
                this.A += i10;
                return;
            }
            System.arraycopy(bArr, i6, bArr2, i11, i13);
            int i14 = i6 + i13;
            int i15 = i10 - i13;
            this.A = i12;
            J0();
            if (i15 <= i12) {
                System.arraycopy(bArr, i14, bArr2, 0, i15);
                this.A = i15;
                return;
            }
            this.B.write(bArr, i14, i15);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(byte b10) {
            if (this.A == this.f9869z) {
                J0();
            }
            int i6 = this.A;
            this.A = i6 + 1;
            this.f9868y[i6] = b10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i6, boolean z10) {
            K0(11);
            G0(i6, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i10 = this.A;
            this.A = i10 + 1;
            this.f9868y[i10] = b10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(byte[] bArr, int i6) {
            B0(i6);
            L0(bArr, 0, i6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(int i6, h hVar) {
            z0(i6, 2);
            m0(hVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(h hVar) {
            B0(hVar.size());
            hVar.Q(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i6, int i10) {
            K0(14);
            G0(i6, 5);
            E0(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(int i6) {
            K0(4);
            E0(i6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i6, long j10) {
            K0(18);
            G0(i6, 1);
            F0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(long j10) {
            K0(8);
            F0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i6, int i10) {
            K0(20);
            G0(i6, 0);
            if (i10 >= 0) {
                H0(i10);
            } else {
                I0(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i6) {
            if (i6 >= 0) {
                B0(i6);
            } else {
                D0(i6);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(int i6, q0 q0Var, g1 g1Var) {
            z0(i6, 2);
            B0(((com.google.protobuf.a) q0Var).r(g1Var));
            g1Var.b(q0Var, this.f9867v);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void u0(q0 q0Var) {
            B0(q0Var.b());
            q0Var.f(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void v0(int i6, q0 q0Var) {
            z0(1, 3);
            A0(2, i6);
            z0(3, 2);
            u0(q0Var);
            z0(1, 4);
        }

        @Override // com.android.volley.toolbox.a
        public final void w(int i6, byte[] bArr, int i10) {
            L0(bArr, i6, i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w0(int i6, h hVar) {
            z0(1, 3);
            A0(2, i6);
            l0(3, hVar);
            z0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x0(int i6, String str) {
            z0(i6, 2);
            y0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void y0(String str) {
            try {
                int length = str.length() * 3;
                int e0 = CodedOutputStream.e0(length);
                int i6 = e0 + length;
                int i10 = this.f9869z;
                if (i6 > i10) {
                    byte[] bArr = new byte[length];
                    int d10 = r1.f10029a.d(str, bArr, 0, length);
                    B0(d10);
                    L0(bArr, 0, d10);
                    return;
                }
                if (i6 > i10 - this.A) {
                    J0();
                }
                int e02 = CodedOutputStream.e0(str.length());
                int i11 = this.A;
                byte[] bArr2 = this.f9868y;
                try {
                    try {
                        if (e02 == e0) {
                            int i12 = i11 + e02;
                            this.A = i12;
                            int d11 = r1.f10029a.d(str, bArr2, i12, i10 - i12);
                            this.A = i11;
                            H0((d11 - i11) - e02);
                            this.A = d11;
                        } else {
                            int c10 = r1.c(str);
                            H0(c10);
                            this.A = r1.f10029a.d(str, bArr2, this.A, c10);
                        }
                    } catch (r1.d e10) {
                        this.A = i11;
                        throw e10;
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (r1.d e12) {
                h0(str, e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void z0(int i6, int i10) {
            B0((i6 << 3) | i10);
        }
    }

    public static int J(int i6) {
        return c0(i6) + 1;
    }

    public static int K(int i6, h hVar) {
        int c0 = c0(i6);
        int size = hVar.size();
        return e0(size) + size + c0;
    }

    public static int L(int i6) {
        return c0(i6) + 8;
    }

    public static int M(int i6, int i10) {
        return T(i10) + c0(i6);
    }

    public static int N(int i6) {
        return c0(i6) + 4;
    }

    public static int P(int i6) {
        return c0(i6) + 8;
    }

    public static int Q(int i6) {
        return c0(i6) + 4;
    }

    @Deprecated
    public static int R(int i6, q0 q0Var, g1 g1Var) {
        return ((com.google.protobuf.a) q0Var).r(g1Var) + (c0(i6) * 2);
    }

    public static int S(int i6, int i10) {
        return T(i10) + c0(i6);
    }

    public static int T(int i6) {
        if (i6 >= 0) {
            return e0(i6);
        }
        return 10;
    }

    public static int U(int i6, long j10) {
        return g0(j10) + c0(i6);
    }

    public static int V(d0 d0Var) {
        int i6;
        if (d0Var.f9899b != null) {
            i6 = d0Var.f9899b.size();
        } else if (d0Var.f9898a != null) {
            i6 = d0Var.f9898a.b();
        } else {
            i6 = 0;
        }
        return e0(i6) + i6;
    }

    public static int W(int i6) {
        return c0(i6) + 4;
    }

    public static int X(int i6) {
        return c0(i6) + 8;
    }

    public static int Y(int i6, int i10) {
        return e0((i10 >> 31) ^ (i10 << 1)) + c0(i6);
    }

    public static int Z(int i6, long j10) {
        return g0((j10 >> 63) ^ (j10 << 1)) + c0(i6);
    }

    public static int a0(int i6, String str) {
        return b0(str) + c0(i6);
    }

    public static int b0(String str) {
        int length;
        try {
            length = r1.c(str);
        } catch (r1.d unused) {
            length = str.getBytes(y.f10086a).length;
        }
        return e0(length) + length;
    }

    public static int c0(int i6) {
        return e0((i6 << 3) | 0);
    }

    public static int d0(int i6, int i10) {
        return e0(i10) + c0(i6);
    }

    public static int e0(int i6) {
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

    public static int f0(int i6, long j10) {
        return g0(j10) + c0(i6);
    }

    public static int g0(long j10) {
        int i6;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i6 += 2;
            j10 >>>= 14;
        }
        if ((j10 & (-16384)) != 0) {
            return i6 + 1;
        }
        return i6;
    }

    public abstract void A0(int i6, int i10);

    public abstract void B0(int i6);

    public abstract void C0(int i6, long j10);

    public abstract void D0(long j10);

    public final void h0(String str, r1.d dVar) {
        f9865w.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.f10086a);
        try {
            B0(bytes.length);
            w(0, bytes, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    public abstract void i0(byte b10);

    public abstract void j0(int i6, boolean z10);

    public abstract void k0(byte[] bArr, int i6);

    public abstract void l0(int i6, h hVar);

    public abstract void m0(h hVar);

    public abstract void n0(int i6, int i10);

    public abstract void o0(int i6);

    public abstract void p0(int i6, long j10);

    public abstract void q0(long j10);

    public abstract void r0(int i6, int i10);

    public abstract void s0(int i6);

    public abstract void t0(int i6, q0 q0Var, g1 g1Var);

    public abstract void u0(q0 q0Var);

    public abstract void v0(int i6, q0 q0Var);

    public abstract void w0(int i6, h hVar);

    public abstract void x0(int i6, String str);

    public abstract void y0(String str);

    public abstract void z0(int i6, int i10);

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(defpackage.c.r("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
